package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class CreeperWoodsBlocks {

    // stone variants
    public static BaseBlock CW_MOSSY_COBBLESTONE;
    public static BaseBlock CW_MOSSY_STONE;
    public static BaseBlock CW_MOSSY_STONE_BRICKS;
    public static BaseBlock CW_MOSSY_CHISELED_STONE_BRICKS;
    public static BaseBlock CW_SLOTTED_STONE;

    // andesite variants
    public static BaseBlock CW_MOSSY_ANDESITE;
    public static BaseBlock CW_CRACKED_ANDESITE;

    // dark andesite
    public static SlabStairBlock CW_DARK_POLISHED_ANDESITE;
    public static BaseBlock CW_MOSSY_DARK_ANDESITE;
    public static BaseBlock CW_MOSSY_DARK_ANDESITE_TILES;
    public static SlabStairBlock CW_DARK_ANDESITE_TILES;
    public static BaseBlock CW_DARK_CHISELED_ANDESITE;
    public static BaseBlock CW_DARK_CHISELED_ANDESITE_2;
    public static Pillar CW_DARK_ANDESITE_PILLAR;
    
    // ground related
    public static GrassBlock CW_GRASS_BLOCK;
    public static BaseBlock CW_GRASSY_DIRT;
    public static BaseBlock CW_DENSE_GRASSY_DIRT;
    public static PathableBlock CW_DIRT;
    public static Slab CW_DIRT_SLAB;
    public static PathBlock CW_DIRT_PATH;
    public static PathableBlock CW_ROCKY_DIRT;
    public static PathBlock CW_ROCKY_DIRT_PATH;
    public static BaseBlock CW_ROCKY_GRASSY_DIRT;
    public static BaseBlock CW_COBWEBBED_DIRT;
    
    // creeper woods granite variant
    public static SlabStairBlock CW_POLISHED_GRANITE;
    public static BaseBlock CW_DIRTY_GRANITE;
    public static BaseBlock CW_CHISELED_GRANITE;

    // stone tiles
    public static SlabStairBlock CW_DIRTY_STONE_TILES;
    public static SlabStairBlock CW_DIRTY_STONE_TILES_1;
    public static SlabStairBlock CW_DIRTY_STONE_TILES_2;

    // floor tiles
    public static BaseBlock CW_DIRTY_FLOOR_TILE;

    // plants
    public static Plant CW_SHRUB;
    public static GlowingPlant CW_POP_FLOWER;
    public static Plant CW_FLOWER_PATCH;

    // custom dungeons blocks
    public static GlowMushroom CW_GLOW_MUSHROOM;
    public static EmissiveBlock CW_GLOW_MELON;
    public static BaseBlock CW_GLOW_MELON_ROOTS;

    // gravestones
    public static Gravestone CW_GRAVESTONE;
    public static Gravestone CW_MOSSY_GRAVESTONE;

    public static void init() {
        // stone variants
        CW_MOSSY_COBBLESTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_cobblestone");
        CW_MOSSY_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_stone");
        CW_MOSSY_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_stone_bricks");
        CW_MOSSY_CHISELED_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_chiseled_stone_bricks");
        CW_SLOTTED_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_slotted_stone");

        // andesite variants
        CW_MOSSY_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_andesite");
        CW_CRACKED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_cracked_andesite");

        // dark andesite
        CW_DARK_POLISHED_ANDESITE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_polished_andesite", "cw_dark_andesite_slab", "cw_dark_andesite_stairs");
        CW_MOSSY_DARK_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_dark_andesite");
        CW_MOSSY_DARK_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_dark_andesite_tiles");
        CW_DARK_ANDESITE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_andesite_tiles", "cw_dark_andesite_tiles_slab", "cw_dark_andesite_tiles_stairs");
        CW_DARK_CHISELED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_chiseled_andesite");
        CW_DARK_CHISELED_ANDESITE_2 = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_chiseled_andesite_2");
        CW_DARK_ANDESITE_PILLAR = new Pillar(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_andesite_pillar");

        // ground related
        CW_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_grassy_dirt");
        CW_DENSE_GRASSY_DIRT = new BaseBlock(0.6F, 0.6F, BlockSoundGroup.GRASS, "cw_dense_grassy_dirt");
        CW_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_dirt_path");
        CW_DIRT = new PathableBlock(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, CW_DIRT_PATH, "cw_dirt");
        CW_DIRT_SLAB = new Slab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_dirt_slab");
        CW_GRASS_BLOCK = new GrassBlock(0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, CW_DIRT, "cw_grass_block");
        CW_ROCKY_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_rocky_dirt_path");
        CW_ROCKY_DIRT = new PathableBlock(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, CW_ROCKY_DIRT_PATH, "cw_rocky_dirt");
        CW_ROCKY_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_rocky_grassy_dirt");
        CW_COBWEBBED_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_cobwebbed_dirt");

        // creeper woods granite variant
        CW_POLISHED_GRANITE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_polished_granite", "cw_polished_granite_slab", "cw_polished_granite_stairs");
        CW_CHISELED_GRANITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_chiseled_granite");
        CW_DIRTY_GRANITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dirty_granite");

        // stone tiles
        CW_DIRTY_STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_dirty_stone_tiles", "cw_dirty_stone_tiles_slab", "cw_dirty_stone_tiles_stairs");
        CW_DIRTY_STONE_TILES_1 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_dirty_stone_tiles_1", "cw_dirty_stone_tiles_slab_1", "cw_dirty_stone_tiles_stairs_1");
        CW_DIRTY_STONE_TILES_2 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_dirty_stone_tiles_2", "cw_dirty_stone_tiles_slab_2", "cw_dirty_stone_tiles_stairs_2");
        
        // floor tiles
        CW_DIRTY_FLOOR_TILE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_dirty_floor_tile");

        // plants
        CW_SHRUB = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cw_shrub");
        CW_POP_FLOWER = new GlowingPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cw_pop_flower");
        CW_FLOWER_PATCH = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cw_flower_patch");

        // custom dungeons blocks
        CW_GLOW_MUSHROOM = new GlowMushroom(0.0F, 0.0F, BlockSoundGroup.SLIME, "cw_glow_mushroom");
        CW_GLOW_MELON = new EmissiveBlock(1.0F, 1.0F, BlockSoundGroup.WOOD, "cw_glow_melon");
        CW_GLOW_MELON_ROOTS = new BaseBlock(0.6F, 0.6F, BlockSoundGroup.GRASS, "cw_glow_melon_roots");

        // gravestones
        CW_GRAVESTONE = new Gravestone(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_gravestone");
        CW_MOSSY_GRAVESTONE = new Gravestone(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_mossy_gravestone");

        // add blockitems to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(JavaDungeons.MOD_ID, "creeper_woods"))).register(content -> {
            content.add(CW_MOSSY_COBBLESTONE.blockItem);
            content.add(CW_MOSSY_STONE.blockItem);
            content.add(CW_MOSSY_STONE_BRICKS.blockItem);
            content.add(CW_MOSSY_CHISELED_STONE_BRICKS.blockItem);
            content.add(CW_SLOTTED_STONE.blockItem);
            content.add(CW_MOSSY_ANDESITE.blockItem);
            content.add(CW_CRACKED_ANDESITE.blockItem);
            content.add(CW_DARK_POLISHED_ANDESITE.base.blockItem);
            content.add(CW_DARK_POLISHED_ANDESITE.slab.blockItem);
            content.add(CW_DARK_POLISHED_ANDESITE.stairs.blockItem);
            content.add(CW_MOSSY_DARK_ANDESITE.blockItem);
            content.add(CW_MOSSY_DARK_ANDESITE_TILES.blockItem);
            content.add(CW_DARK_ANDESITE_TILES.base.blockItem);
            content.add(CW_DARK_ANDESITE_TILES.slab.blockItem);
            content.add(CW_DARK_ANDESITE_TILES.stairs.blockItem);
            content.add(CW_DARK_CHISELED_ANDESITE.blockItem);
            content.add(CW_DARK_CHISELED_ANDESITE_2.blockItem);
            content.add(CW_DARK_ANDESITE_PILLAR.blockItem);
            content.add(CW_GRASS_BLOCK.blockItem);
            content.add(CW_GRASSY_DIRT.blockItem);
            content.add(CW_DENSE_GRASSY_DIRT.blockItem);
            content.add(CW_DIRT.blockItem);
            content.add(CW_DIRT_SLAB.blockItem);
            content.add(CW_DIRT_PATH.blockItem);
            content.add(CW_ROCKY_DIRT.blockItem);
            content.add(CW_ROCKY_DIRT_PATH.blockItem);
            content.add(CW_ROCKY_GRASSY_DIRT.blockItem);
            content.add(CW_COBWEBBED_DIRT.blockItem);
            content.add(CW_POLISHED_GRANITE.base.blockItem);
            content.add(CW_POLISHED_GRANITE.slab.blockItem);
            content.add(CW_POLISHED_GRANITE.stairs.blockItem);
            content.add(CW_DIRTY_GRANITE.blockItem);
            content.add(CW_CHISELED_GRANITE.blockItem);
            content.add(CW_DIRTY_STONE_TILES.base.blockItem);
            content.add(CW_DIRTY_STONE_TILES.slab.blockItem);
            content.add(CW_DIRTY_STONE_TILES.stairs.blockItem);
            content.add(CW_DIRTY_STONE_TILES_1.base.blockItem);
            content.add(CW_DIRTY_STONE_TILES_1.slab.blockItem);
            content.add(CW_DIRTY_STONE_TILES_1.stairs.blockItem);
            content.add(CW_DIRTY_STONE_TILES_2.base.blockItem);
            content.add(CW_DIRTY_STONE_TILES_2.slab.blockItem);
            content.add(CW_DIRTY_STONE_TILES_2.stairs.blockItem);
            content.add(CW_DIRTY_FLOOR_TILE.blockItem);
            content.add(CW_SHRUB.blockItem);
            content.add(CW_POP_FLOWER.blockItem);
            content.add(CW_FLOWER_PATCH.blockItem);
            content.add(CW_GLOW_MUSHROOM.blockItem);
            content.add(CW_GLOW_MELON.blockItem);
            content.add(CW_GLOW_MELON_ROOTS.blockItem);
            content.add(CW_GRAVESTONE.blockItem);
            content.add(CW_MOSSY_GRAVESTONE.blockItem);
        });
    }
}