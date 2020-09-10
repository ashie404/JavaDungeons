package juniebyte.javadungeons.gen;

import com.google.common.collect.ImmutableList;
import juniebyte.javadungeons.content.SoggySwampBlocks;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.tree.LeaveVineTreeDecorator;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Random;

public class SwampSaplingGenerator extends SaplingGenerator {
   protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
      return Feature.TREE.configure((new TreeFeatureConfig.Builder(
        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_LOG.getDefaultState()),
        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_LEAVES.getDefaultState()),
        new BlobFoliagePlacer(UniformIntDistribution.of(3), UniformIntDistribution.of(0), 3),
        new StraightTrunkPlacer(5, 3, 0),
        new TwoLayersFeatureSize(1, 0, 1)
        )).maxWaterDepth(1).decorators(ImmutableList.of(new LeaveVineTreeDecorator())).build());
   }
}