package juniebyte.javadungeons.content;

import io.github.vampirestudios.vampirelib.utils.registry.WoodRegistry;
import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import juniebyte.javadungeons.blocks.saplings.SwampSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SoggySwampBlocks {

    // ground related
    public static Block SS_GRASS_BLOCK;
    public static Block SS_DIRT_PATH;
    public static Block SS_DIRT;

    // stone related
    public static Block SS_MOSSY_STONE;
    public static Block SS_MOSSY_COBBLESTONE;
    public static Block SS_MOSSY_STONE_BRICKS;
    public static Block SS_MOSSY_POLISHED_ANDESITE;
    public static Block SS_MOSSY_CHISELED_STONE_BRICKS;

    // swamp tree
    public static Block SS_SWAMP_LOG;
    public static Block SS_SWAMP_LEAVES;
    public static Block SS_SWAMP_PLANKS;
    public static Block SS_SWAMP_SAPLING;

    // bridge related
    public static Block SS_BRIDGE_PLANKS;
    public static Block SS_ROPE_FENCE;

    // braziers
    public static Block SS_UNLIT_BRAZIER;
    public static Block SS_LIT_BRAZIER;
    public static Block SS_GREEN_LIT_BRAZIER;

    //utils
    public static Block SS_WITCH_POLE;

    public static void init() {
        // ground related
        SS_GRASS_BLOCK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.SOLID_ORGANIC, 0.6F, 0.6F, true, BlockSoundGroup.GRASS, Blocks.DIRT_PATH), "ss_grass_block", JavaDungeons.SOGGY_SWAMP);
        SS_DIRT_PATH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "ss_dirt_path", JavaDungeons.SOGGY_SWAMP);
        SS_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, true, BlockSoundGroup.GRAVEL, SS_DIRT_PATH), "ss_dirt", JavaDungeons.SOGGY_SWAMP);

        // stone related
        SS_MOSSY_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ss_mossy_stone", JavaDungeons.SOGGY_SWAMP);
        SS_MOSSY_COBBLESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ss_mossy_cobblestone", JavaDungeons.SOGGY_SWAMP);
        SS_MOSSY_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ss_mossy_stone_bricks", JavaDungeons.SOGGY_SWAMP);
        SS_MOSSY_POLISHED_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ss_mossy_polished_andesite", JavaDungeons.SOGGY_SWAMP);
        SS_MOSSY_CHISELED_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "ss_mossy_chiseled_stone_bricks", JavaDungeons.SOGGY_SWAMP);

        // swamp tree
        WoodRegistry ssSwamp = WoodRegistry.of(new Identifier(JavaDungeons.MOD_ID, "ss_swamp"), new SwampSaplingGenerator())
                .log().strippedLog().wood().strippedWood().planks().stairs().slab().sapling().shouldGenerateAssets().build();
        SS_SWAMP_LOG = ssSwamp.getLog();
        SS_SWAMP_LEAVES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsLeaves(), "ss_swamp_leaves");
        SS_SWAMP_PLANKS = ssSwamp.getPlanks();
        SS_SWAMP_SAPLING = ssSwamp.getSapling();

        // bridge related
        SS_BRIDGE_PLANKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsTopSlab(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "ss_bridge_planks", JavaDungeons.SOGGY_SWAMP);
        SS_ROPE_FENCE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsFence(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "ss_rope_fence", JavaDungeons.SOGGY_SWAMP);

        // braziers
        SS_UNLIT_BRAZIER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBrazier(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, "unlit", true), "ss_unlit_brazier", JavaDungeons.SOGGY_SWAMP);
        SS_LIT_BRAZIER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBrazier(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, "lit", true), "ss_lit_brazier", JavaDungeons.SOGGY_SWAMP);
        SS_GREEN_LIT_BRAZIER = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBrazier(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, "green_lit", true), "ss_green_lit_brazier", JavaDungeons.SOGGY_SWAMP);

        //utils
        SS_WITCH_POLE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsWitchPole(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD), "ss_witch_pole", JavaDungeons.SOGGY_SWAMP);
    }
}
