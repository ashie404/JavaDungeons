package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.*;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CreepingWinterBlocks {

    // ice-related
    public static DungeonsBlock CI_ICE;
    public static DungeonsBlock CI_ICE_BRICKS;

    // stone brick related
    public static DungeonsSlabStairBlock CI_SNOWY_STONE_TILES;
    public static DungeonsSlabStairBlock CI_SNOWY_STONE_TILES_1;

    // frozen wood
    public static DungeonsPillar CI_FROZEN_LOG;
    public static DungeonsLeaves CI_FROZEN_LEAVES;
    public static DungeonsSlabStairBlock CI_FROZEN_PLANKS;
    public static DungeonsBlock CI_SNOWY_FROZEN_PLANKS;
    public static DungeonsVine CI_FROZEN_VINE;

    public static void init() {
        // ice related
        CI_ICE = new DungeonsBlock(Material.ICE, 0.0F, 0.0F, BlockSoundGroup.GLASS, JavaDungeons.CREEPING_WINTER, "ci_ice");
        CI_ICE_BRICKS = new DungeonsBlock(Material.DENSE_ICE, 0.5F, 0.5F, BlockSoundGroup.STONE, JavaDungeons.CREEPING_WINTER, "ci_ice_bricks");

        // stone brick related
        CI_SNOWY_STONE_TILES = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.CREEPING_WINTER, "ci_snowy_stone_tiles", "ci_snowy_stone_tiles_slab", "ci_snowy_stone_tiles_stairs");
        CI_SNOWY_STONE_TILES_1 = new DungeonsSlabStairBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, JavaDungeons.CREEPING_WINTER, "ci_snowy_stone_tiles_1", "ci_snowy_stone_tiles_slab_1", "ci_snowy_stone_tiles_stairs_1");

        // frozen wood
        CI_FROZEN_LOG = new DungeonsPillar(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD, JavaDungeons.CREEPING_WINTER, "ci_frozen_log");
        CI_FROZEN_LEAVES = new DungeonsLeaves(Material.LEAVES, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.CREEPING_WINTER, "ci_frozen_leaves");
        CI_FROZEN_PLANKS = new DungeonsSlabStairBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD, JavaDungeons.CREEPING_WINTER, "ci_frozen_planks", "ci_frozen_plank_slab", "ci_frozen_plank_stairs");
        CI_SNOWY_FROZEN_PLANKS = new DungeonsBlock(Material.WOOD, 2.0F, 3.0F, BlockSoundGroup.WOOD, JavaDungeons.CREEPING_WINTER, "ci_snowy_frozen_planks");
        CI_FROZEN_VINE = new DungeonsVine(Material.REPLACEABLE_PLANT, 0.2F, 0.2F, BlockSoundGroup.GRASS, JavaDungeons.CREEPING_WINTER, "ci_frozen_vine");
    }
    
}