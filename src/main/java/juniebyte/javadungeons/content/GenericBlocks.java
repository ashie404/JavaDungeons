package juniebyte.javadungeons.content;

import net.minecraft.block.Blocks;

import net.minecraft.sound.BlockSoundGroup;
import juniebyte.javadungeons.blocks.*;

public class GenericBlocks {

    // generic blocks that aren't in mc
    public static DungeonsBlock FLOOR_TILE;
    public static DungeonsBlock DIRTY_FLOOR_TILE;
    public static DungeonsBlock CRATE;
    public static DungeonsBanner RIPPED_BANNER;
    public static DungeonsTent TENT;
    public static DungeonsFence ROPE_FENCE;
    public static DungeonsLantern DUNGEONS_LANTERN;
    public static DungeonsSack SACK;
    public static DungeonsSack SMALL_SACK;

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
    public static DungeonsBlock DARK_ROCKY_DIRT;

    // wood related
    public static DungeonsBlock FLOORBOARDS;
    public static DungeonsBlock BOOKSHELF;
    public static DungeonsBlock DUSTY_BOOKSHELF;
    public static DungeonsBlock EMPTY_BOOKSHELF;
    public static DungeonsTopSlab BRIDGE_PLANKS;
    public static DungeonsBlock DUNGEONS_PLANKS;

    // stone related
    public static DungeonsSlabStairBlock STONE_TILES;
    public static DungeonsSlabStairBlock DIRTY_STONE_TILES;
    public static DungeonsSlabStairBlock DIRTY_STONE_TILES_1;
    public static DungeonsSlabStairBlock DIRTY_STONE_TILES_2;
    public static DungeonsBlock DIRTY_STONE;

    // andesite related
    public static DungeonsBlock CRACKED_ANDESITE;

    // generic plants
    public static DungeonsLeaves BERRY_BUSH_BLOCK;
    public static DungeonsPlant SHORT_GRASS;
    public static DungeonsPlant FERN;
    public static DungeonsPlant SHRUB;
    public static DungeonsPlant YELLOW_TULIP;
    public static DungeonsWaterPlant WATER_PLANT;
    public static DungeonsHangingPlant HANGING_ROSES;

    // sanded andesite
    public static DungeonsBlock SANDED_ANDESITE;
    public static DungeonsBlock SANDED_ANDESITE_TILES;
    public static DungeonsBlock SHADOWED_SANDED_ANDESITE_TILES;
    public static DungeonsBlock MOSSY_SANDED_ANDESITE_TILES;
    public static DungeonsBlock MOSSY_SHADOWED_SANDED_ANDESITE_TILES;
    public static DungeonsBlock SANDED_ANDESITE_BRICKS;
    public static DungeonsBlock CHISELED_SANDED_ANDESITE;

    // glass related
    public static DungeonsTranslucent GLASS;

    public static DungeonsTranslucent BLUE_GLASS;
    public static DungeonsTranslucent BROWN_GLASS;
    public static DungeonsTranslucent BLACK_GLASS;
    public static DungeonsTranslucent GREEN_GLASS;
    public static DungeonsTranslucent YELLOW_GLASS;
    public static DungeonsTranslucent RED_GLASS;
    public static DungeonsTranslucent LIME_GLASS;
    public static DungeonsTranslucent LIGHT_GRAY_GLASS;
    public static DungeonsTranslucent PINK_GLASS;
    public static DungeonsTranslucent MAGENTA_GLASS;
    public static DungeonsTranslucent LIGHT_BLUE_GLASS;
    public static DungeonsTranslucent ORANGE_GLASS;
    public static DungeonsTranslucent GRAY_GLASS;
    public static DungeonsTranslucent PURPLE_GLASS;
    public static DungeonsTranslucent CYAN_GLASS;

    // shelves
    public static DungeonsBlock BEET_SHELF;
    public static DungeonsBlock BOOK_SHELF;
    public static DungeonsBlock CARROT_SHELF;
    public static DungeonsBlock CHEST_SHELF;
    public static DungeonsBlock EMPTY_SHELF;

    // braziers
    public static DungeonsBrazier UNLIT_BRAZIER;
    public static DungeonsBrazier LIT_BRAZIER;
    public static DungeonsBrazier GREEN_LIT_BRAZIER;

    // books
    public static DungeonsBook CLOSED_BOOK;
    public static DungeonsBook OPEN_BOOK;

