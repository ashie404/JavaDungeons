package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CobwebBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class DingyJungleBlocks {

    // grass, dirt & mud 
    public static final Block DJ_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new Block(Material.GRASS), "dj_grass_block");
    public static final Block DJ_MUDDY_GRASS =
        RegistryHelper.registerBlock(new Block(Material.GRASS), "dj_muddy_grass");
    public static final Block DJ_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "dj_dirt");
    public static final Block DJ_DIRT_LAYER =
        RegistryHelper.registerBlock(new LayeringBlock(Material.EARTH), "dj_dirt_layer");
    public static final Block DJ_DIRTY_MUD =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "dj_dirty_mud");
    public static final Block DJ_MUD =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "dj_mud");
    public static final Block DJ_GRASSY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "dj_grassy_dirt");
    public static final Block DJ_GRASSY_MUD =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "dj_grassy_mud");
    public static final Block DJ_DENSE_GRASSY_MUD =
        RegistryHelper.registerBlock(new Block(Material.GRASS), "dj_dense_grassy_mud");
    public static final Block DJ_ROCKY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "dj_rocky_dirt");
    public static final Block DJ_LEAFY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "dj_leafy_dirt");
    public static final Block DJ_MOSS =
        RegistryHelper.registerBlock(new Block(Material.MOSS), "dj_moss");
    
    // pebbles
    public static final Block DJ_PEBBLES =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_pebbles");
    public static final Block DJ_DIRTY_PEBBLES =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_dirty_pebbles");
    public static final Block DJ_MUDDY_PEBBLES =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_muddy_pebbles");
    public static final Block DJ_MOSSY_PEBBLES =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_mossy_pebbles");
    public static final Block DJ_GRASSY_PEBBLES =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_grassy_pebbles");
    public static final Block DJ_SMOLDERING_PEBBLES =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_smoldering_pebbles");
    
    // stones
    public static final Block DJ_OCELOT_STONE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "dj_ocelot_stone");
    public static final Block DJ_CHISELED_STONE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "dj_chiseled_stone");
    public static final Block DJ_DINGY_CHISELED_STONE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "dj_dingy_chiseled_stone");
    public static final Block DJ_MOSSY_CHISELED_STONE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "dj_mossy_chiseled_stone");
    public static final Block DJ_STONE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "dj_stone_bricks");
    public static final Block DJ_MOSSY_STONE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.STONE), "dj_mossy_stone_bricks");
    public static final Block DJ_CARVED_STONE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "dj_carved_stone");

    // metals
    public static final Block DJ_GOLD_BLOCK =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.METAL).mapColor(MapColor.YELLOW)), "dj_gold_block");
    public static final Block DJ_MOSSY_GOLD_BLOCK =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.METAL).mapColor(MapColor.YELLOW)), "dj_mossy_gold_block");
    
    // stone tiles
    public static final SlabStairBlock DJ_STONE_TILES =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dj_stone_tiles");
    public static final Block DJ_STONE_TILES_WALL =
        RegistryHelper.registerBlock(new WallBlock(Material.STONE), "dj_stone_tiles_wall");
    public static final SlabStairBlock DJ_DIRTY_STONE_TILES =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dj_dirty_stone_tiles");
    public static final SlabStairBlock DJ_DIRTY_STONE_TILES_1 =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dj_dirty_stone_tiles_1", "dj_dirty_stone_tiles_slab_1", "dj_dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock DJ_DIRTY_STONE_TILES_2 =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "dj_dirty_stone_tiles_2", "dj_dirty_stone_tiles_slab_2", "dj_dirty_stone_tiles_stairs_2");
    
    // bricks
    public static final Block DJ_BRICKS = 
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_bricks");
    public static final Block DJ_SLIGHTLY_MOSSY_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_slightly_mossy_bricks");
    public static final Block DJ_MOSSY_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_mossy_bricks");
    public static final Block DJ_LARGE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_large_bricks");
    public static final Block DJ_SMOOTH_LARGE_BRICKS =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_smooth_large_bricks");
    
    // stone floors
    public static final Block DJ_BLUE_GLAZED_STONE_FLOOR =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_blue_glazed_stone_floor");
    public static final Block DJ_DIRTY_BLUE_GLAZED_STONE_FLOOR =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_dirty_blue_glazed_stone_floor");
    public static final Block DJ_YELLOW_GLAZED_STONE_FLOOR =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_yellow_glazed_stone_floor");
    
    // tiles
    public static final Block DJ_TILE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_tile");
    public static final Block DJ_CRACKED_TILE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_cracked_tile");
    public static final Block DJ_DIRTY_CRACKED_TILE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_dirty_cracked_tile");
    public static final Block DJ_GOLD_EMBEDDED_TILE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_gold_embedded_tile");
    public static final Block DJ_EMBOSSED_TILE =
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "dj_embossed_tile");
    // dingy quartz blocks
    public static final Block DJ_DINGY_QUARTZ_TILE =
        RegistryHelper.registerBlock(new Block(Material.QUARTZ), "dj_dingy_quartz_tile");
    public static final Block DJ_DINGY_QUARTZ_TILES =
        RegistryHelper.registerBlock(new Block(Material.QUARTZ), "dj_dingy_quartz_tiles");
    public static final Block DJ_DINGY_QUARTZ_PILLAR =
        RegistryHelper.registerBlock(new PillarBlock(Material.QUARTZ), "dj_dingy_quartz_pillar");
    public static final Block DJ_CHISELED_DINGY_QUARTZ =
        RegistryHelper.registerBlock(new Block(Material.QUARTZ), "dj_chiseled_dingy_quartz");
    
    // plants
    public static final Block DJ_GRASS =
        RegistryHelper.registerBlock(new Plant(Material.REPLACABLE_PLANT), "dj_grass");
    public static final Block DJ_RED_FERN =
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "dj_red_fern");
    public static final Block DJ_TALL_FERN =
        RegistryHelper.registerBlock(new TallPlant(Material.REPLACABLE_PLANT), "dj_tall_fern");
    public static final Block DJ_TALL_GRASS =
        RegistryHelper.registerBlock(new TallPlant(Material.REPLACABLE_PLANT), "dj_tall_grass");
    public static final Block DJ_SHRUB =
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "dj_shrub");
    public static final Block DJ_DEAD_SHRUB =
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "dj_dead_shrub");
    public static final Block DJ_BUSH =
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "dj_bush");
    public static final Block DJ_GLOWING_MUSHROOMS =
        RegistryHelper.registerBlock(new Plant(FabricBlockSettings.copyOf(Material.OFFSET_XZ_PLANT).sounds(BlockSoundGroup.WET_GRASS).luminance(6)), "dj_glowing_mushrooms");
    public static final Block DJ_LARGE_JUNGLE_PLANT =
        RegistryHelper.registerBlock(new JunglePlant(Material.PLANT), "dj_large_jungle_plant");
    public static final Block DJ_LARGE_JUNGLE_FERN =
        RegistryHelper.registerBlock(new JunglePlant(Material.PLANT), "dj_large_jungle_fern");
    public static final Block DJ_FLOWERING_JUNGLE_PLANT =
        RegistryHelper.registerBlock(new JunglePlant(Material.PLANT), "dj_flowering_jungle_plant");
    public static final Block DJ_LARGE_JUNGLE_FLOWER =
        RegistryHelper.registerBlock(new JunglePlant(Material.PLANT), "dj_large_jungle_flower");
    public static final Block DJ_PINK_JUNGLE_FLOWER =
        RegistryHelper.registerBlock(new JunglePlant(Material.PLANT), "dj_pink_jungle_flower");
    public static final Block DJ_GLOW_MUSHROOM = 
        RegistryHelper.registerBlock(new GlowMushroom(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.SLIME)), "dj_glow_mushroom");
    
    // cobweb
    public static final Block DJ_COBWEB =
        RegistryHelper.registerBlock(new CobwebBlock(Material.COBWEB), "dj_cobweb");

    // Jungle Wood (regular)
    public static final Block DJ_JUNGLE_LOG =
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "dj_jungle_log");
    public static final Block DJ_JUNGLE_WOOD =
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "dj_jungle_wood");
    public static final Block DJ_GLOWING_JUNGLE_LOG =
        RegistryHelper.registerBlock(new PillarBlock(FabricBlockSettings.copyOf(Material.LOG).luminance(6)), "dj_glowing_jungle_log");
    public static final Block DJ_JUNGLE_ROOT =
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "dj_jungle_root");
    public static final SlabStairBlock DJ_JUNGLE_PLANKS =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.WOOD), "dj_jungle_planks");
    public static final Block DJ_JUNGLE_FENCE =
        RegistryHelper.registerBlock(new FenceBlock(Material.WOOD), "dj_jungle_fence");
    public static final Block DJ_MOSSY_JUNGLE_PLANKS =
        RegistryHelper.registerBlock(new Block(Material.WOOD), "dj_mossy_jungle_planks");
    public static final Block DJ_DIRTY_JUNGLE_PLANKS =
        RegistryHelper.registerBlock(new Block(Material.WOOD), "dj_dirty_jungle_planks");
    public static final Block DJ_MUDDY_JUNGLE_PLANKS =
        RegistryHelper.registerBlock(new Block(Material.WOOD), "dj_muddy_jungle_planks");

    // Jungle Oak
    public static final Block DJ_JUNGLE_OAK_LOG =
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "dj_jungle_oak_log"); 
    public static final Block DJ_JUNGLE_OAK_WOOD =
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "dj_jungle_oak_wood");
    public static final Block DJ_MOSSY_JUNGLE_OAK_WOOD =
        RegistryHelper.registerBlock(new PillarBlock(Material.LOG), "dj_mossy_jungle_oak_wood");
    public static final Block DJ_GLOWING_JUNGLE_OAK_LOG =
        RegistryHelper.registerBlock(new PillarBlock(FabricBlockSettings.copyOf(Material.LOG).luminance(6)), "dj_glowing_jungle_oak_log");
    public static final SlabStairBlock DJ_JUNGLE_OAK_PLANKS =
        RegistryHelper.registerBSS(new SlabStairBlock(Material.WOOD), "dj_jungle_oak_planks");
    public static final Block DJ_JUNGLE_OAK_FENCE =
        RegistryHelper.registerBlock(new FenceBlock(Material.WOOD), "dj_jungle_oak_fence");
    public static final Block DJ_DIRTY_JUNGLE_OAK_PLANKS =
        RegistryHelper.registerBlock(new Block(Material.WOOD), "dj_dirty_jungle_oak_planks");

    // Leaf variants
    public static final Block DJ_JUNGLE_LEAVES =
        RegistryHelper.registerBlock(new Leaves(Material.LEAVES), "dj_jungle_leaves");

    // Other
    public static final Block DJ_TIKI_TORCH =
        RegistryHelper.registerBlock(new TikiTorch(FabricBlockSettings.copyOf(Material.WOOD).luminance(14)), "dj_tiki_torch");

    public static void init() {
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("dingy_jungle"))).register(content -> {
            content.add(DJ_GRASS_BLOCK); 
            content.add(DJ_MUDDY_GRASS);
            content.add(DJ_DIRT);
            content.add(DJ_DIRT_LAYER);
            content.add(DJ_DIRTY_MUD);
            content.add(DJ_MUD);
            content.add(DJ_GRASSY_DIRT);
            content.add(DJ_GRASSY_MUD);
            content.add(DJ_DENSE_GRASSY_MUD);
            content.add(DJ_ROCKY_DIRT);
            content.add(DJ_LEAFY_DIRT);
            content.add(DJ_MOSS);
            content.add(DJ_PEBBLES);
            content.add(DJ_DIRTY_PEBBLES);
            content.add(DJ_MUDDY_PEBBLES);
            content.add(DJ_MOSSY_PEBBLES);
            content.add(DJ_GRASSY_PEBBLES);
            content.add(DJ_SMOLDERING_PEBBLES);
            content.add(DJ_OCELOT_STONE);
            content.add(DJ_CHISELED_STONE);
            content.add(DJ_DINGY_CHISELED_STONE);
            content.add(DJ_MOSSY_CHISELED_STONE);
            content.add(DJ_STONE_BRICKS);
            content.add(DJ_MOSSY_STONE_BRICKS);
            content.add(DJ_CARVED_STONE);
            content.add(DJ_STONE_TILES.base);
            content.add(DJ_STONE_TILES.slab);
            content.add(DJ_STONE_TILES.stairs);
            content.add(DJ_STONE_TILES_WALL);
            content.add(DJ_DIRTY_STONE_TILES.base);
            content.add(DJ_DIRTY_STONE_TILES.slab);
            content.add(DJ_DIRTY_STONE_TILES.stairs);
            content.add(DJ_DIRTY_STONE_TILES_1.base);
            content.add(DJ_DIRTY_STONE_TILES_1.slab);
            content.add(DJ_DIRTY_STONE_TILES_1.stairs);
            content.add(DJ_DIRTY_STONE_TILES_2.base);
            content.add(DJ_DIRTY_STONE_TILES_2.slab);
            content.add(DJ_DIRTY_STONE_TILES_2.stairs);
            content.add(DJ_BRICKS);
            content.add(DJ_SLIGHTLY_MOSSY_BRICKS);
            content.add(DJ_MOSSY_BRICKS);
            content.add(DJ_LARGE_BRICKS);
            content.add(DJ_SMOOTH_LARGE_BRICKS);
            content.add(DJ_GOLD_BLOCK);
            content.add(DJ_MOSSY_GOLD_BLOCK);
            content.add(DJ_BLUE_GLAZED_STONE_FLOOR);
            content.add(DJ_DIRTY_BLUE_GLAZED_STONE_FLOOR);
            content.add(DJ_YELLOW_GLAZED_STONE_FLOOR);
            content.add(DJ_TILE);
            content.add(DJ_CRACKED_TILE);
            content.add(DJ_DIRTY_CRACKED_TILE);
            content.add(DJ_GOLD_EMBEDDED_TILE);
            content.add(DJ_EMBOSSED_TILE);
            content.add(DJ_DINGY_QUARTZ_TILE);
            content.add(DJ_DINGY_QUARTZ_TILES);
            content.add(DJ_DINGY_QUARTZ_PILLAR);
            content.add(DJ_CHISELED_DINGY_QUARTZ);
            content.add(DJ_GRASS);
            content.add(DJ_TALL_GRASS);
            content.add(DJ_RED_FERN);
            content.add(DJ_TALL_FERN);
            content.add(DJ_SHRUB);
            content.add(DJ_DEAD_SHRUB);
            content.add(DJ_BUSH);
            content.add(DJ_GLOWING_MUSHROOMS);
            content.add(DJ_GLOW_MUSHROOM);
            content.add(DJ_COBWEB);
            content.add(DJ_LARGE_JUNGLE_PLANT);
            content.add(DJ_LARGE_JUNGLE_FERN);
            content.add(DJ_FLOWERING_JUNGLE_PLANT);
            content.add(DJ_LARGE_JUNGLE_FLOWER);
            content.add(DJ_PINK_JUNGLE_FLOWER);
            content.add(DJ_TIKI_TORCH);
            content.add(DJ_JUNGLE_LOG);
            content.add(DJ_JUNGLE_WOOD);
            content.add(DJ_GLOWING_JUNGLE_LOG);
            content.add(DJ_JUNGLE_ROOT);
            content.add(DJ_JUNGLE_PLANKS.base);
            content.add(DJ_JUNGLE_PLANKS.slab);
            content.add(DJ_JUNGLE_PLANKS.stairs);
            content.add(DJ_JUNGLE_FENCE);
            content.add(DJ_MOSSY_JUNGLE_PLANKS);
            content.add(DJ_MUDDY_JUNGLE_PLANKS);
            content.add(DJ_DIRTY_JUNGLE_PLANKS);
            content.add(DJ_JUNGLE_LEAVES);
            content.add(DJ_JUNGLE_OAK_LOG);
            content.add(DJ_JUNGLE_OAK_WOOD);
            content.add(DJ_MOSSY_JUNGLE_OAK_WOOD);
            content.add(DJ_GLOWING_JUNGLE_OAK_LOG);
            content.add(DJ_JUNGLE_OAK_PLANKS.base);
            content.add(DJ_JUNGLE_OAK_PLANKS.slab);
            content.add(DJ_JUNGLE_OAK_PLANKS.stairs);
            content.add(DJ_JUNGLE_OAK_FENCE);
            content.add(DJ_DIRTY_JUNGLE_OAK_PLANKS);
        });
    }
}