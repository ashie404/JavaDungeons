package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class FieryForgeBlocks {

    // dark stone
    public static final SlabStairBlock FF_DARK_STONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_dark_stone");
    public static final SlabStairBlock FF_DARK_COBBLESTONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_dark_cobblestone");
    public static final SlabStairBlock FF_DARK_STONE_BRICKS = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_dark_stone_bricks", "ff_dark_stone_brick_slab", "ff_dark_stone_brick_stairs");
    public static final Block FF_DIRTY_DARK_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_dirty_dark_stone_bricks");
    public static final Block FF_CRACKED_DARK_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_cracked_dark_stone_bricks");
    public static final Block FF_CHISELED_DARK_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_chiseled_dark_stone_bricks");
    public static final SlabStairBlock FF_DARK_STONE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_dark_stone_tiles");
    public static final SlabStairBlock FF_DIRTY_DARK_STONE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_dirty_dark_stone_tiles");
    public static final SlabStairBlock FF_DIRTY_DARK_STONE_TILES_1 = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_dirty_dark_stone_tiles_1", "ff_dirty_dark_stone_tiles_slab_1", "ff_dirty_dark_stone_tiles_stairs_1");
    public static final Block FF_EMBLEMED_DARK_STONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ff_emblemed_dark_stone");

    public static void init() {
        JavaDungeons.log.info("Registering Fiery Forge Blocks!");
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("fiery_forge"))).register(content -> {
            content.add(FF_DARK_STONE.base);
            content.add(FF_DARK_STONE.slab);
            content.add(FF_DARK_STONE.stairs);
            content.add(FF_DARK_COBBLESTONE.base);
            content.add(FF_DARK_COBBLESTONE.slab);
            content.add(FF_DARK_COBBLESTONE.stairs);
            content.add(FF_DARK_STONE_BRICKS.base);
            content.add(FF_DARK_STONE_BRICKS.slab);
            content.add(FF_DARK_STONE_BRICKS.stairs);
            content.add(FF_DIRTY_DARK_STONE_BRICKS);
            content.add(FF_CRACKED_DARK_STONE_BRICKS);
            content.add(FF_CHISELED_DARK_STONE_BRICKS);
            content.add(FF_DARK_STONE_TILES.base);
            content.add(FF_DARK_STONE_TILES.slab);
            content.add(FF_DARK_STONE_TILES.stairs);
            content.add(FF_DIRTY_DARK_STONE_TILES.base);
            content.add(FF_DIRTY_DARK_STONE_TILES.slab);
            content.add(FF_DIRTY_DARK_STONE_TILES.stairs);
            content.add(FF_DIRTY_DARK_STONE_TILES_1.base);
            content.add(FF_DIRTY_DARK_STONE_TILES_1.slab);
            content.add(FF_DIRTY_DARK_STONE_TILES_1.stairs);
            content.add(FF_EMBLEMED_DARK_STONE);
        });
    }
}