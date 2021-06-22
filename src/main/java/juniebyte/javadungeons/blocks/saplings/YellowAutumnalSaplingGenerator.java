package juniebyte.javadungeons.blocks.saplings;

import juniebyte.javadungeons.content.JDConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;

public class YellowAutumnalSaplingGenerator extends SaplingGenerator {
   protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
      return random.nextInt(10) == 0 ? JDConfiguredFeatures.PM_FANCY_YELLOW_AUTUMNAL_TREE : JDConfiguredFeatures.PM_YELLOW_AUTUMNAL_TREE;
   }
}