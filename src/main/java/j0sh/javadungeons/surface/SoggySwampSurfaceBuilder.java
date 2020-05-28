package j0sh.javadungeons.surface;

import com.mojang.datafixers.Dynamic;
import j0sh.javadungeons.content.Fluids;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import java.util.Random;
import java.util.function.Function;

public class SoggySwampSurfaceBuilder  extends SurfaceBuilder<TernarySurfaceConfig> {

    public SoggySwampSurfaceBuilder(Function<Dynamic<?>, ? extends TernarySurfaceConfig> function) {
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
                if (p == 62 && !chunk.getBlockState(mutable).isOf(Fluids.SOGGY_SWAMP_WATER)) {
                    chunk.setBlockState(mutable, Fluids.SOGGY_SWAMP_WATER.getDefaultState(), false);
                }

                if (chunk.getBlockState(mutable).isOf(defaultFluid.getBlock())) {
                    chunk.setBlockState(mutable, Fluids.SOGGY_SWAMP_WATER.getDefaultState(), false);
                }
                break;
            }
        }
    }
}