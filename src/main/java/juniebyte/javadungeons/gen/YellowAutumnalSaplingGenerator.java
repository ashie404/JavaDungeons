package juniebyte.javadungeons.gen;

import juniebyte.javadungeons.content.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.util.math.random.Random;
import net.minecraft.block.sapling.*;
import net.minecraft.registry.RegistryKey;

public class YellowAutumnalSaplingGenerator extends SaplingGenerator {
   public YellowAutumnalSaplingGenerator() {
   }

   protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
      return Features.YELLOW_AUTUMNAL_SAPLING;
   }
}