    // candles
    public static DungeonsCandle CANDLE;
    public static DungeonsCandle GREEN_CANDLE;

    // tray
    public static DungeonsTray TRAY;

    // teapot
    public static DungeonsTeapot TEAPOT;

    // redstone related
    public static DungeonsPoweredEmissive LIGHTHOUSE_LAMP;

    // chains
    public static DungeonsChains CHAINS;

    public static void init() {
        // dungeons blocks that aren't in mc
        FLOOR_TILE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "floor_tile");
        DIRTY_FLOOR_TILE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "dirty_floor_tile");
        CRATE = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "crate");
        RIPPED_BANNER = new DungeonsBanner(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "ripped_banner");
        TENT = new DungeonsTent(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "tent");
        ROPE_FENCE = new DungeonsFence(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "rope_fence");
        DUNGEONS_LANTERN = new DungeonsLantern(5.0F, 6.0F, BlockSoundGroup.LANTERN, ItemGroups.GENERIC, "dungeons_lantern");
        SACK = new DungeonsSack(0.8F, 0.8F, BlockSoundGroup.WOOL, ItemGroups.GENERIC, "sack", false);
        SMALL_SACK = new DungeonsSack(0.8F, 0.8F, BlockSoundGroup.WOOL, ItemGroups.GENERIC, "small_sack", true);

        // food related items
        BARREL_CLOSED = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "barrel_closed");
        FISH_BARREL = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "fish_barrel");
        APPLE_FOOD_BOX = new DungeonsFoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "apple_food_box");
        ORANGE_FOOD_BOX = new DungeonsFoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "orange_food_box");
        FISH_FOOD_BOX = new DungeonsFoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "fish_food_box");
        CORN_FOOD_BOX = new DungeonsFoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "corn_food_box");

        // ground related
        DIRT_PATH = new DungeonsPath(0.5F, 0.5F, BlockSoundGroup.GRAVEL, ItemGroups.GENERIC, "dirt_path");
        DIRT = new DungeonsPathable(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, DIRT_PATH, ItemGroups.GENERIC, "dirt");
        DIRT_SLAB = new DungeonsSlab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, ItemGroups.GENERIC, "dirt_slab");
        ROCKY_DIRT_PATH = new DungeonsPath(0.5F, 0.5F, BlockSoundGroup.GRAVEL, ItemGroups.GENERIC, "rocky_dirt_path");
        ROCKY_DIRT = new DungeonsPathable(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, ROCKY_DIRT_PATH, ItemGroups.GENERIC, "rocky_dirt");
        DENSE_GRASSY_DIRT = new DungeonsBlock( 0.6F, 0.6F, BlockSoundGroup.GRASS, ItemGroups.GENERIC, "dense_grassy_dirt");
        GRASSY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, ItemGroups.GENERIC, "grassy_dirt");
        ROCKY_GRASSY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, ItemGroups.GENERIC, "rocky_grassy_dirt");
        GRASS_BLOCK = new DungeonsPathable( 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, ItemGroups.GENERIC, "grass_block");
        DARK_ROCKY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, ItemGroups.GENERIC, "dark_rocky_dirt");

        // wood related
        FLOORBOARDS = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "floorboards");
        BOOKSHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "bookshelf");
        DUSTY_BOOKSHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "dusty_bookshelf");
        EMPTY_BOOKSHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "empty_bookshelf");
        BRIDGE_PLANKS = new DungeonsTopSlab(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "bridge_planks");
        DUNGEONS_PLANKS = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "dungeons_planks");

        // stone related
        STONE_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "stone_tiles", "stone_tiles_slab", "stone_tiles_stairs");
        DIRTY_STONE_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "dirty_stone_tiles", "dirty_stone_tiles_slab", "dirty_stone_tiles_stairs");
        DIRTY_STONE_TILES_1 = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "dirty_stone_tiles_1", "dirty_stone_tiles_slab_1", "dirty_stone_tiles_stairs_1");
        DIRTY_STONE_TILES_2 = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "dirty_stone_tiles_2", "dirty_stone_tiles_slab_2", "dirty_stone_tiles_stairs_2");
        DIRTY_STONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "dirty_stone");

        // andesite related
        CRACKED_ANDESITE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "cracked_andesite");

        // plants
        BERRY_BUSH_BLOCK = new DungeonsLeaves(0.2F, 0.2F, BlockSoundGroup.GRASS, ItemGroups.GENERIC, "berry_bush_block");
        SHORT_GRASS = new DungeonsPlant( 0.0F, 0.0F, BlockSoundGroup.GRASS, ItemGroups.GENERIC, "short_grass");
        FERN = new DungeonsPlant( 0.0F, 0.0F, BlockSoundGroup.GRASS, ItemGroups.GENERIC, "fern");
        SHRUB = new DungeonsPlant( 0.0F, 0.0F, BlockSoundGroup.GRASS, ItemGroups.GENERIC, "shrub");
        YELLOW_TULIP = new DungeonsPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, ItemGroups.GENERIC, "yellow_tulip");
        WATER_PLANT = new DungeonsWaterPlant( 0.0F, 0.0F, BlockSoundGroup.WET_GRASS, ItemGroups.GENERIC, "water_plant");
        HANGING_ROSES = new DungeonsHangingPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, ItemGroups.GENERIC, "hanging_roses");

        // sanded andesite
        SANDED_ANDESITE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "sanded_andesite");
        SANDED_ANDESITE_TILES = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "sanded_andesite_tiles");
        SHADOWED_SANDED_ANDESITE_TILES = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "shadowed_sanded_andesite_tiles");
        MOSSY_SANDED_ANDESITE_TILES = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "mossy_sanded_andesite_tiles");
        MOSSY_SHADOWED_SANDED_ANDESITE_TILES = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "mossy_shadowed_sanded_andesite_tiles");
        SANDED_ANDESITE_BRICKS = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "sanded_andesite_bricks");
        CHISELED_SANDED_ANDESITE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.GENERIC, "chiseled_sanded_andesite");
      
        // glass related
        GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "glass");

        BLUE_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "blue_glass");
        BROWN_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "brown_glass");
        BLACK_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "black_glass");
        GREEN_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "green_glass");
        YELLOW_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "yellow_glass");
        RED_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "red_glass");
        LIME_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "lime_glass");
        LIGHT_GRAY_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "light_gray_glass");
        PINK_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "pink_glass");
        MAGENTA_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "magenta_glass");
        LIGHT_BLUE_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "light_blue_glass");
        ORANGE_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "orange_glass");
        GRAY_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "gray_glass");
        PURPLE_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "purple_glass");
        CYAN_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, ItemGroups.GENERIC, "cyan_glass");

        // shelves
        BEET_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "beet_shelf");
        BOOK_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "book_shelf");
        CARROT_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "carrot_shelf");
        CHEST_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "chest_shelf");
        EMPTY_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "empty_shelf");

        // braziers
        UNLIT_BRAZIER = new DungeonsBrazier(5.0F, 6.0F, BlockSoundGroup.LANTERN, ItemGroups.GENERIC, "unlit", false, "unlit_brazier");
        LIT_BRAZIER = new DungeonsBrazier(5.0F, 6.0F, BlockSoundGroup.LANTERN, ItemGroups.GENERIC, "lit", false, "lit_brazier");
        GREEN_LIT_BRAZIER = new DungeonsBrazier(5.0F, 6.0F, BlockSoundGroup.LANTERN, ItemGroups.GENERIC, "green_lit", false, "green_lit_brazier");

        // books
        CLOSED_BOOK = new DungeonsBook(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "closed_book");
        OPEN_BOOK = new DungeonsBook(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "open_book");

        // candles
        CANDLE = new DungeonsCandle(5.0F, 6.0F, BlockSoundGroup.LANTERN, ItemGroups.GENERIC, "candle", false);
        GREEN_CANDLE = new DungeonsCandle(5.0F, 6.0F, BlockSoundGroup.LANTERN, ItemGroups.GENERIC, "green_candle", true);

        // tray
        TRAY = new DungeonsTray(2.0F, 3.0F, BlockSoundGroup.WOOD, ItemGroups.GENERIC, "tray");

        // teapot
        TEAPOT = new DungeonsTeapot(5.0F, 6.0F, BlockSoundGroup.LANTERN, ItemGroups.GENERIC, "teapot");

        // redstone related
        LIGHTHOUSE_LAMP = new DungeonsPoweredEmissive( 0.3F, 0.3F, BlockSoundGroup.METAL, ItemGroups.GENERIC, "lighthouse_lamp");

        // chains
        CHAINS = new DungeonsChains(5.0F, 6.0F, BlockSoundGroup.CHAIN, ItemGroups.GENERIC, "chains");
    }
}