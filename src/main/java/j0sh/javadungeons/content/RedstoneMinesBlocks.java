package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.*;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class RedstoneMinesBlocks {

    // crystals
    public static DungeonsCrystal RM_CRYSTALS;
    public static DungeonsRedstoneCrystal RM_REDSTONE_CRYSTALS;

    // dirt related
    public static DungeonsBlock RM_SNOWY_DIRT;

    // plants
    public static DungeonsPlant RM_SHRUB;

    // dark quartz
    
    public static void init() {
        // crystals
        RM_CRYSTALS = new DungeonsCrystal(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_crystals");
        RM_REDSTONE_CRYSTALS = new DungeonsRedstoneCrystal(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_redstone_crystals");

        // dirt related
        RM_SNOWY_DIRT = new DungeonsBlock(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.REDSTONE_MINES, "rm_snowy_dirt");

        // plants
        RM_SHRUB = new DungeonsPlant(Material.PLANT, BlockSoundGroup.GRASS, JavaDungeons.REDSTONE_MINES, "rm_shrub");

        // dark quartz
    }
}