package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class DesertTempleBlocks {

    // andesite related
    public static final SlabStairBlock DT_SANDY_ANDESITE = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dt_sandy_andesite");
    public static final Block DT_CHISELED_SANDY_ANDESITE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "dt_chiseled_sandy_andesite");
    public static final Block DT_CHISELED_SANDY_ANDESITE_2 = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "dt_chiseled_sandy_andesite_2");
    public static final Block DT_SANDY_ANDESITE_PILLAR = 
        RegistryHelper.registerBlock(new PillarBlock(Material.STONE), "dt_sandy_andesite_pillar");

    // stone brick related
    public static final SlabStairBlock DT_SANDY_STONE_BRICKS = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dt_sandy_stone_bricks", "dt_sandy_stone_brick_slab", "dt_sandy_stone_brick_stairs");
    public static final SlabStairBlock DT_SANDY_STONE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dt_sandy_stone_tiles");
    public static final Block DT_CRACKED_SANDY_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "dt_cracked_sandy_stone_bricks");
    public static final Block DT_CHISELED_SANDY_STONE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "dt_chiseled_sandy_stone");

    // stone related
    public static final Block DT_SANDY_COBBLESTONE = 
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dt_sandy_cobblestone");

    public static void init() {
        // add blocks to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("desert_temple"))).register(content -> {
            content.add(DT_SANDY_ANDESITE.base);
            content.add(DT_SANDY_ANDESITE.slab);
            content.add(DT_SANDY_ANDESITE.stairs);
            content.add(DT_CHISELED_SANDY_ANDESITE);
            content.add(DT_CHISELED_SANDY_ANDESITE_2);
            content.add(DT_SANDY_ANDESITE_PILLAR);
            content.add(DT_SANDY_STONE_BRICKS.base);
            content.add(DT_SANDY_STONE_BRICKS.slab);
            content.add(DT_SANDY_STONE_BRICKS.stairs);
            content.add(DT_CRACKED_SANDY_STONE_BRICKS);
            content.add(DT_SANDY_STONE_TILES.base);
            content.add(DT_SANDY_STONE_TILES.slab);
            content.add(DT_SANDY_STONE_TILES.stairs);
            content.add(DT_CHISELED_SANDY_STONE);
            content.add(DT_SANDY_COBBLESTONE);
        });
    }
}