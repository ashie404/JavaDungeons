package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.registry.RegistryHelper;
import ashie404.javadungeons.worldgen.SaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class SoggySwampBlocks {

    // ground related
    public static final Block SS_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)), "ss_dirt_path");
    public static final Block SS_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL), true, SS_DIRT_PATH), "ss_dirt");
    public static final Block SS_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new GrassBlock(FabricBlockSettings.create().strength(0.6F).sounds(BlockSoundGroup.GRASS), true, Blocks.DIRT_PATH, SS_DIRT), "ss_grass_block");

    // stone related
    public static final Block SS_MOSSY_STONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ss_mossy_stone");
    public static final Block SS_MOSSY_COBBLESTONE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ss_mossy_cobblestone");
    public static final Block SS_MOSSY_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ss_mossy_stone_bricks");
    public static final Block SS_MOSSY_POLISHED_ANDESITE = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ss_mossy_polished_andesite");
    public static final Block SS_MOSSY_CHISELED_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "ss_mossy_chiseled_stone_bricks");

    // swamp tree
    public static final Block SS_SWAMP_LOG = 
        RegistryHelper.registerBlock(new PillarBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), "ss_swamp_log");
    public static final Block SS_SWAMP_LEAVES = 
        RegistryHelper.registerBlock(new Leaves(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.GRASS)), "ss_swamp_leaves");
    public static final SlabStairBlock SS_SWAMP_PLANKS = 
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), "ss_swamp_planks");
    public static final Block SS_SWAMP_SAPLING = 
        RegistryHelper.registerBlock(new Sapling(SaplingGenerators.SWAMP, FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS)), "ss_swamp_sapling");

    // bridge related
    public static final Block SS_BRIDGE_PLANKS = 
        RegistryHelper.registerBlock(new SlabBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), "ss_bridge_planks");
    public static final Block SS_ROPE_FENCE = 
        RegistryHelper.registerBlock(new FenceBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), "ss_rope_fence");

    // braziers
    public static final Block SS_UNLIT_BRAZIER = 
        RegistryHelper.registerBlock(new Brazier(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE), null, true), "ss_unlit_brazier");
    public static final Block SS_LIT_BRAZIER = 
        RegistryHelper.registerBlock(new Brazier(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE).luminance(15), ParticleTypes.FLAME, true), "ss_lit_brazier");
    public static final Block SS_GREEN_LIT_BRAZIER = 
        RegistryHelper.registerBlock(new Brazier(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE).luminance(15), Particles.GREEN_FLAME, true), "ss_green_lit_brazier");

    public static void init() {
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("soggy_swamp"))).register(content -> {
            content.add(SS_GRASS_BLOCK);
            content.add(SS_DIRT_PATH);
            content.add(SS_DIRT);
            content.add(SS_MOSSY_STONE);
            content.add(SS_MOSSY_COBBLESTONE);
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
            content.add(SS_UNLIT_BRAZIER);
            content.add(SS_LIT_BRAZIER);
            content.add(SS_GREEN_LIT_BRAZIER);
        });
    }
}
