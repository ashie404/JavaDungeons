package j0sh.javadungeons.feature;

import com.mojang.datafixers.Dynamic;

import j0sh.javadungeons.content.*;

import java.util.Random;
import java.util.function.Function;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.SeaPickleFeatureConfig;
import net.minecraft.world.gen.feature.SeaPickleFeature;
import net.minecraft.world.gen.feature.Feature;

public class GlowMushroomFeature extends Feature<SeaPickleFeatureConfig> {
    public GlowMushroomFeature(Function<Dynamic<?>, ? extends SeaPickleFeatureConfig> configFactory) {
        super(configFactory);
    }

    public boolean generate(IWorld iWorld, ChunkGenerator<?> chunkGenerator, Random random, BlockPos blockPos, SeaPickleFeatureConfig featureConfig) {
        int i = 0;

        for(int j = 0; j < featureConfig.count; ++j) {
            int k = random.nextInt(8) - random.nextInt(8);
            int l = random.nextInt(8) - random.nextInt(8);
            int m = iWorld.getTopY(Heightmap.Type.WORLD_SURFACE, blockPos.getX() + k, blockPos.getZ() + l);
            BlockPos blockPos2 = new BlockPos(blockPos.getX() + k, m, blockPos.getZ() + l);

            BlockState blockState = (BlockState)CreeperWoodsBlocks.CW_GLOW_MUSHROOM.getDefaultState()
                .with(SeaPickleBlock.WATERLOGGED, false)
                .with(SeaPickleBlock.PICKLES, random.nextInt(4) + 1);

            // check if the block below is plantable on
            if (iWorld.getBlockState(new BlockPos(blockPos2.getX(), blockPos2.getY()-1, blockPos2.getZ())).getBlock().matches(Tags.PLANTABLE) 
            && blockState.canPlaceAt(iWorld, blockPos2))
                iWorld.setBlockState(blockPos2, blockState, 2);

            ++i;
        }

        return i > 0;
    }
}