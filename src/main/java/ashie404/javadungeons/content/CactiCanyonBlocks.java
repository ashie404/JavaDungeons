package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class CactiCanyonBlocks {

    // grass related
    public static DungeonsPathable CC_GRASS_BLOCK;

    // dirt related
    public static DungeonsBlock CC_DENSE_GRASSY_DIRT;
    public static DungeonsBlock CC_GRASSY_DIRT;
    public static DungeonsPath CC_DIRT_PATH;
    public static DungeonsPathable CC_DIRT;
    public static DungeonsSlab CC_DIRT_SLAB;
    public static DungeonsPath CC_ROCKY_DIRT_PATH;
    public static DungeonsPathable CC_ROCKY_DIRT;

    // sand related
    public static DungeonsFallingBlock CC_SAND;
    public static DungeonsBlock CC_DENSE_SANDY_DIRT;
    public static DungeonsBlock CC_SANDY_DIRT;
    public static DungeonsLayeringBlock CC_SAND_LAYER;

    // sandstone related
    public static DungeonsBlock CC_SANDSTONE;
    public static DungeonsBlock CC_BLUE_SANDSTONE;
    public static DungeonsBlock CC_BROWN_SANDSTONE;
    public static DungeonsBlock CC_DARK_BROWN_SANDSTONE;
    public static DungeonsBlock CC_GRAY_SANDSTONE;
    public static DungeonsBlock CC_GREEN_SANDSTONE;
    public static DungeonsBlock CC_LIGHT_GREEN_SANDSTONE;
    public static DungeonsBlock CC_ORANGE_SANDSTONE;
    public static DungeonsBlock CC_PINK_SANDSTONE;
    public static DungeonsBlock CC_PURPLE_SANDSTONE;
    public static DungeonsBlock CC_RED_SANDSTONE;
    public static DungeonsBlock CC_YELLOW_SANDSTONE;

    public static DungeonsSlabStairBlock CC_NORMAL_SANDSTONE;
    public static DungeonsSlabStairBlock CC_CUT_SANDSTONE;
    public static DungeonsSlabStairBlock CC_SMOOTH_SANDSTONE;
    public static DungeonsBlock CC_CHISELED_SANDSTONE;

    // plant related
    public static DungeonsDesertPlant CC_DESERT_GRASS;
    public static DungeonsDesertPlant CC_CACTUS;
    public static DungeonsDesertPlant CC_SMALL_CACTUS;
    public static DungeonsDesertPlant CC_FERN;
    public static DungeonsDesertPlant CC_FLOWERS;
    public static DungeonsDesertTallPlant CC_YUCCA;
    public static DungeonsDesertTallPlant CC_TALL_CACTUS;
    
    public static void init() {

        // grass related
        CC_GRASS_BLOCK = new DungeonsPathable(0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, "cc_grass_block");

        // dirt related
        CC_DENSE_GRASSY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_dense_grassy_dirt");
        CC_GRASSY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_grassy_dirt");
        CC_DIRT_PATH = new DungeonsPath(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_dirt_path");
        CC_DIRT = new DungeonsPathable(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, CC_DIRT_PATH, "cc_dirt");
        CC_DIRT_SLAB = new DungeonsSlab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_dirt_slab");
        CC_ROCKY_DIRT_PATH = new DungeonsPath(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_rocky_dirt_path");
        CC_ROCKY_DIRT = new DungeonsPathable(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, CC_ROCKY_DIRT_PATH, "cc_rocky_dirt");

        // sand related
        CC_SAND = new DungeonsFallingBlock(0.5F, 0.5F, BlockSoundGroup.SAND, "cc_sand");
        CC_DENSE_SANDY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_dense_sandy_dirt");
        CC_SANDY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_sandy_dirt");
        CC_SAND_LAYER = new DungeonsLayeringBlock(0.5F, 0.5F, BlockSoundGroup.SAND, "cc_sand_layer");
        
        // sandstone related
        CC_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_sandstone");
        CC_BLUE_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_blue_sandstone");
        CC_BROWN_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_brown_sandstone");
        CC_DARK_BROWN_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_dark_brown_sandstone");
        CC_GRAY_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_gray_sandstone");
        CC_GREEN_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_green_sandstone");
        CC_LIGHT_GREEN_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_light_green_sandstone");
        CC_ORANGE_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_orange_sandstone");
        CC_PINK_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_pink_sandstone");
        CC_PURPLE_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_purple_sandstone");
        CC_RED_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_red_sandstone");
        CC_YELLOW_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_yellow_sandstone");

        CC_NORMAL_SANDSTONE = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_normal_sandstone", "cc_normal_sandstone_slab", "cc_normal_sandstone_stairs");
        CC_CUT_SANDSTONE = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_cut_sandstone", "cc_cut_sandstone_slab", "cc_cut_sandstone_stairs");
        CC_SMOOTH_SANDSTONE = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_smooth_sandstone", "cc_smooth_sandstone_slab", "cc_smooth_sandstone_stairs");
        CC_CHISELED_SANDSTONE = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_chiseled_sandstone");

        // plant related
        CC_DESERT_GRASS = new DungeonsDesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_desert_grass");
        CC_CACTUS = new DungeonsDesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_cactus");
        CC_SMALL_CACTUS = new DungeonsDesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_small_cactus");
        CC_FERN = new DungeonsDesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_fern");
        CC_FLOWERS = new DungeonsDesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_flowers");
        CC_YUCCA = new DungeonsDesertTallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_yucca");
        CC_TALL_CACTUS = new DungeonsDesertTallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_tall_cactus");

        // add all blockitems to group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(JavaDungeons.MOD_ID, "pumpkin_pastures"))).register(content -> {
            content.add(CC_GRASS_BLOCK.blockItem);
            content.add(CC_DENSE_GRASSY_DIRT.blockItem);
            content.add(CC_GRASSY_DIRT.blockItem);
            content.add(CC_DIRT_PATH.blockItem);
            content.add(CC_DIRT.blockItem);
            content.add(CC_DIRT_SLAB.blockItem);
            content.add(CC_ROCKY_DIRT_PATH.blockItem);
            content.add(CC_ROCKY_DIRT.blockItem);
            content.add(CC_SAND.blockItem);
            content.add(CC_DENSE_SANDY_DIRT.blockItem);
            content.add(CC_SANDY_DIRT.blockItem);
            content.add(CC_SAND_LAYER.blockItem);
            content.add(CC_SANDSTONE.blockItem);
            content.add(CC_BLUE_SANDSTONE.blockItem);
            content.add(CC_BROWN_SANDSTONE.blockItem);
            content.add(CC_DARK_BROWN_SANDSTONE.blockItem);
            content.add(CC_GRAY_SANDSTONE.blockItem);
            content.add(CC_GREEN_SANDSTONE.blockItem);
            content.add(CC_LIGHT_GREEN_SANDSTONE.blockItem);
            content.add(CC_ORANGE_SANDSTONE.blockItem);
            content.add(CC_PINK_SANDSTONE.blockItem);
            content.add(CC_PURPLE_SANDSTONE.blockItem);
            content.add(CC_RED_SANDSTONE.blockItem);
            content.add(CC_YELLOW_SANDSTONE.blockItem);
            content.add(CC_NORMAL_SANDSTONE.base.blockItem);
            content.add(CC_NORMAL_SANDSTONE.slab.blockItem);
            content.add(CC_NORMAL_SANDSTONE.stairs.blockItem);
            content.add(CC_CUT_SANDSTONE.base.blockItem);
            content.add(CC_CUT_SANDSTONE.slab.blockItem);
            content.add(CC_CUT_SANDSTONE.stairs.blockItem);
            content.add(CC_SMOOTH_SANDSTONE.base.blockItem);
            content.add(CC_SMOOTH_SANDSTONE.slab.blockItem);
            content.add(CC_SMOOTH_SANDSTONE.stairs.blockItem);
            content.add(CC_CHISELED_SANDSTONE.blockItem);
            content.add(CC_DESERT_GRASS.blockItem);
            content.add(CC_CACTUS.blockItem);
            content.add(CC_SMALL_CACTUS.blockItem);
            content.add(CC_FERN.blockItem);
            content.add(CC_FLOWERS.blockItem);
            content.add(CC_YUCCA.blockItem);
            content.add(CC_TALL_CACTUS.blockItem);
        });
    }

}