package ashie404.javadungeons.block;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import ashie404.javadungeons.block.entity.SackBlockEntity;
import ashie404.javadungeons.content.BlockEntities;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Blocks;

import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.stat.Stats;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class Sack extends BlockWithEntity implements Waterloggable {

    // sack block

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public boolean small = false;

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    protected static final VoxelShape SMALL_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 11.0D, 14.0D);

    protected static final MapCodec<? extends Sack> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((Codec.BOOL.fieldOf("small_sack")).forGetter(block -> block.small), Sack.createSettingsCodec()).apply(instance, Sack::new));

    protected MapCodec<? extends Sack> getCodec() { return CODEC; }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return small ? SMALL_SHAPE : SHAPE;
    }
    
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
    }
  
    public FluidState getFluidState(BlockState state) {
       return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
       if ((Boolean)state.get(WATERLOGGED)) {
          world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
       }

       return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return (BlockState)this.getDefaultState().with(WATERLOGGED, fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8);
    }

    public Sack(boolean small_sack, Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque());
        this.small = small_sack;
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false));
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (world.isClient) {
			return ActionResult.SUCCESS;
		} else {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof SackBlockEntity) {
				player.openHandledScreen((SackBlockEntity) blockEntity);
				player.incrementStat(Stats.OPEN_BARREL);
				PiglinBrain.onGuardedBlockInteracted(player, true);
			}

			return ActionResult.CONSUME;
		}
	}

    // Block entity functionality

	@Override
    public BlockRenderType getRenderType(BlockState state) {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL;
    }

	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new SackBlockEntity(pos, state, small);
	}

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        ItemStack itemStack = super.getPickStack(world, pos, state);
        world.getBlockEntity(pos, BlockEntities.SACK).ifPresent(blockEntity -> blockEntity.setStackNbt(itemStack));
        return itemStack;
    }

}