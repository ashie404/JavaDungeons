package ashie404.javadungeons.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class Bedroll extends Block {

    // Bedroll block

    protected static final VoxelShape SHAPE_N = Block.createCuboidShape(2.0D, 1.0D, -15.0D, 14.0D, 11.0D, 30.0D);
    protected static final VoxelShape SHAPE_E = Block.createCuboidShape(-14.0D, 1.0D, 2.0D, 31.0D, 11.0D, 14.0D);
    protected static final VoxelShape SHAPE_S = Block.createCuboidShape(2.0D, 1.0D, -14.0D, 14.0D, 11.0D, 31.0D);
    protected static final VoxelShape SHAPE_W = Block.createCuboidShape(-15.0D, 1.0D, 2.0D, 30.0D, 11.0D, 14.0D);

    public static final DirectionProperty FACING = Properties.FACING;

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		switch (blockState.get(FACING)) {
            case NORTH: return SHAPE_N;
            case EAST: return SHAPE_E;
            case SOUTH: return SHAPE_S;
            case WEST: return SHAPE_W;
            default: return SHAPE_N;
        }
    }
    
    public Bedroll(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque());
        this.setDefaultState((BlockState)this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }
    
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }
}
