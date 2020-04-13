package j0sh.javadungeons.content;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class CreeperWoodsBlocks {

    // stone variants
    public static DungeonsBlock CW_MOSSY_COBBLESTONE;
    public static DungeonsBlock CW_MOSSY_STONE;
    public static DungeonsBlock CW_MOSSY_STONE_BRICKS;

    // andesite variants
    public static DungeonsBlock CW_MOSSY_ANDESITE;
    public static DungeonsBlock CW_CRACKED_ANDESITE;

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
    public static DungeonsBlock CW_GRASSY_DIRT;
    public static DungeonsBlock CW_DENSE_GRASSY_DIRT;
    public static DungeonsBlock CW_DIRT;
    public static DungeonsBlock CW_ROCKY_DIRT;

    // creeper woods granite variant
    public static DungeonsBlock CW_POLISHED_GRANITE;
    public static DungeonsBlock CW_CHISELED_GRANITE;
    public static DungeonsSlab CW_POLISHED_GRANITE_SLAB;

    // stone tiles
    public static DungeonsBlock CW_DIRTY_STONE_TILES;
    public static DungeonsBlock CW_DIRTY_STONE_TILES_1;

    // floor tiles
    public static DungeonsBlock CW_DIRTY_FLOOR_TILE;

    // plants
    public static DungeonsPlant CW_GRASS;
    public static DungeonsPlant CW_SHORT_GRASS;
    public static DungeonsPlant CW_FERN;
    public static DungeonsPlant CW_SHRUB;
    public static DungeonsBlock CW_OAK_LEAVES;

    // custom dungeons blocks
    public static DungeonsGlowMushroom CW_GLOW_MUSHROOM;
    public static DungeonsEmissive CW_GLOW_MELON;
    public static DungeonsBlock CW_GLOW_MELON_ROOTS;

    public static void init() {
        // stone variants
        CW_MOSSY_COBBLESTONE = new DungeonsBlock(Blocks.MOSSY_COBBLESTONE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_cobblestone");
        CW_MOSSY_STONE = new DungeonsBlock(Blocks.STONE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_stone");
        CW_MOSSY_STONE_BRICKS = new DungeonsBlock(Blocks.MOSSY_STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_stone_bricks");

        // andesite variants
        CW_MOSSY_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_mossy_andesite");
        CW_CRACKED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_cracked_andesite");

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
        CW_GRASSY_DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.CREEPER_WOODS, "cw_grassy_dirt");
        CW_DENSE_GRASSY_DIRT = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.CREEPER_WOODS, "cw_dense_grassy_dirt");
        CW_DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.CREEPER_WOODS, "cw_dirt");
        CW_ROCKY_DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.CREEPER_WOODS, "cw_rocky_dirt");

        // creeper woods granite variant
        CW_POLISHED_GRANITE = new DungeonsBlock(Blocks.POLISHED_GRANITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_polished_granite");
        CW_CHISELED_GRANITE = new DungeonsBlock(Blocks.POLISHED_GRANITE, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_chiseled_granite");
        CW_POLISHED_GRANITE_SLAB = new DungeonsSlab(Blocks.POLISHED_GRANITE_SLAB, false, FabricToolTags.PICKAXES, JavaDungeons.CREEPER_WOODS, "cw_polished_granite_slab");

        // plants
        CW_GRASS = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.HOES, JavaDungeons.CREEPER_WOODS, "cw_grass");
        CW_SHORT_GRASS = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.HOES, JavaDungeons.CREEPER_WOODS, "cw_short_grass");
        CW_FERN = new DungeonsPlant(Blocks.FERN, true, FabricToolTags.HOES, JavaDungeons.CREEPER_WOODS, "cw_fern");
        CW_SHRUB = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.HOES, JavaDungeons.CREEPER_WOODS, "cw_shrub");
        CW_OAK_LEAVES = new DungeonsBlock(Blocks.OAK_LEAVES, true, FabricToolTags.HOES, JavaDungeons.CREEPER_WOODS, "cw_oak_leaves");

        // custom dungeons blocks
        CW_GLOW_MUSHROOM = new DungeonsGlowMushroom(Blocks.SEA_PICKLE, true, FabricToolTags.SWORDS, JavaDungeons.CREEPER_WOODS, "cw_glow_mushroom");
        CW_GLOW_MELON = new DungeonsEmissive(Blocks.MELON, true, FabricToolTags.AXES, JavaDungeons.CREEPER_WOODS, "cw_glow_melon");
        CW_GLOW_MELON_ROOTS = new DungeonsBlock(Blocks.GRASS, true, FabricToolTags.AXES, JavaDungeons.CREEPER_WOODS, "cw_glow_melon_roots");
    }
}