package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class CreeperWoodsBlocks {

    // stone variants
    public static final BaseBlock CW_MOSSY_COBBLESTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_cobblestone");
    public static final BaseBlock CW_MOSSY_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_stone");
    public static final BaseBlock CW_MOSSY_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_stone_bricks");
    public static final BaseBlock CW_MOSSY_CHISELED_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_chiseled_stone_bricks");
    public static final BaseBlock CW_SLOTTED_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_slotted_stone");

    // andesite variants
    public static final BaseBlock CW_MOSSY_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_andesite");
    public static final BaseBlock CW_CRACKED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_cracked_andesite");

    // dark andesite
    public static final SlabStairBlock CW_DARK_POLISHED_ANDESITE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_polished_andesite", "cw_dark_andesite_slab", "cw_dark_andesite_stairs");
    public static final BaseBlock CW_MOSSY_DARK_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_dark_andesite");
    public static final BaseBlock CW_MOSSY_DARK_ANDESITE_TILES = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_mossy_dark_andesite_tiles");
    public static final SlabStairBlock CW_DARK_ANDESITE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_andesite_tiles", "cw_dark_andesite_tiles_slab", "cw_dark_andesite_tiles_stairs");
    public static final BaseBlock CW_DARK_CHISELED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_chiseled_andesite");
    public static final BaseBlock CW_DARK_CHISELED_ANDESITE_2 = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_chiseled_andesite_2");
    public static final Pillar CW_DARK_ANDESITE_PILLAR = new Pillar(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dark_andesite_pillar");
    
    // ground related
    public static final BaseBlock CW_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_grassy_dirt");
    public static final BaseBlock CW_DENSE_GRASSY_DIRT = new BaseBlock(0.6F, 0.6F, BlockSoundGroup.GRASS, "cw_dense_grassy_dirt");
    public static final PathBlock CW_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_dirt_path");
    public static final PathableBlock CW_DIRT = new PathableBlock(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, CW_DIRT_PATH, "cw_dirt");
    public static final Slab CW_DIRT_SLAB = new Slab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_dirt_slab");
    public static final GrassBlock CW_GRASS_BLOCK = new GrassBlock(0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, CW_DIRT, "cw_grass_block");
    public static final PathBlock CW_ROCKY_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_rocky_dirt_path");
    public static final PathableBlock CW_ROCKY_DIRT = new PathableBlock(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, CW_ROCKY_DIRT_PATH, "cw_rocky_dirt");
    public static final BaseBlock CW_ROCKY_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_rocky_grassy_dirt");
    public static final BaseBlock CW_COBWEBBED_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cw_cobwebbed_dirt");
    
    // creeper woods granite variant
    public static final SlabStairBlock CW_POLISHED_GRANITE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_polished_granite", "cw_polished_granite_slab", "cw_polished_granite_stairs");
    public static final BaseBlock CW_CHISELED_GRANITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_chiseled_granite");
    public static final BaseBlock CW_DIRTY_GRANITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE,  "cw_dirty_granite");

    // stone tiles
    public static final SlabStairBlock CW_DIRTY_STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_dirty_stone_tiles", "cw_dirty_stone_tiles_slab", "cw_dirty_stone_tiles_stairs");
    public static final SlabStairBlock CW_DIRTY_STONE_TILES_1 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_dirty_stone_tiles_1", "cw_dirty_stone_tiles_slab_1", "cw_dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock CW_DIRTY_STONE_TILES_2 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_dirty_stone_tiles_2", "cw_dirty_stone_tiles_slab_2", "cw_dirty_stone_tiles_stairs_2");

    // floor tiles
    public static final BaseBlock CW_DIRTY_FLOOR_TILE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_dirty_floor_tile");

    // plants
    public static final Plant CW_SHRUB = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cw_shrub");
    public static final Plant CW_FLOWER_PATCH = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cw_flower_patch");
    public static final GlowingPlant CW_POP_FLOWER = new GlowingPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cw_pop_flower");

    // custom dungeons blocks
    public static final GlowMushroom CW_GLOW_MUSHROOM = new GlowMushroom(0.0F, 0.0F, BlockSoundGroup.SLIME, "cw_glow_mushroom");
    public static final EmissiveBlock CW_GLOW_MELON = new EmissiveBlock(1.0F, 1.0F, BlockSoundGroup.WOOD, "cw_glow_melon");
    public static final BaseBlock CW_GLOW_MELON_ROOTS = new BaseBlock(0.6F, 0.6F, BlockSoundGroup.GRASS, "cw_glow_melon_roots");

    // gravestones
    public static final Gravestone CW_GRAVESTONE = new Gravestone(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_gravestone");
    public static final Gravestone CW_MOSSY_GRAVESTONE = new Gravestone(1.5F, 6.0F, BlockSoundGroup.STONE, "cw_mossy_gravestone");

    public static void init() {
        // add blockitems to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("creeper_woods"))).register(content -> {
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