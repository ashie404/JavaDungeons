package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

public class CreeperWoodsBlocks {

    // stone variants
    public static final Block CW_MOSSY_COBBLESTONE = 
        RegistryHelper.registerBlock(new Block(Material.COBBLESTONE), "cw_mossy_cobblestone");
    public static final Block CW_MOSSY_STONE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_mossy_stone");
    public static final Block CW_MOSSY_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_mossy_stone_bricks");
    public static final Block CW_MOSSY_CHISELED_STONE_BRICKS = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_mossy_chiseled_stone_bricks");
    public static final Block CW_SLOTTED_STONE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_slotted_stone");

    // andesite variants
    public static final Block CW_MOSSY_ANDESITE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_mossy_andesite");
    public static final Block CW_CRACKED_ANDESITE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_cracked_andesite");
    public static final Block CW_CHISELED_ANDESITE_SKULL =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_chiseled_andesite_skull");

    // smoky quartz
    public static final SlabStairBlock CW_SMOKY_QUARTZ_TILE = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.QUARTZ), "cw_smoky_quartz_tile", "cw_smoky_quartz_slab", "cw_smoky_quartz_stairs");
    public static final Block CW_MOSSY_SMOKY_QUARTZ_TILE = 
        RegistryHelper.registerBlock(new Block(Material.QUARTZ), "cw_mossy_smoky_quartz_tile");
    public static final Block CW_MOSSY_SMOKY_QUARTZ_TILES = 
        RegistryHelper.registerBlock(new Block(Material.QUARTZ), "cw_mossy_smoky_quartz_tiles");
    public static final SlabStairBlock CW_SMOKY_QUARTZ_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.QUARTZ), "cw_smoky_quartz_tiles");
    public static final Block CW_CHISELED_SMOKY_QUARTZ = 
        RegistryHelper.registerBlock(new Block(Material.QUARTZ), "cw_chiseled_smoky_quartz");
    public static final Block CW_CHISELED_SMOKY_QUARTZ_EYE = 
        RegistryHelper.registerBlock(new Block(Material.QUARTZ), "cw_chiseled_smoky_quartz_eye");
    public static final Block CW_SMOKY_QUARTZ_PILLAR = 
        RegistryHelper.registerBlock(new PillarBlock(Material.QUARTZ), "cw_smoky_quartz_pillar");
    
    // ground related
    public static final Block CW_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cw_grassy_dirt");
    public static final Block CW_DENSE_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.GRASS), "cw_dense_grassy_dirt");
    public static final Block CW_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "cw_dirt_path");
    public static final Block CW_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(Material.EARTH, true, CW_DIRT_PATH), "cw_dirt");
    public static final Block CW_DIRT_SLAB = 
        RegistryHelper.registerBlock(new SlabBlock(Material.EARTH), "cw_dirt_slab");
    public static final Block CW_GRASS_BLOCK = 
        RegistryHelper.registerBlock(new GrassBlock(Material.GRASS, true, Blocks.DIRT_PATH, CW_DIRT), "cw_grass_block");
    public static final Block CW_ROCKY_DIRT_PATH = 
        RegistryHelper.registerBlock(new DirtPathBlock(Material.EARTH), "cw_rocky_dirt_path");
    public static final Block CW_ROCKY_DIRT = 
        RegistryHelper.registerBlock(new PathableBlock(Material.EARTH, false, CW_ROCKY_DIRT_PATH), "cw_rocky_dirt");
    public static final Block CW_ROCKY_GRASSY_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cw_rocky_grassy_dirt");
    public static final Block CW_COBWEBBED_DIRT = 
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cw_cobwebbed_dirt");
    
    // creeper woods granite variant
    public static final SlabStairBlock CW_POLISHED_GRANITE = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cw_polished_granite");
    public static final Block CW_CHISELED_GRANITE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_chiseled_granite");
    public static final Block CW_DIRTY_GRANITE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_dirty_granite");

    // stone tiles
    public static final SlabStairBlock CW_DIRTY_STONE_TILES = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cw_dirty_stone_tiles");
    public static final SlabStairBlock CW_DIRTY_STONE_TILES_1 = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cw_dirty_stone_tiles_1", "cw_dirty_stone_tiles_slab_1", "cw_dirty_stone_tiles_stairs_1");
    public static final SlabStairBlock CW_DIRTY_STONE_TILES_2 = 
        RegistryHelper.registerBSS(new SlabStairBlock(Material.STONE), "cw_dirty_stone_tiles_2", "cw_dirty_stone_tiles_slab_2", "cw_dirty_stone_tiles_stairs_2");

    // floor tiles
    public static final Block CW_DIRTY_FLOOR_TILE = 
        RegistryHelper.registerBlock(new Block(Material.STONE), "cw_dirty_floor_tile");

    // plants
    public static final Block CW_SHRUB = 
        RegistryHelper.registerBlock(new Plant(Material.OFFSET_XZ_PLANT), "cw_shrub");
    public static final Block CW_FLOWER_PATCH = 
        RegistryHelper.registerBlock(new Plant(Material.PLANT), "cw_flower_patch");
    public static final Block CW_POP_FLOWER = 
        RegistryHelper.registerBlock(new GlowingPlant(Material.OFFSET_XZ_PLANT), "cw_pop_flower");

    // custom dungeons blocks
    public static final Block CW_GLOW_MUSHROOM = 
        RegistryHelper.registerBlock(new GlowMushroom(FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.SLIME)), "cw_glow_mushroom");
    public static final Block CW_GLOW_MELON = 
        RegistryHelper.registerBlock(new Block(FabricBlockSettings.copyOf(Material.WOOD).strength(1.0F).luminance(14)), "cw_glow_melon");
    public static final Block CW_GLOW_MELON_ROOTS = 
        RegistryHelper.registerBlock(new Block(Material.GRASS), "cw_glow_melon_roots");

    // gravestones
    public static final Block CW_GRAVESTONE = 
        RegistryHelper.registerBlock(new Gravestone(Material.STONE), "cw_gravestone");
    public static final Block CW_MOSSY_GRAVESTONE = 
        RegistryHelper.registerBlock(new Gravestone(Material.STONE), "cw_mossy_gravestone");

    public static void init() {
        JavaDungeons.log.info("Registering Creeper Woods Blocks!");

        // add blockitems to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("creeper_woods"))).register(content -> {
            content.add(CW_MOSSY_COBBLESTONE);
            content.add(CW_MOSSY_STONE);
            content.add(CW_MOSSY_STONE_BRICKS);
            content.add(CW_MOSSY_CHISELED_STONE_BRICKS);
            content.add(CW_SLOTTED_STONE);
            content.add(CW_MOSSY_ANDESITE);
            content.add(CW_CRACKED_ANDESITE);
            content.add(CW_CHISELED_ANDESITE_SKULL);
            content.add(CW_SMOKY_QUARTZ_TILE.base);
            content.add(CW_SMOKY_QUARTZ_TILE.slab);
            content.add(CW_SMOKY_QUARTZ_TILE.stairs);
            content.add(CW_MOSSY_SMOKY_QUARTZ_TILE);
            content.add(CW_MOSSY_SMOKY_QUARTZ_TILES);
            content.add(CW_SMOKY_QUARTZ_TILES.base);
            content.add(CW_SMOKY_QUARTZ_TILES.slab);
            content.add(CW_SMOKY_QUARTZ_TILES.stairs);
            content.add(CW_CHISELED_SMOKY_QUARTZ);
            content.add(CW_CHISELED_SMOKY_QUARTZ_EYE);
            content.add(CW_SMOKY_QUARTZ_PILLAR);
            content.add(CW_GRASS_BLOCK);
            content.add(CW_GRASSY_DIRT);
            content.add(CW_DENSE_GRASSY_DIRT);
            content.add(CW_DIRT);
            content.add(CW_DIRT_SLAB);
            content.add(CW_DIRT_PATH);
            content.add(CW_ROCKY_DIRT);
            content.add(CW_ROCKY_DIRT_PATH);
            content.add(CW_ROCKY_GRASSY_DIRT);
            content.add(CW_COBWEBBED_DIRT);
            content.add(CW_POLISHED_GRANITE.base);
            content.add(CW_POLISHED_GRANITE.slab);
            content.add(CW_POLISHED_GRANITE.stairs);
            content.add(CW_DIRTY_GRANITE);
            content.add(CW_CHISELED_GRANITE);
            content.add(CW_DIRTY_STONE_TILES.base);
            content.add(CW_DIRTY_STONE_TILES.slab);
            content.add(CW_DIRTY_STONE_TILES.stairs);
            content.add(CW_DIRTY_STONE_TILES_1.base);
            content.add(CW_DIRTY_STONE_TILES_1.slab);
            content.add(CW_DIRTY_STONE_TILES_1.stairs);
            content.add(CW_DIRTY_STONE_TILES_2.base);
            content.add(CW_DIRTY_STONE_TILES_2.slab);
            content.add(CW_DIRTY_STONE_TILES_2.stairs);
            content.add(CW_DIRTY_FLOOR_TILE);
            content.add(CW_SHRUB);
            content.add(CW_POP_FLOWER);
            content.add(CW_FLOWER_PATCH);
            content.add(CW_GLOW_MUSHROOM);
            content.add(CW_GLOW_MELON);
            content.add(CW_GLOW_MELON_ROOTS);
            content.add(CW_GRAVESTONE);
            content.add(CW_MOSSY_GRAVESTONE);
        });
    }
}