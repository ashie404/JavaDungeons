package j0sh.javadungeons.content;

import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class GenericBlocks {

    public static DungeonsBlock FLOOR_TILE;
    public static DungeonsBlock CRATE;
    public static DungeonsBlock DIRT;

    public static void init() {
        FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, JavaDungeons.GENERIC, "floor_tile");
        CRATE = new DungeonsBlock(Blocks.OAK_PLANKS, JavaDungeons.GENERIC, "crate");
        DIRT = new DungeonsBlock(Blocks.DIRT, JavaDungeons.GENERIC, "dirt");
    }
}