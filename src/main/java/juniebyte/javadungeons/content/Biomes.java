package juniebyte.javadungeons.content;

import juniebyte.javadungeons.biome.CreeperWoodsBiome;
import juniebyte.javadungeons.utils.BiomeUtils;
import net.fabricmc.fabric.api.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

import static juniebyte.javadungeons.JavaDungeons.MOD_ID;

public class Biomes {

    public static CreeperWoodsBiome CREEPER_WOODS_BIOME;
//    public static PumpkinPasturesBiome PUMPKIN_PASTURES_BIOME;
//    public static DungeonsPlainsBiome DUNGEONS_PLAINS_BIOME;
//    public static CactiCanyonBiome CACTI_CANYON_BIOME;
//    public static CactiCanyonDesertBiome CACTI_CANYON_DESERT_BIOME;
//    public static SoggySwampBiome SOGGY_SWAMP_BIOME;

    public static RegistryKey<Biome> CREEPER_WOODS_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "creeper_woods"));
    public static RegistryKey<Biome> PUMPKIN_PASTURES_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "pumpkin_pastures"));
    public static RegistryKey<Biome> DUNGEONS_PLAINS_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "dungeons_plains"));
    public static RegistryKey<Biome> CACTI_CANYON_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "cacti_canyon"));
    public static RegistryKey<Biome> CACTI_CANYON_DESERT_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "cacti_canyon_desert"));
    public static RegistryKey<Biome> SOGGY_SWAMP_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "soggy_swamp"));

    public static void init() {
        // register biomes
        CREEPER_WOODS_BIOME = Registry.register(BuiltinRegistries.BIOME, CREEPER_WOODS_BIOME_KEY.getValue(), new CreeperWoodsBiome());
//        PUMPKIN_PASTURES_BIOME = Registry.register(BuiltinRegistries.BIOME, PUMPKIN_PASTURES_BIOME_KEY.getValue(), new PumpkinPasturesBiome());
//        DUNGEONS_PLAINS_BIOME = Registry.register(BuiltinRegistries.BIOME, DUNGEONS_PLAINS_BIOME_KEY.getValue(), new DungeonsPlainsBiome());
//        CACTI_CANYON_BIOME = Registry.register(BuiltinRegistries.BIOME, CACTI_CANYON_BIOME_KEY.getValue(), new CactiCanyonBiome());
//        CACTI_CANYON_DESERT_BIOME = Registry.register(BuiltinRegistries.BIOME, CACTI_CANYON_DESERT_BIOME_KEY.getValue(), new CactiCanyonDesertBiome());
//        SOGGY_SWAMP_BIOME = Registry.register(BuiltinRegistries.BIOME, SOGGY_SWAMP_BIOME_KEY.getValue(), new SoggySwampBiome());

        // add biomes to worldgen
        BiomeUtils.addContinentalBiome(CREEPER_WOODS_BIOME_KEY, OverworldClimate.TEMPERATE, 2D);
//        BiomeUtils.addContinentalBiome(PUMPKIN_PASTURES_BIOME_KEY, OverworldClimate.TEMPERATE, 2.25D);
//        BiomeUtils.addContinentalBiome(DUNGEONS_PLAINS_BIOME_KEY, OverworldClimate.TEMPERATE, 3D);
//        BiomeUtils.addContinentalBiome(SOGGY_SWAMP_BIOME_KEY, OverworldClimate.TEMPERATE, 2.25D);
//        BiomeUtils.addContinentalBiome(CACTI_CANYON_BIOME_KEY, OverworldClimate.DRY, 2.5D);
//        BiomeUtils.addBiomeVariant(CACTI_CANYON_BIOME_KEY, CACTI_CANYON_DESERT_BIOME_KEY, 0.6D, OverworldClimate.DRY);

        // add biomes that are spawnable in
//        BiomeUtils.addSpawnBiome(CREEPER_WOODS_BIOME);
//        BiomeUtils.addSpawnBiome(PUMPKIN_PASTURES_BIOME);
//        BiomeUtils.addSpawnBiome(DUNGEONS_PLAINS_BIOME);
//        BiomeUtils.addSpawnBiome(SOGGY_SWAMP_BIOME);
//        BiomeUtils.addSpawnBiome(CACTI_CANYON_BIOME);
//        BiomeUtils.addSpawnBiome(CACTI_CANYON_DESERT_BIOME);
    }
}
