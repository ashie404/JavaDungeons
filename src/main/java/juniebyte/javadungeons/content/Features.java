package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;

public class Features {
    public static RegistryKey<ConfiguredFeature<?, ?>> SWAMP_SAPLING;
    public static RegistryKey<ConfiguredFeature<?, ?>> RED_AUTUMNAL_SAPLING;
    public static RegistryKey<ConfiguredFeature<?, ?>> YELLOW_AUTUMNAL_SAPLING;

    public static void init() {
        SWAMP_SAPLING = ConfiguredFeatures.of(JavaDungeons.MOD_ID + ":swamp_sapling");
        RED_AUTUMNAL_SAPLING = ConfiguredFeatures.of(JavaDungeons.MOD_ID + ":red_autumnal_sapling");
        YELLOW_AUTUMNAL_SAPLING = ConfiguredFeatures.of(JavaDungeons.MOD_ID + ":yellow_autumnal_sapling");
    }
}
