package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class GenericBlocks {

    // generic blocks that aren't in mc
    public static final BaseBlock FLOOR_TILE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "floor_tile");
    public static final BaseBlock DIRTY_FLOOR_TILE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_floor_tile");
    public static final BaseBlock CRATE = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "crate");
    public static final Banner RIPPED_BANNER = new Banner(2.0F, 3.0F, BlockSoundGroup.WOOD, "ripped_banner");
    public static final Tent TENT = new Tent(2.0F, 3.0F, BlockSoundGroup.WOOD, "tent");
    public static final Fence ROPE_FENCE = new Fence(2.0F, 3.0F, BlockSoundGroup.WOOD, "rope_fence");
    public static final Lantern DUNGEONS_LANTERN = new Lantern(5.0F, 6.0F, BlockSoundGroup.LANTERN, "dungeons_lantern");
    public static final Sack SACK = new Sack(0.8F, 0.8F, BlockSoundGroup.WOOL, "sack", false);
    public static final Sack SMALL_SACK = new Sack(0.8F, 0.8F, BlockSoundGroup.WOOL, "small_sack", true);

    // food related
    public static final BaseBlock BARREL_CLOSED = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "barrel_closed");
    public static final BaseBlock FISH_BARREL = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "fish_barrel");
    public static final FoodBox APPLE_FOOD_BOX = new FoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "apple_food_box");
    public static final FoodBox ORANGE_FOOD_BOX = new FoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "orange_food_box");
    public static final FoodBox FISH_FOOD_BOX = new FoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "fish_food_box");
    public static final FoodBox CORN_FOOD_BOX = new FoodBox(2.0F, 3.0F, BlockSoundGroup.WOOD, "corn_food_box");

    // ground related
    public static final Slab DIRT_SLAB = new Slab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dirt_slab");
    public static final PathBlock DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dirt_path");
    public static final PathBlock ROCKY_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "rocky_dirt_path");
    public static final PathableBlock DIRT = new PathableBlock(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, DIRT_PATH, "dirt");
    public static final PathableBlock ROCKY_DIRT = new PathableBlock(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, ROCKY_DIRT_PATH, "rocky_dirt");
    public static final GrassBlock GRASS_BLOCK = new GrassBlock( 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, DIRT, "grass_block");
    public static final BaseBlock DENSE_GRASSY_DIRT = new BaseBlock( 0.6F, 0.6F, BlockSoundGroup.GRASS, "dense_grassy_dirt");
    public static final BaseBlock GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "grassy_dirt");
    public static final BaseBlock ROCKY_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "rocky_grassy_dirt");
    public static final BaseBlock DARK_ROCKY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "dark_rocky_dirt");

    // wood related
    public static final BaseBlock FLOORBOARDS = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "floorboards");
    public static final BaseBlock BOOKSHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "bookshelf");
    public static final BaseBlock DUSTY_BOOKSHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "dusty_bookshelf");
    public static final BaseBlock EMPTY_BOOKSHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "empty_bookshelf");
    public static final Slab BRIDGE_PLANKS = new Slab(2.0F, 3.0F, BlockSoundGroup.WOOD, "bridge_planks");
    public static final BaseBlock DUNGEONS_PLANKS = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "dungeons_planks");

    // stone related
    public static final SlabStairBlock STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "stone_tiles", "stone_tiles_slab", "stone_tiles_stairs");
    public static final SlabStairBlock DIRTY_STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles", "dirty_stone_tiles_slab", "dirty_stone_tiles_stairs");
    public static final SlabStairBlock DIRTY_STONE_TILES_1 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles_1", "dirty_stone_tiles_slab_1", "dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock DIRTY_STONE_TILES_2 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dirty_stone_tiles_2", "dirty_stone_tiles_slab_2", "dirty_stone_tiles_stairs_2");

    // andesite related
    public static final BaseBlock CRACKED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cracked_andesite");

    // generic plants
    public static final Leaves BERRY_BUSH_BLOCK = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "berry_bush_block");
    public static final Leaves SQUID_COAST_LEAVES = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "squid_coast_leaves");
    public static final Leaves FLOWERING_SQUID_COAST_LEAVES = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "flowering_squid_coast_leaves");
    public static final Plant SHORT_GRASS = new Plant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "short_grass");
    public static final Plant FERN = new Plant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "fern");
    public static final Plant SHRUB = new Plant( 0.0F, 0.0F, BlockSoundGroup.GRASS, "shrub");
    public static final Plant YELLOW_TULIP = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "yellow_tulip");
    public static final Plant FLOWER_PATCH = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "flower_patch");
    public static final Plant DAISY_PATCH = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "daisy_patch");
    public static final WaterPlant WATER_PLANT = new WaterPlant( 0.0F, 0.0F, BlockSoundGroup.WET_GRASS, "water_plant");
    public static final HangingPlant HANGING_ROSES = new HangingPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "hanging_roses");

    // sanded andesite
    public static final BaseBlock SANDED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite");
    public static final BaseBlock SANDED_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite_tiles");
    public static final BaseBlock SHADOWED_SANDED_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "shadowed_sanded_andesite_tiles");
    public static final BaseBlock MOSSY_SANDED_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "mossy_sanded_andesite_tiles");
    public static final BaseBlock MOSSY_SHADOWED_SANDED_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "mossy_shadowed_sanded_andesite_tiles");
    public static final BaseBlock SANDED_ANDESITE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "sanded_andesite_bricks");
    public static final BaseBlock CHISELED_SANDED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "chiseled_sanded_andesite");

    // glass related
    public static final Translucent GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "glass");

    public static final Translucent BLUE_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "blue_glass");
    public static final Translucent BROWN_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "brown_glass");
    public static final Translucent BLACK_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "black_glass");
    public static final Translucent GREEN_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "green_glass");
    public static final Translucent YELLOW_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "yellow_glass");
    public static final Translucent RED_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "red_glass");
    public static final Translucent LIME_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "lime_glass");
    public static final Translucent LIGHT_GRAY_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "light_gray_glass");
    public static final Translucent PINK_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "pink_glass");
    public static final Translucent MAGENTA_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "magenta_glass");
    public static final Translucent LIGHT_BLUE_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "light_blue_glass");
    public static final Translucent ORANGE_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "orange_glass");
    public static final Translucent GRAY_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "gray_glass");
    public static final Translucent PURPLE_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "purple_glass");
    public static final Translucent CYAN_GLASS = new Translucent(0.3F, 0.3F, BlockSoundGroup.GLASS, "cyan_glass");

    // shelves
    public static final BaseBlock BEET_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "beet_shelf");
    public static final BaseBlock BOOK_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "book_shelf");
    public static final BaseBlock CARROT_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "carrot_shelf");
    public static final BaseBlock CHEST_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "chest_shelf");
    public static final BaseBlock EMPTY_SHELF = new BaseBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "empty_shelf");

    // braziers
    public static final Brazier UNLIT_BRAZIER = new Brazier(null, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "unlit", false, "unlit_brazier");
    public static final Brazier LIT_BRAZIER = new Brazier(ParticleTypes.FLAME, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "lit", false, "lit_brazier");
    public static final Brazier GREEN_LIT_BRAZIER = new Brazier(Particles.GREEN_FLAME, 5.0F, 6.0F, BlockSoundGroup.LANTERN, "green_lit", false, "green_lit_brazier");

    // books
    public static final Book CLOSED_BOOK = new Book(2.0F, 3.0F, BlockSoundGroup.WOOD, "closed_book");
    public static final Book OPEN_BOOK = new Book(2.0F, 3.0F, BlockSoundGroup.WOOD, "open_book");

    // candles
    public static final Candle CANDLE = new Candle(5.0F, 6.0F, BlockSoundGroup.LANTERN, "candle", false);
    public static final Candle GREEN_CANDLE = new Candle(5.0F, 6.0F, BlockSoundGroup.LANTERN, "green_candle", true);

    // tray
    public static final Tray TRAY = new Tray(2.0F, 3.0F, BlockSoundGroup.WOOD, "tray");

    // teapot
    public static final Teapot TEAPOT = new Teapot(5.0F, 6.0F, BlockSoundGroup.LANTERN, "teapot");

    // redstone related
    public static final PoweredEmissive LIGHTHOUSE_LAMP = new PoweredEmissive(15, 0.3F, 0.3F, BlockSoundGroup.METAL, "lighthouse_lamp");

    // chains
    public static final Chains CHAINS = new Chains(5.0F, 6.0F, BlockSoundGroup.CHAIN, "chains");

    // vine
    public static final Vine VINE = new Vine(0.2F, 0.2F, BlockSoundGroup.GRASS, "vine");

    public static void init() {
        // Add all blocks to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("generic"))).register(content -> {
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
            content.add(CRACKED_ANDESITE.blockItem);
            content.add(BERRY_BUSH_BLOCK.blockItem);
            content.add(SQUID_COAST_LEAVES.blockItem);
            content.add(FLOWERING_SQUID_COAST_LEAVES.blockItem);
            content.add(SHORT_GRASS.blockItem);
            content.add(FERN.blockItem);
            content.add(SHRUB.blockItem);
            content.add(YELLOW_TULIP.blockItem);
            content.add(FLOWER_PATCH.blockItem);
            content.add(DAISY_PATCH.blockItem);
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