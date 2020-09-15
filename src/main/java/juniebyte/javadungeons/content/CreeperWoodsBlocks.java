package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
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
    public static DungeonsSlabStairBlock CW_DARK_POLISHED_ANDESITE;
    public static DungeonsBlock CW_MOSSY_DARK_ANDESITE;
    public static DungeonsBlock CW_MOSSY_DARK_ANDESITE_TILES;
    public static DungeonsSlabStairBlock CW_DARK_ANDESITE_TILES;
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
    public static DungeonsSlabStairBlock CW_POLISHED_GRANITE;
    public static DungeonsBlock CW_DIRTY_GRANITE;
    public static DungeonsBlock CW_CHISELED_GRANITE;

    // stone tiles
    public static DungeonsSlabStairBlock CW_DIRTY_STONE_TILES;
    public static DungeonsSlabStairBlock CW_DIRTY_STONE_TILES_1;
    public static DungeonsSlabStairBlock CW_DIRTY_STONE_TILES_2;

    // floor tiles
    public static DungeonsBlock CW_DIRTY_FLOOR_TILE;

    // plants
    public static DungeonsPlant CW_SHRUB;
    public static DungeonsGlowingPlant CW_POP_FLOWER;
    public static DungeonsPlant CW_FLOWER_PATCH;
    public static DungeonsLeaves CW_OAK_LEAVES;

    // custom dungeons blocks
    public static DungeonsGlowMushroom CW_GLOW_MUSHROOM;
    public static DungeonsEmissive CW_GLOW_MELON;
    public static DungeonsBlock CW_GLOW_MELON_ROOTS;

    // gravestones
    public static DungeonsGravestone CW_GRAVESTONE;
    public static DungeonsGravestone CW_MOSSY_GRAVESTONE;

    public static void init() {
        // stone variants
        CW_MOSSY_COBBLESTONE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_cobblestone");
        CW_MOSSY_STONE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_stone");
        CW_MOSSY_STONE_BRICKS = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_stone_bricks");
        CW_MOSSY_CHISELED_STONE_BRICKS = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_chiseled_stone_bricks");
        CW_SLOTTED_STONE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_slotted_stone");

        // andesite variants
        CW_MOSSY_ANDESITE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_andesite");
        CW_CRACKED_ANDESITE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_cracked_andesite");

        // dark andesite
        CW_DARK_POLISHED_ANDESITE = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_polished_andesite", "cw_dark_andesite_slab", "cw_dark_andesite_stairs");
        CW_MOSSY_DARK_ANDESITE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_dark_andesite");
        CW_MOSSY_DARK_ANDESITE_TILES = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_mossy_dark_andesite_tiles");
        CW_DARK_ANDESITE_TILES = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_andesite_tiles", "cw_dark_andesite_tiles_slab", "cw_dark_andesite_tiles_stairs");
        CW_DARK_CHISELED_ANDESITE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_chiseled_andesite");
        CW_DARK_CHISELED_ANDESITE_2 = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_chiseled_andesite_2");
        CW_DARK_ANDESITE_PILLAR = new DungeonsPillar(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dark_andesite_pillar");

        // ground related
        CW_GRASS_BLOCK = new DungeonsPathable(Material.SOLID_ORGANIC, 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.GRASS_PATH, JavaDungeons.CREEPER_WOODS, "cw_grass_block");
        CW_GRASSY_DIRT = new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_grassy_dirt");
        CW_DENSE_GRASSY_DIRT = new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_dense_grassy_dirt");
        CW_DIRT_PATH = new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_dirt_path");
        CW_DIRT = new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, CW_DIRT_PATH, JavaDungeons.CREEPER_WOODS, "cw_dirt");
        CW_DIRT_SLAB = new DungeonsSlab(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_dirt_slab");
        CW_ROCKY_DIRT_PATH = new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_rocky_dirt_path");
        CW_ROCKY_DIRT = new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, CW_ROCKY_DIRT_PATH, JavaDungeons.CREEPER_WOODS, "cw_rocky_dirt");
        CW_ROCKY_GRASSY_DIRT = new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_rocky_grassy_dirt");
        CW_COBWEBBED_DIRT = new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL, JavaDungeons.CREEPER_WOODS, "cw_cobwebbed_dirt");

        // creeper woods granite variant
        CW_POLISHED_GRANITE = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_polished_granite", "cw_polished_granite_slab", "cw_polished_granite_stairs");
        CW_CHISELED_GRANITE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_chiseled_granite");
        CW_DIRTY_GRANITE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dirty_granite");

        // stone tiles
        CW_DIRTY_STONE_TILES = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.CREEPER_WOODS, "cw_dirty_stone_tiles", "cw_dirty_stone_tiles_slab", "cw_dirty_stone_tiles_stairs");
        CW_DIRTY_STONE_TILES_1 = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.CREEPER_WOODS, "cw_dirty_stone_tiles_1", "cw_dirty_stone_tiles_slab_1", "cw_dirty_stone_tiles_stairs_1");
        CW_DIRTY_STONE_TILES_2 = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.CREEPER_WOODS, "cw_dirty_stone_tiles_2", "cw_dirty_stone_tiles_slab_2", "cw_dirty_stone_tiles_stairs_2");
        
        // floor tiles
        CW_DIRTY_FLOOR_TILE = new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE,  JavaDungeons.CREEPER_WOODS, "cw_dirty_floor_tile");

        // plants
        CW_SHRUB = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_shrub");
        CW_POP_FLOWER = new DungeonsGlowingPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_pop_flower");
        CW_FLOWER_PATCH = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_flower_patch");
        CW_OAK_LEAVES = new DungeonsLeaves(JavaDungeons.CREEPER_WOODS, "cw_oak_leaves");

        // custom dungeons blocks
        CW_GLOW_MUSHROOM = new DungeonsGlowMushroom(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.SLIME, JavaDungeons.CREEPER_WOODS, "cw_glow_mushroom");
        CW_GLOW_MELON = new DungeonsEmissive(Material.GOURD, 1.0F, 1.0F, BlockSoundGroup.WOOD, JavaDungeons.CREEPER_WOODS, "cw_glow_melon");
        CW_GLOW_MELON_ROOTS = new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS, JavaDungeons.CREEPER_WOODS, "cw_glow_melon_roots");

        // gravestones
        CW_GRAVESTONE = new DungeonsGravestone(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.CREEPER_WOODS, "cw_gravestone");
        CW_MOSSY_GRAVESTONE = new DungeonsGravestone(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.CREEPER_WOODS, "cw_mossy_gravestone");
    }
}