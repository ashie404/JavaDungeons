package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.worldgen.SaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class PumpkinPasturesBlocks {

    // foliage
    public static final Leaves PM_YELLOW_AUTUMNAL_LEAVES = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "pm_yellow_autumnal_leaves");
    public static final Leaves PM_RED_AUTUMNAL_LEAVES = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "pm_red_autumnal_leaves");

    // saplings
    public static final Sapling PM_RED_AUTUMNAL_SAPLING = new Sapling(SaplingGenerators.RED_AUTUMNAL, 0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_red_autumnal_sapling");
    public static final Sapling PM_YELLOW_AUTUMNAL_SAPLING = new Sapling(SaplingGenerators.YELLOW_AUTUMNAL, 0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_yellow_autumnal_sapling");

    // plants
    public static final Plant PM_SHRUB = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_shrub");
    public static final Plant PM_CHARRED_GRASS = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_charred_grass");
    public static final Plant PM_DEAD_SAPLING = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_dead_sapling");
    public static final Plant PM_SAPLING = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_sapling");
    public static final Plant PM_LAVENDER = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_lavender");
    
    // tall plants
    public static final TallPlant PM_TALL_FERN = new TallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_tall_fern");
    public static final TallPlant PM_DRY_TALL_GRASS = new TallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_dry_tall_grass");
    public static final TallPlant PM_CHARRED_TALL_GRASS = new TallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_charred_tall_grass");

    // melons
    public static final BaseBlock PM_BURNT_PUMPKIN = new BaseBlock(1.0F, 1.0F, BlockSoundGroup.WOOD, "pm_burnt_pumpkin");
    public static final BaseBlock PM_ROTTED_PUMPKIN = new BaseBlock(1.0F, 1.0F, BlockSoundGroup.WOOD, "pm_rotted_pumpkin");

    // haybale
    public static final Pillar PM_DRIED_HAYBALE = new Pillar(0.6F, 0.6F, BlockSoundGroup.GRASS, "pm_dried_haybale");

    // ground related
    public static final Slab PM_DIRT_SLAB = new Slab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_dirt_slab");
    public static final PathBlock PM_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_dirt_path");
    public static final PathBlock PM_ROCKY_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_rocky_dirt_path");
    public static final PathableBlock PM_DIRT = new PathableBlock(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, PM_DIRT_PATH, "pm_dirt");
    public static final PathableBlock PM_ROCKY_DIRT = new PathableBlock(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, PM_ROCKY_DIRT_PATH, "pm_rocky_dirt");
    public static final GrassBlock PM_GRASS_BLOCK = new GrassBlock( 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, PM_DIRT, "pm_grass_block");
    public static final BaseBlock PM_DENSE_GRASSY_DIRT = new BaseBlock( 0.6F, 0.6F, BlockSoundGroup.GRASS, "pm_dense_grassy_dirt");
    public static final BaseBlock PM_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_grassy_dirt");
    public static final BaseBlock PM_DARK_ROCKY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_dark_rocky_dirt");
    public static final BaseBlock PM_CHARRED_GRASS_BLOCK = new BaseBlock(0.6F, 0.6F, BlockSoundGroup.GRASS, "pm_charred_grass_block");
    public static final PathBlock PM_CHARRED_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_charred_dirt_path");
    public static final PathableBlock PM_CHARRED_DIRT = new PathableBlock(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, PM_CHARRED_DIRT_PATH, "pm_charred_dirt");
    public static final BaseBlock PM_ASHY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_ashy_dirt");
    public static final Slab PM_CHARRED_DIRT_SLAB = new Slab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_charred_dirt_slab");
    public static final BaseBlock PM_CHARRED_DIRT_EMBERS = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_charred_dirt_embers");
    public static final PathBlock PM_CHARRED_FARMLAND = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_charred_farmland");

    // charred stones
    public static final BaseBlock PM_CHARRED_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_charred_stone");
    public static final SlabStairBlock PM_CHARRED_COBBLESTONE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_charred_cobblestone", "pm_charred_cobblestone_slab", "pm_charred_cobblestone_stairs");
    public static final SlabStairBlock PM_CHARRED_STONE_BRICKS = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_charred_stone_bricks", "pm_charred_stone_brick_slab", "pm_charred_stone_brick_stairs");
    public static final BaseBlock PM_CRACKED_CHARRED_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_cracked_charred_stone_bricks");

    // stone related
    public static final BaseBlock PM_MOSSY_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_mossy_stone_bricks");
    public static final BaseBlock PM_DIRTY_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_dirty_stone");
    public static final SlabStairBlock PM_DIRTY_STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE,   "pm_dirty_stone_tiles",   "pm_dirty_stone_tiles_slab",   "pm_dirty_stone_tiles_stairs");
    public static final SlabStairBlock PM_DIRTY_STONE_TILES_1 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_dirty_stone_tiles_1", "pm_dirty_stone_tiles_slab_1", "pm_dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock PM_DIRTY_STONE_TILES_2 = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_dirty_stone_tiles_2", "pm_dirty_stone_tiles_slab_2", "pm_dirty_stone_tiles_stairs_2");
    public static final BaseBlock PM_DIRTY_FLOOR_TILE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_dirty_floor_tile");

    // wood related
    public static final Pillar PM_CHARRED_LOG = new Pillar(2.0F, 3.0F, BlockSoundGroup.WOOD, "pm_charred_log");
    public static final Pillar PM_CHARRED_WOOD = new Pillar(2.0F, 3.0F, BlockSoundGroup.WOOD, "pm_charred_wood");
    public static final SlabStairBlock PM_CHARRED_PLANKS = new SlabStairBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "pm_charred_planks", "pm_charred_slab", "pm_charred_stairs");

    public static void init() {
        // add all blockitems to group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("pumpkin_pastures"))).register(content -> {
            content.add(PM_YELLOW_AUTUMNAL_LEAVES.blockItem);
            content.add(PM_RED_AUTUMNAL_LEAVES.blockItem);
            content.add(PM_RED_AUTUMNAL_SAPLING.blockItem);
            content.add(PM_YELLOW_AUTUMNAL_SAPLING.blockItem);
            content.add(PM_SHRUB.blockItem);
            content.add(PM_CHARRED_GRASS.blockItem);
            content.add(PM_DEAD_SAPLING.blockItem);
            content.add(PM_SAPLING.blockItem);
            content.add(PM_LAVENDER.blockItem);
            content.add(PM_TALL_FERN.blockItem);
            content.add(PM_DRY_TALL_GRASS.blockItem);
            content.add(PM_CHARRED_TALL_GRASS.blockItem);
            content.add(PM_BURNT_PUMPKIN.blockItem);
            content.add(PM_ROTTED_PUMPKIN.blockItem);
            content.add(PM_DRIED_HAYBALE.blockItem);
            content.add(PM_DIRT.blockItem);
            content.add(PM_DIRT_PATH.blockItem);
            content.add(PM_DIRT_SLAB.blockItem);
            content.add(PM_DARK_ROCKY_DIRT.blockItem);
            content.add(PM_ROCKY_DIRT.blockItem);
            content.add(PM_ROCKY_DIRT_PATH.blockItem);
            content.add(PM_GRASS_BLOCK.blockItem);
            content.add(PM_DENSE_GRASSY_DIRT.blockItem);
            content.add(PM_GRASSY_DIRT.blockItem);
            content.add(PM_CHARRED_GRASS_BLOCK.blockItem);
            content.add(PM_CHARRED_DIRT_PATH.blockItem);
            content.add(PM_ASHY_DIRT.blockItem);
            content.add(PM_CHARRED_DIRT.blockItem);
            content.add(PM_CHARRED_DIRT_SLAB.blockItem);
            content.add(PM_CHARRED_DIRT_EMBERS.blockItem);
            content.add(PM_CHARRED_FARMLAND.blockItem);
            content.add(PM_CHARRED_STONE.blockItem);
            content.add(PM_CHARRED_COBBLESTONE.base.blockItem);
            content.add(PM_CHARRED_COBBLESTONE.slab.blockItem);
            content.add(PM_CHARRED_COBBLESTONE.stairs.blockItem);
            content.add(PM_CHARRED_STONE_BRICKS.base.blockItem);
            content.add(PM_CHARRED_STONE_BRICKS.slab.blockItem);
            content.add(PM_CHARRED_STONE_BRICKS.stairs.blockItem);
            content.add(PM_CRACKED_CHARRED_STONE_BRICKS.blockItem);
            content.add(PM_MOSSY_STONE_BRICKS.blockItem);
            content.add(PM_DIRTY_STONE.blockItem);
            content.add(PM_DIRTY_STONE_TILES.base);
            content.add(PM_DIRTY_STONE_TILES.slab);
            content.add(PM_DIRTY_STONE_TILES.stairs);
            content.add(PM_DIRTY_STONE_TILES_1.base);
            content.add(PM_DIRTY_STONE_TILES_1.slab);
            content.add(PM_DIRTY_STONE_TILES_1.stairs);
            content.add(PM_DIRTY_STONE_TILES_2.base);
            content.add(PM_DIRTY_STONE_TILES_2.slab);
            content.add(PM_DIRTY_STONE_TILES_2.stairs);
            content.add(PM_DIRTY_FLOOR_TILE.blockItem);
            content.add(PM_CHARRED_LOG.blockItem);
            content.add(PM_CHARRED_WOOD.blockItem);
            content.add(PM_CHARRED_PLANKS.base.blockItem);
            content.add(PM_CHARRED_PLANKS.slab.blockItem);
            content.add(PM_CHARRED_PLANKS.stairs.blockItem);
        });
    }
}