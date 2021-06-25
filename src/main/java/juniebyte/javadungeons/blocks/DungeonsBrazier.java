package juniebyte.javadungeons.blocks;

import juniebyte.javadungeons.content.Particles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

public class DungeonsBrazier extends Block {

    public String type;
    public boolean soggySwamp;

    protected static final VoxelShape SHAPE = Block.createCuboidShape(-2.0D, 0.0D, -2.0D, 18.0D, 19.0D, 18.0D);
    protected static final VoxelShape SS_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 17.0D, 16.0D);

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return soggySwamp ? SS_SHAPE : SHAPE;
	}

    public DungeonsBrazier(Material material, float hardness, float resistance, BlockSoundGroup sounds, String type, boolean soggySwamp) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds).nonOpaque().lightLevel(!type.equals("unlit") ? 15 : 0));
        this.type = type;
        this.soggySwamp = soggySwamp;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (!type.equals("unlit")) {
            double d = (double)pos.getX() + 0.5D;
            double e = (double)pos.getY() + 1.0D;
            double f = (double)pos.getZ() + 0.5D;
            world.addParticle(ParticleTypes.LARGE_SMOKE, d, e, f, 0.0D, 0.0D, 0.0D);
            world.addParticle(!type.equals("green_lit") ? ParticleTypes.FLAME : Particles.GREEN_FLAME, d, e, f, 0.0D, 0.0D, 0.0D);
        }
    }
}