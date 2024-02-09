package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class DingyJungleBlocks {
    // grass, dirt & mud 
    public static final Block DJ_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.6F, 0.6F).sounds(BlockSoundGroup.GRASS)), "dj_grass_block");
    public static final Block DJ_MUDDY_GRASS =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.6F, 0.6F).sounds(BlockSoundGroup.GRASS)), "dj_muddy_grass");
    public static final Block DJ_DIRT =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)), "dj_dirt");
    public static final Block DJ_DIRTY_MUD =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)), "dj_dirty_mud");
    public static final Block DJ_MUD =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)), "dj_mud");
    public static final Block DJ_GRASSY_DIRT =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)), "dj_grassy_dirt");
    public static final Block DJ_GRASSY_MUD =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)), "dj_grassy_mud");
    public static final Block DJ_DENSE_GRASSY_MUD =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.6F, 0.6F).sounds(BlockSoundGroup.GRASS)), "dj_dense_grassy_mud");
    public static final Block DJ_ROCKY_DIRT =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)), "dj_rocky_dirt");
    
    // pebbles
    public static final Block DJ_PEBBLES =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_pebbles");
    public static final Block DJ_DIRTY_PEBBLES =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_dirty_pebbles");
    public static final Block DJ_GRASSY_PEBBLES =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_grassy_pebbles");
    
    // stones
    public static final Block DJ_OCELOT_STONE =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_ocelot_stone");
    public static final Block DJ_CHISELED_STONE =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_chiseled_stone");
    public static final Block DJ_DINGY_CHISELED_STONE =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_dingy_chiseled_stone");
    public static final Block DJ_MOSSY_CHISELED_STONE =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_mossy_chiseled_stone");
    public static final Block DJ_STONE_BRICKS =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_stone_bricks");
    public static final Block DJ_MOSSY_STONE_BRICKS =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_mossy_stone_bricks");

    // metals
    public static final Block DJ_GOLD_BLOCK =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL)), "dj_gold_block");
    
    // stone tiles
    public static final SlabStairBlock DJ_STONE_TILES =
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_stone_tiles");
    public static final SlabStairBlock DJ_DIRTY_STONE_TILES =
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_dirty_stone_tiles");
    public static final SlabStairBlock DJ_DIRTY_STONE_TILES_1 =
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_dirty_stone_tiles_1", "dj_dirty_stone_tiles_slab_1", "dj_dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock DJ_DIRTY_STONE_TILES_2 =
        RegistryHelper.registerBSS(new SlabStairBlock(FabricBlockSettings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_dirty_stone_tiles_2", "dj_dirty_stone_tiles_slab_2", "dj_dirty_stone_tiles_stairs_2");
    
    // bricks
    public static final Block DJ_BRICKS = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_bricks");
    public static final Block DJ_SLIGHTLY_MOSSY_BRICKS =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_slightly_mossy_bricks");
    public static final Block DJ_MOSSY_BRICKS =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_mossy_bricks");
    public static final Block DJ_LARGE_BRICKS =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_large_bricks");
    
    // stone floors
    public static final Block DJ_BLUE_GLAZED_STONE_FLOOR =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_blue_glazed_stone_floor");
    public static final Block DJ_DIRTY_BLUE_GLAZED_STONE_FLOOR =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_dirty_blue_glazed_stone_floor");
    public static final Block DJ_YELLOW_GLAZED_STONE_FLOOR =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_yellow_glazed_stone_floor");
    
    // tiles
    public static final Block DJ_TILE =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_tile");
    public static final Block DJ_CRACKED_TILE =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_cracked_tile");
    public static final Block DJ_GOLD_EMBEDDED_TILE =
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.create().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)), "dj_gold_embedded_tile");
    
    // plants
    public static final Block DJ_GRASS =
        RegistryHelper.registerBlock(new Plant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_grass");
    public static final Block DJ_RED_FERN =
        RegistryHelper.registerBlock(new Plant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_red_fern");
    public static final Block DJ_TALL_FERN =
        RegistryHelper.registerBlock(new TallPlant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_tall_fern");
    public static final Block DJ_TALL_GRASS =
        RegistryHelper.registerBlock(new TallPlant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_tall_grass");
    public static final Block DJ_SHRUB =
        RegistryHelper.registerBlock(new Plant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_shrub");
    public static final Block DJ_DEAD_SHRUB =
        RegistryHelper.registerBlock(new Plant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_dead_shrub");
    public static final Block DJ_BUSH =
        RegistryHelper.registerBlock(new Plant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_bush");
    public static final Block DJ_LARGE_JUNGLE_PLANT =
        RegistryHelper.registerBlock(new JunglePlant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_large_jungle_plant");
    public static final Block DJ_LARGE_JUNGLE_FERN =
        RegistryHelper.registerBlock(new JunglePlant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_large_jungle_fern");
    public static final Block DJ_FLOWERING_JUNGLE_PLANT =
        RegistryHelper.registerBlock(new JunglePlant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_flowering_jungle_plant");
    public static final Block DJ_LARGE_JUNGLE_FLOWER =
        RegistryHelper.registerBlock(new JunglePlant(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_large_jungle_flower");
    
    // custom dingy jungle wood & leaves
    public static final Block DJ_JUNGLE_LOG =
        RegistryHelper.registerBlock(new PillarBlock(FabricBlockSettings.create().strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD)), "dj_jungle_log");
    public static final Block DJ_JUNGLE_LEAVES =
        RegistryHelper.registerBlock(new LeavesBlock(FabricBlockSettings.create().strength(0.0F, 0.0F).sounds(BlockSoundGroup.GRASS)), "dj_jungle_leaves");

    public static void init() {
        JavaDungeons.log.info("Registering Dingy Jungle Blocks!");
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("dingy_jungle"))).register(content -> {
            content.add(DJ_GRASS_BLOCK); 
            content.add(DJ_MUDDY_GRASS);
            content.add(DJ_DIRT);
            content.add(DJ_DIRTY_MUD);
            content.add(DJ_MUD);
            content.add(DJ_GRASSY_DIRT);
            content.add(DJ_GRASSY_MUD);
            content.add(DJ_DENSE_GRASSY_MUD);
            content.add(DJ_ROCKY_DIRT);
            content.add(DJ_PEBBLES);
            content.add(DJ_DIRTY_PEBBLES);
            content.add(DJ_GRASSY_PEBBLES);
            content.add(DJ_OCELOT_STONE);
            content.add(DJ_CHISELED_STONE);
            content.add(DJ_DINGY_CHISELED_STONE);
            content.add(DJ_MOSSY_CHISELED_STONE);
            content.add(DJ_STONE_BRICKS);
            content.add(DJ_MOSSY_STONE_BRICKS);
            content.add(DJ_STONE_TILES.base);
            content.add(DJ_STONE_TILES.slab);
            content.add(DJ_STONE_TILES.stairs);
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
            content.add(DJ_GOLD_BLOCK);
            content.add(DJ_BLUE_GLAZED_STONE_FLOOR);
            content.add(DJ_DIRTY_BLUE_GLAZED_STONE_FLOOR);
            content.add(DJ_YELLOW_GLAZED_STONE_FLOOR);
            content.add(DJ_TILE);
            content.add(DJ_CRACKED_TILE);
            content.add(DJ_GOLD_EMBEDDED_TILE);
            content.add(DJ_GRASS);
            content.add(DJ_TALL_GRASS);
            content.add(DJ_RED_FERN);
            content.add(DJ_TALL_FERN);
            content.add(DJ_SHRUB);
            content.add(DJ_DEAD_SHRUB);
            content.add(DJ_BUSH);
            content.add(DJ_LARGE_JUNGLE_PLANT);
            content.add(DJ_LARGE_JUNGLE_FERN);
            content.add(DJ_FLOWERING_JUNGLE_PLANT);
            content.add(DJ_LARGE_JUNGLE_FLOWER);
            content.add(DJ_JUNGLE_LOG);
            content.add(DJ_JUNGLE_LEAVES);
        });
    }
}