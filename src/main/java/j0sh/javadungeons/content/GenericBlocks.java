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
    public static DungeonsBlock BARREL_CLOSED;
    public static DungeonsBlock FISH_BARREL;

    // ground related
    public static DungeonsBlock DIRT;
    public static DungeonsSlab DIRT_SLAB;
    public static DungeonsBlock ROCKY_DIRT;

    // wood related
    public static DungeonsBlock ASH_PLANKS;

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
        BARREL_CLOSED = new DungeonsBlock(Blocks.BARREL, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "barrel_closed");
        FISH_BARREL = new DungeonsBlock(Blocks.BARREL, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "fish_barrel");

        // ground related
        DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dirt");
        DIRT_SLAB = new DungeonsSlab(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dirt_slab");
        ROCKY_DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "rocky_dirt");

        // wood related
        ASH_PLANKS = new DungeonsBlock(Blocks.OAK_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "ash_planks");

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