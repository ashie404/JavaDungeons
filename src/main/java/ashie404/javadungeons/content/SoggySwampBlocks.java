package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import ashie404.javadungeons.worldgen.SaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class SoggySwampBlocks {

    // ground related
    public static final Block SS_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "ss_dirt_path");
    public static final Block SS_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(true, SS_DIRT_PATH, Material.EARTH), "ss_dirt");
    public static final Block SS_DENSE_GRASSY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "ss_dense_grassy_dirt");
    public static final Block SS_GRASSY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "ss_grassy_dirt");
    public static final Block SS_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new GrassBlock(true, Blocks.DIRT_PATH, SS_DIRT, Material.GRASS), "ss_grass_block");

    // stone related
    public static final Block SS_MOSSY_STONE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "ss_mossy_stone");
    public static final Block SS_MOSSY_COBBLESTONE = 
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "ss_mossy_cobblestone");
    public static final Block SS_MOSSY_COBBLESTONE_WALL = 
        RegistryHelper.registerBlock(new WallBlock(Material.COBBLESTONE), "ss_mossy_cobblestone_wall");
    public static final Block SS_MOSSY_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "ss_mossy_stone_bricks");
    public static final Block SS_MOSSY_POLISHED_ANDESITE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "ss_mossy_polished_andesite");
    public static final Block SS_MOSSY_CHISELED_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "ss_mossy_chiseled_stone_bricks");

    // swamp tree
    public static final Block SS_SWAMP_LOG = 
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "ss_swamp_log");
    public static final Block SS_SWAMP_LEAVES = 
        RegistryHelper.registerBlock(new Leaves(Material.LEAVES), "ss_swamp_leaves");
    public static final SlabStairBlock SS_SWAMP_PLANKS = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.WOOD), "ss_swamp_planks");
    public static final Block SS_SWAMP_SAPLING = 
        RegistryHelper.registerBlock(new Sapling(SaplingGenerators.SWAMP, Material.PLANT), "ss_swamp_sapling");

    // bridge related
    public static final Block SS_BRIDGE_PLANKS = 
        RegistryHelper.registerBlock(new DirectionalSlab(Material.WOOD), "ss_bridge_planks");
    public static final Block SS_ROPE_FENCE = 
        RegistryHelper.registerBlock(new FenceBlock(Material.WOOD), "ss_rope_fence");

    // braziers
    public static final Block SS_BRAZIER = 
        RegistryHelper.registerBlock(new Brazier(true, Material.STONE), "ss_brazier");

    public static void init() {
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("soggy_swamp"))).register(content -> {
            content.add(SS_GRASS_BLOCK);
            content.add(SS_DIRT_PATH);
            content.add(SS_DIRT);
            content.add(SS_DENSE_GRASSY_DIRT);
            content.add(SS_GRASSY_DIRT);
            content.add(SS_MOSSY_STONE);
            content.add(SS_MOSSY_COBBLESTONE);
            content.add(SS_MOSSY_COBBLESTONE_WALL);
            content.add(SS_MOSSY_STONE_BRICKS);
            content.add(SS_MOSSY_CHISELED_STONE_BRICKS);
            content.add(SS_SWAMP_LOG);
            content.add(SS_SWAMP_LEAVES);
            content.add(SS_SWAMP_PLANKS.base);
            content.add(SS_SWAMP_PLANKS.slab);
            content.add(SS_SWAMP_PLANKS.stairs);
            content.add(SS_SWAMP_SAPLING);
            content.add(SS_BRIDGE_PLANKS);
            content.add(SS_ROPE_FENCE);
            content.add(SS_BRAZIER);
        });
    }
}
