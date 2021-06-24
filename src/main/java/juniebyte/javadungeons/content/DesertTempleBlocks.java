package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DesertTempleBlocks {

    // andesite related
    public static Block DT_SANDY_ANDESITE;
    public static Block DT_CHISELED_SANDY_ANDESITE;
    public static Block DT_CHISELED_SANDY_ANDESITE_2;
    public static Block DT_SANDY_ANDESITE_PILLAR;

    // stone brick related
    public static Block DT_SANDY_STONE_BRICKS;
    public static Block DT_CRACKED_SANDY_STONE_BRICKS;
    public static Block DT_SANDY_STONE_TILES;
    public static Block DT_CHISELED_SANDY_STONE;

    // stone related
    public static Block DT_SANDY_COBBLESTONE;

    public static void init() {
        // andesite related
        DT_SANDY_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_sandy_andesite", JavaDungeons.DESERT_TEMPLE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_sandy_andesite_slab", JavaDungeons.DESERT_TEMPLE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, DT_SANDY_ANDESITE), "dt_sandy_andesite_stairs", JavaDungeons.DESERT_TEMPLE);
        DT_CHISELED_SANDY_ANDESITE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_chiseled_sandy_andesite", JavaDungeons.DESERT_TEMPLE);
        DT_CHISELED_SANDY_ANDESITE_2 = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_chiseled_sandy_andesite_2", JavaDungeons.DESERT_TEMPLE);
        DT_SANDY_ANDESITE_PILLAR = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPillar(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_sandy_andesite_pillar", JavaDungeons.DESERT_TEMPLE);

        // stone brick related
        DT_SANDY_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_sandy_stone_bricks", JavaDungeons.DESERT_TEMPLE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_sandy_stone_brick_slab", JavaDungeons.DESERT_TEMPLE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, DT_SANDY_STONE_BRICKS), "dt_sandy_stone_brick_stairs", JavaDungeons.DESERT_TEMPLE);
        DT_CRACKED_SANDY_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_cracked_sandy_stone_bricks", JavaDungeons.DESERT_TEMPLE);
        DT_SANDY_STONE_TILES = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_sandy_stone_tiles", JavaDungeons.DESERT_TEMPLE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_sandy_stone_tiles_slab", JavaDungeons.DESERT_TEMPLE);
        JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsStairs(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE, DT_SANDY_STONE_TILES), "dt_sandy_stone_tiles_stairs", JavaDungeons.DESERT_TEMPLE);
        DT_CHISELED_SANDY_STONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_chiseled_sandy_stone", JavaDungeons.DESERT_TEMPLE);

        // stone related
        DT_SANDY_COBBLESTONE = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "dt_sandy_cobblestone", JavaDungeons.DESERT_TEMPLE);
    }
}