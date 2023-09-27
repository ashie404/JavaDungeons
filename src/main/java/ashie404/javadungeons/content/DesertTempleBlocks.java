package ashie404.javadungeons.content;

import ashie404.javadungeons.blocks.*;
import net.minecraft.sound.BlockSoundGroup;

public class DesertTempleBlocks {

    // andesite related
    public static DungeonsSlabStairBlock DT_SANDY_ANDESITE;
    public static DungeonsBlock DT_CHISELED_SANDY_ANDESITE;
    public static DungeonsBlock DT_CHISELED_SANDY_ANDESITE_2;
    public static DungeonsPillar DT_SANDY_ANDESITE_PILLAR;

    // stone brick related
    public static DungeonsSlabStairBlock DT_SANDY_STONE_BRICKS;
    public static DungeonsBlock DT_CRACKED_SANDY_STONE_BRICKS;
    public static DungeonsSlabStairBlock DT_SANDY_STONE_TILES;
    public static DungeonsBlock DT_CHISELED_SANDY_STONE;

    // stone related
    public static DungeonsBlock DT_SANDY_COBBLESTONE;

    public static void init() {
        // andesite related
        DT_SANDY_ANDESITE = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_andesite", "dt_sandy_andesite_slab", "dt_sandy_andesite_stairs");
        DT_CHISELED_SANDY_ANDESITE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_chiseled_sandy_andesite");
        DT_CHISELED_SANDY_ANDESITE_2 = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_chiseled_sandy_andesite_2");
        DT_SANDY_ANDESITE_PILLAR = new DungeonsPillar(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_andesite_pillar");

        // stone brick related
        DT_SANDY_STONE_BRICKS = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_stone_bricks", "dt_sandy_stone_brick_slab", "dt_sandy_stone_brick_stairs");
        DT_CRACKED_SANDY_STONE_BRICKS = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_cracked_sandy_stone_bricks");
        DT_SANDY_STONE_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_stone_tiles", "dt_sandy_stone_tiles_slab", "dt_sandy_stone_tiles_stairs");
        DT_CHISELED_SANDY_STONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_chiseled_sandy_stone");

        // stone related
        DT_SANDY_COBBLESTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_cobblestone");
    }
}