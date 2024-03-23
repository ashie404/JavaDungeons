package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class CactiCanyonBlocks {

    // earth blocks
    public static final Block CC_DENSE_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cc_dense_grassy_dirt");
    public static final Block CC_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cc_grassy_dirt");
    public static final Block CC_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "cc_dirt_path");
    public static final Block CC_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(true, CC_DIRT_PATH, Material.EARTH), "cc_dirt");
    public static final Block CC_DIRT_SLAB = 
        RegistryHelper.registerBlock(new SlabBlock(Material.EARTH), "cc_dirt_slab");
    public static final Block CC_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new GrassBlock(true, Blocks.DIRT_PATH, CC_DIRT, Material.GRASS), "cc_grass_block");
    public static final Block CC_ROCKY_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "cc_rocky_dirt_path");
    public static final Block CC_ROCKY_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(false, CC_ROCKY_DIRT_PATH, Material.EARTH), "cc_rocky_dirt");
    public static final Block CC_DARK_ROCKY_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "cc_dark_rocky_dirt_path");
    public static final Block CC_DARK_ROCKY_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(false, CC_DARK_ROCKY_DIRT_PATH, Material.EARTH), "cc_dark_rocky_dirt");

    // sand blocks
    public static final Block CC_SAND = 
        RegistryHelper.registerBlock(new FallingBlock(Material.SAND), "cc_sand");
    public static final Block CC_DENSE_SANDY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cc_dense_sandy_dirt");
    public static final Block CC_SANDY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cc_sandy_dirt");
    public static final Block CC_SAND_LAYER = 
        RegistryHelper.registerBlock(new LayeringBlock(Material.SAND), "cc_sand_layer");

    // sandstone blocks
    public static final Block CC_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(Material.SANDSTONE), "cc_sandstone");
    public static final Block CC_BLUE_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.TERRACOTTA_BLUE)), "cc_blue_sandstone");
    public static final Block CC_BROWN_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.TERRACOTTA_BROWN)), "cc_brown_sandstone");
    public static final Block CC_DARK_BROWN_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.SPRUCE_BROWN)), "cc_dark_brown_sandstone");
    public static final Block CC_GRAY_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.GRAY)), "cc_gray_sandstone");
    public static final Block CC_GREEN_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.TERRACOTTA_GREEN)), "cc_green_sandstone");
    public static final Block CC_LIGHT_GREEN_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.GREEN)), "cc_light_green_sandstone");
    public static final Block CC_ORANGE_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.ORANGE)), "cc_orange_sandstone");
    public static final Block CC_PINK_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.TERRACOTTA_PINK)), "cc_pink_sandstone");
    public static final Block CC_PURPLE_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.TERRACOTTA_PURPLE)), "cc_purple_sandstone");
    public static final Block CC_RED_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.SANDSTONE).mapColor(MapColor.TERRACOTTA_RED)), "cc_red_sandstone");
    public static final Block CC_YELLOW_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(Material.SANDSTONE), "cc_yellow_sandstone");

    public static final SlabStairBlock CC_NORMAL_SANDSTONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.SANDSTONE), "cc_normal_sandstone");
    public static final SlabStairBlock CC_CUT_SANDSTONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.SANDSTONE), "cc_cut_sandstone");
    public static final SlabStairBlock CC_SMOOTH_SANDSTONE = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.SANDSTONE), "cc_smooth_sandstone");
    public static final Block CC_CHISELED_SANDSTONE = 
        RegistryHelper.registerBlock(new Block(Material.SANDSTONE), "cc_chiseled_sandstone");

    // plant blocks
    public static final Block CC_DESERT_GRASS = 
        RegistryHelper.registerBlock(new DesertPlant(Material.OFFSET_XZ_PLANT), "cc_desert_grass");
    public static final Block CC_CACTUS = 
        RegistryHelper.registerBlock(new DesertPlant(Material.OFFSET_XZ_PLANT), "cc_cactus");
    public static final Block CC_SMALL_CACTUS = 
        RegistryHelper.registerBlock(new DesertPlant(Material.OFFSET_XZ_PLANT), "cc_small_cactus");
    public static final Block CC_FERN = 
        RegistryHelper.registerBlock(new DesertPlant(Material.OFFSET_XZ_PLANT), "cc_fern");
    public static final Block CC_FLOWERS = 
        RegistryHelper.registerBlock(new DesertPlant(Material.OFFSET_XZ_PLANT), "cc_flowers");
    public static final Block CC_YUCCA = 
        RegistryHelper.registerBlock(new DesertTallPlant(Material.OFFSET_XZ_PLANT), "cc_yucca");
    public static final Block CC_TALL_DESERT_GRASS =
        RegistryHelper.registerBlock(new DesertTallPlant(Material.OFFSET_XZ_PLANT), "cc_tall_desert_grass");
    public static final Block CC_TALL_CACTUS = 
        RegistryHelper.registerBlock(new DesertTallPlant(Material.OFFSET_XZ_PLANT), "cc_tall_cactus");
    
    public static void init() {
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
            content.add(CC_DARK_ROCKY_DIRT_PATH);
            content.add(CC_DARK_ROCKY_DIRT);
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
            content.add(CC_TALL_DESERT_GRASS);
            content.add(CC_TALL_CACTUS);
        });
    }

}