package j0sh.javadungeons.surface;

import com.mojang.serialization.Codec;
import j0sh.javadungeons.content.PumpkinPasturesBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import java.util.Random;

public class CharredPumpkinPasturesSurfaceBuilder extends SurfaceBuilder<TernarySurfaceConfig> {

    public CharredPumpkinPasturesSurfaceBuilder(Codec<TernarySurfaceConfig> function) {
        super(function);
    }

    @Override
    public void generate(Random random, Chunk chunk, Biome biome, int x, int z, int height, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, TernarySurfaceConfig ternarySurfaceConfig) {
        int n = x & 15;
        int o = z & 15;
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        SurfaceBuilder.DEFAULT.generate(random, chunk, biome, x, z, height, noise, defaultBlock, defaultFluid, seaLevel, seed, ternarySurfaceConfig);

        for(int p = height; p >= 0; --p) {
            mutable.set(n, p, o);
            if (!chunk.getBlockState(mutable).isAir()) {
                if(chunk.getBlockState(mutable).isOf(Blocks.STONE)) {
                    chunk.setBlockState(mutable, PumpkinPasturesBlocks.PM_CHARRED_STONE.getDefaultState(), false);
                }
                break;
            }
        }
    }
}