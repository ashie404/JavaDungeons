package ashie404.javadungeons.worldgen;

import ashie404.javadungeons.biome.Biomes;
import ashie404.javadungeons.content.CactiCanyonBlocks;
import ashie404.javadungeons.content.CreeperWoodsBlocks;
import ashie404.javadungeons.content.GenericBlocks;
import ashie404.javadungeons.content.SoggySwampBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.MaterialRules.MaterialCondition;
import net.minecraft.world.gen.surfacebuilder.MaterialRules.MaterialRule;

public class DungeonsMaterialRules {
    // Vanilla Block Material Rules
    private static final MaterialRule STONE = makeStateRule(Blocks.STONE);
    private static final MaterialRule GRAVEL = makeStateRule(Blocks.GRAVEL);

    // Generic Material Rules
    private static final MaterialRule GRASS = makeStateRule(GenericBlocks.GRASS_BLOCK);
    private static final MaterialRule DIRT = makeStateRule(GenericBlocks.DIRT);

    // Creeper Woods Material Rules
    private static final MaterialRule CW_GRASS = makeStateRule(CreeperWoodsBlocks.CW_GRASS_BLOCK);
    private static final MaterialRule CW_DIRT = makeStateRule(CreeperWoodsBlocks.CW_DIRT);

    // Cacti Canyon Material Rules
    private static final MaterialRule SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_SANDSTONE);
    private static final MaterialRule ORANGE_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_ORANGE_SANDSTONE);
    private static final MaterialRule PINK_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_PINK_SANDSTONE);
    private static final MaterialRule YELLOW_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_YELLOW_SANDSTONE);
    private static final MaterialRule BROWN_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_BROWN_SANDSTONE);
    private static final MaterialRule RED_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_RED_SANDSTONE);
    private static final MaterialRule GRAY_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_GRAY_SANDSTONE);
    private static final MaterialRule SAND = makeStateRule(CactiCanyonBlocks.CC_SAND);

    // Soggy Swamp Material Rules
    private static final MaterialRule SS_GRASS = makeStateRule(SoggySwampBlocks.SS_GRASS_BLOCK);
    private static final MaterialRule SS_DIRT = makeStateRule(SoggySwampBlocks.SS_DIRT);

    // Construct final surface rule
    public static MaterialRule makeRules() {
        MaterialCondition atOrAboveWaterLvl = MaterialRules.water(-1, 0);
        MaterialCondition soggySwamp = MaterialRules.biome(Biomes.SOGGY_SWAMP);
        MaterialCondition creeperWoods = MaterialRules.biome(Biomes.CREEPER_WOODS);
        MaterialCondition cactiCanyon = MaterialRules.biome(Biomes.CACTI_CANYON);
        MaterialCondition cactiCanyonDesert = MaterialRules.biome(Biomes.CACTI_CANYON_DESERT);

        return MaterialRules.condition(MaterialRules.surface(), MaterialRules.sequence(
            // Above water surface rules
            MaterialRules.condition(atOrAboveWaterLvl, MaterialRules.sequence(
                SoggySwampSurfaceRule(soggySwamp, true),
                CreeperWoodsSurfaceRule(creeperWoods, true),
                CactiCanyonSurfaceRule(cactiCanyon, true),
                CactiCanyonDesertSurfaceRule(cactiCanyonDesert, true),
                DungeonsSurfaceRule(true)
            )),
            // Underwater
            SoggySwampSurfaceRule(soggySwamp, false),
            CreeperWoodsSurfaceRule(creeperWoods, false),
            CactiCanyonSurfaceRule(cactiCanyon, false),
            CactiCanyonDesertSurfaceRule(cactiCanyonDesert, false),
            DungeonsSurfaceRule(false)
        ));
    }

    // Default surface rule for JavaDungeons biomes
    private static MaterialRule DungeonsSurfaceRule(boolean aboveWater) {
        return aboveWater ? 
        // Above water surface builder
            MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, GRASS),
                MaterialRules.condition(MaterialRules.stoneDepth(1, true, VerticalSurfaceType.FLOOR), DIRT),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, STONE),
                STONE
            ) :
        // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.stoneDepth(1, true, VerticalSurfaceType.FLOOR), DIRT),
                STONE
            );
    }

    // Biome-specific surface rules
    private static MaterialRule SoggySwampSurfaceRule(MaterialCondition biomeCondition, boolean aboveWater) {
        return aboveWater ?
        // Above water surface builder
            MaterialRules.condition(biomeCondition, MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, SS_GRASS),
                MaterialRules.condition(MaterialRules.stoneDepth(1, true, VerticalSurfaceType.FLOOR), SS_DIRT),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, STONE),
                STONE
            )) :
        // Underwater surface builder
            MaterialRules.condition(biomeCondition, MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.stoneDepth(1, true, VerticalSurfaceType.FLOOR), SS_DIRT),
                STONE
            ));
    }

    private static MaterialRule CreeperWoodsSurfaceRule(MaterialCondition biomeCondition, boolean aboveWater) {
        return aboveWater ?
        // Above water surface builder
            MaterialRules.condition(biomeCondition, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, CW_GRASS),
                    MaterialRules.condition(MaterialRules.stoneDepth(1, true, VerticalSurfaceType.FLOOR), CW_DIRT),
                    MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, STONE)
            )) :
        // Underwater surface builder
            MaterialRules.condition(biomeCondition, MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.stoneDepth(1, true, VerticalSurfaceType.FLOOR), CW_DIRT),
                STONE
            ));
    }

    private static MaterialRule CactiCanyonSurfaceRule(MaterialCondition biomeCondition, boolean aboveWater) {
        // TODO: Finish cacti canyon surface builder
        return aboveWater ?
        // Above water surface builder
            MaterialRules.condition(biomeCondition, SANDSTONE) :
        // Underwater surface builder
            MaterialRules.condition(biomeCondition, STONE);
    }

    private static MaterialRule CactiCanyonDesertSurfaceRule(MaterialCondition biomeCondition, boolean aboveWater) {
        // TODO: Finish cacti canyon desert surface builder
        return aboveWater ?
        // Above water surface builder
            MaterialRules.condition(biomeCondition, SAND) :
        // Underwater surface builder
            MaterialRules.condition(biomeCondition, STONE);
    }

    private static MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}