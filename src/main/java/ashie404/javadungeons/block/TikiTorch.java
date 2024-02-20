package ashie404.javadungeons.block;

import com.mojang.serialization.MapCodec;

import ashie404.javadungeons.content.BlockEntities;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class TikiTorch extends BlockWithEntity {

    // tiki torch block

    protected static final VoxelShape SHAPE = VoxelShapes.union(Block.createCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D),
        Block.createCuboidShape(6.0D, 16.0D, 6.0D, 10.0D, 24.0D, 10.0D));

    protected static final MapCodec<TikiTorch> CODEC = createCodec(TikiTorch::new);
    protected final MapCodec<TikiTorch> getCodec() { return CODEC; }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return SHAPE;
	}

    public TikiTorch(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque().breakInstantly().solid().pistonBehavior(PistonBehavior.DESTROY));
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    /// Block entity functionality

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TikiTorchBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        if (world.isClient) {
            return validateTicker(type, BlockEntities.TIKI_TORCH, TikiTorchBlockEntity::particleTick);
        }
        return null;
    }
}