package ashie404.javadungeons.block.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.block.entity.ViewerCountManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.DoubleInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import ashie404.javadungeons.content.BlockEntities;

public class SackBlockEntity extends LootableContainerBlockEntity {
    public static final String ITEMS_KEY = "Items";
	private DefaultedList<ItemStack> inventory;
	private boolean small;
    private final ViewerCountManager stateManager = new ViewerCountManager(){

        @Override
        protected void onContainerOpen(World world, BlockPos pos, BlockState state) {
            SackBlockEntity.playSound(world, pos, state, SoundEvents.BLOCK_WOOL_STEP);
        }

        @Override
        protected void onContainerClose(World world, BlockPos pos, BlockState state) {
            SackBlockEntity.playSound(world, pos, state, SoundEvents.BLOCK_WOOL_PLACE);
        }

        @Override
        protected void onViewerCountUpdate(World world, BlockPos pos, BlockState state, int oldViewerCount, int newViewerCount) {
            SackBlockEntity.this.onViewerCountUpdate(world, pos, state, oldViewerCount, newViewerCount);
        }

        @Override
        protected boolean isPlayerViewing(PlayerEntity player) {
            if (player.currentScreenHandler instanceof GenericContainerScreenHandler) {
                Inventory inventory = ((GenericContainerScreenHandler)player.currentScreenHandler).getInventory();
                return inventory == SackBlockEntity.this || inventory instanceof DoubleInventory && ((DoubleInventory)inventory).isPart(SackBlockEntity.this);
            }
            return false;
        }
    };

    public SackBlockEntity(BlockPos pos, BlockState state) {
		super(BlockEntities.SACK, pos, state);
		this.inventory = DefaultedList.ofSize(18, ItemStack.EMPTY);
	}

	public SackBlockEntity(BlockPos pos, BlockState state, boolean small_sack) {
		super(BlockEntities.SACK, pos, state);
		this.small = small_sack;
		this.inventory = DefaultedList.ofSize(small ? 9 : 18, ItemStack.EMPTY);
	}

    @Override
    public int size() {
        return small ? 9 : 18;
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable(small ? "container.dungeons.small_sack" : "container.dungeons.sack");
    }

	@Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.small = nbt.getBoolean("small_sack");
        this.inventory = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        if (!this.readLootTable(nbt)) {
            Inventories.readNbt(nbt, this.inventory);
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putBoolean("small_sack", small);
        if (!this.writeLootTable(nbt)) {
            Inventories.writeNbt(nbt, this.inventory);
        }
    }

    static void playSound(World world, BlockPos pos, BlockState state, SoundEvent soundEvent) {
        double d = (double)pos.getX() + 0.5;
        double e = (double)pos.getY() + 0.5;
        double f = (double)pos.getZ() + 0.5;
        world.playSound(null, d, e, f, soundEvent, SoundCategory.BLOCKS, 0.5f, world.random.nextFloat() * 0.1f + 0.9f);
    }

    @Override
    public void onOpen(PlayerEntity player) {
        if (!this.removed && !player.isSpectator()) {
            this.stateManager.openContainer(player, this.getWorld(), this.getPos(), this.getCachedState());
        }
    }

    @Override
    public void onClose(PlayerEntity player) {
        if (!this.removed && !player.isSpectator()) {
            this.stateManager.closeContainer(player, this.getWorld(), this.getPos(), this.getCachedState());
        }
    }

    @Override
    protected DefaultedList<ItemStack> method_11282() {
        return this.inventory;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list) {
        this.inventory = list;
    }

    public static void copyInventory(SackBlockEntity from, SackBlockEntity to) {
        DefaultedList<ItemStack> defaultedList = from.method_11282();
        from.setInvStackList(to.method_11282());
        to.setInvStackList(defaultedList);
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        if (small) return new GenericContainerScreenHandler(ScreenHandlerType.GENERIC_9X1, syncId, playerInventory, this, 1);
        return new GenericContainerScreenHandler(ScreenHandlerType.GENERIC_9X2, syncId, playerInventory, this, 2);
    }

    public void onScheduledTick() {
        if (!this.removed) {
            this.stateManager.updateViewerCount(this.getWorld(), this.getPos(), this.getCachedState());
        }
    }

    protected void onViewerCountUpdate(World world, BlockPos pos, BlockState state, int oldViewerCount, int newViewerCount) {
        Block block = state.getBlock();
        world.addSyncedBlockEvent(pos, block, 1, newViewerCount);
    }
}