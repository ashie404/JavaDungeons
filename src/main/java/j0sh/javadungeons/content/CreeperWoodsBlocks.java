package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.DungeonsBlock;
import j0sh.javadungeons.blocks.DungeonsEmissive;
import j0sh.javadungeons.blocks.DungeonsGlowMushroom;
import j0sh.javadungeons.blocks.DungeonsGlowingPlant;
import j0sh.javadungeons.blocks.DungeonsPath;
import j0sh.javadungeons.blocks.DungeonsPathable;
import j0sh.javadungeons.blocks.DungeonsPillar;
import j0sh.javadungeons.blocks.DungeonsPlant;
import j0sh.javadungeons.blocks.DungeonsSlab;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CreeperWoodsBlocks {

    // stone variants
    public static DungeonsBlock CW_MOSSY_COBBLESTONE;
    public static DungeonsBlock CW_MOSSY_STONE;
    public static DungeonsBlock CW_MOSSY_STONE_BRICKS;
    public static DungeonsBlock CW_MOSSY_CHISELED_STONE_BRICKS;
    public static DungeonsBlock CW_SLOTTED_STONE;

    // andesite variants
    public static DungeonsBlock CW_MOSSY_ANDESITE;
    public static DungeonsBlock CW_CRACKED_ANDESITE;

    // dark andesite
    public static DungeonsBlock CW_DARK_POLISHED_ANDESITE;
    public static DungeonsSlab CW_DARK_ANDESITE_SLAB;
    public static DungeonsBlock CW_MOSSY_DARK_ANDESITE;
    public static DungeonsBlock CW_MOSSY_DARK_ANDESITE_TILES;
    public static DungeonsBlock CW_DARK_ANDESITE_TILES;
    public static DungeonsBlock CW_DARK_CHISELED_ANDESITE;
    public static DungeonsBlock CW_DARK_CHISELED_ANDESITE_2;
    public static DungeonsPillar CW_DARK_ANDESITE_PILLAR;
    
    // ground related
    public static DungeonsPathable CW_GRASS_BLOCK;
    public static DungeonsBlock CW_GRASSY_DIRT;
    public static DungeonsBlock CW_DENSE_GRASSY_DIRT;
    public static DungeonsPathable CW_DIRT;
    public static DungeonsSlab CW_DIRT_SLAB;
    public static DungeonsPath CW_DIRT_PATH;
    public static DungeonsPathable CW_ROCKY_DIRT;
    public static DungeonsPath CW_ROCKY_DIRT_PATH;
    public static DungeonsBlock CW_ROCKY_GRASSY_DIRT;
    public static DungeonsBlock CW_COBWEBBED_DIRT;

    // creeper woods granite variant
    public static DungeonsBlock CW_POLISHED_GRANITE;
    public static DungeonsBlock CW_DIRTY_GRANITE;
    public static DungeonsBlock CW_CHISELED_GRANITE;
    public static DungeonsSlab CW_POLISHED_GRANITE_SLAB;

    // stone tiles
    public static DungeonsBlock CW_DIRTY_STONE_TILES;
    public static DungeonsBlock CW_DIRTY_STONE_TILES_1;

    // floor tiles
    public static DungeonsBlock CW_DIRTY_FLOOR_TILE;

    // plants
    public static DungeonsPlant CW_SHRUB;
    public static DungeonsGlowingPlant CW_POP_FLOWER;
    public static DungeonsPlant CW_FLOWER_PATCH;

    // custom dungeons blocks
    public static DungeonsGlowMushroom CW_GLOW_MUSHROOM;
    public static DungeonsEmissive CW_GLOW_MELON;
    public static DungeonsBlock CW_GLOW_MELON_ROOTS;

    public static void init() {
        // stone variants
        CW_MOSSY_COBBLESTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_cobblestone");
        CW_MOSSY_STONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_stone");
        CW_MOSSY_STONE_BRICKS = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_stone_bricks");
        CW_MOSSY_CHISELED_STONE_BRICKS = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_chiseled_stone_bricks");
        CW_SLOTTED_STONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_slotted_stone");

        // andesite variants
        CW_MOSSY_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_andesite");
        CW_CRACKED_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_cracked_andesite");

        // dark andesite
        CW_DARK_POLISHED_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_polished_andesite");
        CW_DARK_ANDESITE_SLAB = new DungeonsSlab(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_andesite_slab");
        CW_MOSSY_DARK_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_dark_andesite");
        CW_MOSSY_DARK_ANDESITE_TILES = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_dark_andesite_tiles");
        CW_DARK_ANDESITE_TILES = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_andesite_tiles");
        CW_DARK_CHISELED_ANDESITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_chiseled_andesite");
        CW_DARK_CHISELED_ANDESITE_2 = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_chiseled_andesite_2");
        CW_DARK_ANDESITE_PILLAR = new DungeonsPillar(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_andesite_pillar");

        // ground related
        CW_GRASS_BLOCK = new DungeonsPathable(Material.ORGANIC, BlockSoundGroup.GRASS, Blocks.GRASS_PATH, JavaDungeons.CREEPER_WOODS, "cw_grass_block");
        CW_GRASSY_DIRT = new DungeonsBlock(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_grassy_dirt");
        CW_DENSE_GRASSY_DIRT = new DungeonsBlock(Material.ORGANIC, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_dense_grassy_dirt");
        CW_DIRT_PATH = new DungeonsPath(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_dirt_path");
        CW_DIRT = new DungeonsPathable(Material.EARTH, BlockSoundGroup.GRAVEL, CW_DIRT_PATH, JavaDungeons.CREEPER_WOODS, "cw_dirt");
        CW_DIRT_SLAB = new DungeonsSlab(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_dirt_slab");
        CW_ROCKY_DIRT_PATH = new DungeonsPath(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_rocky_dirt_path");
        CW_ROCKY_DIRT = new DungeonsPathable(Material.EARTH, BlockSoundGroup.GRAVEL, CW_ROCKY_DIRT_PATH, JavaDungeons.CREEPER_WOODS, "cw_rocky_dirt");
        CW_ROCKY_GRASSY_DIRT = new DungeonsBlock(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_rocky_grassy_dirt");
        CW_COBWEBBED_DIRT = new DungeonsBlock(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_cobwebbed_dirt");

        // creeper woods granite variant
        CW_POLISHED_GRANITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_polished_granite");
        CW_CHISELED_GRANITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_chiseled_granite");
        CW_POLISHED_GRANITE_SLAB = new DungeonsSlab(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_polished_granite_slab");
        CW_DIRTY_GRANITE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dirty_granite");
        
        // floor tiles
        CW_DIRTY_FLOOR_TILE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dirty_floor_tile");

        // plants
        CW_SHRUB = new DungeonsPlant(Material.REPLACEABLE_PLANT, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_shrub");
        CW_POP_FLOWER = new DungeonsGlowingPlant(Material.REPLACEABLE_PLANT, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_pop_flower");
        CW_FLOWER_PATCH = new DungeonsPlant(Material.REPLACEABLE_PLANT, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_flower_patch");

        // custom dungeons blocks
        CW_GLOW_MUSHROOM = new DungeonsGlowMushroom(Material.PLANT, BlockSoundGroup.SLIME, JavaDungeons.CREEPER_WOODS, "cw_glow_mushroom");
        CW_GLOW_MELON = new DungeonsEmissive(Material.PUMPKIN, BlockSoundGroup.WOOD, JavaDungeons.CREEPER_WOODS, "cw_glow_melon");
        CW_GLOW_MELON_ROOTS = new DungeonsBlock(Material.ORGANIC, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_glow_melon_roots");
    }
}