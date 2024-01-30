package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class FieryForgeBlocks {

    // dark stone
    public static SlabStairBlock FF_DARK_STONE;
    public static SlabStairBlock FF_DARK_COBBLESTONE;
    public static SlabStairBlock FF_DARK_STONE_BRICKS;
    public static BaseBlock FF_DIRTY_DARK_STONE_BRICKS;
    public static BaseBlock FF_CRACKED_DARK_STONE_BRICKS;
    public static BaseBlock FF_CHISELED_DARK_STONE_BRICKS;
    public static SlabStairBlock FF_DARK_STONE_TILES;
    public static SlabStairBlock FF_DIRTY_DARK_STONE_TILES;
    public static SlabStairBlock FF_DIRTY_DARK_STONE_TILES_1;
    public static BaseBlock FF_EMBLEMED_DARK_STONE;

    public static void init() {
        // dark stone
        FF_DARK_STONE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_dark_stone", "ff_dark_stone_slab", "ff_dark_stone_stairs");
        FF_DARK_COBBLESTONE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_dark_cobblestone", "ff_dark_cobblestone_slab", "ff_dark_cobblestone_stairs");
        FF_DARK_STONE_BRICKS = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_dark_stone_bricks", "ff_dark_stone_brick_slab", "ff_dark_stone_brick_stairs");
        FF_DIRTY_DARK_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_dirty_dark_stone_bricks");
        FF_CRACKED_DARK_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_cracked_dark_stone_bricks");
        FF_CHISELED_DARK_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_chiseled_dark_stone_bricks");
        FF_DARK_STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_dark_stone_tiles", "ff_dark_stone_tiles_slab", "ff_dark_stone_tiles_stairs");
        FF_DIRTY_DARK_STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_dirty_dark_stone_tiles", "ff_dirty_dark_stone_tiles_slab", "ff_dirty_dark_stone_tiles_stairs");
        FF_DIRTY_DARK_STONE_TILES_1 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_dirty_dark_stone_tiles_1", "ff_dirty_dark_stone_tiles_slab_1", "ff_dirty_dark_stone_tiles_stairs_1");
        FF_EMBLEMED_DARK_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ff_emblemed_dark_stone");

        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("fiery_forge"))).register(content -> {
            content.add(FF_DARK_STONE.base.blockItem);
            content.add(FF_DARK_STONE.slab.blockItem);
            content.add(FF_DARK_STONE.stairs.blockItem);
            content.add(FF_DARK_COBBLESTONE.base.blockItem);
            content.add(FF_DARK_COBBLESTONE.slab.blockItem);
            content.add(FF_DARK_COBBLESTONE.stairs.blockItem);
            content.add(FF_DARK_STONE_BRICKS.base.blockItem);
            content.add(FF_DARK_STONE_BRICKS.slab.blockItem);
            content.add(FF_DARK_STONE_BRICKS.stairs.blockItem);
            content.add(FF_DIRTY_DARK_STONE_BRICKS.blockItem);
            content.add(FF_CRACKED_DARK_STONE_BRICKS.blockItem);
            content.add(FF_CHISELED_DARK_STONE_BRICKS.blockItem);
            content.add(FF_DARK_STONE_TILES.base.blockItem);
            content.add(FF_DARK_STONE_TILES.slab.blockItem);
            content.add(FF_DARK_STONE_TILES.stairs.blockItem);
            content.add(FF_DIRTY_DARK_STONE_TILES.base.blockItem);
            content.add(FF_DIRTY_DARK_STONE_TILES.slab.blockItem);
            content.add(FF_DIRTY_DARK_STONE_TILES.stairs.blockItem);
            content.add(FF_DIRTY_DARK_STONE_TILES_1.base.blockItem);
            content.add(FF_DIRTY_DARK_STONE_TILES_1.slab.blockItem);
            content.add(FF_DIRTY_DARK_STONE_TILES_1.stairs.blockItem);
            content.add(FF_EMBLEMED_DARK_STONE.blockItem);
        });
    }
}