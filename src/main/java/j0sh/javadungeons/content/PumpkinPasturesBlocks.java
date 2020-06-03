package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.*;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class PumpkinPasturesBlocks {

    // foliage
    public static DungeonsLeaves PM_YELLOW_AUTUMNAL_LEAVES;
    public static DungeonsLeaves PM_RED_AUTUMNAL_LEAVES;

    // plants
    public static DungeonsPlant PM_SHRUB;
    public static DungeonsPlant PM_CHARRED_GRASS;
    public static DungeonsPlant PM_FERN;
    public static DungeonsPlant PM_DEAD_SAPLING;

    // melons
    public static DungeonsBlock PM_BURNT_PUMPKIN;
    public static DungeonsBlock PM_ROTTED_PUMPKIN;

    // haybale
    public static DungeonsPillar PM_DRIED_HAYBALE;

    // ground related
    public static DungeonsBlock PM_CHARRED_GRASS_BLOCK;
    public static DungeonsPath PM_CHARRED_DIRT_PATH;
    public static DungeonsPathable PM_CHARRED_DIRT;
    public static DungeonsSlab PM_CHARRED_DIRT_SLAB;
    public static DungeonsBlock PM_CHARRED_DIRT_EMBERS;
    public static DungeonsPath PM_CHARRED_FARMLAND;

    // charred stones
    public static DungeonsBlock PM_CHARRED_STONE;
    public static DungeonsSlabStairBlock PM_CHARRED_COBBLESTONE;
    public static DungeonsSlabStairBlock PM_CHARRED_STONE_BRICKS;
    public static DungeonsBlock PM_CRACKED_CHARRED_STONE_BRICKS;

    // stone related
    public static DungeonsBlock PM_MOSSY_STONE_BRICKS;

    // wood related
    public static DungeonsPillar PM_CHARRED_LOG;
    public static DungeonsPillar PM_CHARRED_WOOD;
    public static DungeonsSlabStairBlock PM_CHARRED_PLANKS;

    public static void init() {
        // foliage
        PM_YELLOW_AUTUMNAL_LEAVES = new DungeonsLeaves(Material.LEAVES, 0.2F, 0.2F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_yellow_autumnal_leaves");
        PM_RED_AUTUMNAL_LEAVES = new DungeonsLeaves(Material.LEAVES, 0.2F, 0.2F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_red_autumnal_leaves");

        // melons
        PM_BURNT_PUMPKIN = new DungeonsBlock(Material.GOURD, 1.0F, 1.0F, BlockSoundGroup.WOOD, JavaDungeons.PUMPKIN_PASTURES, "pm_burnt_pumpkin");
        PM_ROTTED_PUMPKIN = new DungeonsBlock(Material.GOURD, 1.0F, 1.0F, BlockSoundGroup.WOOD, JavaDungeons.PUMPKIN_PASTURES, "pm_rotted_pumpkin");

        // haybale
        PM_DRIED_HAYBALE = new DungeonsPillar(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_dried_haybale");

        // plants
        PM_SHRUB = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_shrub");
        PM_CHARRED_GRASS = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_grass");
        PM_FERN = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_fern");
        PM_DEAD_SAPLING = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_dead_sapling");

        // ground related
        PM_CHARRED_GRASS_BLOCK = new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_grass_block");
        PM_CHARRED_DIRT_PATH = new DungeonsPath(Material.SOIL, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_dirt_path");
        PM_CHARRED_DIRT = new DungeonsPathable(Material.SOIL, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, PM_CHARRED_DIRT_PATH, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_dirt");
        PM_CHARRED_DIRT_SLAB = new DungeonsSlab(Material.SOIL, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_dirt_slab");
        PM_CHARRED_DIRT_EMBERS = new DungeonsBlock(Material.SOIL, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_dirt_embers");
        PM_CHARRED_FARMLAND = new DungeonsPath(Material.SOIL, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_farmland");
        
        // charred stones
        PM_CHARRED_STONE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_stone");
        PM_CHARRED_COBBLESTONE = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_cobblestone", "pm_charred_cobblestone_slab", "pm_charred_cobblestone_stairs");
        PM_CHARRED_STONE_BRICKS = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_stone_bricks", "pm_charred_stone_brick_slab", "pm_charred_stone_brick_stairs");
        PM_CRACKED_CHARRED_STONE_BRICKS = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.PUMPKIN_PASTURES, "pm_cracked_charred_stone_bricks");

        // stone related
        PM_MOSSY_STONE_BRICKS = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.PUMPKIN_PASTURES, "pm_mossy_stone_bricks");

        // wood related
        PM_CHARRED_LOG = new DungeonsPillar(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_log");
        PM_CHARRED_WOOD = new DungeonsPillar(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_wood");
        PM_CHARRED_PLANKS = new DungeonsSlabStairBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_planks", "pm_charred_slab", "pm_charred_stairs");
    }
}