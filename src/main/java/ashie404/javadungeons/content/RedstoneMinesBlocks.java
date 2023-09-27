package ashie404.javadungeons.content;

import ashie404.javadungeons.blocks.*;
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
    public static DungeonsSlabStairBlock RM_DARK_QUARTZ;
    public static DungeonsSlabStairBlock RM_DARK_QUARTZ_TILES;
    public static DungeonsPillar RM_DARK_QUARTZ_PILLAR;
    public static DungeonsBlock RM_CHISELED_DARK_QUARTZ;
    public static DungeonsBlock RM_CHISELED_DARK_QUARTZ_1;
    
    public static void init() {
        // crystals
        RM_CRYSTALS = new DungeonsCrystal(3.0F, 6.0F, BlockSoundGroup.STONE, ItemGroups.REDSTONE_MINES, "rm_crystals");
        RM_REDSTONE_CRYSTALS = new DungeonsRedstoneCrystal(3.0F, 6.0F, BlockSoundGroup.STONE, ItemGroups.REDSTONE_MINES, "rm_redstone_crystals");

        // dirt related
        RM_SNOWY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, ItemGroups.REDSTONE_MINES, "rm_snowy_dirt");

        // plants
        RM_SHRUB = new DungeonsPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, ItemGroups.REDSTONE_MINES, "rm_shrub");

        // dark quartz
        RM_DARK_QUARTZ = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.REDSTONE_MINES, "rm_dark_quartz", "rm_dark_quartz_slab", "rm_dark_quartz_stairs");
        RM_DARK_QUARTZ_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.REDSTONE_MINES, "rm_dark_quartz_tiles", "rm_dark_quartz_tiles_slab", "rm_dark_quartz_tiles_stairs");
        RM_DARK_QUARTZ_PILLAR = new DungeonsPillar(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.REDSTONE_MINES, "rm_dark_quartz_pillar");
        RM_CHISELED_DARK_QUARTZ = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.REDSTONE_MINES, "rm_chiseled_dark_quartz");
        RM_CHISELED_DARK_QUARTZ_1 = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, ItemGroups.REDSTONE_MINES, "rm_chiseled_dark_quartz_1");
    }
}