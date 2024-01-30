package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.worldgen.SaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class SoggySwampBlocks {

    // ground related
    public static final PathBlock SS_DIRT_PATH = new PathBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "ss_dirt_path");
    public static final PathableBlock SS_DIRT = new PathableBlock(0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, SS_DIRT_PATH, "ss_dirt");
    public static final GrassBlock SS_GRASS_BLOCK = new GrassBlock(0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH, SS_DIRT, "ss_grass_block");

    // stone related
    public static final BaseBlock SS_MOSSY_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_stone");
    public static final BaseBlock SS_MOSSY_COBBLESTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_cobblestone");
    public static final BaseBlock SS_MOSSY_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_stone_bricks");
    public static final BaseBlock SS_MOSSY_POLISHED_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_polished_andesite");
    public static final BaseBlock SS_MOSSY_CHISELED_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "ss_mossy_chiseled_stone_bricks");

    // swamp tree
    public static final Pillar SS_SWAMP_LOG = new Pillar(2.0F, 3.0F, BlockSoundGroup.WOOD, "ss_swamp_log");
    public static final Leaves SS_SWAMP_LEAVES = new Leaves(0.2F, 0.2F, BlockSoundGroup.GRASS, "ss_swamp_leaves");
    public static final SlabStairBlock SS_SWAMP_PLANKS = new SlabStairBlock(2.0F, 3.0F, BlockSoundGroup.WOOD, "ss_swamp_planks", "ss_swamp_planks_slab", "ss_swamp_planks_stairs");
    public static final Sapling SS_SWAMP_SAPLING = new Sapling(SaplingGenerators.SWAMP, 0.0F, 0.0F, BlockSoundGroup.GRASS, "ss_swamp_sapling");

    // bridge related
    public static final TopSlab SS_BRIDGE_PLANKS = new TopSlab(2.0F, 3.0F, BlockSoundGroup.WOOD, "ss_bridge_planks");
    public static final Fence SS_ROPE_FENCE = new Fence(2.0F, 3.0F, BlockSoundGroup.WOOD, "ss_rope_fence");

    // braziers
    public static final Brazier SS_UNLIT_BRAZIER = new Brazier(null, 1.5F, 6.0F, BlockSoundGroup.STONE, "unlit", true, "ss_unlit_brazier");
    public static final Brazier SS_LIT_BRAZIER = new Brazier(ParticleTypes.FLAME, 1.5F, 6.0F, BlockSoundGroup.STONE, "lit", true, "ss_lit_brazier");
    public static final Brazier SS_GREEN_LIT_BRAZIER = new Brazier(Particles.GREEN_FLAME, 1.5F, 6.0F, BlockSoundGroup.STONE, "green_lit", true, "ss_green_lit_brazier");

    public static void init() {
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("soggy_swamp"))).register(content -> {
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
