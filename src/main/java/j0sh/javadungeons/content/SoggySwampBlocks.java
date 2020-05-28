package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.DungeonsBlock;
import j0sh.javadungeons.blocks.DungeonsPath;
import j0sh.javadungeons.blocks.DungeonsPathable;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class SoggySwampBlocks {

    // ground related
    public static DungeonsBlock SS_GRASS_BLOCK;
    public static DungeonsPath SS_DIRT_PATH;
    public static DungeonsPathable SS_DIRT;

    // stone related
    public static DungeonsBlock SS_MOSSY_STONE;
    public static DungeonsBlock SS_MOSSY_COBBLESTONE;
    public static DungeonsBlock SS_MOSSY_STONE_BRICKS;
    public static DungeonsBlock SS_MOSSY_CHISELED_STONE_BRICKS;

    public static void init() {
        SS_GRASS_BLOCK = new DungeonsBlock(Material.SOLID_ORGANIC, BlockSoundGroup.GRASS, JavaDungeons.SOGGY_SWAMP, "ss_grass_block");
        SS_DIRT_PATH = new DungeonsPath(Material.SOLID_ORGANIC, BlockSoundGroup.GRASS, JavaDungeons.SOGGY_SWAMP, "ss_dirt_path");
        SS_DIRT = new DungeonsPathable(Material.SOLID_ORGANIC, BlockSoundGroup.GRASS, SS_DIRT_PATH, JavaDungeons.SOGGY_SWAMP, "ss_dirt");

        SS_MOSSY_STONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.SOGGY_SWAMP, "ss_mossy_stone");
        SS_MOSSY_COBBLESTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.SOGGY_SWAMP, "ss_mossy_cobblestone");
        SS_MOSSY_STONE_BRICKS = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.SOGGY_SWAMP, "ss_mossy_stone_bricks");
        SS_MOSSY_CHISELED_STONE_BRICKS = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.SOGGY_SWAMP, "ss_mossy_chiseled_stone_bricks");
    }

}
