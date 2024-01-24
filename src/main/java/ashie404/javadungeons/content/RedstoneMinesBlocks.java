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
    public static Crystal RM_CRYSTALS;
    public static RedstoneCrystal RM_REDSTONE_CRYSTALS;

    // dirt related
    public static BaseBlock RM_SNOWY_DIRT;

    // plants
    public static Plant RM_SHRUB;

    // dark quartz
    public static SlabStairBlock RM_DARK_QUARTZ;
    public static SlabStairBlock RM_DARK_QUARTZ_TILES;
    public static Pillar RM_DARK_QUARTZ_PILLAR;
    public static BaseBlock RM_CHISELED_DARK_QUARTZ;
    public static BaseBlock RM_CHISELED_DARK_QUARTZ_1;
    
    public static void init() {
        // crystals
        RM_CRYSTALS = new Crystal(3.0F, 6.0F, BlockSoundGroup.STONE, "rm_crystals");
        RM_REDSTONE_CRYSTALS = new RedstoneCrystal(3.0F, 6.0F, BlockSoundGroup.STONE, "rm_redstone_crystals");

        // dirt related
        RM_SNOWY_DIRT = new BaseBlock(0.5F, 0.5F, BlockSoundGroup.GRAVEL, "rm_snowy_dirt");

        // plants
        RM_SHRUB = new Plant(0.0F, 0.0F, BlockSoundGroup.GRASS, "rm_shrub");

        // dark quartz
        RM_DARK_QUARTZ = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_dark_quartz", "rm_dark_quartz_slab", "rm_dark_quartz_stairs");
        RM_DARK_QUARTZ_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_dark_quartz_tiles", "rm_dark_quartz_tiles_slab", "rm_dark_quartz_tiles_stairs");
        RM_DARK_QUARTZ_PILLAR = new Pillar(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_dark_quartz_pillar");
        RM_CHISELED_DARK_QUARTZ = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_chiseled_dark_quartz");
        RM_CHISELED_DARK_QUARTZ_1 = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "rm_chiseled_dark_quartz_1");

        // add to item group
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