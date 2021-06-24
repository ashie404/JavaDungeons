package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import juniebyte.javadungeons.blocks.entity.DungeonsSackBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;

public class GenericBlocks {

    // generic blocks that aren't in mc
    public static Block FLOOR_TILE;
    public static Block DIRTY_FLOOR_TILE;
    public static Block CRATE;
    public static Block RIPPED_BANNER;
    public static Block TENT;
    public static Block ROPE_FENCE;
    public static Block DUNGEONS_LANTERN;
    public static Block SACK;
    public static Block SMALL_SACK;
    public static BlockEntityType<DungeonsSackBlockEntity> SACK_BE;

    // food related
    public static Block BARREL_CLOSED;
    public static Block FISH_BARREL;
    public static Block APPLE_FOOD_BOX;
    public static Block ORANGE_FOOD_BOX;
    public static Block FISH_FOOD_BOX;
    public static Block CORN_FOOD_BOX;

    // ground related
    public static Block DIRT;
    public static Block DIRT_SLAB;
    public static Block DIRT_PATH;
    public static Block ROCKY_DIRT;
    public static Block ROCKY_DIRT_PATH;
    public static Block DENSE_GRASSY_DIRT;
    public static Block GRASSY_DIRT;
    public static Block ROCKY_GRASSY_DIRT;
    public static Block GRASS_BLOCK;
    public static Block DARK_ROCKY_DIRT;

    // wood related
    public static Block FLOORBOARDS;
    public static Block BOOKSHELF;
    public static Block DUSTY_BOOKSHELF;
    public static Block EMPTY_BOOKSHELF;
    public static Block BRIDGE_PLANKS;
    public static Block DUNGEONS_PLANKS;

    // stone related
    public static Block STONE_TILES;
    public static Block DIRTY_STONE_TILES;
    public static Block DIRTY_STONE_TILES_1;
    public static Block DIRTY_STONE_TILES_2;
    public static Block DIRTY_STONE;

    // andesite related
    public static Block CRACKED_ANDESITE;

    // generic plants
    public static Block BERRY_BUSH_BLOCK;
    public static Block SHORT_GRASS;
    public static Block FERN;
    public static Block SHRUB;
    public static Block YELLOW_TULIP;
    public static Block WATER_PLANT;
    public static Block HANGING_ROSES;

    // sanded andesite
    public static Block SANDED_ANDESITE;
    public static Block SANDED_ANDESITE_TILES;
    public static Block SHADOWED_SANDED_ANDESITE_TILES;
    public static Block MOSSY_SANDED_ANDESITE_TILES;
    public static Block MOSSY_SHADOWED_SANDED_ANDESITE_TILES;
    public static Block SANDED_ANDESITE_BRICKS;
    public static Block CHISELED_SANDED_ANDESITE;

    // glass related
    public static Block GLASS;

    public static Block BLUE_GLASS;
    public static Block BROWN_GLASS;
    public static Block BLACK_GLASS;
    public static Block GREEN_GLASS;
    public static Block YELLOW_GLASS;
    public static Block RED_GLASS;
    public static Block LIME_GLASS;
    public static Block LIGHT_GRAY_GLASS;
    public static Block PINK_GLASS;
    public static Block MAGENTA_GLASS;
    public static Block LIGHT_BLUE_GLASS;
    public static Block ORANGE_GLASS;
    public static Block GRAY_GLASS;
    public static Block PURPLE_GLASS;
    public static Block CYAN_GLASS;

    // shelves
    public static Block BEET_SHELF;
    public static Block BOOK_SHELF;
    public static Block CARROT_SHELF;
    public static Block CHEST_SHELF;
    public static Block EMPTY_SHELF;

    // braziers
    public static Block UNLIT_BRAZIER;
    public static Block LIT_BRAZIER;
    public static Block GREEN_LIT_BRAZIER;

    // books
    public static Block CLOSED_BOOK;
    public static Block OPEN_BOOK;

    // candles
    public static Block CANDLE;
    public static Block GREEN_CANDLE;

    // tray
    public static Block TRAY;

    // teapot
    public static Block TEAPOT;

    // redstone related
    public static Block LIGHTHOUSE_LAMP;

    // chains
    public static Block CHAINS;

    // custom crafting utility (not in dungeons)
    public static Block DUNGEONS_TRANSFORMER;

