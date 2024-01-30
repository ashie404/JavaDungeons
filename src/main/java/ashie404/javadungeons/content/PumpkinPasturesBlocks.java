package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.worldgen.SaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class PumpkinPasturesBlocks {

    // foliage
    public static Leaves PM_YELLOW_AUTUMNAL_LEAVES;
    public static Leaves PM_RED_AUTUMNAL_LEAVES;

    // saplings
    public static Sapling PM_RED_AUTUMNAL_SAPLING;
    public static Sapling PM_YELLOW_AUTUMNAL_SAPLING;

    // plants
    public static Plant PM_SHRUB;
    public static Plant PM_CHARRED_GRASS;
    public static Plant PM_FERN;
    public static Plant PM_DEAD_SAPLING;
    
    // tall plants
    public static TallPlant PM_TALL_FERN;
    public static TallPlant PM_DRY_TALL_GRASS;
    public static TallPlant PM_CHARRED_TALL_GRASS;

    // melons
    public static BaseBlock PM_BURNT_PUMPKIN;
    public static BaseBlock PM_ROTTED_PUMPKIN;

    // haybale
    public static Pillar PM_DRIED_HAYBALE;

    // ground related
    public static BaseBlock PM_CHARRED_GRASS_BLOCK;
    public static PathBlock PM_CHARRED_DIRT_PATH;
    public static PathableBlock PM_CHARRED_DIRT;
    public static BaseBlock PM_ASHY_DIRT;
    public static Slab PM_CHARRED_DIRT_SLAB;
    public static BaseBlock PM_CHARRED_DIRT_EMBERS;
    public static PathBlock PM_CHARRED_FARMLAND;

    // charred stones
    public static BaseBlock PM_CHARRED_STONE;
    public static SlabStairBlock PM_CHARRED_COBBLESTONE;
    public static SlabStairBlock PM_CHARRED_STONE_BRICKS;
    public static BaseBlock PM_CRACKED_CHARRED_STONE_BRICKS;

    // stone related
    public static BaseBlock PM_MOSSY_STONE_BRICKS;

    // wood related
    public static Pillar PM_CHARRED_LOG;
    public static Pillar PM_CHARRED_WOOD;
    public static SlabStairBlock PM_CHARRED_PLANKS;

    public static void init() {
        // foliage
        PM_YELLOW_AUTUMNAL_LEAVES = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "pm_yellow_autumnal_leaves");
        PM_RED_AUTUMNAL_LEAVES = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "pm_red_autumnal_leaves");
        
        // saplings
        PM_RED_AUTUMNAL_SAPLING = new Sapling(SaplingGenerators.RED_AUTUMNAL, 0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_red_autumnal_sapling");
        PM_YELLOW_AUTUMNAL_SAPLING = new Sapling(SaplingGenerators.YELLOW_AUTUMNAL, 0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_yellow_autumnal_sapling");

        // melons
        PM_BURNT_PUMPKIN = new BaseBlock(1.0F, 1.0F, BlockSoundGroup.WOOD, "pm_burnt_pumpkin");
        PM_ROTTED_PUMPKIN = new BaseBlock(1.0F, 1.0F, BlockSoundGroup.WOOD, "pm_rotted_pumpkin");

        // haybale
        PM_DRIED_HAYBALE = new Pillar(0.6F, 0.6F, BlockSoundGroup.GRASS, "pm_dried_haybale");

        // plants
        PM_SHRUB = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_shrub");
        PM_CHARRED_GRASS = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_charred_grass");
        PM_FERN = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_fern");
        PM_DEAD_SAPLING = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_dead_sapling");

        // tall plants
        PM_TALL_FERN = new TallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_tall_fern");
        PM_DRY_TALL_GRASS = new TallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_dry_tall_grass");
        PM_CHARRED_TALL_GRASS = new TallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "pm_charred_tall_grass");

        // ground related
        PM_CHARRED_GRASS_BLOCK = new BaseBlock(0.6F, 0.6F, BlockSoundGroup.GRASS, "pm_charred_grass_block");
        PM_CHARRED_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_charred_dirt_path");
        PM_ASHY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_ashy_dirt");
        PM_CHARRED_DIRT = new PathableBlock(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, PM_CHARRED_DIRT_PATH, "pm_charred_dirt");
        PM_CHARRED_DIRT_SLAB = new Slab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_charred_dirt_slab");
        PM_CHARRED_DIRT_EMBERS = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_charred_dirt_embers");
        PM_CHARRED_FARMLAND = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "pm_charred_farmland");
        
        // charred stones
        PM_CHARRED_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_charred_stone");
        PM_CHARRED_COBBLESTONE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_charred_cobblestone", "pm_charred_cobblestone_slab", "pm_charred_cobblestone_stairs");
        PM_CHARRED_STONE_BRICKS = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_charred_stone_bricks", "pm_charred_stone_brick_slab", "pm_charred_stone_brick_stairs");
        PM_CRACKED_CHARRED_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_cracked_charred_stone_bricks");

        // stone related
        PM_MOSSY_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "pm_mossy_stone_bricks");

        // wood related
        PM_CHARRED_LOG = new Pillar(2.0F, 3.0F, BlockSoundGroup.WOOD, "pm_charred_log");
        PM_CHARRED_WOOD = new Pillar(2.0F, 3.0F, BlockSoundGroup.WOOD, "pm_charred_wood");
        PM_CHARRED_PLANKS = new SlabStairBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "pm_charred_planks", "pm_charred_slab", "pm_charred_stairs");

        // add all blockitems to group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("pumpkin_pastures"))).register(content -> {
            content.add(PM_YELLOW_AUTUMNAL_LEAVES.blockItem);
            content.add(PM_RED_AUTUMNAL_LEAVES.blockItem);
            content.add(PM_RED_AUTUMNAL_SAPLING.blockItem);
            content.add(PM_YELLOW_AUTUMNAL_SAPLING.blockItem);
            content.add(PM_SHRUB.blockItem);
            content.add(PM_CHARRED_GRASS.blockItem);
            content.add(PM_FERN.blockItem);
            content.add(PM_DEAD_SAPLING.blockItem);
            content.add(PM_TALL_FERN.blockItem);
            content.add(PM_DRY_TALL_GRASS.blockItem);
            content.add(PM_CHARRED_TALL_GRASS.blockItem);
            content.add(PM_BURNT_PUMPKIN.blockItem);
            content.add(PM_ROTTED_PUMPKIN.blockItem);
            content.add(PM_DRIED_HAYBALE.blockItem);
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
            content.add(PM_CHARRED_LOG.blockItem);
            content.add(PM_CHARRED_WOOD.blockItem);
            content.add(PM_CHARRED_PLANKS.base.blockItem);
            content.add(PM_CHARRED_PLANKS.slab.blockItem);
            content.add(PM_CHARRED_PLANKS.stairs.blockItem);
        });
    }
}