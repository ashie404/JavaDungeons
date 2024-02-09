package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.registry.RegistryHelper;
import ashie404.javadungeons.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class CreeperWoodsBlocks {

    // stone variants
    public static final Block CW_MOSSY_COBBLESTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_mossy_cobblestone");
    public static final Block CW_MOSSY_STONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_mossy_stone");
    public static final Block CW_MOSSY_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_mossy_stone_bricks");
    public static final Block CW_MOSSY_CHISELED_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_mossy_chiseled_stone_bricks");
    public static final Block CW_SLOTTED_STONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_slotted_stone");

    // andesite variants
    public static final Block CW_MOSSY_ANDESITE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_mossy_andesite");
    public static final Block CW_CRACKED_ANDESITE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_cracked_andesite");

    // dark andesite
    public static final SlabStairBlock CW_DARK_POLISHED_ANDESITE = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dark_polished_andesite", "cw_dark_andesite_slab", "cw_dark_andesite_stairs");
    public static final Block CW_MOSSY_DARK_ANDESITE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_mossy_dark_andesite");
    public static final Block CW_MOSSY_DARK_ANDESITE_TILES = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_mossy_dark_andesite_tiles");
    public static final SlabStairBlock CW_DARK_ANDESITE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dark_andesite_tiles");
    public static final Block CW_DARK_CHISELED_ANDESITE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dark_chiseled_andesite");
    public static final Block CW_DARK_CHISELED_ANDESITE_2 = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dark_chiseled_andesite_2");
    public static final Block CW_DARK_ANDESITE_PILLAR = 
        RegistryHelper.registerBlock(new PillarBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dark_andesite_pillar");
    
    // ground related
    public static final Block CW_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cw_grassy_dirt");
    public static final Block CW_DENSE_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.6F).sounds(BlockSoundGroup.GRASS)), "cw_dense_grassy_dirt");
    public static final Block CW_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cw_dirt_path");
    public static final Block CW_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL), true, CW_DIRT_PATH), "cw_dirt");
    public static final Block CW_DIRT_SLAB = 
        RegistryHelper.registerBlock(new SlabBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cw_dirt_slab");
    public static final Block CW_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new GrassBlock(FabricBlockSettings.create().strength(0.6F).sounds(BlockSoundGroup.GRASS), true, Blocks.DIRT_PATH, CW_DIRT), "cw_grass_block");
    public static final Block CW_ROCKY_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cw_rocky_dirt_path");
    public static final Block CW_ROCKY_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL), false, CW_ROCKY_DIRT_PATH), "cw_rocky_dirt");
    public static final Block CW_ROCKY_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cw_rocky_grassy_dirt");
    public static final Block CW_COBWEBBED_DIRT = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cw_cobwebbed_dirt");
    
    // creeper woods granite variant
    public static final SlabStairBlock CW_POLISHED_GRANITE = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_polished_granite");
    public static final Block CW_CHISELED_GRANITE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_chiseled_granite");
    public static final Block CW_DIRTY_GRANITE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dirty_granite");

    // stone tiles
    public static final SlabStairBlock CW_DIRTY_STONE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dirty_stone_tiles");
    public static final SlabStairBlock CW_DIRTY_STONE_TILES_1 = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dirty_stone_tiles_1", "cw_dirty_stone_tiles_slab_1", "cw_dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock CW_DIRTY_STONE_TILES_2 = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dirty_stone_tiles_2", "cw_dirty_stone_tiles_slab_2", "cw_dirty_stone_tiles_stairs_2");

    // floor tiles
    public static final Block CW_DIRTY_FLOOR_TILE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_dirty_floor_tile");

    // plants
    public static final Block CW_SHRUB = 
        RegistryHelper.registerBlock(new Plant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS)), "cw_shrub");
    public static final Block CW_FLOWER_PATCH = 
        RegistryHelper.registerBlock(new Plant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS)), "cw_flower_patch");
    public static final Block CW_POP_FLOWER = 
        RegistryHelper.registerBlock(new GlowingPlant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS)), "cw_pop_flower");

    // custom dungeons blocks
    public static final Block CW_GLOW_MUSHROOM = 
        RegistryHelper.registerBlock(new GlowMushroom(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.SLIME)), "cw_glow_mushroom");
    public static final Block CW_GLOW_MELON = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance(14)), "cw_glow_melon");
    public static final Block CW_GLOW_MELON_ROOTS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.6F).sounds(BlockSoundGroup.GRASS)), "cw_glow_melon_roots");

    // gravestones
    public static final Block CW_GRAVESTONE = 
        RegistryHelper.registerBlock(new Gravestone(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_gravestone");
    public static final Block CW_MOSSY_GRAVESTONE = 
        RegistryHelper.registerBlock(new Gravestone(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cw_mossy_gravestone");

    public static void init() {
        JavaDungeons.log.info("Registering Creeper Woods Blocks!");

        // add blockitems to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("creeper_woods"))).register(content -> {
            content.add(CW_MOSSY_COBBLESTONE);
            content.add(CW_MOSSY_STONE);
            content.add(CW_MOSSY_STONE_BRICKS);
            content.add(CW_MOSSY_CHISELED_STONE_BRICKS);
            content.add(CW_SLOTTED_STONE);
            content.add(CW_MOSSY_ANDESITE);
            content.add(CW_CRACKED_ANDESITE);
            content.add(CW_DARK_POLISHED_ANDESITE.base);
            content.add(CW_DARK_POLISHED_ANDESITE.slab);
            content.add(CW_DARK_POLISHED_ANDESITE.stairs);
            content.add(CW_MOSSY_DARK_ANDESITE);
            content.add(CW_MOSSY_DARK_ANDESITE_TILES);
            content.add(CW_DARK_ANDESITE_TILES.base);
            content.add(CW_DARK_ANDESITE_TILES.slab);
            content.add(CW_DARK_ANDESITE_TILES.stairs);
            content.add(CW_DARK_CHISELED_ANDESITE);
            content.add(CW_DARK_CHISELED_ANDESITE_2);
            content.add(CW_DARK_ANDESITE_PILLAR);
            content.add(CW_GRASS_BLOCK);
            content.add(CW_GRASSY_DIRT);
            content.add(CW_DENSE_GRASSY_DIRT);
            content.add(CW_DIRT);
            content.add(CW_DIRT_SLAB);
            content.add(CW_DIRT_PATH);
            content.add(CW_ROCKY_DIRT);
            content.add(CW_ROCKY_DIRT_PATH);
            content.add(CW_ROCKY_GRASSY_DIRT);
            content.add(CW_COBWEBBED_DIRT);
            content.add(CW_POLISHED_GRANITE.base);
            content.add(CW_POLISHED_GRANITE.slab);
            content.add(CW_POLISHED_GRANITE.stairs);
            content.add(CW_DIRTY_GRANITE);
            content.add(CW_CHISELED_GRANITE);
            content.add(CW_DIRTY_STONE_TILES.base);
            content.add(CW_DIRTY_STONE_TILES.slab);
            content.add(CW_DIRTY_STONE_TILES.stairs);
            content.add(CW_DIRTY_STONE_TILES_1.base);
            content.add(CW_DIRTY_STONE_TILES_1.slab);
            content.add(CW_DIRTY_STONE_TILES_1.stairs);
            content.add(CW_DIRTY_STONE_TILES_2.base);
            content.add(CW_DIRTY_STONE_TILES_2.slab);
            content.add(CW_DIRTY_STONE_TILES_2.stairs);
            content.add(CW_DIRTY_FLOOR_TILE);
            content.add(CW_SHRUB);
            content.add(CW_POP_FLOWER);
            content.add(CW_FLOWER_PATCH);
            content.add(CW_GLOW_MUSHROOM);
            content.add(CW_GLOW_MELON);
            content.add(CW_GLOW_MELON_ROOTS);
            content.add(CW_GRAVESTONE);
            content.add(CW_MOSSY_GRAVESTONE);
        });
    }
}