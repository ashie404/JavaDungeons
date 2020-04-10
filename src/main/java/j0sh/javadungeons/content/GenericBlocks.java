package j0sh.javadungeons.content;

import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class GenericBlocks {

    // generic blocks that aren't in mc
    public static DungeonsBlock FLOOR_TILE;
    public static DungeonsBlock DIRTY_FLOOR_TILE; 
    public static DungeonsBlock CRATE;

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

    public static void init() {
        // dungeons blocks that aren't in mc
        FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, JavaDungeons.GENERIC, "floor_tile");
        DIRTY_FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, JavaDungeons.GENERIC, "dirty_floor_tile");
        CRATE = new DungeonsBlock(Blocks.OAK_PLANKS, JavaDungeons.GENERIC, "crate");

        // ground related
        DIRT = new DungeonsBlock(Blocks.DIRT, JavaDungeons.GENERIC, "dirt");
        DIRT_SLAB = new DungeonsSlab(Blocks.DIRT, JavaDungeons.GENERIC, "dirt_slab");
        ROCKY_DIRT = new DungeonsBlock(Blocks.DIRT, JavaDungeons.GENERIC, "rocky_dirt");

        // wood related
        ASH_PLANKS = new DungeonsBlock(Blocks.OAK_PLANKS, JavaDungeons.GENERIC, "ash_planks");

        // stone brick related
        DARK_STONE_BRICKS = new DungeonsBlock(Blocks.STONE_BRICKS, JavaDungeons.GENERIC, "dark_stone_bricks");
        DIRTY_DARK_STONE_BRICKS = new DungeonsBlock(Blocks.STONE_BRICKS, JavaDungeons.GENERIC, "dirty_dark_stone_bricks");
        CHISELED_DARK_STONE = new DungeonsBlock(Blocks.CHISELED_STONE_BRICKS, JavaDungeons.GENERIC, "chiseled_dark_stone");

        // plants
        SHORT_GRASS = new DungeonsPlant(Blocks.GRASS, JavaDungeons.GENERIC, "short_grass");
        GRASS_CLUMP = new DungeonsPlant(Blocks.GRASS, JavaDungeons.GENERIC, "grass_clump");
    }
}