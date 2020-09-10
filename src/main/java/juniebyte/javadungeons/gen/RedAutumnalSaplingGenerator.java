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
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.OptionalInt;
import java.util.Random;

public class RedAutumnalSaplingGenerator extends SaplingGenerator {
   protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
      return random.nextInt(10) == 0 ? Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
      new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.getDefaultState()),
      new LargeOakFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(4), 4),
      new LargeOakTrunkPlacer(3, 11, 0),
      new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().build()) : Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
      new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.getDefaultState()),
      new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
      new StraightTrunkPlacer(4, 2, 0),
      new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());
   }
}
