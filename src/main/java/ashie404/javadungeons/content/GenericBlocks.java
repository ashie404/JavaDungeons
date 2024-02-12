package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class GenericBlocks {

    // generic blocks that aren't in mc
    public static final Block FLOOR_TILE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "floor_tile");
    public static final Block DIRTY_FLOOR_TILE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "dirty_floor_tile");
    public static final Block CRATE = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "crate");
    public static final Block RIPPED_BANNER = 
        RegistryHelper.registerBlock(new Banner(Material.WOOD), "ripped_banner");
    public static final Block TENT = 
        RegistryHelper.registerBlock(new Tent(Material.WOOD), "tent");
    public static final Block ROPE_FENCE = 
        RegistryHelper.registerBlock(new FenceBlock(Material.WOOD), "rope_fence");
    public static final Block DUNGEONS_LANTERN = 
        RegistryHelper.registerBlock(new LanternBlock(FabricBlockSettings.copyOf(Material.CAST_IRON).luminance(15)), "dungeons_lantern");
    public static final Block SACK = 
        RegistryHelper.registerBlock(new Sack(Material.FABRIC, false), "sack");
    public static final Block SMALL_SACK = 
        RegistryHelper.registerBlock(new Sack(Material.FABRIC, true), "small_sack");

    // food related
    public static final Block BARREL_CLOSED = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "barrel_closed");
    public static final Block FISH_BARREL = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "fish_barrel");
    public static final Block APPLE_FOOD_BOX = 
        RegistryHelper.registerBlock(new FoodBox(Material.WOOD), "apple_food_box");
    public static final Block ORANGE_FOOD_BOX = 
        RegistryHelper.registerBlock(new FoodBox(Material.WOOD), "orange_food_box");
    public static final Block FISH_FOOD_BOX = 
        RegistryHelper.registerBlock(new FoodBox(Material.WOOD), "fish_food_box");
    public static final Block CORN_FOOD_BOX = 
        RegistryHelper.registerBlock(new FoodBox(Material.WOOD), "corn_food_box");

    // ground related
    public static final Block DIRT_SLAB = 
        RegistryHelper.registerBlock(new SlabBlock(Material.EARTH), "dirt_slab");
    public static final Block DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "dirt_path");
    public static final Block ROCKY_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "rocky_dirt_path");
    public static final Block DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(Material.EARTH, true, DIRT_PATH), "dirt");
    public static final Block ROCKY_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(Material.EARTH, false, ROCKY_DIRT_PATH), "rocky_dirt");
    public static final Block GRASS_BLOCK = 
        RegistryHelper.registerBlock(new GrassBlock(Material.GRASS, true, Blocks.DIRT_PATH, DIRT), "grass_block");
    public static final Block DENSE_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.GRASS), "dense_grassy_dirt");
    public static final Block GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "grassy_dirt");
    public static final Block ROCKY_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "rocky_grassy_dirt");
    public static final Block DARK_ROCKY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "dark_rocky_dirt");

    // wood related
    public static final Block FLOORBOARDS = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "floorboards");
    public static final Block BOOKSHELF = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "bookshelf");
    public static final Block DUSTY_BOOKSHELF = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "dusty_bookshelf");
    public static final Block EMPTY_BOOKSHELF = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "empty_bookshelf");
    public static final Block BRIDGE_PLANKS = 
        RegistryHelper.registerBlock(new SlabBlock(Material.WOOD), "bridge_planks");
    public static final Block DUNGEONS_PLANKS = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "dungeons_planks");

    // stone related
    public static final SlabStairBlock STONE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "stone_tiles");
    public static final SlabStairBlock DIRTY_STONE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dirty_stone_tiles");
    public static final SlabStairBlock DIRTY_STONE_TILES_1 = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dirty_stone_tiles_1", "dirty_stone_tiles_slab_1", "dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock DIRTY_STONE_TILES_2 = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dirty_stone_tiles_2", "dirty_stone_tiles_slab_2", "dirty_stone_tiles_stairs_2");
    public static final SlabStairBlock COBBLESTONE =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.COBBLESTONE), "cobblestone");
    public static final Block MOSSY_COBBLESTONE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "mossy_cobblestone");

    // andesite related
    public static final Block CRACKED_ANDESITE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cracked_andesite");

    // generic plants
    public static final Block BERRY_BUSH_BLOCK = 
        RegistryHelper.registerBlock(new Leaves(Material.LEAVES), "berry_bush_block");
    public static final Block SQUID_COAST_LEAVES = 
        RegistryHelper.registerBlock(new Leaves(Material.LEAVES), "squid_coast_leaves");
    public static final Block FLOWERING_SQUID_COAST_LEAVES = 
        RegistryHelper.registerBlock(new Leaves(Material.LEAVES), "flowering_squid_coast_leaves");
    public static final Block SHORT_GRASS = 
        RegistryHelper.registerBlock(new Plant(Material.REPLACABLE_PLANT), "short_grass");
    public static final Block FERN = 
        RegistryHelper.registerBlock(new Plant(Material.REPLACABLE_PLANT), "fern");
    public static final Block SHRUB = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "shrub");
    public static final Block YELLOW_TULIP = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "yellow_tulip");
    public static final Block FLOWER_PATCH = 
        RegistryHelper.registerBlock(new Plant(Material.PLANT), "flower_patch");
    public static final Block DAISY_PATCH = 
        RegistryHelper.registerBlock(new Plant(Material.PLANT), "daisy_patch");
    public static final Block WATER_PLANT = 
        RegistryHelper.registerBlock(new WaterPlant(FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "water_plant");
    public static final Block HANGING_ROSES = 
        RegistryHelper.registerBlock(new HangingPlant(Material.PLANT), "hanging_roses");

    // sanded andesite
    public static final Block SANDED_ANDESITE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "sanded_andesite");
    public static final Block SANDED_ANDESITE_TILES = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "sanded_andesite_tiles");
    public static final Block SHADOWED_SANDED_ANDESITE_TILES = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "shadowed_sanded_andesite_tiles");
    public static final Block MOSSY_SANDED_ANDESITE_TILES = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "mossy_sanded_andesite_tiles");
    public static final Block MOSSY_SHADOWED_SANDED_ANDESITE_TILES = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "mossy_shadowed_sanded_andesite_tiles");

    // glass related
    public static final Block GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "glass");

    public static final Block BLUE_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "blue_glass");
    public static final Block BROWN_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "brown_glass");
    public static final Block BLACK_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "black_glass");
    public static final Block GREEN_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "green_glass");
    public static final Block YELLOW_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "yellow_glass");
    public static final Block RED_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "red_glass");
    public static final Block LIME_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "lime_glass");
    public static final Block LIGHT_GRAY_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "light_gray_glass");
    public static final Block PINK_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "pink_glass");
    public static final Block MAGENTA_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "magenta_glass");
    public static final Block LIGHT_BLUE_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "light_blue_glass");
    public static final Block ORANGE_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "orange_glass");
    public static final Block GRAY_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "gray_glass");
    public static final Block PURPLE_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "purple_glass");
    public static final Block CYAN_GLASS = 
        RegistryHelper.registerBlock(new Translucent(Material.GLASS), "cyan_glass");

    // shelves
    public static final Block BEET_SHELF = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "beet_shelf");
    public static final Block BOOK_SHELF = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "book_shelf");
    public static final Block CARROT_SHELF = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "carrot_shelf");
    public static final Block CHEST_SHELF = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "chest_shelf");
    public static final Block EMPTY_SHELF = 
        RegistryHelper.registerBlock(new Block(Material.WOOD), "empty_shelf");

    // braziers
    public static final Block UNLIT_BRAZIER = 
        RegistryHelper.registerBlock(new Brazier(Material.CAST_IRON, null, false), "unlit_brazier");
    public static final Block LIT_BRAZIER = 
        RegistryHelper.registerBlock(new Brazier(FabricBlockSettings.copyOf(Material.CAST_IRON).luminance(15), ParticleTypes.FLAME, false), "lit_brazier");
    public static final Block GREEN_LIT_BRAZIER = 
        RegistryHelper.registerBlock(new Brazier(FabricBlockSettings.copyOf(Material.CAST_IRON).luminance(15), Particles.GREEN_FLAME, false), "green_lit_brazier");

    // books
    public static final Block CLOSED_BOOK = 
        RegistryHelper.registerBlock(new Book(Material.WOOD), "closed_book");
    public static final Block OPEN_BOOK = 
        RegistryHelper.registerBlock(new Book(Material.WOOD), "open_book");

    // candles
    public static final Block CANDLE = 
        RegistryHelper.registerBlock(new Candle(Material.CAST_IRON, false), "candle");
    public static final Block GREEN_CANDLE = 
        RegistryHelper.registerBlock(new Candle(Material.CAST_IRON, true), "green_candle");

    // tray
    public static final Block TRAY = 
        RegistryHelper.registerBlock(new Tray(Material.WOOD), "tray");

    // teapot
    public static final Block TEAPOT = 
        RegistryHelper.registerBlock(new Teapot(Material.CAST_IRON), "teapot");

    // redstone related
    public static final Block LIGHTHOUSE_LAMP = 
        RegistryHelper.registerBlock(new PoweredEmissive(Material.SOFT_METAL, 15), "lighthouse_lamp");

    // chains
    public static final Block CHAINS = 
        RegistryHelper.registerBlock(new Chains(FabricBlockSettings.copyOf(Material.CAST_IRON).sounds(BlockSoundGroup.CHAIN)), "chains");

    // vine
    public static final Block VINE = 
        RegistryHelper.registerBlock(new Vine(Material.LEAVES), "vine");

    public static void init() {
        JavaDungeons.log.info("Registering Generic Blocks!");
        // Add all blocks to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("generic"))).register(content -> {
            content.add(FLOOR_TILE);
            content.add(DIRTY_FLOOR_TILE);
            content.add(CRATE);
            content.add(RIPPED_BANNER);
            content.add(TENT);
            content.add(ROPE_FENCE);
            content.add(DUNGEONS_LANTERN);
            content.add(SACK);
            content.add(SMALL_SACK);
            content.add(BARREL_CLOSED);
            content.add(FISH_BARREL);
            content.add(APPLE_FOOD_BOX);
            content.add(ORANGE_FOOD_BOX);
            content.add(FISH_FOOD_BOX);
            content.add(CORN_FOOD_BOX);
            content.add(DIRT);
            content.add(DIRT_SLAB);
            content.add(DIRT_PATH);
            content.add(ROCKY_DIRT);
            content.add(ROCKY_DIRT_PATH);
            content.add(DENSE_GRASSY_DIRT);
            content.add(GRASSY_DIRT);
            content.add(ROCKY_GRASSY_DIRT);
            content.add(GRASS_BLOCK);
            content.add(DARK_ROCKY_DIRT);
            content.add(FLOORBOARDS);
            content.add(BOOKSHELF);
            content.add(DUSTY_BOOKSHELF);
            content.add(EMPTY_BOOKSHELF);
            content.add(BRIDGE_PLANKS);
            content.add(DUNGEONS_PLANKS);
            content.add(STONE_TILES.base);
            content.add(STONE_TILES.slab);
            content.add(STONE_TILES.stairs);
            content.add(DIRTY_STONE_TILES.base);
            content.add(DIRTY_STONE_TILES.slab);
            content.add(DIRTY_STONE_TILES.stairs);
            content.add(DIRTY_STONE_TILES_1.base);
            content.add(DIRTY_STONE_TILES_1.slab);
            content.add(DIRTY_STONE_TILES_1.stairs);
            content.add(DIRTY_STONE_TILES_2.base);
            content.add(DIRTY_STONE_TILES_2.slab);
            content.add(DIRTY_STONE_TILES_2.stairs);
            content.add(CRACKED_ANDESITE);
            content.add(BERRY_BUSH_BLOCK);
            content.add(SQUID_COAST_LEAVES);
            content.add(FLOWERING_SQUID_COAST_LEAVES);
            content.add(SHORT_GRASS);
            content.add(FERN);
            content.add(SHRUB);
            content.add(YELLOW_TULIP);
            content.add(FLOWER_PATCH);
            content.add(DAISY_PATCH);
            content.add(WATER_PLANT);
            content.add(HANGING_ROSES);
            content.add(SANDED_ANDESITE);
            content.add(SANDED_ANDESITE_TILES);
            content.add(SHADOWED_SANDED_ANDESITE_TILES);
            content.add(MOSSY_SANDED_ANDESITE_TILES);
            content.add(MOSSY_SHADOWED_SANDED_ANDESITE_TILES);
            content.add(COBBLESTONE.base);
            content.add(COBBLESTONE.slab);
            content.add(COBBLESTONE.stairs);
            content.add(MOSSY_COBBLESTONE);
            content.add(GLASS);
            content.add(BLUE_GLASS);
            content.add(BROWN_GLASS);
            content.add(BLACK_GLASS);
            content.add(GREEN_GLASS);
            content.add(YELLOW_GLASS);
            content.add(RED_GLASS);
            content.add(LIME_GLASS);
            content.add(LIGHT_GRAY_GLASS);
            content.add(PINK_GLASS);
            content.add(MAGENTA_GLASS);
            content.add(LIGHT_BLUE_GLASS);
            content.add(ORANGE_GLASS);
            content.add(GRAY_GLASS);
            content.add(PURPLE_GLASS);
            content.add(CYAN_GLASS);
            content.add(BEET_SHELF);
            content.add(BOOK_SHELF);
            content.add(CARROT_SHELF);
            content.add(CHEST_SHELF);
            content.add(EMPTY_SHELF);
            content.add(UNLIT_BRAZIER);
            content.add(LIT_BRAZIER);
            content.add(GREEN_LIT_BRAZIER);
            content.add(CLOSED_BOOK);
            content.add(OPEN_BOOK);
            content.add(CANDLE);
            content.add(GREEN_CANDLE);
            content.add(TRAY);
            content.add(TEAPOT);
            content.add(LIGHTHOUSE_LAMP);
            content.add(CHAINS);
            content.add(VINE);
        });
    }
}