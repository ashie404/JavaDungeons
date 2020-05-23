package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.*;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CactiCanyonBlocks {

    // sand related
    public static DungeonsFallingBlock CC_SAND;
    public static DungeonsBlock CC_DENSE_SANDY_DIRT;
    public static DungeonsBlock CC_SANDY_DIRT;

    // sandstone related
    public static DungeonsBlock CC_SANDSTONE;
    public static DungeonsBlock CC_BLUE_SANDSTONE;
    public static DungeonsBlock CC_BROWN_SANDSTONE;
    public static DungeonsBlock CC_DARK_BROWN_SANDSTONE;
    public static DungeonsBlock CC_GRAY_SANDSTONE;
    public static DungeonsBlock CC_GREEN_SANDSTONE;
    public static DungeonsBlock CC_LIGHT_GREEN_SANDSTONE;
    public static DungeonsBlock CC_ORANGE_SANDSTONE;
    public static DungeonsBlock CC_PINK_SANDSTONE;
    public static DungeonsBlock CC_PURPLE_SANDSTONE;
    public static DungeonsBlock CC_RED_SANDSTONE;
    public static DungeonsBlock CC_YELLOW_SANDSTONE;
    
    public static void init() {
        // sand related
        CC_SAND = new DungeonsFallingBlock(Material.SAND, BlockSoundGroup.SAND, JavaDungeons.CACTI_CANYON, "cc_sand");
        CC_DENSE_SANDY_DIRT = new DungeonsBlock(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.CACTI_CANYON, "cc_dense_sandy_dirt");
        CC_SANDY_DIRT = new DungeonsBlock(Material.EARTH, BlockSoundGroup.GRAVEL, JavaDungeons.CACTI_CANYON, "cc_sandy_dirt");
        
        // sandstone related
        CC_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_sandstone");
        CC_BLUE_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_blue_sandstone");
        CC_BROWN_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_brown_sandstone");
        CC_DARK_BROWN_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_dark_brown_sandstone");
        CC_GRAY_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_gray_sandstone");
        CC_GREEN_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_green_sandstone");
        CC_LIGHT_GREEN_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_light_green_sandstone");
        CC_ORANGE_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_orange_sandstone");
        CC_PINK_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_pink_sandstone");
        CC_PURPLE_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_purple_sandstone");
        CC_RED_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_red_sandstone");
        CC_YELLOW_SANDSTONE = new DungeonsBlock(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.CACTI_CANYON, "cc_yellow_sandstone");
    }

}