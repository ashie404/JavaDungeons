package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.DungeonsBlock;
import j0sh.javadungeons.blocks.DungeonsPillar;
import j0sh.javadungeons.blocks.DungeonsSlabStairBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DesertTempleBlocks {

    // andesite related
    public static DungeonsSlabStairBlock DT_SANDY_ANDESITE;
    public static DungeonsBlock DT_CHISELED_SANDY_ANDESITE;
    public static DungeonsBlock DT_CHISELED_SANDY_ANDESITE_2;
    public static DungeonsPillar DT_SANDY_ANDESITE_PILLAR;

    // stone brick related
    public static DungeonsSlabStairBlock  DT_SANDY_STONE_BRICKS;
    public static DungeonsBlock DT_CRACKED_SANDY_STONE_BRICKS;
    public static DungeonsSlabStairBlock  DT_SANDY_STONE_TILES;
    public static DungeonsBlock DT_CHISELED_SANDY_STONE;

    // stone related
    public static DungeonsBlock DT_SANDY_COBBLESTONE;

    public static void init() {
        // andesite related
        DT_SANDY_ANDESITE = new DungeonsSlabStairBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_sandy_andesite", "dt_sandy_andesite_slab", "dt_sandy_andesite_stairs");
        DT_CHISELED_SANDY_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_chiseled_sandy_andesite");
        DT_CHISELED_SANDY_ANDESITE_2 = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_chiseled_sandy_andesite_2");
        DT_SANDY_ANDESITE_PILLAR = new DungeonsPillar(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_sandy_andesite_pillar");

        // stone brick related
        DT_SANDY_STONE_BRICKS = new DungeonsSlabStairBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_sandy_stone_bricks", "dt_sandy_stone_brick_slab", "dt_sandy_stone_brick_stairs");
        DT_CRACKED_SANDY_STONE_BRICKS = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_cracked_sandy_stone_bricks");
        DT_SANDY_STONE_TILES = new DungeonsSlabStairBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_sandy_stone_tiles", "dt_sandy_stone_tiles_slab", "dt_sandy_stone_tiles_stairs");
        DT_CHISELED_SANDY_STONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_chiseled_sandy_stone");

        // stone related
        DT_SANDY_COBBLESTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.DESERT_TEMPLE, "dt_sandy_cobblestone");
    }
}