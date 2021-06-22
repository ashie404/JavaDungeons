package juniebyte.javadungeons.blocks.saplings;

import juniebyte.javadungeons.content.ConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;

public class RedAutumnalSaplingGenerator extends SaplingGenerator {
	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
		return random.nextInt(10) == 0 ? ConfiguredFeatures.PM_FANCY_RED_AUTUMNAL_TREE : ConfiguredFeatures.PM_RED_AUTUMNAL_TREE;
	}
}
