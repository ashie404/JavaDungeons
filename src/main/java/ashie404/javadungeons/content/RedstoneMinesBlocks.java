package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class RedstoneMinesBlocks {

    // crystals
    public static final Block RM_CRYSTALS = 
        RegistryHelper.registerBlock(new Crystal(Material.CRYSTAL), "rm_crystals");
    public static final Block RM_REDSTONE_CRYSTALS = 
        RegistryHelper.registerBlock(new RedstoneCrystal(Material.CRYSTAL), "rm_redstone_crystals");

    // dirt related
    public static final Block RM_SNOWY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "rm_snowy_dirt");

    // plants
    public static final Block RM_SHRUB = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "rm_shrub");

    // floor tiles
    public static final Block RM_DARK_FLOOR_TILE =
        RegistryHelper.registerBlock(new Block(Material.DARK_STONE), "rm_dark_floor_tile");
    public static final Block RM_DIRTY_DARK_FLOOR_TILE =
        RegistryHelper.registerBlock(new Block(Material.DARK_STONE), "rm_dirty_dark_floor_tile");

    // dark quartz
    public static final SlabStairBlock RM_DARK_QUARTZ = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.DARK_QUARTZ), "rm_dark_quartz");
    public static final SlabStairBlock RM_DARK_QUARTZ_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.DARK_QUARTZ), "rm_dark_quartz_tiles");
    public static final Block RM_DARK_QUARTZ_PILLAR = 
        RegistryHelper.registerBlock(new PillarBlock(Material.DARK_QUARTZ), "rm_dark_quartz_pillar");
    public static final Block RM_CHISELED_DARK_QUARTZ = 
        RegistryHelper.registerBlock(new Block(Material.DARK_QUARTZ), "rm_chiseled_dark_quartz");
    public static final Block RM_CHISELED_DARK_QUARTZ_1 = 
        RegistryHelper.registerBlock(new Block(Material.DARK_QUARTZ), "rm_chiseled_dark_quartz_1");
    
    public static void init() {
        JavaDungeons.log.info("Registering Redstone Mines Blocks!");
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("redstone_mines"))).register(content -> {
            content.add(RM_CRYSTALS);
            content.add(RM_REDSTONE_CRYSTALS);
            content.add(RM_SNOWY_DIRT);
            content.add(RM_SHRUB);
            content.add(RM_DARK_FLOOR_TILE);
            content.add(RM_DIRTY_DARK_FLOOR_TILE);
            content.add(RM_DARK_QUARTZ.base);
            content.add(RM_DARK_QUARTZ.slab);
            content.add(RM_DARK_QUARTZ.stairs);
            content.add(RM_DARK_QUARTZ_TILES.base);
            content.add(RM_DARK_QUARTZ_TILES.slab);
            content.add(RM_DARK_QUARTZ_TILES.stairs);
            content.add(RM_DARK_QUARTZ_PILLAR);
            content.add(RM_CHISELED_DARK_QUARTZ);
            content.add(RM_CHISELED_DARK_QUARTZ_1);
        });
    }
}