    public static void init() {
        // dungeons blocks that aren't in mc
        FLOOR_TILE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "floor_tile", JavaDungeons.GENERIC);
        DIRTY_FLOOR_TILE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dirty_floor_tile", JavaDungeons.GENERIC);
        CRATE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "crate", JavaDungeons.GENERIC);
        RIPPED_BANNER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBanner(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "ripped_banner", JavaDungeons.GENERIC);
        TENT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTent(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "tent", JavaDungeons.GENERIC);
        ROPE_FENCE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsFence(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "rope_fence", JavaDungeons.GENERIC);
        DUNGEONS_LANTERN = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsLantern(Material.METAL, 5.0F, 6.0F, BlockSoundGroup.LANTERN), "dungeons_lantern", JavaDungeons.GENERIC);
        SACK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSack(Material.WOOL, 0.8F, 0.8F, BlockSoundGroup.WOOL, false, 2), "sack", JavaDungeons.GENERIC);
        SMALL_SACK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSack(Material.WOOL, 0.8F, 0.8F, BlockSoundGroup.WOOL, true, 1), "small_sack", JavaDungeons.GENERIC);
        SACK_BE = JavaDungeons.REGISTRY_HELPER.registerBlockEntity(BlockEntityType.Builder.create(DungeonsSackBlockEntity::new, SACK, SMALL_SACK), "sack");

        // food related items
        BARREL_CLOSED = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "barrel_closed", JavaDungeons.GENERIC);
        FISH_BARREL = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "fish_barrel", JavaDungeons.GENERIC);
        APPLE_FOOD_BOX = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsFoodBox(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "apple_food_box", JavaDungeons.GENERIC);
        ORANGE_FOOD_BOX = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsFoodBox(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "orange_food_box", JavaDungeons.GENERIC);
        FISH_FOOD_BOX = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsFoodBox(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "fish_food_box", JavaDungeons.GENERIC);
        CORN_FOOD_BOX = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsFoodBox(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "corn_food_box", JavaDungeons.GENERIC);

        // ground related
        DIRT_PATH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dirt_path", JavaDungeons.GENERIC);
        DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, DIRT_PATH), "dirt", JavaDungeons.GENERIC);
        DIRT_SLAB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dirt_slab", JavaDungeons.GENERIC);
        ROCKY_DIRT_PATH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "rocky_dirt_path", JavaDungeons.GENERIC);
        ROCKY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, ROCKY_DIRT_PATH), "rocky_dirt", JavaDungeons.GENERIC);
        DENSE_GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS), "dense_grassy_dirt", JavaDungeons.GENERIC);
        GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "grassy_dirt", JavaDungeons.GENERIC);
        ROCKY_GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "rocky_grassy_dirt", JavaDungeons.GENERIC);
        GRASS_BLOCK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.SOLID_ORGANIC, 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH), "grass_block", JavaDungeons.GENERIC);
        DARK_ROCKY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "dark_rocky_dirt", JavaDungeons.GENERIC);

        // wood related
        FLOORBOARDS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "floorboards", JavaDungeons.GENERIC);
        BOOKSHELF = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "bookshelf", JavaDungeons.GENERIC);
        DUSTY_BOOKSHELF = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "dusty_bookshelf", JavaDungeons.GENERIC);
        EMPTY_BOOKSHELF = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "empty_bookshelf", JavaDungeons.GENERIC);
        BRIDGE_PLANKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTopSlab(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "bridge_planks", JavaDungeons.GENERIC);
        DUNGEONS_PLANKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "dungeons_planks", JavaDungeons.GENERIC);

        // stone related
        STONE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "stone_tiles", JavaDungeons.GENERIC);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "stone_tiles_slab", JavaDungeons.GENERIC);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, STONE_TILES), "stone_tiles_stairs", JavaDungeons.GENERIC);
        DIRTY_STONE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dirty_stone_tiles", JavaDungeons.GENERIC);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE),"dirty_stone_tiles_slab", JavaDungeons.GENERIC);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, DIRTY_STONE_TILES), "dirty_stone_tiles_stairs", JavaDungeons.GENERIC);
        DIRTY_STONE_TILES_1 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dirty_stone_tiles_1", JavaDungeons.GENERIC);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dirty_stone_tiles_slab_1", JavaDungeons.GENERIC);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, DIRTY_STONE_TILES_1), "dirty_stone_tiles_stairs_1", JavaDungeons.GENERIC);
        DIRTY_STONE_TILES_2 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dirty_stone_tiles_2", JavaDungeons.GENERIC);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dirty_stone_tiles_slab_2", JavaDungeons.GENERIC);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, DIRTY_STONE_TILES_2), "dirty_stone_tiles_stairs_2", JavaDungeons.GENERIC);
        DIRTY_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dirty_stone", JavaDungeons.GENERIC);

        // andesite related
        CRACKED_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cracked_andesite", JavaDungeons.GENERIC);

        // plants
        BERRY_BUSH_BLOCK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsLeaves(), "berry_bush_block", JavaDungeons.GENERIC);
        SHORT_GRASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "short_grass", JavaDungeons.GENERIC);
        FERN = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "fern", JavaDungeons.GENERIC);
        SHRUB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "shrub", JavaDungeons.GENERIC);
        YELLOW_TULIP = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "yellow_tulip", JavaDungeons.GENERIC);
        WATER_PLANT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsWaterPlant(Material.UNDERWATER_PLANT, 0.0F, 0.0F, BlockSoundGroup.WET_GRASS), "water_plant", JavaDungeons.GENERIC);
        HANGING_ROSES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsHangingPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "hanging_roses", JavaDungeons.GENERIC);

        // sanded andesite
        SANDED_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "sanded_andesite", JavaDungeons.GENERIC);
        SANDED_ANDESITE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "sanded_andesite_tiles", JavaDungeons.GENERIC);
        SHADOWED_SANDED_ANDESITE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "shadowed_sanded_andesite_tiles", JavaDungeons.GENERIC);
        MOSSY_SANDED_ANDESITE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "mossy_sanded_andesite_tiles", JavaDungeons.GENERIC);
        MOSSY_SHADOWED_SANDED_ANDESITE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "mossy_shadowed_sanded_andesite_tiles", JavaDungeons.GENERIC);
        SANDED_ANDESITE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "sanded_andesite_bricks", JavaDungeons.GENERIC);
        CHISELED_SANDED_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "chiseled_sanded_andesite", JavaDungeons.GENERIC);
      
        // glass related
        GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "glass", JavaDungeons.GENERIC);

        BLUE_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "blue_glass", JavaDungeons.GENERIC);
        BROWN_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "brown_glass", JavaDungeons.GENERIC);
        BLACK_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "black_glass", JavaDungeons.GENERIC);
        GREEN_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "green_glass", JavaDungeons.GENERIC);
        YELLOW_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "yellow_glass", JavaDungeons.GENERIC);
        RED_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "red_glass", JavaDungeons.GENERIC);
        LIME_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "lime_glass", JavaDungeons.GENERIC);
        LIGHT_GRAY_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "light_gray_glass", JavaDungeons.GENERIC);
        PINK_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "pink_glass", JavaDungeons.GENERIC);
        MAGENTA_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "magenta_glass", JavaDungeons.GENERIC);
        LIGHT_BLUE_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "light_blue_glass", JavaDungeons.GENERIC);
        ORANGE_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "orange_glass", JavaDungeons.GENERIC);
        GRAY_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "gray_glass", JavaDungeons.GENERIC);
        PURPLE_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "purple_glass", JavaDungeons.GENERIC);
        CYAN_GLASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTranslucent(Material.GLASS, 0.3F, 0.3F, BlockSoundGroup.GLASS), "cyan_glass", JavaDungeons.GENERIC);

        // shelves
        BEET_SHELF = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "beet_shelf", JavaDungeons.GENERIC);
        BOOK_SHELF = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "book_shelf", JavaDungeons.GENERIC);
        CARROT_SHELF = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "carrot_shelf", JavaDungeons.GENERIC);
        CHEST_SHELF = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "chest_shelf", JavaDungeons.GENERIC);
        EMPTY_SHELF = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "empty_shelf", JavaDungeons.GENERIC);

        // braziers
        UNLIT_BRAZIER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBrazier(Material.METAL, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "unlit", false), "unlit_brazier", JavaDungeons.GENERIC);
        LIT_BRAZIER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBrazier(Material.METAL, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "lit", false), "lit_brazier", JavaDungeons.GENERIC);
        GREEN_LIT_BRAZIER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBrazier(Material.METAL, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "green_lit", false), "green_lit_brazier", JavaDungeons.GENERIC);

        // books
        CLOSED_BOOK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBook(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "closed_book", JavaDungeons.GENERIC);
        OPEN_BOOK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBook(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "open_book", JavaDungeons.GENERIC);

        // candles
        CANDLE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsCandle(Material.METAL, 5.0F, 6.0F, BlockSoundGroup.LANTERN, false), "candle", JavaDungeons.GENERIC);
        GREEN_CANDLE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsCandle(Material.METAL, 5.0F, 6.0F, BlockSoundGroup.LANTERN, true), "green_candle", JavaDungeons.GENERIC);

        // tray
        TRAY = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTray(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "tray", JavaDungeons.GENERIC);

        // teapot
        TEAPOT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTeapot(Material.METAL, 5.0F, 6.0F, BlockSoundGroup.LANTERN), "teapot", JavaDungeons.GENERIC);

        // redstone related
        LIGHTHOUSE_LAMP = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPoweredEmissive(Material.REDSTONE_LAMP, 0.3F, 0.3F, BlockSoundGroup.METAL), "lighthouse_lamp", JavaDungeons.GENERIC);

        // chains
        CHAINS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsChains(Material.METAL, 5.0F, 6.0F, BlockSoundGroup.CHAIN), "chains", JavaDungeons.GENERIC);

        // custom crafting utility (not in dungeons)
        DUNGEONS_TRANSFORMER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTransformer(), "dungeons_transformer", JavaDungeons.GENERIC);
    }
}