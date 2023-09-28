package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

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
        RM_CRYSTALS = new DungeonsCrystal(3.0F, 6.0F, BlockSoundGroup.STONE, "rm_crystals");
        RM_REDSTONE_CRYSTALS = new DungeonsRedstoneCrystal(3.0F, 6.0F, BlockSoundGroup.STONE, "rm_redstone_crystals");

        // dirt related
        RM_SNOWY_DIRT = new DungeonsBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "rm_snowy_dirt");

        // plants
        RM_SHRUB = new DungeonsPlant(0.0F, 0.0F, BlockSoundGroup.GRASS, "rm_shrub");

        // dark quartz
        RM_DARK_QUARTZ = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_dark_quartz", "rm_dark_quartz_slab", "rm_dark_quartz_stairs");
        RM_DARK_QUARTZ_TILES = new DungeonsSlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_dark_quartz_tiles", "rm_dark_quartz_tiles_slab", "rm_dark_quartz_tiles_stairs");
        RM_DARK_QUARTZ_PILLAR = new DungeonsPillar(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_dark_quartz_pillar");
        RM_CHISELED_DARK_QUARTZ = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_chiseled_dark_quartz");
        RM_CHISELED_DARK_QUARTZ_1 = new DungeonsBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_chiseled_dark_quartz_1");

        // add to item groups
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(JavaDungeons.MOD_ID, "redstone_mines"))).register(content -> {
            content.add(RM_CRYSTALS.blockItem);
            content.add(RM_REDSTONE_CRYSTALS.blockItem);
            content.add(RM_SNOWY_DIRT.blockItem);
            content.add(RM_SHRUB.blockItem);
            content.add(RM_DARK_QUARTZ.base.blockItem);
            content.add(RM_DARK_QUARTZ.slab.blockItem);
            content.add(RM_DARK_QUARTZ.stairs.blockItem);
            content.add(RM_DARK_QUARTZ_TILES.base.blockItem);
            content.add(RM_DARK_QUARTZ_TILES.slab.blockItem);
            content.add(RM_DARK_QUARTZ_TILES.stairs.blockItem);
            content.add(RM_DARK_QUARTZ_PILLAR.blockItem);
            content.add(RM_CHISELED_DARK_QUARTZ.blockItem);
            content.add(RM_CHISELED_DARK_QUARTZ_1.blockItem);
        });
    }
}