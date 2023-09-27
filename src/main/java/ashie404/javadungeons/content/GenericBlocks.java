package ashie404.javadungeons.content;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.JavaDungeons;

public class GenericBlocks {

    private static final Identifier GROUP_ID = new Identifier(JavaDungeons.MOD_ID, "generic");

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
        FLOOR_TILE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "floor_tile");
        DIRTY_FLOOR_TILE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_floor_tile");
        CRATE = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "crate");
        RIPPED_BANNER = new DungeonsBanner(2.0F, 3.0F, BlockSoundGroup.WOOD, "ripped_banner");
        TENT = new DungeonsTent(2.0F, 3.0F, BlockSoundGroup.WOOD, "tent");
        ROPE_FENCE = new DungeonsFence(2.0F, 3.0F, BlockSoundGroup.WOOD, "rope_fence");
        DUNGEONS_LANTERN = new DungeonsLantern(5.0F, 6.0F, BlockSoundGroup.LANTERN, "dungeons_lantern");
        SACK = new DungeonsSack(0.8F, 0.8F, BlockSoundGroup.WOOL, "sack", false);
        SMALL_SACK = new DungeonsSack(0.8F, 0.8F, BlockSoundGroup.WOOL, "small_sack", true);

        // food related items
        BARREL_CLOSED = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "barrel_closed");
        FISH_BARREL = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "fish_barrel");
        APPLE_FOOD_BOX = new DungeonsFoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "apple_food_box");
        ORANGE_FOOD_BOX = new DungeonsFoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "orange_food_box");
        FISH_FOOD_BOX = new DungeonsFoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "fish_food_box");
        CORN_FOOD_BOX = new DungeonsFoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "corn_food_box");

        // ground related
        DIRT_PATH = new DungeonsPath(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dirt_path");
        DIRT = new DungeonsPathable(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, DIRT_PATH, "dirt");
        DIRT_SLAB = new DungeonsSlab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dirt_slab");
        ROCKY_DIRT_PATH = new DungeonsPath(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "rocky_dirt_path");
        ROCKY_DIRT = new DungeonsPathable(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, ROCKY_DIRT_PATH, "rocky_dirt");
        DENSE_GRASSY_DIRT = new DungeonsBlock( 0.6F, 0.6F, BlockSoundGroup.GRASS, "dense_grassy_dirt");
        GRASSY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "grassy_dirt");
        ROCKY_GRASSY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "rocky_grassy_dirt");
        GRASS_BLOCK = new DungeonsPathable( 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, "grass_block");
        DARK_ROCKY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dark_rocky_dirt");

        // wood related
        FLOORBOARDS = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "floorboards");
        BOOKSHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "bookshelf");
        DUSTY_BOOKSHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "dusty_bookshelf");
        EMPTY_BOOKSHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "empty_bookshelf");
        BRIDGE_PLANKS = new DungeonsTopSlab(2.0F, 3.0F, BlockSoundGroup.WOOD, "bridge_planks");
        DUNGEONS_PLANKS = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "dungeons_planks");

        // stone related
        STONE_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "stone_tiles", "stone_tiles_slab", "stone_tiles_stairs");
        DIRTY_STONE_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles", "dirty_stone_tiles_slab", "dirty_stone_tiles_stairs");
        DIRTY_STONE_TILES_1 = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles_1", "dirty_stone_tiles_slab_1", "dirty_stone_tiles_stairs_1");
        DIRTY_STONE_TILES_2 = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles_2", "dirty_stone_tiles_slab_2", "dirty_stone_tiles_stairs_2");
        DIRTY_STONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone");

        // andesite related
        CRACKED_ANDESITE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cracked_andesite");

        // plants
        BERRY_BUSH_BLOCK = new DungeonsLeaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "berry_bush_block");
        SHORT_GRASS = new DungeonsPlant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "short_grass");
        FERN = new DungeonsPlant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "fern");
        SHRUB = new DungeonsPlant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "shrub");
        YELLOW_TULIP = new DungeonsPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "yellow_tulip");
        WATER_PLANT = new DungeonsWaterPlant( 0.0F, 0.0F, BlockSoundGroup.WET_GRASS, "water_plant");
        HANGING_ROSES = new DungeonsHangingPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "hanging_roses");

        // sanded andesite
        SANDED_ANDESITE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite");
        SANDED_ANDESITE_TILES = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite_tiles");
        SHADOWED_SANDED_ANDESITE_TILES = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "shadowed_sanded_andesite_tiles");
        MOSSY_SANDED_ANDESITE_TILES = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "mossy_sanded_andesite_tiles");
        MOSSY_SHADOWED_SANDED_ANDESITE_TILES = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "mossy_shadowed_sanded_andesite_tiles");
        SANDED_ANDESITE_BRICKS = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite_bricks");
        CHISELED_SANDED_ANDESITE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "chiseled_sanded_andesite");
      
        // glass related
        GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "glass");

        BLUE_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "blue_glass");
        BROWN_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "brown_glass");
        BLACK_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "black_glass");
        GREEN_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "green_glass");
        YELLOW_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "yellow_glass");
        RED_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "red_glass");
        LIME_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "lime_glass");
        LIGHT_GRAY_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "light_gray_glass");
        PINK_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "pink_glass");
        MAGENTA_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "magenta_glass");
        LIGHT_BLUE_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "light_blue_glass");
        ORANGE_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "orange_glass");
        GRAY_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "gray_glass");
        PURPLE_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "purple_glass");
        CYAN_GLASS = new DungeonsTranslucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "cyan_glass");

        // shelves
        BEET_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "beet_shelf");
        BOOK_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "book_shelf");
        CARROT_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "carrot_shelf");
        CHEST_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "chest_shelf");
        EMPTY_SHELF = new DungeonsBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "empty_shelf");

        // braziers
        UNLIT_BRAZIER = new DungeonsBrazier(5.0F, 6.0F, BlockSoundGroup.LANTERN, "unlit", false, "unlit_brazier");
        LIT_BRAZIER = new DungeonsBrazier(5.0F, 6.0F, BlockSoundGroup.LANTERN, "lit", false, "lit_brazier");
        GREEN_LIT_BRAZIER = new DungeonsBrazier(5.0F, 6.0F, BlockSoundGroup.LANTERN, "green_lit", false, "green_lit_brazier");

        // books
        CLOSED_BOOK = new DungeonsBook(2.0F, 3.0F, BlockSoundGroup.WOOD, "closed_book");
        OPEN_BOOK = new DungeonsBook(2.0F, 3.0F, BlockSoundGroup.WOOD, "open_book");

        // candles
        CANDLE = new DungeonsCandle(5.0F, 6.0F, BlockSoundGroup.LANTERN, "candle", false);
        GREEN_CANDLE = new DungeonsCandle(5.0F, 6.0F, BlockSoundGroup.LANTERN, "green_candle", true);

        // tray
        TRAY = new DungeonsTray(2.0F, 3.0F, BlockSoundGroup.WOOD, "tray");

        // teapot
        TEAPOT = new DungeonsTeapot(5.0F, 6.0F, BlockSoundGroup.LANTERN, "teapot");

        // redstone related
        LIGHTHOUSE_LAMP = new DungeonsPoweredEmissive( 0.3F, 0.3F, BlockSoundGroup.METAL, "lighthouse_lamp");

        // chains
        CHAINS = new DungeonsChains(5.0F, 6.0F, BlockSoundGroup.CHAIN, "chains");

        // Add all blocks to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier("dungeons", "generic"))).register(content -> {
            content.add(FLOOR_TILE.blockItem);
            content.add(DIRTY_FLOOR_TILE.blockItem);
            content.add(CRATE.blockItem);
            content.add(RIPPED_BANNER.blockItem);
            content.add(TENT.blockItem);
            content.add(ROPE_FENCE.blockItem);
            content.add(DUNGEONS_LANTERN.blockItem);
            content.add(SACK.blockItem);
            content.add(SMALL_SACK.blockItem);
            content.add(BARREL_CLOSED.blockItem);
            content.add(FISH_BARREL.blockItem);
            content.add(APPLE_FOOD_BOX.blockItem);
            content.add(ORANGE_FOOD_BOX.blockItem);
            content.add(FISH_FOOD_BOX.blockItem);
            content.add(CORN_FOOD_BOX.blockItem);
            content.add(DIRT.blockItem);
            content.add(DIRT_SLAB.blockItem);
            content.add(DIRT_PATH.blockItem);
            content.add(ROCKY_DIRT.blockItem);
            content.add(ROCKY_DIRT_PATH.blockItem);
            content.add(DENSE_GRASSY_DIRT.blockItem);
            content.add(GRASSY_DIRT.blockItem);
            content.add(ROCKY_GRASSY_DIRT.blockItem);
            content.add(GRASS_BLOCK.blockItem);
            content.add(DARK_ROCKY_DIRT.blockItem);
            content.add(FLOORBOARDS.blockItem);
            content.add(BOOKSHELF.blockItem);
            content.add(DUSTY_BOOKSHELF.blockItem);
            content.add(EMPTY_BOOKSHELF.blockItem);
            content.add(BRIDGE_PLANKS.blockItem);
            content.add(DUNGEONS_PLANKS.blockItem);
            content.add(STONE_TILES.base.blockItem);
            content.add(STONE_TILES.slab.blockItem);
            content.add(STONE_TILES.stairs.blockItem);
            content.add(DIRTY_STONE_TILES.base.blockItem);
            content.add(DIRTY_STONE_TILES.slab.blockItem);
            content.add(DIRTY_STONE_TILES.stairs.blockItem);
            content.add(DIRTY_STONE_TILES_1.base.blockItem);
            content.add(DIRTY_STONE_TILES_1.slab.blockItem);
            content.add(DIRTY_STONE_TILES_1.stairs.blockItem);
            content.add(DIRTY_STONE_TILES_2.base.blockItem);
            content.add(DIRTY_STONE_TILES_2.slab.blockItem);
            content.add(DIRTY_STONE_TILES_2.stairs.blockItem);
            content.add(DIRTY_STONE.blockItem);
            content.add(CRACKED_ANDESITE.blockItem);
            content.add(BERRY_BUSH_BLOCK.blockItem);
            content.add(SHORT_GRASS.blockItem);
            content.add(FERN.blockItem);
            content.add(SHRUB.blockItem);
            content.add(YELLOW_TULIP.blockItem);
            content.add(WATER_PLANT.blockItem);
            content.add(HANGING_ROSES.blockItem);
            content.add(SANDED_ANDESITE.blockItem);
            content.add(SANDED_ANDESITE_TILES.blockItem);
            content.add(SHADOWED_SANDED_ANDESITE_TILES.blockItem);
            content.add(MOSSY_SANDED_ANDESITE_TILES.blockItem);
            content.add(MOSSY_SHADOWED_SANDED_ANDESITE_TILES.blockItem);
            content.add(SANDED_ANDESITE_BRICKS.blockItem);
            content.add(CHISELED_SANDED_ANDESITE.blockItem);
            content.add(GLASS.blockItem);
            content.add(BLUE_GLASS.blockItem);
            content.add(BROWN_GLASS.blockItem);
            content.add(BLACK_GLASS.blockItem);
            content.add(GREEN_GLASS.blockItem);
            content.add(YELLOW_GLASS.blockItem);
            content.add(RED_GLASS.blockItem);
            content.add(LIME_GLASS.blockItem);
            content.add(LIGHT_GRAY_GLASS.blockItem);
            content.add(PINK_GLASS.blockItem);
            content.add(MAGENTA_GLASS.blockItem);
            content.add(LIGHT_BLUE_GLASS.blockItem);
            content.add(ORANGE_GLASS.blockItem);
            content.add(GRAY_GLASS.blockItem);
            content.add(PURPLE_GLASS.blockItem);
            content.add(CYAN_GLASS.blockItem);
            content.add(BEET_SHELF.blockItem);
            content.add(BOOK_SHELF.blockItem);
            content.add(CARROT_SHELF.blockItem);
            content.add(CHEST_SHELF.blockItem);
            content.add(EMPTY_SHELF.blockItem);
            content.add(UNLIT_BRAZIER.blockItem);
            content.add(LIT_BRAZIER.blockItem);
            content.add(GREEN_LIT_BRAZIER.blockItem);
            content.add(CLOSED_BOOK.blockItem);
            content.add(OPEN_BOOK.blockItem);
            content.add(CANDLE.blockItem);
            content.add(GREEN_CANDLE.blockItem);
            content.add(TRAY.blockItem);
            content.add(TEAPOT.blockItem);
            content.add(LIGHTHOUSE_LAMP.blockItem);
            content.add(CHAINS.blockItem);
        });
    }
}