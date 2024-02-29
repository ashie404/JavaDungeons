package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class CoralRiseBlocks {

    // earth blocks
    public static final Block CR_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_dirt");
    public static final Block CR_GRASS_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_grass_block");
    public static final Block CR_GRASSY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_grassy_dirt");
    public static final Block CR_GRASSY_SAND =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_grassy_sand");
    public static final Block CR_GRASSY_GRAVEL =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_grassy_gravel");
    public static final Block CR_SANDY_GRAVEL =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_sandy_gravel");
    public static final Block CR_DIRTY_GRAVEL =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_dirty_gravel");
    public static final Block CR_GRAVEL_SAND =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_gravel_sand");
    public static final Block CR_SANDY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_sandy_dirt");
    public static final Block CR_FOSSIL_SAND =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_fossil_sand");

    // coral blocks
    public static final Block CR_TUBE_CORAL_GRASS =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_tube_coral_grass");
    public static final Block CR_DEAD_TUBE_CORAL_GRASS =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dead_tube_coral_grass");
    public static final Block CR_FIRE_CORAL_GRASS =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_fire_coral_grass");
    public static final Block CR_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_tube_coral_block");
    public static final Block CR_DEAD_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dead_tube_coral_block");
    public static final Block CR_FIRE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_fire_coral_block");
    public static final Block CR_MIXED_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_mixed_coral_block");
    public static final Block CR_DIRTY_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dirty_tube_coral_block");
    public static final Block CR_DIRTY_DEAD_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dirty_dead_tube_coral_block");
    public static final Block CR_DIRTY_FIRE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dirty_fire_coral_block");
    public static final Block CR_SANDY_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_sandy_tube_coral_block");
    public static final Block CR_SANDY_FIRE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_sandy_fire_coral_block");
    public static final Block CR_GRASSY_FIRE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_grassy_fire_coral_block");

    // stone blocks
    public static final SlabStairBlock CR_COBBLESTONE =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.COBBLESTONE), "cr_cobblestone");
    public static final SlabStairBlock CR_DARK_COBBLESTONE =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.COBBLESTONE), "cr_dark_cobblestone");
    public static final Block CR_DIRTY_DARK_COBBLESTONE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "cr_dirty_dark_cobblestone");
    public static final Block CR_MOSSY_DARK_COBBLESTONE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "cr_mossy_dark_cobblestone");
    public static final Block CR_GRAVELLY_DARK_COBBLESTONE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "cr_gravelly_dark_cobblestone");
    public static final Block CR_SANDY_DARK_COBBLESTONE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "cr_sandy_dark_cobblestone");
    public static final Block CR_ANDESITE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_andesite");
    public static final Block CR_SANDY_ANDESITE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_andesite");
    public static final SlabStairBlock CR_STONE_BRICKS =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cr_stone_bricks");
    public static final Block CR_MOSSY_STONE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_mossy_stone_bricks");
    public static final Block CR_CHISELED_STONE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_chiseled_stone_bricks");
    public static final Block CR_MOSSY_CHISELED_STONE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_mossy_chiseled_stone_bricks");
    public static final Block CR_FLOOR_TILE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_floor_tile");
    public static final Block CR_DIRTY_FLOOR_TILE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_dirty_floor_tile");

    // granite blocks
    public static final Block CR_POLISHED_GRANITE_FOSSIL =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_polished_granite_fossil");
    public static final Block CR_DIRTY_POLISHED_GRANITE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_dirty_polished_granite");
    public static final Block CR_SANDY_POLISHED_GRANITE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_polished_granite");
    public static final SlabStairBlock CR_GRANITE_BRICKS =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cr_granite_bricks");
    public static final Block CR_CRACKED_GRANITE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_cracked_granite_bricks");
    public static final Block CR_SANDY_GRANITE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_granite_bricks");
    public static final Block CR_CHISELED_GRANITE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_chiseled_granite");
    public static final SlabStairBlock CR_GRANITE_TILES =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cr_granite_tiles");
    public static final Block CR_DIRTY_GRANITE_TILES =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_dirty_granite_tiles");
    public static final Block CR_SANDY_GRANITE_TILES =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_granite_tiles");
    public static final Block CR_GRASSY_GRANITE_TILES =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_grassy_granite_tiles");
    public static final SlabStairBlock CR_GRANITE_SHINGLES =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cr_granite_shingles");
    public static final Block CR_PRISMARINE_GRANITE_PILLAR =
        RegistryHelper.registerBlock(new PillarBlock(Material.STONE), "cr_prismarine_granite_pillar");

    // prismarine blocks
    public static final Block CR_PRISMARINE_BOOKSHELF =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_prismarine_bookshelf");
    public static final Block CR_PRISMARINE_PILLAR =
        RegistryHelper.registerBlock(new PillarBlock(Material.STONE), "cr_prismarine_pillar");
    public static final Block CR_DIRTY_PRISMARINE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_dirty_prismarine");
    public static final Block CR_DIRTY_PRISMARINE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_dirty_prismarine_bricks");
    public static final Block CR_GRAVELLY_PRISMARINE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_gravelly_prismarine");
    public static final Block CR_GRAVELLY_PRISMARINE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_gravelly_prismarine_bricks");
    public static final Block CR_SANDY_PRISMARINE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_prismarine");
    public static final Block CR_PRISMARINE_FLOOR_TILE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_prismarine_floor_tile");
    public static final Block CR_SANDY_PRISMARINE_FLOOR_TILE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_prismarine_floor_tile");
    public static final SlabStairBlock CR_PRISMARINE_BRICK =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cr_prismarine_brick");
    public static final Block CR_PRISMARINE_BRICK_PILLAR =
        RegistryHelper.registerBlock(new PillarBlock(Material.STONE), "cr_prismarine_brick_pillar");
    public static final Block CR_WEATHERED_PRISMARINE_BRICK =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_weathered_prismarine_brick");
    public static final Block CR_SANDY_PRISMARINE_BRICK =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_prismarine_brick");
    public static final SlabStairBlock CR_PRISMARINE_TILE =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cr_prismarine_tile");
    public static final Block CR_SANDY_PRISMARINE_TILE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_prismarine_tile");
    public static final SlabStairBlock CR_PRISMARINE_SHINGLES =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cr_prismarine_shingles");
    public static final Block CR_SANDY_PRISMARINE_SHINGLES =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_prismarine_shingles");
    public static final SlabStairBlock CR_GRANITE_PRISMARINE_SHINGLES =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cr_granite_prismarine_shingles");
    public static final Block CR_ADORNED_PRISMARINE_TILE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_adorned_prismarine_tile");

    // wood blocks
    public static final Block CR_MOSSY_JUNGLE_PLANKS =
        RegistryHelper.registerBlock(new Block(Material.WOOD), "cr_mossy_jungle_planks");
    public static final Block CR_SANDY_JUNGLE_PLANKS =
        RegistryHelper.registerBlock(new Block(Material.WOOD), "cr_sandy_jungle_planks");
    public static final Block CR_SANDY_DARK_OAK_PLANKS =
        RegistryHelper.registerBlock(new Block(Material.WOOD), "cr_sandy_dark_oak_planks");



    public static void init() {
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("coral_rise"))).register(content -> {
            
        });
    }
}