package juniebyte.javadungeons.gen;

import java.util.Random;

import com.google.common.collect.ImmutableList;

import juniebyte.javadungeons.content.SoggySwampBlocks;
import net.minecraft.world.gen.decorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.block.sapling.*;

public class SwampSaplingGenerator extends SaplingGenerator {
   protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
      return Feature.TREE.configure((new TreeFeatureConfig.Builder(
        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_LOG.getDefaultState()),
        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_LEAVES.getDefaultState()),
        new BlobFoliagePlacer(3, 0, 0, 0, 3),
        new StraightTrunkPlacer(5, 3, 0),
        new TwoLayersFeatureSize(1, 0, 1)
        )).maxWaterDepth(1).decorators(ImmutableList.of(new LeaveVineTreeDecorator())).build());
   }
}