package j0sh.javadungeons.content;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class CreeperWoodsBlocks {

    // stone variants
    public static DungeonsBlock CW_MOSSY_STONE_BRICKS;

    // andesite variants
    public static DungeonsBlock CW_MOSSY_ANDESITE;

    // dark andesite
    public static DungeonsBlock CW_DARK_POLISHED_ANDESITE;
    public static DungeonsBlock CW_MOSSY_DARK_ANDESITE;
    public static DungeonsBlock CW_MOSSY_DARK_ANDESITE_TILES;
    public static DungeonsBlock CW_DARK_ANDESITE_TILES;
    public static DungeonsBlock CW_DARK_CHISELED_ANDESITE;
    public static DungeonsBlock CW_DARK_CHISELED_ANDESITE_2;
    public static DungeonsPillar CW_DARK_ANDESITE_PILLAR;
    
    // ground related
    public static DungeonsBlock CW_GRASS_BLOCK;

    // creeper woods granite variant
    public static DungeonsBlock CW_POLISHED_GRANITE;
    public static DungeonsBlock CW_CHISELED_GRANITE;
    public static DungeonsSlab CW_POLISHED_GRANITE_SLAB;

    // sanded andesite
    public static DungeonsBlock CW_SANDED_ANDESITE;
    public static DungeonsBlock CW_SANDED_ANDESITE_TILES;
    public static DungeonsBlock CW_MOSSY_SANDED_ANDESITE_TILES;
    public static DungeonsBlock CW_SANDED_ANDESITE_BRICKS;
    public static DungeonsBlock CW_CHISELED_SANDED_ANDESITE;

    // custom dungeons blocks
    public static DungeonsGlowMushroom CW_GLOW_MUSHROOM;

    public static void init() {
        // stone variants
        CW_MOSSY_STONE_BRICKS = new DungeonsBlock(Blocks.MOSSY_STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_stone_bricks");

        // andesite variants
        CW_MOSSY_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_andesite");

        // dark andesite
        CW_DARK_POLISHED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_dark_polished_andesite");
        CW_MOSSY_DARK_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_dark_andesite");
        CW_MOSSY_DARK_ANDESITE_TILES = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_dark_andesite_tiles");
        CW_DARK_ANDESITE_TILES = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_dark_andesite_tiles");
        CW_DARK_CHISELED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_dark_chiseled_andesite");
        CW_DARK_CHISELED_ANDESITE_2 = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_dark_chiseled_andesite_2");
        CW_DARK_ANDESITE_PILLAR = new DungeonsPillar(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_dark_andesite_pillar");

        // ground related
        CW_GRASS_BLOCK = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.CREEPER_WOODS, "cw_grass_block");

        // creeper woods granite variant
        CW_POLISHED_GRANITE = new DungeonsBlock(Blocks.POLISHED_GRANITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_polished_granite");
        CW_CHISELED_GRANITE = new DungeonsBlock(Blocks.POLISHED_GRANITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_chiseled_granite");
        CW_POLISHED_GRANITE_SLAB = new DungeonsSlab(Blocks.POLISHED_GRANITE_SLAB, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_polished_granite_slab");

        // sanded andesite
        CW_SANDED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_sanded_andesite");
        CW_SANDED_ANDESITE_TILES = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_sanded_andesite_tiles");
        CW_MOSSY_SANDED_ANDESITE_TILES = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_sanded_andesite_tiles");
        CW_SANDED_ANDESITE_BRICKS = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_sanded_andesite_bricks");
        CW_CHISELED_SANDED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_chiseled_sanded_andesite");

        // custom dungeons blocks
        CW_GLOW_MUSHROOM = new DungeonsGlowMushroom(Blocks.SEA_PICKLE, true, FabricToolTags.SWORDS, JavaDungeons.CREEPER_WOODS, "cw_glow_mushroom");
    }
}