package juniebyte.javadungeons.gen;

import juniebyte.javadungeons.content.PumpkinPasturesBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Random;

public class YellowAutumnalSaplingGenerator extends SaplingGenerator {
   protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
      return Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
              new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_LEAVES.getDefaultState()),
              new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
              new StraightTrunkPlacer(4, 2, 0),
              new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build()
      );
   }
}