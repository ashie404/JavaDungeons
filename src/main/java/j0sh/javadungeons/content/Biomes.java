package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.biome.CreeperWoodsBiome;
import j0sh.javadungeons.biome.DungeonsPlainsBiome;
import j0sh.javadungeons.biome.PumpkinPasturesBiome;
import j0sh.javadungeons.biome.DungeonsSoggySwampBiome;
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Biomes {

    public static CreeperWoodsBiome CREEPER_WOODS_BIOME;
    public static PumpkinPasturesBiome PUMPKIN_PASTURES_BIOME;
    public static DungeonsPlainsBiome DUNGEONS_PLAINS_BIOME;
    public static DungeonsSoggySwampBiome SOGGY_SWAMP_BIOME;

    public static void init() {
        // register biomes
        CREEPER_WOODS_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "creeper_woods"), new CreeperWoodsBiome());
        PUMPKIN_PASTURES_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "pumpkin_pastures"), new PumpkinPasturesBiome());
        DUNGEONS_PLAINS_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "dungeons_plains"), new DungeonsPlainsBiome());
        SOGGY_SWAMP_BIOME = Registry.register(Registry.BIOME, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp"), new DungeonsSoggySwampBiome());

        // add biomes to worldgen
        OverworldBiomes.addContinentalBiome(CREEPER_WOODS_BIOME, OverworldClimate.TEMPERATE, 2D);
        OverworldBiomes.addContinentalBiome(PUMPKIN_PASTURES_BIOME, OverworldClimate.TEMPERATE, 2.25D);
        OverworldBiomes.addContinentalBiome(DUNGEONS_PLAINS_BIOME, OverworldClimate.TEMPERATE, 3D);

        // add biomes that are spawnable in
        FabricBiomes.addSpawnBiome(CREEPER_WOODS_BIOME);
        FabricBiomes.addSpawnBiome(PUMPKIN_PASTURES_BIOME);
        FabricBiomes.addSpawnBiome(DUNGEONS_PLAINS_BIOME);
    }

}