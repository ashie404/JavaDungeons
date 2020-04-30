package j0sh.javadungeons.feature;

import com.ibm.icu.impl.coll.FCDIterCollationIterator;
import com.mojang.datafixers.Dynamic;

import j0sh.javadungeons.content.*;

import java.util.Random;
import java.util.function.Function;
import net.minecraft.block.BlockState;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorConfig;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.SeaPickleFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class GlowMushroomFeature extends Feature<SeaPickleFeatureConfig> {
    public GlowMushroomFeature(Function<Dynamic<?>, ? extends SeaPickleFeatureConfig> configFactory) {
        super(configFactory);
    }

    @Override
    public boolean generate(IWorld world, StructureAccessor accessor, ChunkGenerator<? extends ChunkGeneratorConfig> generator, Random random, BlockPos pos, SeaPickleFeatureConfig config) {
        int i = 0;

        for(int j = 0; j < config.count; ++j) {
            int k = random.nextInt(8) - random.nextInt(8);
            int l = random.nextInt(8) - random.nextInt(8);
            int m = world.getTopY(Heightmap.Type.WORLD_SURFACE, pos.getX() + k, pos.getZ() + l);
            BlockPos blockPos2 = new BlockPos(pos.getX() + k, m, pos.getZ() + l);

            BlockState blockState = (BlockState)CreeperWoodsBlocks.CW_GLOW_MUSHROOM.getDefaultState()
                    .with(SeaPickleBlock.WATERLOGGED, false)
                    .with(SeaPickleBlock.PICKLES, random.nextInt(4) + 1);

            // check if the block below is plantable on
            if (world.getBlockState(blockPos2.down()).getBlock().isIn(Tags.PLANTABLE)
                    && blockState.canPlaceAt(world, blockPos2))
                world.setBlockState(blockPos2, blockState, 2);

            ++i;
        }

        return i > 0;
    }
}