package j0sh.javadungeons.content;

import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class GenericBlocks {

    public static DungeonsBlock FLOOR_TILE;
    public static DungeonsBlock DIRTY_FLOOR_TILE; 
    public static DungeonsBlock CRATE;
    public static DungeonsBlock DIRT;
    public static DungeonsBlock ROCKY_DIRT;
    public static DungeonsBlock ASH_PLANKS;

    public static void init() {
        FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, JavaDungeons.GENERIC, "floor_tile");
        DIRTY_FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, JavaDungeons.GENERIC, "dirty_floor_tile");
        CRATE = new DungeonsBlock(Blocks.OAK_PLANKS, JavaDungeons.GENERIC, "crate");
        DIRT = new DungeonsBlock(Blocks.DIRT, JavaDungeons.GENERIC, "dirt");
        ROCKY_DIRT = new DungeonsBlock(Blocks.DIRT, JavaDungeons.GENERIC, "rocky_dirt");
        ASH_PLANKS = new DungeonsBlock(Blocks.OAK_PLANKS, JavaDungeons.GENERIC, "ash_planks");
    }
}