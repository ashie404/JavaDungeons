package j0sh.javadungeons.content;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class PumpkinPasturesBlocks {

    // foliage
    public static DungeonsBlock PM_YELLOW_AUTUMNAL_LEAVES;
    public static DungeonsBlock PM_RED_AUTUMNAL_LEAVES;

    // grass
    public static DungeonsPlant PM_SHRUB;
    public static DungeonsPlant PM_CHARRED_GRASS;

    // plants
    public static DungeonsBlock PM_BURNT_PUMPKIN;
    public static DungeonsBlock PM_ROTTED_PUMPKIN;
    public static DungeonsPillar PM_DRIED_HAYBALE;

    // ground related
    public static DungeonsBlock PM_CHARRED_GRASS_BLOCK;
    public static DungeonsBlock PM_CHARRED_DIRT;
    public static DungeonsPath PM_CHARRED_FARMLAND;

    // charred stones
    public static DungeonsBlock PM_CHARRED_STONE;
    public static DungeonsBlock PM_CHARRED_COBBLESTONE;
    public static DungeonsBlock PM_CHARRED_STONE_BRICKS;
    public static DungeonsBlock PM_CRACKED_CHARRED_STONE_BRICKS;

    // wood related
    public static DungeonsPillar PM_CHARRED_LOG;
    public static DungeonsPillar PM_CHARRED_WOOD;
    public static DungeonsBlock PM_CHARRED_PLANKS;
    public static DungeonsStairs PM_CHARRED_STAIRS;
    public static DungeonsSlab PM_CHARRED_SLAB;

    public static void init() {
        // foliage
        PM_YELLOW_AUTUMNAL_LEAVES = new DungeonsBlock(Blocks.BIRCH_LEAVES, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_yellow_autumnal_leaves");
        PM_RED_AUTUMNAL_LEAVES = new DungeonsBlock(Blocks.OAK_LEAVES, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_red_autumnal_leaves");

        // plants
        PM_BURNT_PUMPKIN = new DungeonsBlock(Blocks.PUMPKIN, true, FabricToolTags.AXES, JavaDungeons.PUMPKIN_PASTURES, "pm_burnt_pumpkin");
        PM_ROTTED_PUMPKIN = new DungeonsBlock(Blocks.PUMPKIN, true, FabricToolTags.AXES, JavaDungeons.PUMPKIN_PASTURES, "pm_rotted_pumpkin");
        PM_DRIED_HAYBALE = new DungeonsPillar(Blocks.HAY_BLOCK, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_dried_haybale");

        // grass
        PM_SHRUB = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_shrub");
        PM_CHARRED_GRASS = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_grass");

        // ground related
        PM_CHARRED_GRASS_BLOCK = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_grass_block");
        PM_CHARRED_DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_dirt");
        PM_CHARRED_FARMLAND = new DungeonsPath(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_farmland");
        
        // charred stones
        PM_CHARRED_STONE = new DungeonsBlock(Blocks.STONE, false, FabricToolTags.PICKAXES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_stone");
        PM_CHARRED_COBBLESTONE = new DungeonsBlock(Blocks.COBBLESTONE, false, FabricToolTags.PICKAXES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_cobblestone");
        PM_CHARRED_STONE_BRICKS = new DungeonsBlock(Blocks.STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_stone_bricks");
        PM_CRACKED_CHARRED_STONE_BRICKS = new DungeonsBlock(Blocks.CRACKED_STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.PUMPKIN_PASTURES, "pm_cracked_charred_stone_bricks");

        // wood related
        PM_CHARRED_LOG = new DungeonsPillar(Blocks.OAK_LOG, true, FabricToolTags.AXES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_log");
        PM_CHARRED_WOOD = new DungeonsPillar(Blocks.OAK_WOOD, true, FabricToolTags.AXES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_wood");
        PM_CHARRED_PLANKS = new DungeonsBlock(Blocks.OAK_PLANKS, true, FabricToolTags.AXES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_planks");
        PM_CHARRED_STAIRS = new DungeonsStairs(Blocks.OAK_STAIRS, true, FabricToolTags.AXES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_stairs");
        PM_CHARRED_SLAB = new DungeonsSlab(Blocks.OAK_SLAB, true, FabricToolTags.AXES, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_slab");
    }
}