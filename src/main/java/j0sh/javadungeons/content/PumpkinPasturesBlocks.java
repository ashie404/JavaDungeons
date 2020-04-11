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
    public static DungeonsPlant PM_AUTUMNAL_GRASS;
    public static DungeonsPlant PM_AUTUMNAL_SHORT_GRASS;
    public static DungeonsPlant PM_AUTUMNAL_GRASS_CLUMP;

    // plants
    public static DungeonsBlock PM_BURNT_PUMPKIN;
    public static DungeonsBlock PM_ROTTED_PUMPKIN;

    // ground related
    public static DungeonsBlock PM_AUTUMNAL_GRASS_BLOCK;
    public static DungeonsBlock PM_DENSE_AUTUMNAL_GRASSY_DIRT;
    public static DungeonsBlock PM_AUTUMNAL_GRASSY_DIRT;
    public static DungeonsBlock PM_SPARSE_AUTUMNAL_GRASSY_DIRT;

    // wood related
    public static DungeonsBlock PM_CHARRED_LOG;
    public static DungeonsBlock PM_CHARRED_WOOD;
    public static DungeonsBlock PM_CHARRED_PLANKS;
    public static DungeonsStairs PM_CHARRED_STAIRS;
    public static DungeonsSlab PM_CHARRED_SLAB;

    public static void init() {
        // foliage
        PM_YELLOW_AUTUMNAL_LEAVES = new DungeonsBlock(Blocks.BIRCH_LEAVES, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_yellow_autumnal_leaves");
        PM_RED_AUTUMNAL_LEAVES = new DungeonsBlock(Blocks.OAK_LEAVES, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_red_autumnal_leaves");

        // plants
        PM_BURNT_PUMPKIN = new DungeonsBlock(Blocks.PUMPKIN, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "pm_burnt_pumpkin");

        // grass
        PM_AUTUMNAL_GRASS = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_autumnal_grass");
        PM_AUTUMNAL_SHORT_GRASS = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_autumnal_short_grass");
        PM_AUTUMNAL_GRASS_CLUMP = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.HOES, JavaDungeons.PUMPKIN_PASTURES, "pm_autumnal_grass_clump");

        // ground related
        PM_AUTUMNAL_GRASS_BLOCK = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.PUMPKIN_PASTURES, "pm_autumnal_grass_block");
        PM_DENSE_AUTUMNAL_GRASSY_DIRT = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.PUMPKIN_PASTURES, "pm_dense_autumnal_grassy_dirt");
        PM_AUTUMNAL_GRASSY_DIRT = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.PUMPKIN_PASTURES, "pm_autumnal_grassy_dirt");
        PM_SPARSE_AUTUMNAL_GRASSY_DIRT = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.PUMPKIN_PASTURES, "pm_sparse_autumnal_grassy_dirt");
        
        // wood related
        PM_CHARRED_PLANKS = new DungeonsBlock(Blocks.OAK_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "pm_charred_planks");
        // TODO: Add other charred wood blocks
        // TODO: Add charred grass types and charred dirt
        // TODO: Add autumnal tree saplings?
        // TODO: Brighten yellow autumnal colors
    }
}