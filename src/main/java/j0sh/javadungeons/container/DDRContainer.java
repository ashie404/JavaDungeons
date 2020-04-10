package j0sh.javadungeons.container;

import java.util.List;

import com.google.common.collect.Lists;

import j0sh.javadungeons.blocks.BBlocks;
import j0sh.javadungeons.recipe.DDRRecipe;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.container.BlockContext;
import net.minecraft.container.Container;
import net.minecraft.container.ContainerType;
import net.minecraft.container.Property;
import net.minecraft.container.Slot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.BasicInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class DDRContainer extends Container {
   private final BlockContext context;
   private final Property selectedRecipe;
   private final World world;
   private List<DDRRecipe> availableRecipes;
   private ItemStack inputStack;
   private long lastTakeTime;
   final Slot inputSlot;
   final Slot outputSlot;
   private Runnable contentsChangedListener;
   public final Inventory inventory;
   private final CraftingResultInventory field_19173;

   public DDRContainer(final int syncId, final PlayerInventory playerInventory) {
      this(syncId, playerInventory, BlockContext.EMPTY);
   }

   public DDRContainer(final int syncId, final PlayerInventory playerInventory, final BlockContext blockContext) {
      super(null, syncId);
      this.selectedRecipe = Property.create();
      this.availableRecipes = Lists.newArrayList();
      this.inputStack = ItemStack.EMPTY;
      this.contentsChangedListener = () -> {
      };
      this.inventory = new BasicInventory(1) {
         public void markDirty() {
            super.markDirty();
            DDRContainer.this.onContentChanged(this);
            DDRContainer.this.contentsChangedListener.run();
         }
      };
      this.field_19173 = new CraftingResultInventory();
      this.context = blockContext;
      this.world = playerInventory.player.world;
      this.inputSlot = this.addSlot(new Slot(this.inventory, 0, 20, 33));
      this.outputSlot = this.addSlot(new Slot(this.field_19173, 1, 143, 33) {
         public boolean canInsert(final ItemStack stack) {
            return false;
         }

         public ItemStack onTakeItem(final PlayerEntity player, final ItemStack stack) {
            final ItemStack itemStack = DDRContainer.this.inputSlot.takeStack(1);
            if (!itemStack.isEmpty()) {
               DDRContainer.this.populateResult();
            }

            stack.getItem().onCraft(stack, player.world, player);
            blockContext.run((world, blockPos) -> {
               final long l = world.getTime();
               if (DDRContainer.this.lastTakeTime != l) {
                  world.playSound((PlayerEntity)null, blockPos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F);
                  DDRContainer.this.lastTakeTime = l;
               }

            });
            return super.onTakeItem(player, stack);
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
   public List<DDRRecipe> getAvailableRecipes() {
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

   public boolean canUse(final PlayerEntity player) {
      return canUse(this.context, player, BBlocks.Dimensional_Rectifier);
   }

   public boolean onButtonClick(final PlayerEntity player, final int id) {
      if (id >= 0 && id < this.availableRecipes.size()) {
         this.selectedRecipe.set(id);
         this.populateResult();
      }

      return true;
   }

   public void onContentChanged(final Inventory inventory) {
      final ItemStack itemStack = this.inputSlot.getStack();
      if (itemStack.getItem() != this.inputStack.getItem()) {
         this.inputStack = itemStack.copy();
         this.updateInput(inventory, itemStack);
      }

   }

   private void updateInput(final Inventory inventory, final ItemStack itemStack) {
      this.availableRecipes.clear();
      this.selectedRecipe.set(-1);
      this.outputSlot.setStack(ItemStack.EMPTY);
      if (!itemStack.isEmpty()) {
         this.availableRecipes = this.world.getRecipeManager().getAllMatches(DDRRecipe.TYPE, inventory, this.world);
      }

   }

   private void populateResult() {
      if (!this.availableRecipes.isEmpty()) {
         final DDRRecipe DDRRecipe = (DDRRecipe)this.availableRecipes.get(this.selectedRecipe.get());
         this.outputSlot.setStack(DDRRecipe.craft(this.inventory));
      } else {
         this.outputSlot.setStack(ItemStack.EMPTY);
      }

      this.sendContentUpdates();
   }

   public ContainerType<?> getType() {
      return ContainerType.STONECUTTER;
   }

   @Environment(EnvType.CLIENT)
   public void setContentsChangedListener(final Runnable runnable) {
      this.contentsChangedListener = runnable;
   }

   public boolean canInsertIntoSlot(final ItemStack stack, final Slot slot) {
      return slot.inventory != this.field_19173 && super.canInsertIntoSlot(stack, slot);
   }

   public ItemStack transferSlot(final PlayerEntity player, final int invSlot) {
      ItemStack itemStack = ItemStack.EMPTY;
      final Slot slot = (Slot)this.slots.get(invSlot);
      if (slot != null && slot.hasStack()) {
         final ItemStack itemStack2 = slot.getStack();
         final Item item = itemStack2.getItem();
         itemStack = itemStack2.copy();
         if (invSlot == 1) {
            item.onCraft(itemStack2, player.world, player);
            if (!this.insertItem(itemStack2, 2, 38, true)) {
               return ItemStack.EMPTY;
            }

            slot.onStackChanged(itemStack2, itemStack);
         } else if (invSlot == 0) {
            if (!this.insertItem(itemStack2, 2, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else if (this.world.getRecipeManager().getFirstMatch(DDRRecipe.TYPE, new BasicInventory(new ItemStack[]{itemStack2}), this.world).isPresent()) {
            if (!this.insertItem(itemStack2, 0, 1, false)) {
               return ItemStack.EMPTY;
            }
         } else if (invSlot >= 2 && invSlot < 29) {
            if (!this.insertItem(itemStack2, 29, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else if (invSlot >= 29 && invSlot < 38 && !this.insertItem(itemStack2, 2, 29, false)) {
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

   public void close(final PlayerEntity player) {
      super.close(player);
      this.field_19173.removeInvStack(1);
      this.context.run((world, blockPos) -> {
         this.dropInventory(player, player.world, this.inventory);
      });
   }
}