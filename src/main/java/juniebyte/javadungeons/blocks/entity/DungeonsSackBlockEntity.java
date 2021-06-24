package juniebyte.javadungeons.blocks.entity;

import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

import java.util.Iterator;
import java.util.stream.IntStream;

public class DungeonsSackBlockEntity extends LootableContainerBlockEntity {
   private static int[] AVAILABLE_SLOTS;
   private DefaultedList<ItemStack> inventory;
   private int viewerCount;
   private int size;

   public DungeonsSackBlockEntity(BlockPos pos, BlockState state) {
      super(BlockEntityType.SHULKER_BOX, pos, state);
      this.inventory = DefaultedList.ofSize(18, ItemStack.EMPTY);
      AVAILABLE_SLOTS = IntStream.range(0, 18).toArray();
   }

   public DungeonsSackBlockEntity(BlockPos pos, BlockState state, int size) {
      super(BlockEntityType.SHULKER_BOX, pos, state);
      this.size = size;
      this.inventory = DefaultedList.ofSize(size, ItemStack.EMPTY);
      AVAILABLE_SLOTS = IntStream.range(0, 27).toArray();
   }

   public NbtCompound writeNbt(NbtCompound compoundTag_1) {
      super.writeNbt(compoundTag_1);
      if (!this.serializeLootTable(compoundTag_1)) {
         Inventories.writeNbt(compoundTag_1, this.inventory);
      }

      return compoundTag_1;
   }

   public void readNbt(NbtCompound compoundTag_1) {
      super.readNbt(compoundTag_1);
      this.inventory = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
      if (!this.deserializeLootTable(compoundTag_1)) {
         Inventories.readNbt(compoundTag_1, this.inventory);
      }

   }

   public int size() {
      return 27;
   }

   public boolean isEmpty() {
      Iterator<ItemStack> var1 = this.inventory.iterator();

      ItemStack itemStack_1;
      do {
         if (!var1.hasNext()) {
            return true;
         }

         itemStack_1 = var1.next();
      } while (itemStack_1.isEmpty());

      return false;
   }

   public ItemStack getStack(int int_1) {
      return this.inventory.get(int_1);
   }

   public ItemStack removeStack(int int_1, int int_2) {
      return Inventories.splitStack(this.inventory, int_1, int_2);
   }

   public ItemStack removeStack(int int_1) {
      return Inventories.removeStack(this.inventory, int_1);
   }

   public void setStack(int int_1, ItemStack itemStack_1) {
      this.inventory.set(int_1, itemStack_1);
      if (itemStack_1.getCount() > this.getMaxCountPerStack()) {
         itemStack_1.setCount(this.getMaxCountPerStack());
      }

   }

   public void clear() {
      this.inventory.clear();
   }

   protected DefaultedList<ItemStack> getInvStackList() {
      return this.inventory;
   }

   protected void setInvStackList(DefaultedList<ItemStack> defaultedList_1) {
      this.inventory = defaultedList_1;
   }

   protected Text getContainerName() {
      return new TranslatableText("container.sack");
   }

   @Override
   protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
      return switch (size) {
         case 1 -> GenericContainerScreenHandler.createGeneric9x1(syncId, playerInventory);
         case 2 -> GenericContainerScreenHandler.createGeneric9x2(syncId, playerInventory);
         default -> throw new IllegalStateException("Unexpected value: " + size);
      };
   }

   public void onOpen(PlayerEntity playerEntity_1) {
      if (!playerEntity_1.isSpectator()) {
         if (this.viewerCount < 0) {
            this.viewerCount = 0;
         }

         ++this.viewerCount;
         BlockState blockState_1 = this.getCachedState();
         this.playSound(blockState_1, SoundEvents.BLOCK_BARREL_OPEN);

         this.scheduleUpdate();
      }

   }

   private void scheduleUpdate() {
      this.world.getBlockTickScheduler().schedule(this.getPos(), this.getCachedState().getBlock(), 5);
   }

   public void onClose(PlayerEntity playerEntity_1) {
      if (!playerEntity_1.isSpectator()) {
         --this.viewerCount;
         BlockState blockState_1 = this.getCachedState();
         this.playSound(blockState_1, SoundEvents.BLOCK_BARREL_CLOSE);
      }
   }

   private void playSound(BlockState blockState_1, SoundEvent event) {
      Vec3i vec3i_1 = blockState_1.get(BarrelBlock.FACING).getVector();
      double double_1 = (double) this.pos.getX() + 0.5D + (double) vec3i_1.getX() / 2.0D;
      double double_2 = (double) this.pos.getY() + 0.5D + (double) vec3i_1.getY() / 2.0D;
      double double_3 = (double) this.pos.getZ() + 0.5D + (double) vec3i_1.getZ() / 2.0D;
      this.world.playSound(null, double_1, double_2, double_3, event, SoundCategory.BLOCKS, 0.5F, this.world.random.nextFloat() * 0.1F + 0.9F);
   }

}