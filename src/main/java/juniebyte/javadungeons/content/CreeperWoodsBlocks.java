package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import juniebyte.javadungeons.blocks.saplings.CWFancyOakSaplingGenerator;
import juniebyte.javadungeons.blocks.saplings.CWOakSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CreeperWoodsBlocks {

    // stone variants
    public static Block CW_LIGHTLY_MOSSY_COBBLESTONE;
    public static Block CW_LIGHTLY_MOSSY_STONE;
    public static Block CW_LIGHTLY_MOSSY_STONE_BRICKS;
    public static Block CW_MOSSY_COBBLESTONE;
    public static Block CW_MOSSY_STONE;
    public static Block CW_MOSSY_STONE_BRICKS;
    public static Block CW_HEAVILY_MOSSY_COBBLESTONE;
    public static Block CW_HEAVILY_MOSSY_STONE;
    public static Block CW_HEAVILY_MOSSY_STONE_BRICKS;
    public static Block CW_MOSSY_CHISELED_STONE_BRICKS;
    public static Block CW_SLOTTED_STONE;

    // andesite variants
    public static Block CW_MOSSY_ANDESITE;
    public static Block CW_CRACKED_ANDESITE;

    // dark andesite
    public static Block CW_DARK_POLISHED_ANDESITE;
    public static Block CW_MOSSY_DARK_ANDESITE;
    public static Block CW_MOSSY_DARK_ANDESITE_TILES;
    public static Block CW_DARK_ANDESITE_TILES;
    public static Block CW_DARK_CHISELED_ANDESITE;
    public static Block CW_DARK_CHISELED_ANDESITE_2;
    public static Block CW_DARK_ANDESITE_PILLAR;

    // ground related
    public static Block CW_GRASS_BLOCK;
    public static Block CW_GRASSY_DIRT;
    public static Block CW_DENSE_GRASSY_DIRT;
    public static Block CW_DIRT;
    public static Block CW_DIRT_SLAB;
    public static Block CW_DIRT_PATH;
    public static Block CW_ROCKY_DIRT;
    public static Block CW_ROCKY_DIRT_PATH;
    public static Block CW_ROCKY_GRASSY_DIRT;
    public static Block CW_COBWEBBED_DIRT;

    // creeper woods granite variant
    public static Block CW_POLISHED_GRANITE;
    public static Block CW_DIRTY_GRANITE;
    public static Block CW_CHISELED_GRANITE;

    // stone tiles
    public static Block CW_DIRTY_STONE_TILES;
    public static Block CW_DIRTY_STONE_TILES_1;
    public static Block CW_DIRTY_STONE_TILES_2;

    // floor tiles
    public static Block CW_DIRTY_FLOOR_TILE;

    // plants
    public static Block CW_SHRUB;
    public static Block CW_POP_FLOWER;
    public static Block CW_FLOWER_PATCH;
    public static Block CW_OAK_LEAVES;
    public static Block CW_OAK_SAPLING;
    public static Block CW_FANCY_OAK_SAPLING;

    // custom dungeons blocks
    public static Block CW_GLOW_MUSHROOM;
    public static Block CW_GLOW_MELON;
    public static Block CW_GLOW_MELON_ROOTS;

    // gravestones
    public static Block CW_GRAVESTONE;
    public static Block CW_MOSSY_GRAVESTONE;

    public static void init() {
        // stone variants
        CW_LIGHTLY_MOSSY_COBBLESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_lightly_mossy_cobblestone", JavaDungeons.CREEPER_WOODS);
        CW_LIGHTLY_MOSSY_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_lightly_mossy_stone", JavaDungeons.CREEPER_WOODS);
        CW_LIGHTLY_MOSSY_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_lightly_mossy_stone_bricks", JavaDungeons.CREEPER_WOODS);
        CW_MOSSY_COBBLESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_mossy_cobblestone", JavaDungeons.CREEPER_WOODS);
        CW_MOSSY_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_mossy_stone", JavaDungeons.CREEPER_WOODS);
        CW_MOSSY_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_mossy_stone_bricks", JavaDungeons.CREEPER_WOODS);
        CW_HEAVILY_MOSSY_COBBLESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_heavily_mossy_cobblestone", JavaDungeons.CREEPER_WOODS);
        CW_HEAVILY_MOSSY_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_heavily_mossy_stone", JavaDungeons.CREEPER_WOODS);
        CW_HEAVILY_MOSSY_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_heavily_mossy_stone_bricks", JavaDungeons.CREEPER_WOODS);
        CW_MOSSY_CHISELED_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_mossy_chiseled_stone_bricks", JavaDungeons.CREEPER_WOODS);
        CW_SLOTTED_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_slotted_stone", JavaDungeons.CREEPER_WOODS);

        // andesite variants
        CW_MOSSY_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_mossy_andesite", JavaDungeons.CREEPER_WOODS);
        CW_CRACKED_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_cracked_andesite", JavaDungeons.CREEPER_WOODS);

        // dark andesite
        CW_DARK_POLISHED_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dark_polished_andesite", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dark_andesite_slab", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CW_DARK_POLISHED_ANDESITE), "cw_dark_andesite_stairs", JavaDungeons.CREEPER_WOODS);
        CW_MOSSY_DARK_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_mossy_dark_andesite", JavaDungeons.CREEPER_WOODS);
        CW_MOSSY_DARK_ANDESITE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_mossy_dark_andesite_tiles", JavaDungeons.CREEPER_WOODS);
        CW_DARK_ANDESITE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dark_andesite_tiles", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dark_andesite_tiles_slab", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CW_DARK_ANDESITE_TILES), "cw_dark_andesite_tiles_stairs", JavaDungeons.CREEPER_WOODS);
        CW_DARK_CHISELED_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dark_chiseled_andesite", JavaDungeons.CREEPER_WOODS);
        CW_DARK_CHISELED_ANDESITE_2 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dark_chiseled_andesite_2", JavaDungeons.CREEPER_WOODS);
        CW_DARK_ANDESITE_PILLAR = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPillar(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dark_andesite_pillar", JavaDungeons.CREEPER_WOODS);

        // ground related
        CW_GRASS_BLOCK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.SOLID_ORGANIC, 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH), "cw_grass_block", JavaDungeons.CREEPER_WOODS);
        CW_GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cw_grassy_dirt", JavaDungeons.CREEPER_WOODS);
        CW_DENSE_GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS), "cw_dense_grassy_dirt", JavaDungeons.CREEPER_WOODS);
        CW_DIRT_PATH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cw_dirt_path", JavaDungeons.CREEPER_WOODS);
        CW_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, CW_DIRT_PATH), "cw_dirt", JavaDungeons.CREEPER_WOODS);
        CW_DIRT_SLAB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cw_dirt_slab", JavaDungeons.CREEPER_WOODS);
        CW_ROCKY_DIRT_PATH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cw_rocky_dirt_path", JavaDungeons.CREEPER_WOODS);
        CW_ROCKY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, CW_ROCKY_DIRT_PATH), "cw_rocky_dirt", JavaDungeons.CREEPER_WOODS);
        CW_ROCKY_GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cw_rocky_grassy_dirt", JavaDungeons.CREEPER_WOODS);
        CW_COBWEBBED_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cw_cobwebbed_dirt", JavaDungeons.CREEPER_WOODS);

        // creeper woods granite variant
        CW_POLISHED_GRANITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_polished_granite", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_polished_granite_slab", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CW_POLISHED_GRANITE), "cw_polished_granite_stairs", JavaDungeons.CREEPER_WOODS);
        CW_CHISELED_GRANITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_chiseled_granite", JavaDungeons.CREEPER_WOODS);
        CW_DIRTY_GRANITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dirty_granite", JavaDungeons.CREEPER_WOODS);

        // stone tiles
        CW_DIRTY_STONE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dirty_stone_tiles", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dirty_stone_tiles_slab", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CW_DIRTY_STONE_TILES), "cw_dirty_stone_tiles_stairs", JavaDungeons.CREEPER_WOODS);
        CW_DIRTY_STONE_TILES_1 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dirty_stone_tiles_1", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dirty_stone_tiles_slab_1", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CW_DIRTY_STONE_TILES_1), "cw_dirty_stone_tiles_stairs_1", JavaDungeons.CREEPER_WOODS);
        CW_DIRTY_STONE_TILES_2 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dirty_stone_tiles_2", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dirty_stone_tiles_slab_2", JavaDungeons.CREEPER_WOODS);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CW_DIRTY_STONE_TILES_2), "cw_dirty_stone_tiles_stairs_2", JavaDungeons.CREEPER_WOODS);

        // floor tiles
        CW_DIRTY_FLOOR_TILE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_dirty_floor_tile", JavaDungeons.CREEPER_WOODS);

        // plants
        CW_SHRUB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cw_shrub", JavaDungeons.CREEPER_WOODS);
        CW_POP_FLOWER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsGlowingPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cw_pop_flower", JavaDungeons.CREEPER_WOODS);
        CW_FLOWER_PATCH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cw_flower_patch", JavaDungeons.CREEPER_WOODS);
        CW_OAK_LEAVES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsLeaves(), "cw_oak_leaves", JavaDungeons.CREEPER_WOODS);
        CW_OAK_SAPLING = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSapling(new CWOakSaplingGenerator()), "cw_oak_sapling", JavaDungeons.CREEPER_WOODS);
        CW_FANCY_OAK_SAPLING = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSapling(new CWFancyOakSaplingGenerator()), "cw_fancy_oak_sapling", JavaDungeons.CREEPER_WOODS);

        // custom dungeons blocks
        CW_GLOW_MUSHROOM = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsGlowMushroom(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.SLIME), "cw_glow_mushroom", JavaDungeons.CREEPER_WOODS);
        CW_GLOW_MELON = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsEmissive(Material.GOURD, 1.0F, 1.0F, BlockSoundGroup.WOOD), "cw_glow_melon", JavaDungeons.CREEPER_WOODS);
        CW_GLOW_MELON_ROOTS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS), "cw_glow_melon_roots", JavaDungeons.CREEPER_WOODS);

        // gravestones
        CW_GRAVESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsGravestone(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_gravestone", JavaDungeons.CREEPER_WOODS);
        CW_MOSSY_GRAVESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsGravestone(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cw_mossy_gravestone", JavaDungeons.CREEPER_WOODS);
    }
}