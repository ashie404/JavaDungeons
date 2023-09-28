package ashie404.javadungeons.gen;

import ashie404.javadungeons.content.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.util.math.random.Random;
import net.minecraft.block.sapling.*;
import net.minecraft.registry.RegistryKey;

public class SwampSaplingGenerator extends SaplingGenerator {
   public SwampSaplingGenerator() {
   }

   protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
      return Features.SWAMP_SAPLING;
   }
}