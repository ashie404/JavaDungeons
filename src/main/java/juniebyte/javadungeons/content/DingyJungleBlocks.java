package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DingyJungleBlocks {

    // grass, dirt & mud
    public static Block DJ_GRASS_BLOCK; 
    public static Block DJ_MUDDY_GRASS;
    public static Block DJ_DIRT;
    public static Block DJ_DIRTY_MUD;
    public static Block DJ_MUD;
    public static Block DJ_GRASSY_DIRT;
    public static Block DJ_GRASSY_MUD;
    public static Block DJ_ROCKY_DIRT;

    // pebbles
    public static Block DJ_PEBBLES;
    public static Block DJ_DIRTY_PEBBLES;
    public static Block DJ_GRASSY_PEBBLES;

    // stones
    public static Block DJ_COBBLESTONE;
    public static Block DJ_MOSSY_COBBLESTONE;
    public static Block DJ_OCELOT_STONE;
    public static Block DJ_CHISELED_STONE;
    public static Block DJ_DINGY_CHISELED_STONE;
    public static Block DJ_MOSSY_CHISELED_STONE;
    public static Block DJ_STONE_BRICKS;
    public static Block DJ_CRACKED_STONE_BRICKS;
    public static Block DJ_MOSSY_STONE_BRICKS;

    // stone tiles
    public static Block DJ_STONE_TILES;
    public static Block DJ_DIRTY_STONE_TILES;
    public static Block DJ_DIRTY_STONE_TILES_1;
    public static Block DJ_DIRTY_STONE_TILES_2;

    // bricks
    public static Block DJ_BRICKS;
    public static Block DJ_SLIGHTLY_MOSSY_BRICKS;
    public static Block DJ_MOSSY_BRICKS;
    public static Block DJ_LARGE_BRICKS;

    // stone floors
    public static Block DJ_GREEN_GLAZED_STONE_FLOOR;
    public static Block DJ_DIRTY_GREEN_GLAZED_STONE_FLOOR;
    public static Block DJ_YELLOW_GLAZED_STONE_FLOOR;

    // tiles
    public static Block DJ_TILE;
    public static Block DJ_CRACKED_TILE;
    public static Block DJ_GOLD_EMBEDDED_TILE;

    // plants
    public static Block DJ_GRASS;
    public static Block DJ_RED_FERN;
    public static Block DJ_TALL_FERN;
    public static Block DJ_SHRUB;
    public static Block DJ_DEAD_SHRUB;
    public static Block DJ_BUSH;

    public static void init() {
        // grass, dirt & mud
        DJ_GRASS_BLOCK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS), "dj_grass_block", JavaDungeons.DINGY_JUNGLE);
        DJ_MUDDY_GRASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS), "dj_muddy_grass", JavaDungeons.DINGY_JUNGLE);
        DJ_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dj_dirt", JavaDungeons.DINGY_JUNGLE);
        DJ_DIRTY_MUD = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dj_dirty_mud", JavaDungeons.DINGY_JUNGLE);
        DJ_MUD = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dj_mud", JavaDungeons.DINGY_JUNGLE);
        DJ_GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dj_grassy_dirt", JavaDungeons.DINGY_JUNGLE);
        DJ_GRASSY_MUD = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dj_grassy_mud", JavaDungeons.DINGY_JUNGLE);
        DJ_ROCKY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dj_rocky_dirt", JavaDungeons.DINGY_JUNGLE);
        
        // pebbles
        DJ_PEBBLES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_pebbles", JavaDungeons.DINGY_JUNGLE);
        DJ_DIRTY_PEBBLES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_dirty_pebbles", JavaDungeons.DINGY_JUNGLE);
        DJ_GRASSY_PEBBLES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_grassy_pebbles", JavaDungeons.DINGY_JUNGLE);

        // stones
        DJ_COBBLESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_cobblestone", JavaDungeons.DINGY_JUNGLE);
        DJ_MOSSY_COBBLESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_mossy_cobblestone", JavaDungeons.DINGY_JUNGLE);
        DJ_OCELOT_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_ocelot_stone", JavaDungeons.DINGY_JUNGLE);
        DJ_CHISELED_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_chiseled_stone", JavaDungeons.DINGY_JUNGLE);
        DJ_DINGY_CHISELED_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_dingy_chiseled_stone", JavaDungeons.DINGY_JUNGLE);
        DJ_MOSSY_CHISELED_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_mossy_chiseled_stone", JavaDungeons.DINGY_JUNGLE);
        DJ_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_stone_bricks", JavaDungeons.DINGY_JUNGLE);
        DJ_CRACKED_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_cracked_stone_bricks", JavaDungeons.DINGY_JUNGLE);
        DJ_MOSSY_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_mossy_stone_bricks", JavaDungeons.DINGY_JUNGLE);

        // stone tiles
        DJ_STONE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_stone_tiles", JavaDungeons.DINGY_JUNGLE);
        DJ_DIRTY_STONE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_dirty_stone_tiles", JavaDungeons.DINGY_JUNGLE);
        DJ_DIRTY_STONE_TILES_1 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_dirty_stone_tiles_1", JavaDungeons.DINGY_JUNGLE);
        DJ_DIRTY_STONE_TILES_2 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dj_dirty_stone_tiles_2", JavaDungeons.DINGY_JUNGLE);

        // bricks
        DJ_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_bricks", JavaDungeons.DINGY_JUNGLE);
        DJ_SLIGHTLY_MOSSY_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_slightly_mossy_bricks", JavaDungeons.DINGY_JUNGLE);
        DJ_MOSSY_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_mossy_bricks", JavaDungeons.DINGY_JUNGLE);
        DJ_LARGE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_large_bricks", JavaDungeons.DINGY_JUNGLE);

        // stone floors
        DJ_GREEN_GLAZED_STONE_FLOOR = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_green_glazed_stone_floor", JavaDungeons.DINGY_JUNGLE);
        DJ_DIRTY_GREEN_GLAZED_STONE_FLOOR = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_dirty_green_glazed_stone_floor", JavaDungeons.DINGY_JUNGLE);
        DJ_YELLOW_GLAZED_STONE_FLOOR = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_yellow_glazed_stone_floor", JavaDungeons.DINGY_JUNGLE);

        // tiles
        DJ_TILE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_tile", JavaDungeons.DINGY_JUNGLE);
        DJ_CRACKED_TILE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_cracked_tile", JavaDungeons.DINGY_JUNGLE);
        DJ_GOLD_EMBEDDED_TILE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 2.0F, 6.0F, BlockSoundGroup.STONE), "dj_gold_embedded_tile", JavaDungeons.DINGY_JUNGLE);

        // plants
        DJ_GRASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "dj_grass", JavaDungeons.DINGY_JUNGLE);
        DJ_RED_FERN = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "dj_red_fern", JavaDungeons.DINGY_JUNGLE);
        DJ_TALL_FERN = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTallPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "dj_tall_fern", JavaDungeons.DINGY_JUNGLE);
        DJ_SHRUB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "dj_shrub", JavaDungeons.DINGY_JUNGLE);
        DJ_DEAD_SHRUB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "dj_dead_shrub", JavaDungeons.DINGY_JUNGLE);
        DJ_BUSH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "dj_bush", JavaDungeons.DINGY_JUNGLE);
    }
}