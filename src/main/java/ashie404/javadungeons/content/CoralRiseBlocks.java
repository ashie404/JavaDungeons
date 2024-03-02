package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

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

    // plants
    public static final Block CR_SEA_VINE =
        RegistryHelper.registerBlock(new UnderwaterVine(FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_sea_vine");
    public static final Block CR_WATER_SHRUB =
        RegistryHelper.registerBlock(new UnderwaterPlant(0, Material.PLANT), "cr_water_shrub");
    public static final Block CR_SEAWEED =
        RegistryHelper.registerBlock(new UnderwaterPlant(0, FabricBlockSettings.copyOf(Material.OFFSET_XZ_PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_seaweed");
    public static final Block CR_TALL_SEAWEED =
        RegistryHelper.registerBlock(new UnderwaterTallPlant(FabricBlockSettings.copyOf(Material.OFFSET_XZ_PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_tall_seaweed");
    public static final Block CR_BUBBLE_WEED =
        RegistryHelper.registerBlock(new UnderwaterTallPlant(FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_bubble_weed");
    public static final Block CR_FIRE_CORAL =
        RegistryHelper.registerBlock(new UnderwaterPlant(0, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_fire_coral");
    public static final Block CR_TUBE_CORAL =
        RegistryHelper.registerBlock(new UnderwaterPlant(0, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_tube_coral");
    public static final Block CR_TALL_TUBE_CORAL =
        RegistryHelper.registerBlock(new UnderwaterTallPlant(FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_tall_tube_coral");
    public static final Block CR_BLUE_CORAL_FAN =
        RegistryHelper.registerBlock(new UnderwaterPlant(1, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_blue_coral_fan");
    public static final Block CR_YELLOW_CORAL_FAN =
        RegistryHelper.registerBlock(new UnderwaterPlant(1, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_yellow_coral_fan");
    public static final Block CR_LARGE_CORAL_COLONY =
        RegistryHelper.registerBlock(new UnderwaterPlant(2, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_large_coral_colony");
    public static final Block CR_RED_LUMINOUS_MUSHROOMS =
        RegistryHelper.registerBlock(new UnderwaterPlant(0, Material.PLANT), "cr_red_luminous_mushrooms");
    public static final Block CR_ORANGE_LUMINOUS_MUSHROOMS =
        RegistryHelper.registerBlock(new UnderwaterPlant(0, Material.PLANT), "cr_orange_luminous_mushrooms");
    public static final Block CR_LUMINOUS_CRYSTALS =
        RegistryHelper.registerBlock(new UnderwaterPlant(0, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD)), "cr_luminous_crystals");
    public static final Block CR_SHORT_RED_BUBBLE_CORAL =
        RegistryHelper.registerBlock(new UnderwaterTallPlant(1, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_short_red_bubble_coral");
    public static final Block CR_TALL_RED_BUBBLE_CORAL =
        RegistryHelper.registerBlock(new UnderwaterTallPlant(0, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_tall_red_bubble_coral");
    public static final Block CR_SHORT_YELLOW_BUBBLE_CORAL =
        RegistryHelper.registerBlock(new UnderwaterTallPlant(1, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_short_yellow_bubble_coral");
    public static final Block CR_TALL_YELLOW_BUBBLE_CORAL =
        RegistryHelper.registerBlock(new UnderwaterTallPlant(0, FabricBlockSettings.copyOf(Material.PLANT).sounds(BlockSoundGroup.WET_GRASS)), "cr_tall_yellow_bubble_coral");

    public static void init() {
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("coral_rise"))).register(content -> {
            content.add(CR_DIRT);
            content.add(CR_GRASS_BLOCK);
            content.add(CR_GRASSY_DIRT);
            content.add(CR_GRASSY_SAND);
            content.add(CR_GRASSY_GRAVEL);
            content.add(CR_SANDY_GRAVEL);
            content.add(CR_DIRTY_GRAVEL);
            content.add(CR_GRAVEL_SAND);
            content.add(CR_SANDY_DIRT);
            content.add(CR_FOSSIL_SAND);
            content.add(CR_TUBE_CORAL_GRASS);
            content.add(CR_DEAD_TUBE_CORAL_GRASS);
            content.add(CR_FIRE_CORAL_GRASS);
            content.add(CR_TUBE_CORAL_BLOCK);
            content.add(CR_DEAD_TUBE_CORAL_BLOCK);
            content.add(CR_FIRE_CORAL_BLOCK);
            content.add(CR_MIXED_CORAL_BLOCK);
            content.add(CR_DIRTY_TUBE_CORAL_BLOCK);
            content.add(CR_DIRTY_DEAD_TUBE_CORAL_BLOCK);
            content.add(CR_DIRTY_FIRE_CORAL_BLOCK);
            content.add(CR_SANDY_TUBE_CORAL_BLOCK);
            content.add(CR_SANDY_FIRE_CORAL_BLOCK);
            content.add(CR_GRASSY_FIRE_CORAL_BLOCK);
            content.add(CR_COBBLESTONE.base);
            content.add(CR_COBBLESTONE.slab);
            content.add(CR_COBBLESTONE.stairs);
            content.add(CR_DARK_COBBLESTONE.base);
            content.add(CR_DARK_COBBLESTONE.slab);
            content.add(CR_DARK_COBBLESTONE.stairs);
            content.add(CR_DIRTY_DARK_COBBLESTONE);
            content.add(CR_MOSSY_DARK_COBBLESTONE);
            content.add(CR_GRAVELLY_DARK_COBBLESTONE);
            content.add(CR_SANDY_DARK_COBBLESTONE);
            content.add(CR_ANDESITE);
            content.add(CR_SANDY_ANDESITE);
            content.add(CR_STONE_BRICKS.base);
            content.add(CR_STONE_BRICKS.slab);
            content.add(CR_STONE_BRICKS.stairs);
            content.add(CR_MOSSY_STONE_BRICKS);
            content.add(CR_CHISELED_STONE_BRICKS);
            content.add(CR_MOSSY_CHISELED_STONE_BRICKS);
            content.add(CR_FLOOR_TILE);
            content.add(CR_DIRTY_FLOOR_TILE);
            content.add(CR_POLISHED_GRANITE_FOSSIL );
            content.add(CR_DIRTY_POLISHED_GRANITE);
            content.add(CR_SANDY_POLISHED_GRANITE );
            content.add(CR_GRANITE_BRICKS.base);
            content.add(CR_GRANITE_BRICKS.slab);
            content.add(CR_GRANITE_BRICKS.stairs);
            content.add(CR_CRACKED_GRANITE_BRICKS);
            content.add(CR_SANDY_GRANITE_BRICKS );
            content.add(CR_CHISELED_GRANITE);
            content.add(CR_GRANITE_TILES.base);
            content.add(CR_GRANITE_TILES.slab);
            content.add(CR_GRANITE_TILES.stairs);
            content.add(CR_DIRTY_GRANITE_TILES);
            content.add(CR_SANDY_GRANITE_TILES);
            content.add(CR_GRASSY_GRANITE_TILES);
            content.add(CR_GRANITE_SHINGLES.base);
            content.add(CR_GRANITE_SHINGLES.slab);
            content.add(CR_GRANITE_SHINGLES.stairs);
            content.add(CR_PRISMARINE_GRANITE_PILLAR);
            content.add(CR_PRISMARINE_BOOKSHELF);
            content.add(CR_PRISMARINE_PILLAR);
            content.add(CR_DIRTY_PRISMARINE);
            content.add(CR_DIRTY_PRISMARINE_BRICKS);
            content.add(CR_GRAVELLY_PRISMARINE);
            content.add(CR_GRAVELLY_PRISMARINE_BRICKS);
            content.add(CR_SANDY_PRISMARINE );
            content.add(CR_PRISMARINE_FLOOR_TILE);
            content.add(CR_SANDY_PRISMARINE_FLOOR_TILE);
            content.add(CR_PRISMARINE_BRICK.base);
            content.add(CR_PRISMARINE_BRICK.slab);
            content.add(CR_PRISMARINE_BRICK.stairs);
            content.add(CR_PRISMARINE_BRICK_PILLAR);
            content.add(CR_WEATHERED_PRISMARINE_BRICK);
            content.add(CR_SANDY_PRISMARINE_BRICK);
            content.add(CR_PRISMARINE_TILE.base);
            content.add(CR_PRISMARINE_TILE.slab);
            content.add(CR_PRISMARINE_TILE.stairs);
            content.add(CR_SANDY_PRISMARINE_TILE);
            content.add(CR_PRISMARINE_SHINGLES.base);
            content.add(CR_PRISMARINE_SHINGLES.slab);
            content.add(CR_PRISMARINE_SHINGLES.stairs);
            content.add(CR_SANDY_PRISMARINE_SHINGLES);
            content.add(CR_GRANITE_PRISMARINE_SHINGLES.base);
            content.add(CR_GRANITE_PRISMARINE_SHINGLES.slab);
            content.add(CR_GRANITE_PRISMARINE_SHINGLES.stairs);
            content.add(CR_ADORNED_PRISMARINE_TILE);
            content.add(CR_MOSSY_JUNGLE_PLANKS);
            content.add(CR_SANDY_JUNGLE_PLANKS);
            content.add(CR_SANDY_DARK_OAK_PLANKS);
            content.add(CR_SEA_VINE);
            content.add(CR_WATER_SHRUB);
            content.add(CR_SEAWEED);
            content.add(CR_TALL_SEAWEED);
            content.add(CR_BUBBLE_WEED);
            content.add(CR_FIRE_CORAL);
            content.add(CR_TUBE_CORAL);
            content.add(CR_TALL_TUBE_CORAL);
            content.add(CR_BLUE_CORAL_FAN);
            content.add(CR_YELLOW_CORAL_FAN);
            content.add(CR_LARGE_CORAL_COLONY);
            content.add(CR_RED_LUMINOUS_MUSHROOMS);
            content.add(CR_ORANGE_LUMINOUS_MUSHROOMS);
            content.add(CR_LUMINOUS_CRYSTALS);
            content.add(CR_SHORT_RED_BUBBLE_CORAL);
            content.add(CR_TALL_RED_BUBBLE_CORAL);
            content.add(CR_SHORT_YELLOW_BUBBLE_CORAL);
            content.add(CR_TALL_YELLOW_BUBBLE_CORAL);
        });
    }
}