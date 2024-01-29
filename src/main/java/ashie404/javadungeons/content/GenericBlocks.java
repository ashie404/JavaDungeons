package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import io.netty.handler.codec.marshalling.DefaultUnmarshallerProvider;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class GenericBlocks {

    private static final Identifier GROUP_ID = new Identifier(JavaDungeons.MOD_ID, "generic");

    // generic blocks that aren't in mc
    public static BaseBlock FLOOR_TILE;
    public static BaseBlock DIRTY_FLOOR_TILE;
    public static BaseBlock CRATE;
    public static Banner RIPPED_BANNER;
    public static Tent TENT;
    public static Fence ROPE_FENCE;
    public static Lantern DUNGEONS_LANTERN;
    public static Sack SACK;
    public static Sack SMALL_SACK;

    // food related
    public static BaseBlock BARREL_CLOSED;
    public static BaseBlock FISH_BARREL;
    public static FoodBox APPLE_FOOD_BOX;
    public static FoodBox ORANGE_FOOD_BOX;
    public static FoodBox FISH_FOOD_BOX;
    public static FoodBox CORN_FOOD_BOX;

    // ground related
    public static GrassBlock GRASS_BLOCK;
    public static PathableBlock DIRT;
    public static Slab DIRT_SLAB;
    public static PathBlock DIRT_PATH;
    public static PathableBlock ROCKY_DIRT;
    public static PathBlock ROCKY_DIRT_PATH;
    public static BaseBlock DENSE_GRASSY_DIRT;
    public static BaseBlock GRASSY_DIRT;
    public static BaseBlock ROCKY_GRASSY_DIRT;
    public static BaseBlock DARK_ROCKY_DIRT;

    // wood related
    public static BaseBlock FLOORBOARDS;
    public static BaseBlock BOOKSHELF;
    public static BaseBlock DUSTY_BOOKSHELF;
    public static BaseBlock EMPTY_BOOKSHELF;
    public static TopSlab BRIDGE_PLANKS;
    public static BaseBlock DUNGEONS_PLANKS;

    // stone related
    public static SlabStairBlock STONE_TILES;
    public static SlabStairBlock DIRTY_STONE_TILES;
    public static SlabStairBlock DIRTY_STONE_TILES_1;
    public static SlabStairBlock DIRTY_STONE_TILES_2;
    public static BaseBlock DIRTY_STONE;

    // andesite related
    public static BaseBlock CRACKED_ANDESITE;

    // generic plants
    public static Leaves BERRY_BUSH_BLOCK;
    public static Plant SHORT_GRASS;
    public static Plant FERN;
    public static Plant SHRUB;
    public static Plant YELLOW_TULIP;
    public static WaterPlant WATER_PLANT;
    public static HangingPlant HANGING_ROSES;

    // sanded andesite
    public static BaseBlock SANDED_ANDESITE;
    public static BaseBlock SANDED_ANDESITE_TILES;
    public static BaseBlock SHADOWED_SANDED_ANDESITE_TILES;
    public static BaseBlock MOSSY_SANDED_ANDESITE_TILES;
    public static BaseBlock MOSSY_SHADOWED_SANDED_ANDESITE_TILES;
    public static BaseBlock SANDED_ANDESITE_BRICKS;
    public static BaseBlock CHISELED_SANDED_ANDESITE;

    // glass related
    public static Translucent GLASS;

    public static Translucent BLUE_GLASS;
    public static Translucent BROWN_GLASS;
    public static Translucent BLACK_GLASS;
    public static Translucent GREEN_GLASS;
    public static Translucent YELLOW_GLASS;
    public static Translucent RED_GLASS;
    public static Translucent LIME_GLASS;
    public static Translucent LIGHT_GRAY_GLASS;
    public static Translucent PINK_GLASS;
    public static Translucent MAGENTA_GLASS;
    public static Translucent LIGHT_BLUE_GLASS;
    public static Translucent ORANGE_GLASS;
    public static Translucent GRAY_GLASS;
    public static Translucent PURPLE_GLASS;
    public static Translucent CYAN_GLASS;

    // shelves
    public static BaseBlock BEET_SHELF;
    public static BaseBlock BOOK_SHELF;
    public static BaseBlock CARROT_SHELF;
    public static BaseBlock CHEST_SHELF;
    public static BaseBlock EMPTY_SHELF;

    // braziers
    public static Brazier UNLIT_BRAZIER;
    public static Brazier LIT_BRAZIER;
    public static Brazier GREEN_LIT_BRAZIER;

    // books
    public static Book CLOSED_BOOK;
    public static Book OPEN_BOOK;

    // candles
    public static Candle CANDLE;
    public static Candle GREEN_CANDLE;

    // tray
    public static Tray TRAY;

    // teapot
    public static Teapot TEAPOT;

    // redstone related
    public static PoweredEmissive LIGHTHOUSE_LAMP;

    // chains
    public static Chains CHAINS;

    // vine
    public static Vine VINE;

    public static void init() {
        // dungeons blocks that aren't in mc
        FLOOR_TILE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "floor_tile");
        DIRTY_FLOOR_TILE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_floor_tile");
        CRATE = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "crate");
        RIPPED_BANNER = new Banner(2.0F, 3.0F, BlockSoundGroup.WOOD, "ripped_banner");
        TENT = new Tent(2.0F, 3.0F, BlockSoundGroup.WOOD, "tent");
        ROPE_FENCE = new Fence(2.0F, 3.0F, BlockSoundGroup.WOOD, "rope_fence");
        DUNGEONS_LANTERN = new Lantern(5.0F, 6.0F, BlockSoundGroup.LANTERN, "dungeons_lantern");
        SACK = new Sack(0.8F, 0.8F, BlockSoundGroup.WOOL, "sack", false);
        SMALL_SACK = new Sack(0.8F, 0.8F, BlockSoundGroup.WOOL, "small_sack", true);

        // food related items
        BARREL_CLOSED = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "barrel_closed");
        FISH_BARREL = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "fish_barrel");
        APPLE_FOOD_BOX = new FoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "apple_food_box");
        ORANGE_FOOD_BOX = new FoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "orange_food_box");
        FISH_FOOD_BOX = new FoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "fish_food_box");
        CORN_FOOD_BOX = new FoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "corn_food_box");

        // ground related
        DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dirt_path");
        DIRT = new PathableBlock(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, DIRT_PATH, "dirt");
        DIRT_SLAB = new Slab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dirt_slab");
        ROCKY_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "rocky_dirt_path");
        ROCKY_DIRT = new PathableBlock(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, ROCKY_DIRT_PATH, "rocky_dirt");
        DENSE_GRASSY_DIRT = new BaseBlock( 0.6F, 0.6F, BlockSoundGroup.GRASS, "dense_grassy_dirt");
        GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "grassy_dirt");
        ROCKY_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "rocky_grassy_dirt");
        GRASS_BLOCK = new GrassBlock( 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, DIRT, "grass_block");
        DARK_ROCKY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dark_rocky_dirt");

        // wood related
        FLOORBOARDS = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "floorboards");
        BOOKSHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "bookshelf");
        DUSTY_BOOKSHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "dusty_bookshelf");
        EMPTY_BOOKSHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "empty_bookshelf");
        BRIDGE_PLANKS = new TopSlab(2.0F, 3.0F, BlockSoundGroup.WOOD, "bridge_planks");
        DUNGEONS_PLANKS = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "dungeons_planks");

        // stone related
        STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "stone_tiles", "stone_tiles_slab", "stone_tiles_stairs");
        DIRTY_STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles", "dirty_stone_tiles_slab", "dirty_stone_tiles_stairs");
        DIRTY_STONE_TILES_1 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles_1", "dirty_stone_tiles_slab_1", "dirty_stone_tiles_stairs_1");
        DIRTY_STONE_TILES_2 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles_2", "dirty_stone_tiles_slab_2", "dirty_stone_tiles_stairs_2");
        DIRTY_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone");

        // andesite related
        CRACKED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cracked_andesite");

        // plants
        BERRY_BUSH_BLOCK = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "berry_bush_block");
        SHORT_GRASS = new Plant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "short_grass");
        FERN = new Plant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "fern");
        SHRUB = new Plant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "shrub");
        YELLOW_TULIP = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "yellow_tulip");
        WATER_PLANT = new WaterPlant( 0.0F, 0.0F, BlockSoundGroup.WET_GRASS, "water_plant");
        HANGING_ROSES = new HangingPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "hanging_roses");

        // sanded andesite
        SANDED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite");
        SANDED_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite_tiles");
        SHADOWED_SANDED_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "shadowed_sanded_andesite_tiles");
        MOSSY_SANDED_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "mossy_sanded_andesite_tiles");
        MOSSY_SHADOWED_SANDED_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "mossy_shadowed_sanded_andesite_tiles");
        SANDED_ANDESITE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite_bricks");
        CHISELED_SANDED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "chiseled_sanded_andesite");
      
        // glass related
        GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "glass");

        BLUE_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "blue_glass");
        BROWN_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "brown_glass");
        BLACK_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "black_glass");
        GREEN_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "green_glass");
        YELLOW_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "yellow_glass");
        RED_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "red_glass");
        LIME_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "lime_glass");
        LIGHT_GRAY_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "light_gray_glass");
        PINK_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "pink_glass");
        MAGENTA_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "magenta_glass");
        LIGHT_BLUE_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "light_blue_glass");
        ORANGE_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "orange_glass");
        GRAY_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "gray_glass");
        PURPLE_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "purple_glass");
        CYAN_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "cyan_glass");

        // shelves
        BEET_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "beet_shelf");
        BOOK_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "book_shelf");
        CARROT_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "carrot_shelf");
        CHEST_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "chest_shelf");
        EMPTY_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "empty_shelf");

        // braziers
        UNLIT_BRAZIER = new Brazier(null, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "unlit", false, "unlit_brazier");
        LIT_BRAZIER = new Brazier(ParticleTypes.SMALL_FLAME, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "lit", false, "lit_brazier");
        GREEN_LIT_BRAZIER = new Brazier(Particles.GREEN_FLAME, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "green_lit", false, "green_lit_brazier");

        // books
        CLOSED_BOOK = new Book(2.0F, 3.0F, BlockSoundGroup.WOOD, "closed_book");
        OPEN_BOOK = new Book(2.0F, 3.0F, BlockSoundGroup.WOOD, "open_book");

        // candles
        CANDLE = new Candle(5.0F, 6.0F, BlockSoundGroup.LANTERN, "candle", false);
        GREEN_CANDLE = new Candle(5.0F, 6.0F, BlockSoundGroup.LANTERN, "green_candle", true);

        // tray
        TRAY = new Tray(2.0F, 3.0F, BlockSoundGroup.WOOD, "tray");

        // teapot
        TEAPOT = new Teapot(5.0F, 6.0F, BlockSoundGroup.LANTERN, "teapot");

        // redstone related
        LIGHTHOUSE_LAMP = new PoweredEmissive( 0.3F, 0.3F, BlockSoundGroup.METAL, "lighthouse_lamp");

        // chains
        CHAINS = new Chains(5.0F, 6.0F, BlockSoundGroup.CHAIN, "chains");

        // vine
        VINE = new Vine(0.2F, 0.2F, BlockSoundGroup.GRASS, "vine");

        // Add all blocks to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(JavaDungeons.MOD_ID, "generic"))).register(content -> {
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
            content.add(VINE.blockItem);
        });
    }
}