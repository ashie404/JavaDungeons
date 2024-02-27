package ashie404.javadungeons.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class KitchenUtensil extends Block implements Waterloggable {

    // kitchen utensil block

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final DirectionProperty FACING = Properties.FACING;

    protected static final VoxelShape POT_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 5.0D, 12.0D);
    protected static final VoxelShape PAN_SHAPE_N = VoxelShapes.union(Block.createCuboidShape(7.0D, 1.0D, 1.0D, 9.0D, 2.0D, 6.0D),
                                                                    Block.createCuboidShape(4.0D, 0.0D, 6.0D, 12.0D, 2.0D, 14.0D));
    protected static final VoxelShape PAN_SHAPE_E = VoxelShapes.union(Block.createCuboidShape(10.0D, 1.0D, 7.0D, 15.0D, 2.0D, 9.0D),
                                                                    Block.createCuboidShape(2.0D, 0.0D, 4.0D, 10.0D, 2.0D, 12.0D));
    protected static final VoxelShape PAN_SHAPE_S = VoxelShapes.union(Block.createCuboidShape(7.0D, 1.0D, 10.0D, 9.0D, 2.0D, 15.0D),
                                                                    Block.createCuboidShape(4.0D, 0.0D, 2.0D, 12.0D, 2.0D, 10.0D));
    protected static final VoxelShape PAN_SHAPE_W = VoxelShapes.union(Block.createCuboidShape(1.0D, 1.0D, 7.0D, 6.0D, 2.0D, 9.0D),
                                                                    Block.createCuboidShape(6.0D, 0.0D, 4.0D, 14.0D, 2.0D, 12.0D));
    
    private final Boolean isPan;

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
        if (isPan) { switch (blockState.get(FACING)) {
            case NORTH: return PAN_SHAPE_N;
            case EAST: return PAN_SHAPE_E;
            case SOUTH: return PAN_SHAPE_S;
            case WEST: return PAN_SHAPE_W;
            default: return PAN_SHAPE_N;
        }}
		return POT_SHAPE;
    }
    
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(WATERLOGGED);
    }
  
    public FluidState getFluidState(BlockState state) {
       return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
       if ((Boolean)state.get(WATERLOGGED)) {
          world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
       }

       return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()).with(WATERLOGGED, fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8);
    }

    public KitchenUtensil(Boolean pan, Settings settings) {
        super(settings);
        this.isPan = pan;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }
}