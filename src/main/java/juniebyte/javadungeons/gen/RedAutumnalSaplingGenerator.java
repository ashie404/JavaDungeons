package juniebyte.javadungeons.gen;

import java.util.OptionalInt;
import java.util.Random;

import juniebyte.javadungeons.content.PumpkinPasturesBlocks;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.block.Blocks;
import net.minecraft.block.sapling.*;

public class RedAutumnalSaplingGenerator extends SaplingGenerator {
   protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
      return random.nextInt(10) == 0 ? Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
      new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.getDefaultState()),
      new LargeOakFoliagePlacer(2, 0, 4, 0, 4),
      new LargeOakTrunkPlacer(3, 11, 0),
      new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().build()) : Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
      new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.getDefaultState()),
      new BlobFoliagePlacer(2, 0, 0, 0, 3),
      new StraightTrunkPlacer(4, 2, 0),
      new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());
   }
}
