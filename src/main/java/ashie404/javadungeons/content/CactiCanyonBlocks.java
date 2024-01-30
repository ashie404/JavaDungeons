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

    // earth blocks
    public static GrassBlock CC_GRASS_BLOCK;
    public static BaseBlock CC_DENSE_GRASSY_DIRT;
    public static BaseBlock CC_GRASSY_DIRT;
    public static PathBlock CC_DIRT_PATH;
    public static PathableBlock CC_DIRT;
    public static Slab CC_DIRT_SLAB;
    public static PathBlock CC_ROCKY_DIRT_PATH;
    public static PathableBlock CC_ROCKY_DIRT;

    // sand blocks
    public static FallingBlock CC_SAND;
    public static BaseBlock CC_DENSE_SANDY_DIRT;
    public static BaseBlock CC_SANDY_DIRT;
    public static LayeringBlock CC_SAND_LAYER;

    // sandstone blocks
    public static BaseBlock CC_SANDSTONE;
    public static BaseBlock CC_BLUE_SANDSTONE;
    public static BaseBlock CC_BROWN_SANDSTONE;
    public static BaseBlock CC_DARK_BROWN_SANDSTONE;
    public static BaseBlock CC_GRAY_SANDSTONE;
    public static BaseBlock CC_GREEN_SANDSTONE;
    public static BaseBlock CC_LIGHT_GREEN_SANDSTONE;
    public static BaseBlock CC_ORANGE_SANDSTONE;
    public static BaseBlock CC_PINK_SANDSTONE;
    public static BaseBlock CC_PURPLE_SANDSTONE;
    public static BaseBlock CC_RED_SANDSTONE;
    public static BaseBlock CC_YELLOW_SANDSTONE;

    public static SlabStairBlock CC_NORMAL_SANDSTONE;
    public static SlabStairBlock CC_CUT_SANDSTONE;
    public static SlabStairBlock CC_SMOOTH_SANDSTONE;
    public static BaseBlock CC_CHISELED_SANDSTONE;

    // plant blocks
    public static DesertPlant CC_DESERT_GRASS;
    public static DesertPlant CC_CACTUS;
    public static DesertPlant CC_SMALL_CACTUS;
    public static DesertPlant CC_FERN;
    public static DesertPlant CC_FLOWERS;
    public static DesertTallPlant CC_YUCCA;
    public static DesertTallPlant CC_TALL_CACTUS;
    
    public static void init() {

        // earth blocks
        CC_DENSE_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_dense_grassy_dirt");
        CC_GRASSY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_grassy_dirt");
        CC_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_dirt_path");
        CC_DIRT = new PathableBlock(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, CC_DIRT_PATH, "cc_dirt");
        CC_DIRT_SLAB = new Slab(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_dirt_slab");
        CC_GRASS_BLOCK = new GrassBlock(0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, CC_DIRT, "cc_grass_block");
        CC_ROCKY_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_rocky_dirt_path");
        CC_ROCKY_DIRT = new PathableBlock(0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, CC_ROCKY_DIRT_PATH, "cc_rocky_dirt");

        // sand related
        CC_SAND = new FallingBlock(0.5F, 0.5F, BlockSoundGroup.SAND, "cc_sand");
        CC_DENSE_SANDY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_dense_sandy_dirt");
        CC_SANDY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "cc_sandy_dirt");
        CC_SAND_LAYER = new LayeringBlock(0.5F, 0.5F, BlockSoundGroup.SAND, "cc_sand_layer");
        
        // sandstone related
        CC_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_sandstone");
        CC_BLUE_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_blue_sandstone");
        CC_BROWN_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_brown_sandstone");
        CC_DARK_BROWN_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_dark_brown_sandstone");
        CC_GRAY_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_gray_sandstone");
        CC_GREEN_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_green_sandstone");
        CC_LIGHT_GREEN_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_light_green_sandstone");
        CC_ORANGE_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_orange_sandstone");
        CC_PINK_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_pink_sandstone");
        CC_PURPLE_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_purple_sandstone");
        CC_RED_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_red_sandstone");
        CC_YELLOW_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_yellow_sandstone");

        CC_NORMAL_SANDSTONE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_normal_sandstone", "cc_normal_sandstone_slab", "cc_normal_sandstone_stairs");
        CC_CUT_SANDSTONE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_cut_sandstone", "cc_cut_sandstone_slab", "cc_cut_sandstone_stairs");
        CC_SMOOTH_SANDSTONE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_smooth_sandstone", "cc_smooth_sandstone_slab", "cc_smooth_sandstone_stairs");
        CC_CHISELED_SANDSTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "cc_chiseled_sandstone");

        // plant related
        CC_DESERT_GRASS = new DesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_desert_grass");
        CC_CACTUS = new DesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_cactus");
        CC_SMALL_CACTUS = new DesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_small_cactus");
        CC_FERN = new DesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_fern");
        CC_FLOWERS = new DesertPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_flowers");
        CC_YUCCA = new DesertTallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_yucca");
        CC_TALL_CACTUS = new DesertTallPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "cc_tall_cactus");

        // add all blockitems to group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("cacti_canyon"))).register(content -> {
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