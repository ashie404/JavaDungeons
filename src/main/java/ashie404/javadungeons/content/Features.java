package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.worldgen.feature.CactiCanyonPillarsFeature;
import ashie404.javadungeons.worldgen.feature.GlowMushroomFeature;
import ashie404.javadungeons.worldgen.feature.JungleGlowMushroomFeature;
import ashie404.javadungeons.worldgen.feature.SeaweedFeature;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class Features {
    // Configured feature registry keys
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_AUTUMNAL_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("red_autumnal_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_AUTUMNAL_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("yellow_autumnal_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOGGY_SWAMP_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("soggy_swamp_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_OAK = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("fancy_jungle_oak"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("jungle_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, JavaDungeons.ID("mega_jungle_tree"));
    
    // Mod features
    public static final Feature<CountConfig> GLOW_MUSHROOM = new GlowMushroomFeature(CountConfig.CODEC);
    public static final Feature<CountConfig> JUNGLE_GLOW_MUSHROOM = new JungleGlowMushroomFeature(CountConfig.CODEC);
    public static final Feature<DefaultFeatureConfig> CACTI_CANYON_PILLARS = new CactiCanyonPillarsFeature(DefaultFeatureConfig.CODEC);
    public static final Feature<ProbabilityConfig> SEAWEED = new SeaweedFeature(ProbabilityConfig.CODEC);

    public static void init() {
        // Register mod features
        Registry.register(Registries.FEATURE, JavaDungeons.ID("glow_mushroom"), GLOW_MUSHROOM);
        Registry.register(Registries.FEATURE, JavaDungeons.ID("jungle_glow_mushroom"), JUNGLE_GLOW_MUSHROOM);
        Registry.register(Registries.FEATURE, JavaDungeons.ID("cacti_canyon_pillars"), CACTI_CANYON_PILLARS);
        Registry.register(Registries.FEATURE, JavaDungeons.ID("seaweed"), SEAWEED);
    }
}
 