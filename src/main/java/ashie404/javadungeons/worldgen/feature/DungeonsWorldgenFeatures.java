package ashie404.javadungeons.worldgen.feature;

import ashie404.javadungeons.JavaDungeons;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class DungeonsWorldgenFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_AUTUMNAL = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(JavaDungeons.MOD_ID, "red_autumnal"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_AUTUMNAL = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(JavaDungeons.MOD_ID, "yellow_autumnal"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> SWAMP = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(JavaDungeons.MOD_ID, "swamp"));
}
 