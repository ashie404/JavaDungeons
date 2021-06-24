package juniebyte.javadungeons.content;

import io.github.vampirestudios.vampirelib.utils.registry.StoneRegistry;
import io.github.vampirestudios.vampirelib.utils.registry.WoodRegistry;
import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.blocks.*;
import juniebyte.javadungeons.blocks.saplings.RedAutumnalSaplingGenerator;
import juniebyte.javadungeons.blocks.saplings.YellowAutumnalSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class PumpkinPasturesBlocks {

    // foliage
    public static Block PM_YELLOW_AUTUMNAL_LEAVES;
    public static Block PM_RED_AUTUMNAL_LEAVES;

    // saplings
    public static Block PM_RED_AUTUMNAL_SAPLING;
    public static Block PM_YELLOW_AUTUMNAL_SAPLING;

    // plants
    public static Block PM_SHRUB;
    public static Block PM_CHARRED_GRASS;
    public static Block PM_FERN;
    public static Block PM_DEAD_SAPLING;

    // melons
    public static Block PM_BURNT_PUMPKIN;
    public static Block PM_ROTTED_PUMPKIN;

    // haybale
    public static Block PM_DRIED_HAYBALE;

    // ground related
    public static Block PM_CHARRED_GRASS_BLOCK;
    public static Block PM_CHARRED_DIRT_PATH;
    public static Block PM_CHARRED_DIRT;
    public static Block PM_CHARRED_DIRT_SLAB;
    public static Block PM_CHARRED_DIRT_EMBERS;
    public static Block PM_CHARRED_FARMLAND;

    // charred stones
    public static Block PM_CHARRED_STONE;
    public static Block PM_CHARRED_COBBLESTONE;
    public static Block PM_CHARRED_STONE_BRICKS;
    public static Block PM_CRACKED_CHARRED_STONE_BRICKS;

    // stone related
    public static Block PM_MOSSY_STONE_BRICKS;

    // wood related
    public static Block PM_CHARRED_LOG;
    public static Block PM_CHARRED_WOOD;
    public static Block PM_CHARRED_PLANKS;
    public static Block PM_CHARRED_STAIRS;
    public static Block PM_CHARRED_SLAB;

    public static void init() {
        // foliage
        PM_YELLOW_AUTUMNAL_LEAVES = new DungeonsLeaves(JavaDungeons.PUMPKIN_PASTURES, "pm_yellow_autumnal_leaves");
        PM_RED_AUTUMNAL_LEAVES = new DungeonsLeaves(JavaDungeons.PUMPKIN_PASTURES, "pm_red_autumnal_leaves");
        
        // saplings
        PM_RED_AUTUMNAL_SAPLING = new DungeonsSapling(new RedAutumnalSaplingGenerator(), JavaDungeons.PUMPKIN_PASTURES, "pm_red_autumnal_sapling");
        PM_YELLOW_AUTUMNAL_SAPLING = new DungeonsSapling(new YellowAutumnalSaplingGenerator(), JavaDungeons.PUMPKIN_PASTURES, "pm_yellow_autumnal_sapling");

        // melons
        PM_BURNT_PUMPKIN = JavaDungeons.REGISTRY_HELPER.registerBlock(new PMBurntPumpkin(), "pm_burnt_pumpkin", JavaDungeons.PUMPKIN_PASTURES);
        PM_ROTTED_PUMPKIN = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.GOURD, 1.0F, 1.0F, BlockSoundGroup.WOOD), "pm_rotted_pumpkin", JavaDungeons.PUMPKIN_PASTURES);

        // haybale
        PM_DRIED_HAYBALE = new DungeonsPillar(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_dried_haybale");

        // plants
        PM_SHRUB = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_shrub");
        PM_CHARRED_GRASS = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_charred_grass");
        PM_FERN = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_fern");
        PM_DEAD_SAPLING = new DungeonsPlant(Material.REPLACEABLE_PLANT, 0.0F, 0.0F, BlockSoundGroup.GRASS, JavaDungeons.PUMPKIN_PASTURES, "pm_dead_sapling");

        // ground related
        PM_CHARRED_GRASS_BLOCK = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.SOLID_ORGANIC, 0.6F, 0.6F, BlockSoundGroup.GRASS), "pm_charred_grass_block", JavaDungeons.PUMPKIN_PASTURES);
        PM_CHARRED_DIRT_PATH = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "pm_charred_dirt_path", JavaDungeons.PUMPKIN_PASTURES);
        PM_CHARRED_DIRT = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPathable(Material.AGGREGATE, 0.5F, 0.5F, false, BlockSoundGroup.GRAVEL, PM_CHARRED_DIRT_PATH), "pm_charred_dirt", JavaDungeons.PUMPKIN_PASTURES);
        PM_CHARRED_DIRT_SLAB = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsSlab(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "pm_charred_dirt_slab", JavaDungeons.PUMPKIN_PASTURES);
        PM_CHARRED_DIRT_EMBERS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "pm_charred_dirt_embers", JavaDungeons.PUMPKIN_PASTURES);
        PM_CHARRED_FARMLAND = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsPath(Material.AGGREGATE, 0.5F, 0.5F, BlockSoundGroup.GRAVEL), "pm_charred_farmland", JavaDungeons.PUMPKIN_PASTURES);
        
        // charred stones
        StoneRegistry stoneRegistry = StoneRegistry.of(new Identifier(JavaDungeons.MOD_ID, "pm_charred_stone"))
                .raw().stairs().slab().wall()
                .cobblestone().cobblestoneSlab().cobblestoneStairs().cobblestoneWall()
                .bricks().brickSlab().brickStairs().brickWall()
                .crackedBricks().crackedBricksSlab().crackedBricksStairs().crackedBricksWall().build();
        PM_CHARRED_STONE = stoneRegistry.getRaw();
        PM_CHARRED_COBBLESTONE = stoneRegistry.getCobblestone();
        PM_CHARRED_STONE_BRICKS = stoneRegistry.getBricks();
        PM_CRACKED_CHARRED_STONE_BRICKS = stoneRegistry.getCrackedBricks();

        // stone related
        PM_MOSSY_STONE_BRICKS = JavaDungeons.REGISTRY_HELPER.registerBlock(new DungeonsBlock(Material.STONE, 1.5F, 6.0F, BlockSoundGroup.STONE), "pm_mossy_stone_bricks", JavaDungeons.PUMPKIN_PASTURES);

        // wood related
        WoodRegistry woodRegistry = WoodRegistry.of(new Identifier(JavaDungeons.MOD_ID, "pm_charred"))
                .log().wood().strippedLog().strippedWood().planks().stairs().slab().shouldGenerateAssets().build();
        PM_CHARRED_LOG = woodRegistry.getLog();
        PM_CHARRED_WOOD = woodRegistry.getWood();
        PM_CHARRED_PLANKS = woodRegistry.getPlanks();
        PM_CHARRED_STAIRS = woodRegistry.getStairs();
        PM_CHARRED_SLAB = woodRegistry.getSlab();
    }
}