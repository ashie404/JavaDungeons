package juniebyte.javadungeons.content;

import juniebyte.javadungeons.blocks.*;
import net.minecraft.sound.BlockSoundGroup;

public class FieryForgeBlocks {

    // dark stone
    public static DungeonsSlabStairBlock FF_DARK_STONE;
    public static DungeonsSlabStairBlock FF_DARK_COBBLESTONE;
    public static DungeonsSlabStairBlock FF_DARK_STONE_BRICKS;
    public static DungeonsBlock FF_DIRTY_DARK_STONE_BRICKS;
    public static DungeonsBlock FF_CRACKED_DARK_STONE_BRICKS;
    public static DungeonsBlock FF_CHISELED_DARK_STONE_BRICKS;
    public static DungeonsSlabStairBlock FF_DARK_STONE_TILES;
    public static DungeonsSlabStairBlock FF_DIRTY_DARK_STONE_TILES;
    public static DungeonsSlabStairBlock FF_DIRTY_DARK_STONE_TILES_1;
    public static DungeonsBlock FF_EMBLEMED_DARK_STONE;

    public static void init() {
        // dark stone
        FF_DARK_STONE = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_dark_stone", "ff_dark_stone_slab", "ff_dark_stone_stairs");
        FF_DARK_COBBLESTONE = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_dark_cobblestone", "ff_dark_cobblestone_slab", "ff_dark_cobblestone_stairs");
        FF_DARK_STONE_BRICKS = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_dark_stone_bricks", "ff_dark_stone_brick_slab", "ff_dark_stone_brick_stairs");
        FF_DIRTY_DARK_STONE_BRICKS = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_dirty_dark_stone_bricks");
        FF_CRACKED_DARK_STONE_BRICKS = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_cracked_dark_stone_bricks");
        FF_CHISELED_DARK_STONE_BRICKS = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_chiseled_dark_stone_bricks");
        FF_DARK_STONE_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_dark_stone_tiles", "ff_dark_stone_tiles_slab", "ff_dark_stone_tiles_stairs");
        FF_DIRTY_DARK_STONE_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_dirty_dark_stone_tiles", "ff_dirty_dark_stone_tiles_slab", "ff_dirty_dark_stone_tiles_stairs");
        FF_DIRTY_DARK_STONE_TILES_1 = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_dirty_dark_stone_tiles_1", "ff_dirty_dark_stone_tiles_slab_1", "ff_dirty_dark_stone_tiles_stairs_1");
        FF_EMBLEMED_DARK_STONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.FIERY_FORGE, "ff_emblemed_dark_stone");
    }
}