/*
package juniebyte.javadungeons.content;

import juniebyte.javadungeons.biome.*;
import juniebyte.javadungeons.JavaDungeons;

import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Biomes {

    public static CreeperWoodsBiome CREEPER_WOODS_BIOME;
    public static PumpkinPasturesBiome PUMPKIN_PASTURES_BIOME;
    public static DungeonsPlainsBiome DUNGEONS_PLAINS_BIOME;
    public static CactiCanyonBiome CACTI_CANYON_BIOME;
    public static CactiCanyonDesertBiome CACTI_CANYON_DESERT_BIOME;
    public static SoggySwampBiome SOGGY_SWAMP_BIOME;

    public static void init() {
        // register biomes
        CREEPER_WOODS_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "creeper_woods"), new CreeperWoodsBiome());
        PUMPKIN_PASTURES_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "pumpkin_pastures"), new PumpkinPasturesBiome());
        DUNGEONS_PLAINS_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "dungeons_plains"), new DungeonsPlainsBiome());
        CACTI_CANYON_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "cacti_canyon"), new CactiCanyonBiome());
        CACTI_CANYON_DESERT_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "cacti_canyon_desert"), new CactiCanyonDesertBiome());
        SOGGY_SWAMP_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp"), new SoggySwampBiome());

        // add biomes to worldgen
        OverworldBiomes.addContinentalBiome(CREEPER_WOODS_BIOME, OverworldClimate.TEMPERATE, 2D);
        OverworldBiomes.addContinentalBiome(PUMPKIN_PASTURES_BIOME, OverworldClimate.TEMPERATE, 2.25D);
        OverworldBiomes.addContinentalBiome(DUNGEONS_PLAINS_BIOME, OverworldClimate.TEMPERATE, 3D);
        OverworldBiomes.addContinentalBiome(SOGGY_SWAMP_BIOME, OverworldClimate.TEMPERATE, 2.25D);
        OverworldBiomes.addContinentalBiome(CACTI_CANYON_BIOME, OverworldClimate.DRY, 2.5D);
        OverworldBiomes.addBiomeVariant(CACTI_CANYON_BIOME, CACTI_CANYON_DESERT_BIOME, 0.6D, OverworldClimate.DRY);

        // add biomes that are spawnable in
        FabricBiomes.addSpawnBiome(CREEPER_WOODS_BIOME);
        FabricBiomes.addSpawnBiome(PUMPKIN_PASTURES_BIOME);
        FabricBiomes.addSpawnBiome(DUNGEONS_PLAINS_BIOME);
        FabricBiomes.addSpawnBiome(SOGGY_SWAMP_BIOME);
        FabricBiomes.addSpawnBiome(CACTI_CANYON_BIOME);
        FabricBiomes.addSpawnBiome(CACTI_CANYON_DESERT_BIOME);
    }
}*/
