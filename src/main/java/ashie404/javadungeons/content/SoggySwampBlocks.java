package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.worldgen.SaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SoggySwampBlocks {

    // ground related
    public static PathableBlock SS_GRASS_BLOCK;
    public static PathBlock SS_DIRT_PATH;
    public static PathableBlock SS_DIRT;

    // stone related
    public static BaseBlock SS_MOSSY_STONE;
    public static BaseBlock SS_MOSSY_COBBLESTONE;
    public static BaseBlock SS_MOSSY_STONE_BRICKS;
    public static BaseBlock SS_MOSSY_POLISHED_ANDESITE;
    public static BaseBlock SS_MOSSY_CHISELED_STONE_BRICKS;

    // swamp tree
    public static Pillar SS_SWAMP_LOG;
    public static Leaves SS_SWAMP_LEAVES;
    public static SlabStairBlock SS_SWAMP_PLANKS;
    public static Sapling SS_SWAMP_SAPLING;

    // bridge related
    public static TopSlab SS_BRIDGE_PLANKS;
    public static Fence SS_ROPE_FENCE;

    // braziers
    public static Brazier SS_UNLIT_BRAZIER;
    public static Brazier SS_LIT_BRAZIER;
    public static Brazier SS_GREEN_LIT_BRAZIER;

    public static void init() {
        // ground related
        SS_GRASS_BLOCK = new PathableBlock(0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, "ss_grass_block");
        SS_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "ss_dirt_path");
        SS_DIRT = new PathableBlock(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, SS_DIRT_PATH, "ss_dirt");

        // stone related
        SS_MOSSY_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_stone");
        SS_MOSSY_COBBLESTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_cobblestone");
        SS_MOSSY_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_stone_bricks");
        SS_MOSSY_POLISHED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_polished_andesite");
        SS_MOSSY_CHISELED_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_chiseled_stone_bricks");

        // swamp tree
        SS_SWAMP_LOG = new Pillar(2.0F, 3.0F, BlockSoundGroup.WOOD, "ss_swamp_log");
        SS_SWAMP_LEAVES = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "ss_swamp_leaves");
        SS_SWAMP_PLANKS = new SlabStairBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "ss_swamp_planks", "ss_swamp_planks_slab", "ss_swamp_planks_stairs");
        SS_SWAMP_SAPLING = new Sapling(SaplingGenerators.SWAMP, 0.0F, 0.0F, BlockSoundGroup.GRASS, "ss_swamp_sapling");

        // bridge related
        SS_BRIDGE_PLANKS = new TopSlab(2.0F, 3.0F, BlockSoundGroup.WOOD, "ss_bridge_planks");
        SS_ROPE_FENCE = new Fence(2.0F, 3.0F, BlockSoundGroup.WOOD, "ss_rope_fence");

        // braziers
        SS_UNLIT_BRAZIER = new Brazier(1.5F, 6.0F, BlockSoundGroup.STONE, "unlit", true, "ss_unlit_brazier");
        SS_LIT_BRAZIER = new Brazier(1.5F, 6.0F, BlockSoundGroup.STONE, "lit", true, "ss_lit_brazier");
        SS_GREEN_LIT_BRAZIER = new Brazier(1.5F, 6.0F, BlockSoundGroup.STONE, "green_lit", true, "ss_green_lit_brazier");

        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp"))).register(content -> {
            content.add(SS_GRASS_BLOCK.blockItem);
            content.add(SS_DIRT_PATH.blockItem);
            content.add(SS_DIRT.blockItem);
            content.add(SS_MOSSY_STONE.blockItem);
            content.add(SS_MOSSY_COBBLESTONE.blockItem);
            content.add(SS_MOSSY_STONE_BRICKS.blockItem);
            content.add(SS_MOSSY_CHISELED_STONE_BRICKS.blockItem);
            content.add(SS_SWAMP_LOG.blockItem);
            content.add(SS_SWAMP_LEAVES.blockItem);
            content.add(SS_SWAMP_PLANKS.base.blockItem);
            content.add(SS_SWAMP_PLANKS.slab.blockItem);
            content.add(SS_SWAMP_PLANKS.stairs.blockItem);
            content.add(SS_SWAMP_SAPLING.blockItem);
            content.add(SS_BRIDGE_PLANKS.blockItem);
            content.add(SS_ROPE_FENCE.blockItem);
            content.add(SS_UNLIT_BRAZIER.blockItem);
            content.add(SS_LIT_BRAZIER.blockItem);
            content.add(SS_GREEN_LIT_BRAZIER.blockItem);
        });
    }
}
