package ashie404.javadungeons.worldgen.surfacebuilder;

import ashie404.javadungeons.biome.Biomes;
import ashie404.javadungeons.content.CactiCanyonBlocks;
import ashie404.javadungeons.content.CreeperWoodsBlocks;
import ashie404.javadungeons.content.GenericBlocks;
import ashie404.javadungeons.content.SoggySwampBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
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

    // Globally used material conditions
    private static final MaterialCondition aboveWater = MaterialRules.water(-1, 0);
    private static final MaterialCondition stoneDepthFloorSurface1 = MaterialRules.stoneDepth(1, true, VerticalSurfaceType.FLOOR);

    // Construct final surface rule
    public static MaterialRule makeRules() {
        return MaterialRules.sequence(
            SoggySwampSurfaceRule(),
            CreeperWoodsSurfaceRule(),
            CactiCanyonSurfaceRule(),
            CactiCanyonDesertSurfaceRule(),
            DungeonsSurfaceRule()
        );
    }

    // Default surface rule for JavaDungeons biomes
    private static MaterialRule DungeonsSurfaceRule() {
        return MaterialRules.sequence(MaterialRules.condition(aboveWater,
            // Above water surface builder 
            MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, GRASS),
                MaterialRules.condition(stoneDepthFloorSurface1, DIRT),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, STONE),
                STONE
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, DIRT),
                STONE
            )
        );    
    }

    // Biome-specific surface rules
    private static MaterialRule SoggySwampSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.SOGGY_SWAMP), MaterialRules.sequence(
            // Above water surface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, SS_GRASS),
                MaterialRules.condition(stoneDepthFloorSurface1, SS_DIRT),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, STONE),
                STONE
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, SS_DIRT),
                STONE
            )
        ));
    }

    private static MaterialRule CreeperWoodsSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.CREEPER_WOODS), MaterialRules.sequence(
            // Above water suface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, CW_GRASS),
                    MaterialRules.condition(stoneDepthFloorSurface1, CW_DIRT),
                    MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, STONE)
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, CW_DIRT),
                STONE
            )
        ));
    }

    private static MaterialRule CactiCanyonSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.CACTI_CANYON), MaterialRules.sequence(
            // Above water surface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.aboveY(YOffset.fixed(256), 0), ORANGE_SANDSTONE),
                    MaterialRules.condition(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(74), 1), MaterialRules.sequence(
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.909, -0.5454), SANDSTONE),
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.1818, 0.1818), SANDSTONE),
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, 0.5454, 0.909), SANDSTONE)
                    ))
                ))
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, SAND),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, SANDSTONE),
                STONE
            )
        ));
    }

    private static MaterialRule CactiCanyonDesertSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.CACTI_CANYON_DESERT), MaterialRules.sequence(
            // Above water surface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, SAND),
                SANDSTONE
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, SAND),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, SANDSTONE),
                STONE
            )
        ));
    }

    private static MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}