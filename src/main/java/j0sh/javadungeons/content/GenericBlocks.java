package j0sh.javadungeons.content;

import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class GenericBlocks {

    // generic blocks that aren't in mc
    public static DungeonsBlock FLOOR_TILE;
    public static DungeonsBlock DIRTY_FLOOR_TILE;
    public static DungeonsBlock CRATE;
    public static DungeonsBanner RIPPED_BANNER;
    public static DungeonsTent TENT;
    public static DungeonsFence ROPE_FENCE;
    public static DungeonsLantern DUNGEONS_LANTERN;

    // food related
    public static DungeonsBlock BARREL_CLOSED;
    public static DungeonsBlock FISH_BARREL;
    public static DungeonsFoodBox APPLE_FOOD_BOX;
    public static DungeonsFoodBox ORANGE_FOOD_BOX;
    public static DungeonsFoodBox FISH_FOOD_BOX;
    public static DungeonsFoodBox CORN_FOOD_BOX;

    // ground related
    public static DungeonsPathable DIRT;
    public static DungeonsSlab DIRT_SLAB;
    public static DungeonsPath DIRT_PATH;
    public static DungeonsPathable ROCKY_DIRT;
    public static DungeonsPath ROCKY_DIRT_PATH;
    public static DungeonsBlock DENSE_GRASSY_DIRT;
    public static DungeonsBlock GRASSY_DIRT;
    public static DungeonsBlock ROCKY_GRASSY_DIRT;
    public static DungeonsPathable GRASS_BLOCK;

    // wood related
    public static DungeonsBlock FLOORBOARDS;
    public static DungeonsBlock BOOKSHELF;
    public static DungeonsBlock DUSTY_BOOKSHELF;
    public static DungeonsBlock EMPTY_BOOKSHELF;
    public static DungeonsTopSlab BRIDGE_PLANKS;
    public static DungeonsBlock DUNGEONS_PLANKS;

    // stone-brick related
    public static DungeonsBlock DARK_STONE_BRICKS;
    public static DungeonsBlock DIRTY_DARK_STONE_BRICKS;
    public static DungeonsBlock CHISELED_DARK_STONE;
    public static DungeonsBlock STONE_TILES;
    public static DungeonsSlab STONE_TILES_SLAB;
    public static DungeonsBlock DIRTY_STONE_TILES;
    public static DungeonsBlock DIRTY_STONE_TILES_1;
    public static DungeonsSlab DIRTY_STONE_TILES_SLAB;
    public static DungeonsSlab DIRTY_STONE_TILES_SLAB_1;

    // stone related
    public static DungeonsBlock DIRTY_STONE;

    // andesite related
    public static DungeonsBlock EMBLEMED_ANDESITE;
    public static DungeonsBlock CRACKED_ANDESITE;

    // generic plants
    public static DungeonsLeaves BERRY_BUSH_BLOCK;
    public static DungeonsPlant SHORT_GRASS;
    public static DungeonsPlant FERN;
    public static DungeonsPlant SHRUB;
    public static DungeonsWaterPlant WATER_PLANT;

    // sanded andesite
    public static DungeonsBlock SANDED_ANDESITE;
    public static DungeonsBlock SANDED_ANDESITE_TILES;
    public static DungeonsBlock SHADOWED_SANDED_ANDESITE_TILES;
    public static DungeonsBlock MOSSY_SANDED_ANDESITE_TILES;
    public static DungeonsBlock MOSSY_SHADOWED_SANDED_ANDESITE_TILES;
    public static DungeonsBlock SANDED_ANDESITE_BRICKS;
    public static DungeonsBlock CHISELED_SANDED_ANDESITE;

    // redstone related
    public static DungeonsPoweredEmissive LIGHTHOUSE_LAMP;

    public static void init() {
        // dungeons blocks that aren't in mc
        FLOOR_TILE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "floor_tile");
        DIRTY_FLOOR_TILE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "dirty_floor_tile");
        CRATE = new DungeonsBlock(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "crate");
        RIPPED_BANNER = new DungeonsBanner(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "ripped_banner");
        TENT = new DungeonsTent(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "tent");
        ROPE_FENCE = new DungeonsFence(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "rope_fence");
        DUNGEONS_LANTERN = new DungeonsLantern(Material.METAL, BlockSoundGroup.LANTERN, JavaDungeons.GENERIC, "dungeons_lantern");

        // food related items
        BARREL_CLOSED = new DungeonsBlock(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "barrel_closed");
        FISH_BARREL = new DungeonsBlock(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "fish_barrel");
        APPLE_FOOD_BOX = new DungeonsFoodBox(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "apple_food_box");
        ORANGE_FOOD_BOX = new DungeonsFoodBox(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "orange_food_box");
        FISH_FOOD_BOX = new DungeonsFoodBox(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "fish_food_box");
        CORN_FOOD_BOX = new DungeonsFoodBox(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "corn_food_box");

        // ground related
        DIRT_PATH = new DungeonsPath(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.GENERIC, "dirt_path");
        DIRT = new DungeonsPathable(Material.EARTH, BlockSoundGroup.GRAVEL, DIRT_PATH, JavaDungeons.GENERIC, "dirt");
        DIRT_SLAB = new DungeonsSlab(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.GENERIC, "dirt_slab");
        ROCKY_DIRT_PATH = new DungeonsPath(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.GENERIC, "rocky_dirt_path");
        ROCKY_DIRT = new DungeonsPathable(Material.EARTH, BlockSoundGroup.GRAVEL, ROCKY_DIRT_PATH, JavaDungeons.GENERIC, "rocky_dirt");
        DENSE_GRASSY_DIRT = new DungeonsBlock(Material.ORGANIC, BlockSoundGroup.GRASS, JavaDungeons.GENERIC, "dense_grassy_dirt");
        GRASSY_DIRT = new DungeonsBlock(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.GENERIC, "grassy_dirt");
        ROCKY_GRASSY_DIRT = new DungeonsBlock(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.GENERIC, "rocky_grassy_dirt");
        GRASS_BLOCK = new DungeonsPathable(Material.ORGANIC, BlockSoundGroup.GRASS, Blocks.GRASS_PATH, JavaDungeons.GENERIC, "grass_block");

        // wood related
        FLOORBOARDS = new DungeonsBlock(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "floorboards");
        BOOKSHELF = new DungeonsBlock(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "bookshelf");
        DUSTY_BOOKSHELF = new DungeonsBlock(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "dusty_bookshelf");
        EMPTY_BOOKSHELF = new DungeonsBlock(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "empty_bookshelf");
        BRIDGE_PLANKS = new DungeonsTopSlab(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "bridge_planks");
        DUNGEONS_PLANKS = new DungeonsBlock(Material.WOOD, BlockSoundGroup.WOOD, JavaDungeons.GENERIC, "dungeons_planks");

        // stone brick related
        DARK_STONE_BRICKS = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "dark_stone_bricks");
        DIRTY_DARK_STONE_BRICKS = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "dirty_dark_stone_bricks");
        CHISELED_DARK_STONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "chiseled_dark_stone");
        STONE_TILES = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "stone_tiles");
        STONE_TILES_SLAB = new DungeonsSlab(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "stone_tiles_slab");
        DIRTY_STONE_TILES = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "dirty_stone_tiles");
        DIRTY_STONE_TILES_1 = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "dirty_stone_tiles_1");
        DIRTY_STONE_TILES_SLAB = new DungeonsSlab(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "dirty_stone_tiles_slab");
        DIRTY_STONE_TILES_SLAB_1 = new DungeonsSlab(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "dirty_stone_tiles_slab_1");

        // stone related
        DIRTY_STONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "dirty_stone");

        // andesite related
        EMBLEMED_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "emblemed_andesite");
        CRACKED_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "cracked_andesite");

        // plants
        BERRY_BUSH_BLOCK = new DungeonsLeaves(Material.LEAVES, BlockSoundGroup.GRASS, JavaDungeons.GENERIC, "berry_bush_block");
        SHORT_GRASS = new DungeonsPlant(Material.PLANT, BlockSoundGroup.GRASS, JavaDungeons.GENERIC, "short_grass");
        FERN = new DungeonsPlant(Material.PLANT, BlockSoundGroup.GRASS, JavaDungeons.GENERIC, "fern");
        SHRUB = new DungeonsPlant(Material.PLANT, BlockSoundGroup.GRASS, JavaDungeons.GENERIC, "shrub");
        WATER_PLANT = new DungeonsWaterPlant(Material.SEAGRASS, BlockSoundGroup.WET_GRASS, JavaDungeons.GENERIC, "water_plant");

        // sanded andesite
        SANDED_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "sanded_andesite");
        SANDED_ANDESITE_TILES = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "sanded_andesite_tiles");
        SHADOWED_SANDED_ANDESITE_TILES = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "shadowed_sanded_andesite_tiles");
        MOSSY_SANDED_ANDESITE_TILES = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "mossy_sanded_andesite_tiles");
        MOSSY_SHADOWED_SANDED_ANDESITE_TILES = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "mossy_shadowed_sanded_andesite_tiles");
        SANDED_ANDESITE_BRICKS = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "sanded_andesite_bricks");
        CHISELED_SANDED_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.GENERIC, "chiseled_sanded_andesite");
      
        // redstone related
        LIGHTHOUSE_LAMP = new DungeonsPoweredEmissive(Material.REDSTONE_LAMP, BlockSoundGroup.METAL, JavaDungeons.GENERIC, "lighthouse_lamp");
    }
}