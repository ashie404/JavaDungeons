package ashie404.javadungeons.block;

import com.mojang.serialization.MapCodec;

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
import net.minecraft.particle.DefaultParticleType;
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

    private final DefaultParticleType particle;
    protected final VoxelShape SHAPE;
    private final VoxelShape DEFAULT_SHAPE = VoxelShapes.union(Block.createCuboidShape(-4.0D, 0.0D, -4.0D, 20.0D, 4.0D, 20.0D),Block.createCuboidShape(0.0D, 4.0D, 0.0D, 16.0D, 20.0D, 16.0D));
    private final VoxelShape SS_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 17.0D, 16.0D);
    private final boolean TYPE;

    protected MapCodec<? extends Brazier> getCodec() { return null; }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return SHAPE;
	}

    public Brazier(Settings settings, DefaultParticleType p, boolean soggySwamp) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque().ticksRandomly().solid());
        this.particle = p;
        this.TYPE = soggySwamp;
        this.SHAPE = soggySwamp ? SS_SHAPE : DEFAULT_SHAPE;
    }

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
            if (particle == Particles.GREEN_FLAME) {
                return validateTicker(type, BlockEntities.BRAZIER, BrazierBlockEntity::greenFlameTick);
            }
            return validateTicker(type, BlockEntities.BRAZIER, BrazierBlockEntity::flameTick);
        }
        return null;
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
        if (particle != null) {
            double d = (double)pos.getX() + 0.5;
            double e = (double)pos.getY() + 1.15;
            double f = (double)pos.getZ() + 0.5;
            
            //world.addParticle(particle, d, e, f, 0.0, 0.02*Math.abs(rd1), 0.0);
            //world.addParticle(particle, d+g, e, f+h, 0.0, 0.03*Math.abs(rd2), 0.0);
            world.addParticle(particle == Particles.GREEN_FLAME ? Particles.GREEN_EMBERS : Particles.EMBERS, d, e, f, 0.0, 0.0, 0.0);
        }
    }
}