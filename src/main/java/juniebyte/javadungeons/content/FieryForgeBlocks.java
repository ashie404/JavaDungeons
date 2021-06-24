package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class FieryForgeBlocks {

    // dark stone
    public static Block FF_DARK_STONE;
    public static Block FF_DARK_COBBLESTONE;
    public static Block FF_DARK_STONE_BRICKS;
    public static Block FF_DIRTY_DARK_STONE_BRICKS;
    public static Block FF_CRACKED_DARK_STONE_BRICKS;
    public static Block FF_CHISELED_DARK_STONE_BRICKS;
    public static Block FF_DARK_STONE_TILES;
    public static Block FF_DIRTY_DARK_STONE_TILES;
    public static Block FF_DIRTY_DARK_STONE_TILES_1;
    public static Block FF_EMBLEMED_DARK_STONE;

    public static void init() {
        // dark stone
        FF_DARK_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dark_stone", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dark_stone_slab", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, FF_DARK_STONE), "ff_dark_stone_stairs", JavaDungeons.FIERY_FORGE);
        FF_DARK_COBBLESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dark_cobblestone", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE),"ff_dark_cobblestone_slab", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, FF_DARK_COBBLESTONE), "ff_dark_cobblestone_stairs", JavaDungeons.FIERY_FORGE);
        FF_DARK_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dark_stone_bricks", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dark_stone_brick_slab", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, FF_DARK_STONE_BRICKS), "ff_dark_stone_brick_stairs", JavaDungeons.FIERY_FORGE);
        FF_DIRTY_DARK_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dirty_dark_stone_bricks", JavaDungeons.FIERY_FORGE);
        FF_CRACKED_DARK_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_cracked_dark_stone_bricks", JavaDungeons.FIERY_FORGE);
        FF_CHISELED_DARK_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_chiseled_dark_stone_bricks", JavaDungeons.FIERY_FORGE);

        FF_DARK_STONE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dark_stone_tiles", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dark_stone_tiles_slab", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, FF_DARK_STONE_TILES), "ff_dark_stone_tiles_stairs", JavaDungeons.FIERY_FORGE);
        FF_DIRTY_DARK_STONE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dirty_dark_stone_tiles", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE),"ff_dirty_dark_stone_tiles_slab", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, FF_DIRTY_DARK_STONE_TILES), "ff_dirty_dark_stone_tiles_stairs", JavaDungeons.FIERY_FORGE);
        FF_DIRTY_DARK_STONE_TILES_1 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dirty_dark_stone_tiles_1", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_dirty_dark_stone_tiles_slab_1", JavaDungeons.FIERY_FORGE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, FF_DIRTY_DARK_STONE_TILES_1), "ff_dirty_dark_stone_tiles_stairs_1", JavaDungeons.FIERY_FORGE);
        FF_EMBLEMED_DARK_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ff_emblemed_dark_stone", JavaDungeons.FIERY_FORGE);
    }
}