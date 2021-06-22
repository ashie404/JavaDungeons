package juniebyte.javadungeons.blocks.saplings;

import juniebyte.javadungeons.content.JDConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;

public class SwampSaplingGenerator extends SaplingGenerator {

	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
        return JDConfiguredFeatures.SS_SWAMP_TREE;
	}

}