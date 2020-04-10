package j0sh.javadungeons.content;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class GenericBlocks {

    // generic blocks that aren't in mc
    public static DungeonsBlock FLOOR_TILE;
    public static DungeonsBlock DIRTY_FLOOR_TILE; 
    public static DungeonsBlock CRATE;
    public static DungeonsBlock BURNT_PUMPKIN;

    // food related
    public static DungeonsBlock BARREL_CLOSED;
    public static DungeonsBlock FISH_BARREL;
    public static DungeonsFoodBox APPLE_FOOD_BOX;
    public static DungeonsFoodBox ORANGE_FOOD_BOX;
    public static DungeonsFoodBox FISH_FOOD_BOX;
    public static DungeonsFoodBox CORN_FOOD_BOX;

    // ground related
    public static DungeonsBlock DIRT;
    public static DungeonsSlab DIRT_SLAB;
    public static DungeonsPath DIRT_PATH;
    public static DungeonsBlock ROCKY_DIRT;
    public static DungeonsBlock DENSE_GRASSY_DIRT;
    public static DungeonsBlock GRASSY_DIRT;
    public static DungeonsBlock SPARSE_GRASSY_DIRT;

    // wood related
    public static DungeonsBlock ASH_PLANKS;
    public static DungeonsBlock FLOORBOARDS;

    // stone-brick related
    public static DungeonsBlock DARK_STONE_BRICKS;
    public static DungeonsBlock DIRTY_DARK_STONE_BRICKS;
    public static DungeonsBlock CHISELED_DARK_STONE;

    // generic plants
    public static DungeonsPlant SHORT_GRASS;
    public static DungeonsPlant GRASS_CLUMP;
    public static DungeonsWaterPlant WATER_PLANT;

    // custom blocks not in MC: Dungeons
    public static DimensionalRectifier DIMENSIONAL_RECTIFIER;

    public static void init() {
        // dungeons blocks that aren't in mc
        FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "floor_tile");
        DIRTY_FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "dirty_floor_tile");
        CRATE = new DungeonsBlock(Blocks.OAK_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "crate");
        BURNT_PUMPKIN = new DungeonsBlock(Blocks.PUMPKIN, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "burnt_pumpkin");

        // food related items
        BARREL_CLOSED = new DungeonsBlock(Blocks.BARREL, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "barrel_closed");
        FISH_BARREL = new DungeonsBlock(Blocks.BARREL, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "fish_barrel");
        APPLE_FOOD_BOX = new DungeonsFoodBox(Blocks.SPRUCE_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "apple_food_box");
        ORANGE_FOOD_BOX = new DungeonsFoodBox(Blocks.SPRUCE_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "orange_food_box");
        FISH_FOOD_BOX = new DungeonsFoodBox(Blocks.SPRUCE_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "fish_food_box");
        CORN_FOOD_BOX = new DungeonsFoodBox(Blocks.SPRUCE_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "corn_food_box");

        // ground related
        DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dirt");
        DIRT_SLAB = new DungeonsSlab(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dirt_slab");
        DIRT_PATH = new DungeonsPath(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dirt_path");
        ROCKY_DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "rocky_dirt");
        DENSE_GRASSY_DIRT = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dense_grassy_dirt");
        GRASSY_DIRT = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "grassy_dirt");
        SPARSE_GRASSY_DIRT = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "sparse_grassy_dirt");

        // wood related
        ASH_PLANKS = new DungeonsBlock(Blocks.OAK_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "ash_planks");
        FLOORBOARDS = new DungeonsBlock(Blocks.OAK_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "floorboards");

        // stone brick related
        DARK_STONE_BRICKS = new DungeonsBlock(Blocks.STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "dark_stone_bricks");
        DIRTY_DARK_STONE_BRICKS = new DungeonsBlock(Blocks.STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "dirty_dark_stone_bricks");
        CHISELED_DARK_STONE = new DungeonsBlock(Blocks.CHISELED_STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "chiseled_dark_stone");

        // plants
        SHORT_GRASS = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "short_grass");
        GRASS_CLUMP = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "grass_clump");
        WATER_PLANT = new DungeonsWaterPlant(Blocks.SEAGRASS, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "water_plant");

        // custom blocks not in mc: dungeons
        DIMENSIONAL_RECTIFIER = new DimensionalRectifier();
    }
}