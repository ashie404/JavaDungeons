package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.worldgen.feature.CactiCanyonPillarsFeature;
import ashie404.javadungeons.worldgen.feature.GlowMushroomFeature;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class Features {
    // Configured feature registry keys
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_AUTUMNAL_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("red_autumnal_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_AUTUMNAL_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("yellow_autumnal_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOGGY_SWAMP_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("soggy_swamp_tree"));
    
    // Mod features
    public static final Feature<CountConfig> GLOW_MUSHROOM = new GlowMushroomFeature(CountConfig.CODEC);
    public static final Feature<DefaultFeatureConfig> CACTI_CANYON_PILLARS = new CactiCanyonPillarsFeature(DefaultFeatureConfig.CODEC);

    public static void init() {
        JavaDungeons.log.info("Registering Features!");
        // Register mod features
        Registry.register(Registries.FEATURE, JavaDungeons.ID("glow_mushroom"), GLOW_MUSHROOM);
        Registry.register(Registries.FEATURE, JavaDungeons.ID("cacti_canyon_pillars"), CACTI_CANYON_PILLARS);
    }
}
 