package ashie404.javadungeons.block;

import ashie404.javadungeons.content.Particles;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

import net.minecraft.block.ShapeContext;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class Candle extends Block {

    // candle block

    protected static final VoxelShape SHAPE = Block.createCuboidShape(5.5D, 0.0D, 5.5D, 10.5D, 15.0D, 10.5D);
    private DefaultParticleType particle;
    private boolean isGreen;

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return SHAPE;
	}

    public Candle(boolean green, Settings settings) {
        super(FabricBlockSettings.copyOf(settings).pistonBehavior(PistonBehavior.DESTROY).nonOpaque().luminance(15).ticksRandomly());
        this.isGreen = green;
        this.particle = isGreen ? Particles.CANDLE_GREEN_FLAME : Particles.CANDLE_FLAME;
        
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double d = (double)pos.getX() + 0.5D;
        double e = (double)pos.getY() + 1.0D;
        double f = (double)pos.getZ() + 0.5D;
        world.addParticle(isGreen ? Particles.GREEN_CANDLE_EMBERS : Particles.CANDLE_EMBERS, d, e, f, 0.0D, 0.0D, 0.0D);
        world.addParticle(particle, d, e, f, 0.0D, 0.0D, 0.0D);
    }
}