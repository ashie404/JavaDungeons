package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CactiCanyonBlocks {

    // grass related
    public static Block CC_GRASS_BLOCK;

    // dirt related
    public static Block CC_DENSE_GRASSY_DIRT;
    public static Block CC_GRASSY_DIRT;
    public static Block CC_DIRT_PATH;
    public static Block CC_DIRT;
    public static Block CC_DIRT_SLAB;
    public static Block CC_ROCKY_DIRT_PATH;
    public static Block CC_ROCKY_DIRT;

    // sand related
    public static Block CC_SAND;
    public static Block CC_DENSE_SANDY_DIRT;
    public static Block CC_SANDY_DIRT;
    public static Block CC_SAND_LAYER;

    // sandstone related
    public static Block CC_SANDSTONE;
    public static Block CC_BLUE_SANDSTONE;
    public static Block CC_BROWN_SANDSTONE;
    public static Block CC_DARK_BROWN_SANDSTONE;
    public static Block CC_GRAY_SANDSTONE;
    public static Block CC_GREEN_SANDSTONE;
    public static Block CC_LIGHT_GREEN_SANDSTONE;
    public static Block CC_ORANGE_SANDSTONE;
    public static Block CC_PINK_SANDSTONE;
    public static Block CC_PURPLE_SANDSTONE;
    public static Block CC_RED_SANDSTONE;
    public static Block CC_YELLOW_SANDSTONE;

    public static Block CC_NORMAL_SANDSTONE;
    public static Block CC_CUT_SANDSTONE;
    public static Block CC_SMOOTH_SANDSTONE;
    public static Block CC_CHISELED_SANDSTONE;

    // plant related
    public static Block CC_DESERT_GRASS;
    public static Block CC_CACTUS;
    public static Block CC_SMALL_CACTUS;
    public static Block CC_FERN;
    public static Block CC_FLOWERS;
    public static Block CC_YUCCA;
    public static Block CC_TALL_CACTUS;
    
    public static void init() {
        // grass related
        CC_GRASS_BLOCK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.SOLID_ORGANIC, 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH), "cc_grass_block", JavaDungeons.CACTI_CANYON);

        // dirt related
        CC_DENSE_GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cc_dense_grassy_dirt", JavaDungeons.CACTI_CANYON);
        CC_GRASSY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cc_grassy_dirt", JavaDungeons.CACTI_CANYON);
        CC_DIRT_PATH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cc_dirt_path", JavaDungeons.CACTI_CANYON);
        CC_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, CC_DIRT_PATH), "cc_dirt", JavaDungeons.CACTI_CANYON);
        CC_DIRT_SLAB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cc_dirt_slab", JavaDungeons.CACTI_CANYON);
        CC_ROCKY_DIRT_PATH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cc_rocky_dirt_path", JavaDungeons.CACTI_CANYON);
        CC_ROCKY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, CC_ROCKY_DIRT_PATH), "cc_rocky_dirt", JavaDungeons.CACTI_CANYON);

        // sand related
        CC_SAND = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsFallingBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.SAND), "cc_sand", JavaDungeons.CACTI_CANYON);
        CC_DENSE_SANDY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cc_dense_sandy_dirt", JavaDungeons.CACTI_CANYON);
        CC_SANDY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "cc_sandy_dirt", JavaDungeons.CACTI_CANYON);
        CC_SAND_LAYER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsLayeringBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.SAND), "cc_sand_layer", JavaDungeons.CACTI_CANYON);
        
        // sandstone related
        CC_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_sandstone", JavaDungeons.CACTI_CANYON);
        CC_BLUE_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_blue_sandstone", JavaDungeons.CACTI_CANYON);
        CC_BROWN_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_brown_sandstone", JavaDungeons.CACTI_CANYON);
        CC_DARK_BROWN_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_dark_brown_sandstone", JavaDungeons.CACTI_CANYON);
        CC_GRAY_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_gray_sandstone", JavaDungeons.CACTI_CANYON);
        CC_GREEN_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_green_sandstone", JavaDungeons.CACTI_CANYON);
        CC_LIGHT_GREEN_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_light_green_sandstone", JavaDungeons.CACTI_CANYON);
        CC_ORANGE_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_orange_sandstone", JavaDungeons.CACTI_CANYON);
        CC_PINK_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_pink_sandstone", JavaDungeons.CACTI_CANYON);
        CC_PURPLE_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_purple_sandstone", JavaDungeons.CACTI_CANYON);
        CC_RED_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_red_sandstone", JavaDungeons.CACTI_CANYON);
        CC_YELLOW_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_yellow_sandstone", JavaDungeons.CACTI_CANYON);

        CC_NORMAL_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_normal_sandstone", JavaDungeons.CACTI_CANYON);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_normal_sandstone_slab", JavaDungeons.CACTI_CANYON);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CC_NORMAL_SANDSTONE), "cc_normal_sandstone_stairs", JavaDungeons.CACTI_CANYON);
        CC_CUT_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_cut_sandstone", JavaDungeons.CACTI_CANYON);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE),"cc_cut_sandstone_slab", JavaDungeons.CACTI_CANYON);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CC_CUT_SANDSTONE), "cc_cut_sandstone_stairs", JavaDungeons.CACTI_CANYON);
        CC_SMOOTH_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_smooth_sandstone", JavaDungeons.CACTI_CANYON);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_smooth_sandstone_slab", JavaDungeons.CACTI_CANYON);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, CC_SMOOTH_SANDSTONE), "cc_smooth_sandstone_stairs", JavaDungeons.CACTI_CANYON);
        CC_CHISELED_SANDSTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "cc_chiseled_sandstone");

        // plant related
        CC_DESERT_GRASS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsDesertPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cc_desert_grass", JavaDungeons.CACTI_CANYON);
        CC_CACTUS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsDesertPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cc_cactus", JavaDungeons.CACTI_CANYON);
        CC_SMALL_CACTUS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsDesertPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cc_small_cactus", JavaDungeons.CACTI_CANYON);
        CC_FERN = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsDesertPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cc_fern", JavaDungeons.CACTI_CANYON);
        CC_FLOWERS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsDesertPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cc_flowers", JavaDungeons.CACTI_CANYON);
        CC_YUCCA = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsDesertTallPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cc_yucca", JavaDungeons.CACTI_CANYON);
        CC_TALL_CACTUS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsDesertTallPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "cc_tall_cactus", JavaDungeons.CACTI_CANYON);
    }

}