package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class RedstoneMinesBlocks {

    // crystals
    public static Block RM_CRYSTALS;
    public static Block RM_REDSTONE_CRYSTALS;

    // dirt related
    public static Block RM_SNOWY_DIRT;

    // plants
    public static Block RM_SHRUB;

    // dark quartz
    public static Block RM_DARK_QUARTZ;
    public static Block RM_DARK_QUARTZ_TILES;
    public static Block RM_DARK_QUARTZ_PILLAR;
    public static Block RM_CHISELED_DARK_QUARTZ;
    public static Block RM_CHISELED_DARK_QUARTZ_1;
    
    public static void init() {
        // crystals
        RM_CRYSTALS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsCrystal(Material.STONE, 3.0F, 6.0F, BlockSoundGroup.STONE), "rm_crystals", JavaDungeons.REDSTONE_MINES);
        RM_REDSTONE_CRYSTALS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsRedstoneCrystal(Material.STONE, 3.0F, 6.0F, BlockSoundGroup.STONE), "rm_redstone_crystals", JavaDungeons.REDSTONE_MINES);

        // dirt related
        RM_SNOWY_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "rm_snowy_dirt", JavaDungeons.REDSTONE_MINES);

        // plants
        RM_SHRUB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPlant(Material.PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS), "rm_shrub", JavaDungeons.REDSTONE_MINES);

        // dark quartz
        RM_DARK_QUARTZ = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "rm_dark_quartz", JavaDungeons.REDSTONE_MINES);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "rm_dark_quartz_slab", JavaDungeons.REDSTONE_MINES);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, RM_DARK_QUARTZ), "rm_dark_quartz_stairs", JavaDungeons.REDSTONE_MINES);
        RM_DARK_QUARTZ_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "rm_dark_quartz_tiles", JavaDungeons.REDSTONE_MINES);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE),"rm_dark_quartz_tiles_slab", JavaDungeons.REDSTONE_MINES);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, RM_DARK_QUARTZ_TILES), "rm_dark_quartz_tiles_stairs", JavaDungeons.REDSTONE_MINES);
        RM_DARK_QUARTZ_PILLAR = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPillar(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "rm_dark_quartz_pillar", JavaDungeons.REDSTONE_MINES);
        RM_CHISELED_DARK_QUARTZ = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "rm_chiseled_dark_quartz", JavaDungeons.REDSTONE_MINES);
        RM_CHISELED_DARK_QUARTZ_1 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "rm_chiseled_dark_quartz_1", JavaDungeons.REDSTONE_MINES);
    }
}