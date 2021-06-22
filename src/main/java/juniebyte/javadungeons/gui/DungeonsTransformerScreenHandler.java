package juniebyte.javadungeons.gui;

import com.google.common.collect.Lists;
import juniebyte.javadungeons.content.GenericBlocks;
import juniebyte.javadungeons.recipe.DungeonsTransformerRecipe;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.Property;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import java.util.List;

public class DungeonsTransformerScreenHandler extends ScreenHandler {
   private final ScreenHandlerContext context;
   private final Property selectedRecipe;
   private final World world;
   private List<DungeonsTransformerRecipe> availableRecipes;
   private ItemStack inputStack;
   private long lastTakeTime;
   final Slot inputSlot;
   final Slot outputSlot;
   private Runnable contentsChangedListener;
   public final Inventory input;
   private final CraftingResultInventory output;

   public DungeonsTransformerScreenHandler(int syncId, PlayerInventory playerInventory) {
      this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
   }

   public DungeonsTransformerScreenHandler(int syncId, PlayerInventory playerInventory, final ScreenHandlerContext context) {
      super(null, syncId);
      this.selectedRecipe = Property.create();
      this.availableRecipes = Lists.newArrayList();
      this.inputStack = ItemStack.EMPTY;
      this.contentsChangedListener = () -> {
      };
      this.input = new SimpleInventory(1) {
         public void markDirty() {
            super.markDirty();
            DungeonsTransformerScreenHandler.this.onContentChanged(this);
            DungeonsTransformerScreenHandler.this.contentsChangedListener.run();
         }
      };
      this.output = new CraftingResultInventory();
      this.context = context;
      this.world = playerInventory.player.world;
      this.inputSlot = this.addSlot(new Slot(this.input, 0, 20, 33));
      this.outputSlot = this.addSlot(new Slot(this.output, 1, 143, 33) {
         public boolean canInsert(ItemStack stack) {
            return false;
         }

         public void onTakeItem(PlayerEntity player, ItemStack stack) {
            ItemStack itemStack = DungeonsTransformerScreenHandler.this.inputSlot.takeStack(1);
            if (!itemStack.isEmpty()) {
               DungeonsTransformerScreenHandler.this.populateResult();
            }

            stack.getItem().onCraft(stack, player.world, player);
            context.run((world, blockPos) -> {
               long l = world.getTime();
               if (DungeonsTransformerScreenHandler.this.lastTakeTime != l) {
                  world.playSound(null, blockPos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F);
                  DungeonsTransformerScreenHandler.this.lastTakeTime = l;
               }

            });
         }
      });

      int k;
      for(k = 0; k < 3; ++k) {
         for(int j = 0; j < 9; ++j) {
            this.addSlot(new Slot(playerInventory, j + k * 9 + 9, 8 + j * 18, 84 + k * 18));
         }
      }

      for(k = 0; k < 9; ++k) {
         this.addSlot(new Slot(playerInventory, k, 8 + k * 18, 142));
      }

      this.addProperty(this.selectedRecipe);
   }

   @Environment(EnvType.CLIENT)
   public int getSelectedRecipe() {
      return this.selectedRecipe.get();
   }

   @Environment(EnvType.CLIENT)
   public List<DungeonsTransformerRecipe> getAvailableRecipes() {
      return this.availableRecipes;
   }

   @Environment(EnvType.CLIENT)
   public int getAvailableRecipeCount() {
      return this.availableRecipes.size();
   }

   @Environment(EnvType.CLIENT)
   public boolean canCraft() {
      return this.inputSlot.hasStack() && !this.availableRecipes.isEmpty();
   }

   public boolean canUse(PlayerEntity player) {
      return canUse(this.context, player, GenericBlocks.DUNGEONS_TRANSFORMER);
   }

   public boolean onButtonClick(PlayerEntity player, int id) {
      if (id >= 0 && id < this.availableRecipes.size()) {
         this.selectedRecipe.set(id);
         this.populateResult();
      }

      return true;
   }

   public void onContentChanged(Inventory inventory) {
      ItemStack itemStack = this.inputSlot.getStack();
      if (itemStack.getItem() != this.inputStack.getItem()) {
         this.inputStack = itemStack.copy();
         this.updateInput(inventory, itemStack);
      }

   }

   private void updateInput(Inventory input, ItemStack stack) {
      this.availableRecipes.clear();
      this.selectedRecipe.set(-1);
      this.outputSlot.setStack(ItemStack.EMPTY);
      if (!stack.isEmpty()) {
         this.availableRecipes = this.world.getRecipeManager().getAllMatches(DungeonsTransformerRecipe.TYPE, input, this.world);
      }

   }

   private void populateResult() {
      if (!this.availableRecipes.isEmpty()) {
         DungeonsTransformerRecipe dungeonsTransformerRecipe = this.availableRecipes.get(this.selectedRecipe.get());
         this.outputSlot.setStack(dungeonsTransformerRecipe.craft(this.input));
      } else {
         this.outputSlot.setStack(ItemStack.EMPTY);
      }

      this.sendContentUpdates();
   }

   public ScreenHandlerType<?> getType() {
      return null;
   }

   @Environment(EnvType.CLIENT)
   public void setContentsChangedListener(Runnable runnable) {
      this.contentsChangedListener = runnable;
   }

   public boolean canInsertIntoSlot(ItemStack stack, Slot slot) {
      return slot.inventory != this.output && super.canInsertIntoSlot(stack, slot);
   }

   public ItemStack transferSlot(PlayerEntity player, int index) {
      ItemStack itemStack = ItemStack.EMPTY;
      Slot slot = this.slots.get(index);
      if (slot != null && slot.hasStack()) {
         ItemStack itemStack2 = slot.getStack();
         Item item = itemStack2.getItem();
         itemStack = itemStack2.copy();
         if (index == 1) {
            item.onCraft(itemStack2, player.world, player);
            if (!this.insertItem(itemStack2, 2, 38, true)) {
               return ItemStack.EMPTY;
            }

            slot.onQuickTransfer(itemStack2, itemStack);
         } else if (index == 0) {
            if (!this.insertItem(itemStack2, 2, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else if (this.world.getRecipeManager().getFirstMatch(DungeonsTransformerRecipe.TYPE, new SimpleInventory(itemStack2), this.world).isPresent()) {
            if (!this.insertItem(itemStack2, 0, 1, false)) {
               return ItemStack.EMPTY;
            }
         } else if (index >= 2 && index < 29) {
            if (!this.insertItem(itemStack2, 29, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else if (index >= 29 && index < 38 && !this.insertItem(itemStack2, 2, 29, false)) {
            return ItemStack.EMPTY;
         }

         if (itemStack2.isEmpty()) {
            slot.setStack(ItemStack.EMPTY);
         }

         slot.markDirty();
         if (itemStack2.getCount() == itemStack.getCount()) {
            return ItemStack.EMPTY;
         }

         slot.onTakeItem(player, itemStack2);
         this.sendContentUpdates();
      }

      return itemStack;
   }

   public void close(PlayerEntity player) {
      super.close(player);
      this.output.removeStack(1);
      this.context.run((world, blockPos) -> {
         this.dropInventory(player, this.input);
      });
   }
}
