package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.AbstractBlock.OffsetType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class CactiCanyonBlocks {

    // earth blocks
    public static final Block CC_DENSE_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cc_dense_grassy_dirt");
    public static final Block CC_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cc_grassy_dirt");
    public static final Block CC_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cc_dirt_path");
    public static final Block CC_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL), true, CC_DIRT_PATH), "cc_dirt");
    public static final Block CC_DIRT_SLAB = 
        RegistryHelper.registerBlock(new SlabBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cc_dirt_slab");
    public static final Block CC_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new GrassBlock(FabricBlockSettings.create().strength(0.6F).sounds(BlockSoundGroup.GRASS), true, Blocks.DIRT_PATH, CC_DIRT), "cc_grass_block");
    public static final Block CC_ROCKY_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cc_rocky_dirt_path");
    public static final Block CC_ROCKY_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL), false, CC_ROCKY_DIRT_PATH), "cc_rocky_dirt");

    // sand blocks
    public static final Block CC_SAND = 
        RegistryHelper.registerBlock(new FallingBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.SAND)), "cc_sand");
    public static final Block CC_DENSE_SANDY_DIRT = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cc_dense_sandy_dirt");
    public static final Block CC_SANDY_DIRT = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "cc_sandy_dirt");
    public static final Block CC_SAND_LAYER = 
        RegistryHelper.registerBlock(new LayeringBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.SAND)), "cc_sand_layer");

    // sandstone blocks
    public static final Block CC_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_sandstone");
    public static final Block CC_BLUE_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_blue_sandstone");
    public static final Block CC_BROWN_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_brown_sandstone");
    public static final Block CC_DARK_BROWN_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_dark_brown_sandstone");
    public static final Block CC_GRAY_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_gray_sandstone");
    public static final Block CC_GREEN_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_green_sandstone");
    public static final Block CC_LIGHT_GREEN_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_light_green_sandstone");
    public static final Block CC_ORANGE_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_orange_sandstone");
    public static final Block CC_PINK_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_pink_sandstone");
    public static final Block CC_PURPLE_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_purple_sandstone");
    public static final Block CC_RED_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_red_sandstone");
    public static final Block CC_YELLOW_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_yellow_sandstone");

    public static final SlabStairBlock CC_NORMAL_SANDSTONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_normal_sandstone");
    public static final SlabStairBlock CC_CUT_SANDSTONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_cut_sandstone");
    public static final SlabStairBlock CC_SMOOTH_SANDSTONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_smooth_sandstone");
    public static final Block CC_CHISELED_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "cc_chiseled_sandstone");

    // plant blocks
    public static final Block CC_DESERT_GRASS = 
        RegistryHelper.registerBlock(new DesertPlant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS).breakInstantly().offset(OffsetType.XZ)), "cc_desert_grass");
    public static final Block CC_CACTUS = 
        RegistryHelper.registerBlock(new DesertPlant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS).breakInstantly().offset(OffsetType.XZ)), "cc_cactus");
    public static final Block CC_SMALL_CACTUS = 
        RegistryHelper.registerBlock(new DesertPlant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS).breakInstantly().offset(OffsetType.XZ)), "cc_small_cactus");
    public static final Block CC_FERN = 
        RegistryHelper.registerBlock(new DesertPlant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS).breakInstantly().offset(OffsetType.XZ)), "cc_fern");
    public static final Block CC_FLOWERS = 
        RegistryHelper.registerBlock(new DesertPlant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS).breakInstantly().offset(OffsetType.XZ)), "cc_flowers");
    public static final Block CC_YUCCA = 
        RegistryHelper.registerBlock(new DesertTallPlant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS).breakInstantly().offset(OffsetType.XZ)), "cc_yucca");
    public static final Block CC_TALL_CACTUS = 
        RegistryHelper.registerBlock(new DesertTallPlant(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS).breakInstantly().offset(OffsetType.XZ)), "cc_tall_cactus");
    
    public static void init() {
        JavaDungeons.log.info("Registering Cacti Canyon Blocks!");

        // add all blockitems to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("cacti_canyon"))).register(content -> {
            content.add(CC_GRASS_BLOCK);
            content.add(CC_DENSE_GRASSY_DIRT);
            content.add(CC_GRASSY_DIRT);
            content.add(CC_DIRT_PATH);
            content.add(CC_DIRT);
            content.add(CC_DIRT_SLAB);
            content.add(CC_ROCKY_DIRT_PATH);
            content.add(CC_ROCKY_DIRT);
            content.add(CC_SAND);
            content.add(CC_DENSE_SANDY_DIRT);
            content.add(CC_SANDY_DIRT);
            content.add(CC_SAND_LAYER);
            content.add(CC_SANDSTONE);
            content.add(CC_BLUE_SANDSTONE);
            content.add(CC_BROWN_SANDSTONE);
            content.add(CC_DARK_BROWN_SANDSTONE);
            content.add(CC_GRAY_SANDSTONE);
            content.add(CC_GREEN_SANDSTONE);
            content.add(CC_LIGHT_GREEN_SANDSTONE);
            content.add(CC_ORANGE_SANDSTONE);
            content.add(CC_PINK_SANDSTONE);
            content.add(CC_PURPLE_SANDSTONE);
            content.add(CC_RED_SANDSTONE);
            content.add(CC_YELLOW_SANDSTONE);
            content.add(CC_NORMAL_SANDSTONE.base);
            content.add(CC_NORMAL_SANDSTONE.slab);
            content.add(CC_NORMAL_SANDSTONE.stairs);
            content.add(CC_CUT_SANDSTONE.base);
            content.add(CC_CUT_SANDSTONE.slab);
            content.add(CC_CUT_SANDSTONE.stairs);
            content.add(CC_SMOOTH_SANDSTONE.base);
            content.add(CC_SMOOTH_SANDSTONE.slab);
            content.add(CC_SMOOTH_SANDSTONE.stairs);
            content.add(CC_CHISELED_SANDSTONE);
            content.add(CC_DESERT_GRASS);
            content.add(CC_CACTUS);
            content.add(CC_SMALL_CACTUS);
            content.add(CC_FERN);
            content.add(CC_FLOWERS);
            content.add(CC_YUCCA);
            content.add(CC_TALL_CACTUS);
        });
    }

}