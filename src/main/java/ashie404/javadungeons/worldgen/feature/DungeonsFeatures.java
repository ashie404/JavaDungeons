package ashie404.javadungeons.worldgen.feature;

import ashie404.javadungeons.JavaDungeons;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;

public class DungeonsFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_AUTUMNAL_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("red_autumnal_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_AUTUMNAL_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("yellow_autumnal_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOGGY_SWAMP_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("soggy_swamp_tree"));
    public static final Feature<CountConfig> GLOW_MUSHROOM = new GlowMushroomFeature(CountConfig.CODEC);

    public static void init() {
        Registry.register(Registries.FEATURE, JavaDungeons.ID("glow_mushroom"), GLOW_MUSHROOM);
    }
}
 