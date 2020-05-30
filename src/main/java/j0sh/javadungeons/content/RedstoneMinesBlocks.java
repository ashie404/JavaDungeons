package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.*;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class RedstoneMinesBlocks {

    //Crystals
    public static DungeonsCrystal RM_CRYSTALS;
    public static DungeonsRedstoneCrystal RM_REDSTONE_CRYSTALS;

    // dirt related
    public static DungeonsBlock RM_SNOWY_DIRT;

    // plants
    public static DungeonsPlant RM_SHRUB;

    // dark quartz
    public static DungeonsSlabStairBlock RM_DARK_QUARTZ;
    public static DungeonsSlabStairBlock RM_DARK_QUARTZ_TILES;
    public static DungeonsPillar RM_DARK_QUARTZ_PILLAR;
    public static DungeonsBlock RM_CHISELED_DARK_QUARTZ;
    public static DungeonsBlock RM_CHISELED_DARK_QUARTZ_1;

    public static void init() {
        //Crystals
        RM_CRYSTALS = new DungeonsCrystal(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_crystals");
        RM_REDSTONE_CRYSTALS = new DungeonsRedstoneCrystal(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_redstone_crystals");

        // dirt related
        RM_SNOWY_DIRT = new DungeonsBlock(Material.SOIL, BlockSoundGroup.GRAVEL, JavaDungeons.REDSTONE_MINES, "rm_snowy_dirt");

        // plants
        RM_SHRUB = new DungeonsPlant(Material.PLANT, BlockSoundGroup.GRASS, JavaDungeons.REDSTONE_MINES, "rm_shrub");

        // dark quartz
        RM_DARK_QUARTZ = new DungeonsSlabStairBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_dark_quartz", "rm_dark_quartz_slab", "rm_dark_quartz_stairs");
        RM_DARK_QUARTZ_TILES = new DungeonsSlabStairBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_dark_quartz_tiles", "rm_dark_quartz_tiles_slab", "rm_dark_quartz_tiles_stairs");
        RM_DARK_QUARTZ_PILLAR = new DungeonsPillar(Material.STONE, BlockSoundGroup.STONE, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, "rm_dark_quartz_pillar");
        RM_CHISELED_DARK_QUARTZ = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_chiseled_dark_quartz");
        RM_CHISELED_DARK_QUARTZ_1 = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_chiseled_dark_quartz_1");
    }

}