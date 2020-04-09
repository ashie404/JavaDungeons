package j0sh.javadungeons.content;

import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class DesertTempleBlocks {

    // andesite related
    public static DungeonsBlock DT_SANDY_ANDESITE;
    public static DungeonsBlock DT_CHISELED_SANDY_ANDESITE;
    public static DungeonsBlock DT_CHISELED_SANDY_ANDESITE_2;
    public static DungeonsPillar DT_SANDY_ANDESITE_PILLAR;

    // stone brick related
    public static DungeonsBlock DT_SANDY_STONE_BRICKS;
    public static DungeonsBlock DT_SANDY_STONE_TILES;
    public static DungeonsBlock DT_CHISELED_SANDY_STONE;

    public static void init() {
        // andesite related
        DT_SANDY_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, JavaDungeons.DESERT_TEMPLE, "dt_sandy_andesite");
        DT_CHISELED_SANDY_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, JavaDungeons.DESERT_TEMPLE, "dt_chiseled_sandy_andesite");
        DT_CHISELED_SANDY_ANDESITE_2 = new DungeonsBlock(Blocks.POLISHED_ANDESITE, JavaDungeons.DESERT_TEMPLE, "dt_chiseled_sandy_andesite_2");
        DT_SANDY_ANDESITE_PILLAR = new DungeonsPillar(Blocks.POLISHED_ANDESITE, JavaDungeons.DESERT_TEMPLE, "dt_sandy_andesite_pillar");

        // stone brick related
        DT_SANDY_STONE_BRICKS = new DungeonsBlock(Blocks.STONE_BRICKS, JavaDungeons.DESERT_TEMPLE, "dt_sandy_stone_bricks");
        DT_SANDY_STONE_TILES = new DungeonsBlock(Blocks.STONE_BRICKS, JavaDungeons.DESERT_TEMPLE, "dt_sandy_stone_tiles");
        DT_CHISELED_SANDY_STONE = new DungeonsBlock(Blocks.CHISELED_STONE_BRICKS, JavaDungeons.DESERT_TEMPLE, "dt_chiseled_sandy_stone");
    }
}