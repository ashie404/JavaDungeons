package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class Gravestone extends Block {

    // gravestone block

    public static final DirectionProperty FACING;
    public static final VoxelShape N_SHAPE;
    public static final VoxelShape S_SHAPE;
    public static final VoxelShape E_SHAPE;
    public static final VoxelShape W_SHAPE;

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
        switch (blockState.get(FACING)) {
            case NORTH:
                return N_SHAPE;
            case SOUTH:
                return S_SHAPE;
            case EAST:
                return E_SHAPE;
            case WEST:
                return W_SHAPE;
            default:
                return N_SHAPE;
        }
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }
    
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public Gravestone(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)));
        
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
        N_SHAPE = BaseBlock.createCuboidShape(0.0D, 0.0D, 11.0D, 16.0D, 18.0D, 16.0D);
        S_SHAPE = BaseBlock.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 18.0D, 5.0D);
        E_SHAPE = BaseBlock.createCuboidShape(0.0D, 0.0D, 0.0D, 5.0D, 18.0D, 16.0D);
        W_SHAPE = BaseBlock.createCuboidShape(11.0D, 0.0D, 0.0D, 16.0D, 18.0D, 16.0D);
    }

}