package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import ashie404.javadungeons.worldgen.SaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class PumpkinPasturesBlocks {

    // foliage
    public static final Block PM_YELLOW_AUTUMNAL_LEAVES = 
        RegistryHelper.registerBlock(new Leaves(FabricBlockSettings.copyOf(Material.LEAVES).mapColor(MapColor.YELLOW)), "pm_yellow_autumnal_leaves");
    public static final Block PM_RED_AUTUMNAL_LEAVES = 
        RegistryHelper.registerBlock(new Leaves(FabricBlockSettings.copyOf(Material.LEAVES).mapColor(MapColor.RED)), "pm_red_autumnal_leaves");

    // saplings
    public static final Block PM_RED_AUTUMNAL_SAPLING = 
        RegistryHelper.registerBlock(new Sapling(SaplingGenerators.RED_AUTUMNAL, Material.PLANT), "pm_red_autumnal_sapling");
    public static final Block PM_YELLOW_AUTUMNAL_SAPLING = 
        RegistryHelper.registerBlock(new Sapling(SaplingGenerators.YELLOW_AUTUMNAL, Material.PLANT), "pm_yellow_autumnal_sapling");

    // plants
    public static final Block PM_SHRUB = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "pm_shrub");
    public static final Block PM_CHARRED_GRASS = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "pm_charred_grass");
    public static final Block PM_DEAD_SAPLING = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "pm_dead_sapling");
    public static final Block PM_SAPLING = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "pm_sapling");
    public static final Block PM_LAVENDER = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "pm_lavender");
    
    // tall plants
    public static final Block PM_TALL_FERN = 
        RegistryHelper.registerBlock(new TallPlant(Material.OFFSET_XZ_PLANT), "pm_tall_fern");
    public static final Block PM_DRY_TALL_GRASS = 
        RegistryHelper.registerBlock(new TallPlant(Material.OFFSET_XZ_PLANT), "pm_dry_tall_grass");
    public static final Block PM_CHARRED_TALL_GRASS = 
        RegistryHelper.registerBlock(new TallPlant(Material.OFFSET_XZ_PLANT), "pm_charred_tall_grass");

    // melons
    public static final Block PM_BURNT_PUMPKIN = 
        RegistryHelper.registerBlock(new Block(Material.MELON), "pm_burnt_pumpkin");
    public static final Block PM_ROTTED_PUMPKIN = 
        RegistryHelper.registerBlock(new Block(Material.MELON), "pm_rotted_pumpkin");

    // haybale
    public static final Block PM_DRIED_HAYBALE = 
        RegistryHelper.registerBlock(new PillarBlock(Material.GRASS), "pm_dried_haybale");

    // ground related
    public static final Block PM_DIRT_SLAB = 
        RegistryHelper.registerBlock(new SlabBlock(Material.EARTH), "pm_dirt_slab");
    public static final Block PM_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "pm_dirt_path");
    public static final Block PM_ROCKY_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "pm_rocky_dirt_path");
    public static final Block PM_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(true, PM_DIRT_PATH, Material.EARTH), "pm_dirt");
    public static final Block PM_ROCKY_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(false, PM_ROCKY_DIRT_PATH, Material.EARTH), "pm_rocky_dirt");
    public static final Block PM_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new GrassBlock(true, Blocks.DIRT_PATH, PM_DIRT, Material.GRASS), "pm_grass_block");
    public static final Block PM_DENSE_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.GRASS), "pm_dense_grassy_dirt");
    public static final Block PM_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "pm_grassy_dirt");
    public static final Block PM_DARK_ROCKY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "pm_dark_rocky_dirt");
    public static final Block PM_CHARRED_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new Block(Material.GRASS), "pm_charred_grass_block");
    public static final Block PM_CHARRED_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "pm_charred_dirt_path");
    public static final Block PM_CHARRED_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(false, PM_CHARRED_DIRT_PATH, Material.EARTH), "pm_charred_dirt");
    public static final Block PM_ASHY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "pm_ashy_dirt");
    public static final Block PM_CHARRED_DIRT_SLAB = 
        RegistryHelper.registerBlock(new SlabBlock(Material.EARTH), "pm_charred_dirt_slab");
    public static final Block PM_CHARRED_DIRT_EMBERS = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "pm_charred_dirt_embers");
    public static final Block PM_CHARRED_FARMLAND = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "pm_charred_farmland");

    // charred stones
    public static final SlabStairBlock PM_CHARRED_STONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.DARK_STONE), "pm_charred_stone");
    public static final SlabStairBlock PM_CHARRED_COBBLESTONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.COBBLESTONE), "pm_charred_cobblestone");
    public static final Block PM_CHARRED_COBBLESTONE_WALL =
        RegistryHelper.registerBlock(new WallBlock(Material.COBBLESTONE), "pm_charred_cobblestone_wall");
    public static final SlabStairBlock PM_CHARRED_STONE_BRICKS = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.DARK_STONE), "pm_charred_stone_bricks", "pm_charred_stone_brick_slab", "pm_charred_stone_brick_stairs");
    public static final Block PM_CHARRED_STONE_BRICK_WALL =
        RegistryHelper.registerBlock(new WallBlock(Material.DARK_STONE), "pm_charred_stone_brick_wall");
    public static final Block PM_CRACKED_CHARRED_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(Material.DARK_STONE), "pm_cracked_charred_stone_bricks");

    // stone related
    public static final Block PM_MOSSY_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "pm_mossy_stone_bricks");
    public static final Block PM_DIRTY_STONE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "pm_dirty_stone");
    public static final SlabStairBlock PM_DIRTY_STONE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "pm_dirty_stone_tiles");
    public static final SlabStairBlock PM_DIRTY_STONE_TILES_1 = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "pm_dirty_stone_tiles_1", "pm_dirty_stone_tiles_slab_1", "pm_dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock PM_DIRTY_STONE_TILES_2 = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "pm_dirty_stone_tiles_2", "pm_dirty_stone_tiles_slab_2", "pm_dirty_stone_tiles_stairs_2");
    public static final Block PM_DIRTY_FLOOR_TILE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "pm_dirty_floor_tile");

    // wood related
    public static final Block PM_CHARRED_LOG = 
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "pm_charred_log");
    public static final Block PM_CHARRED_WOOD = 
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "pm_charred_wood");
    public static final SlabStairBlock PM_CHARRED_PLANKS = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.WOOD), "pm_charred_planks", "pm_charred_slab", "pm_charred_stairs");

    public static void init() {
        // add all blockitems to group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("pumpkin_pastures"))).register(content -> {
            content.add(PM_YELLOW_AUTUMNAL_LEAVES);
            content.add(PM_RED_AUTUMNAL_LEAVES);
            content.add(PM_RED_AUTUMNAL_SAPLING);
            content.add(PM_YELLOW_AUTUMNAL_SAPLING);
            content.add(PM_SHRUB);
            content.add(PM_CHARRED_GRASS);
            content.add(PM_DEAD_SAPLING);
            content.add(PM_SAPLING);
            content.add(PM_LAVENDER);
            content.add(PM_TALL_FERN);
            content.add(PM_DRY_TALL_GRASS);
            content.add(PM_CHARRED_TALL_GRASS);
            content.add(PM_BURNT_PUMPKIN);
            content.add(PM_ROTTED_PUMPKIN);
            content.add(PM_DRIED_HAYBALE);
            content.add(PM_DIRT);
            content.add(PM_DIRT_PATH);
            content.add(PM_DIRT_SLAB);
            content.add(PM_DARK_ROCKY_DIRT);
            content.add(PM_ROCKY_DIRT);
            content.add(PM_ROCKY_DIRT_PATH);
            content.add(PM_GRASS_BLOCK);
            content.add(PM_DENSE_GRASSY_DIRT);
            content.add(PM_GRASSY_DIRT);
            content.add(PM_CHARRED_GRASS_BLOCK);
            content.add(PM_CHARRED_DIRT_PATH);
            content.add(PM_ASHY_DIRT);
            content.add(PM_CHARRED_DIRT);
            content.add(PM_CHARRED_DIRT_SLAB);
            content.add(PM_CHARRED_DIRT_EMBERS);
            content.add(PM_CHARRED_FARMLAND);
            content.add(PM_CHARRED_STONE.base);
            content.add(PM_CHARRED_STONE.slab);
            content.add(PM_CHARRED_STONE.stairs);
            content.add(PM_CHARRED_COBBLESTONE.base);
            content.add(PM_CHARRED_COBBLESTONE.slab);
            content.add(PM_CHARRED_COBBLESTONE.stairs);
            content.add(PM_CHARRED_COBBLESTONE_WALL);
            content.add(PM_CHARRED_STONE_BRICKS.base);
            content.add(PM_CHARRED_STONE_BRICKS.slab);
            content.add(PM_CHARRED_STONE_BRICKS.stairs);
            content.add(PM_CHARRED_STONE_BRICK_WALL);
            content.add(PM_CRACKED_CHARRED_STONE_BRICKS);
            content.add(PM_MOSSY_STONE_BRICKS);
            content.add(PM_DIRTY_STONE);
            content.add(PM_DIRTY_STONE_TILES.base);
            content.add(PM_DIRTY_STONE_TILES.slab);
            content.add(PM_DIRTY_STONE_TILES.stairs);
            content.add(PM_DIRTY_STONE_TILES_1.base);
            content.add(PM_DIRTY_STONE_TILES_1.slab);
            content.add(PM_DIRTY_STONE_TILES_1.stairs);
            content.add(PM_DIRTY_STONE_TILES_2.base);
            content.add(PM_DIRTY_STONE_TILES_2.slab);
            content.add(PM_DIRTY_STONE_TILES_2.stairs);
            content.add(PM_DIRTY_FLOOR_TILE);
            content.add(PM_CHARRED_LOG);
            content.add(PM_CHARRED_WOOD);
            content.add(PM_CHARRED_PLANKS.base);
            content.add(PM_CHARRED_PLANKS.slab);
            content.add(PM_CHARRED_PLANKS.stairs);
        });
    }
}