package ashie404.javadungeons.block;

import java.util.function.ToIntFunction;

import com.mojang.serialization.MapCodec;

import ashie404.javadungeons.block.Properties.LitVariant;
import ashie404.javadungeons.content.BlockEntities;
import ashie404.javadungeons.content.Particles;
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
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class Brazier extends BlockWithEntity {

    // brazier block

    protected final VoxelShape SHAPE;
    private final VoxelShape DEFAULT_SHAPE = VoxelShapes.union(Block.createCuboidShape(-4.0D, 0.0D, -4.0D, 20.0D, 4.0D, 20.0D),Block.createCuboidShape(0.0D, 4.0D, 0.0D, 16.0D, 20.0D, 16.0D));
    private final VoxelShape SS_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 17.0D, 16.0D);
    private final boolean TYPE;
    public static final EnumProperty<Properties.LitVariant> LIT_VARIANT = Properties.LIT_VARIANT;

    protected MapCodec<? extends Brazier> getCodec() { return null; }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return SHAPE;
	}

    private static ToIntFunction<BlockState> getLightLevel() {
        return (blockState) -> { return blockState.get(LIT_VARIANT) != LitVariant.UNLIT ? 15 : 0; };
    }

    public Brazier(Settings settings, boolean soggySwamp) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque().ticksRandomly().solid().luminance(getLightLevel()));
        this.TYPE = soggySwamp;
        this.SHAPE = soggySwamp ? SS_SHAPE : DEFAULT_SHAPE;
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(LIT_VARIANT, Properties.LitVariant.UNLIT);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT_VARIANT);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        // If TYPE is true (Soggy Swamp brazier) then only check for block below current. 
        // If TYPE is false (default brazier) then check for block below current, and non-diagonal adjacents. (due to its shape being larger than 1 block)
        return TYPE ? sideCoversSmallSquare(world, pos.down(), Direction.UP) :
            sideCoversSmallSquare(world, pos.down(), Direction.UP) && 
            sideCoversSmallSquare(world, pos.add(1, 0, 0).down(), Direction.UP) && sideCoversSmallSquare(world, pos.add(0, 0, 1).down(), Direction.UP) &&
            sideCoversSmallSquare(world, pos.add(-1, 0, 0).down(), Direction.UP) && sideCoversSmallSquare(world, pos.add(0, 0, -1).down(), Direction.UP);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        LitVariant variant = state.get(LIT_VARIANT);
        if (variant != LitVariant.UNLIT) {
            double d = (double)pos.getX() + 0.5;
            double e = (double)pos.getY() + 1.15;
            double f = (double)pos.getZ() + 0.5;
            world.addParticle(variant == LitVariant.LIT_GREEN ? Particles.GREEN_EMBERS : Particles.EMBERS, d, e, f, 0.0, 0.0, 0.0);
        }
    }

    /// Block entity functionality

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BrazierBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL;
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        if (world.isClient) {
            return validateTicker(type, BlockEntities.BRAZIER, BrazierBlockEntity::particleTick);
        }
        return null;
    }
}