package ashie404.javadungeons.worldgen.surfacebuilder;

import ashie404.javadungeons.biome.Biomes;
import ashie404.javadungeons.block.Material;
import ashie404.javadungeons.content.CactiCanyonBlocks;
import ashie404.javadungeons.content.CoralRiseBlocks;
import ashie404.javadungeons.content.CreeperWoodsBlocks;
import ashie404.javadungeons.content.DingyJungleBlocks;
import ashie404.javadungeons.content.GenericBlocks;
import ashie404.javadungeons.content.PumpkinPasturesBlocks;
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
    private static final MaterialRule SAND = makeStateRule(Blocks.SAND); 

    // Generic Material Rules
    private static final MaterialRule GRASS = makeStateRule(GenericBlocks.GRASS_BLOCK);
    private static final MaterialRule DIRT = makeStateRule(GenericBlocks.DIRT);

    // Creeper Woods Material Rules
    private static final MaterialRule CW_GRASS = makeStateRule(CreeperWoodsBlocks.CW_GRASS_BLOCK);
    private static final MaterialRule CW_DIRT = makeStateRule(CreeperWoodsBlocks.CW_DIRT);

    // Pumpkin Pastures Material Rules
    private static final MaterialRule PM_GRASS = makeStateRule(PumpkinPasturesBlocks.PM_GRASS_BLOCK);
    private static final MaterialRule PM_DIRT = makeStateRule(PumpkinPasturesBlocks.PM_DIRT);
    private static final MaterialRule PM_ASHY_DIRT = makeStateRule(PumpkinPasturesBlocks.PM_ASHY_DIRT);
    private static final MaterialRule PM_CHAR_DIRT = makeStateRule(PumpkinPasturesBlocks.PM_CHARRED_DIRT);
    private static final MaterialRule PM_CHAR_DIRT_PATH = makeStateRule(PumpkinPasturesBlocks.PM_CHARRED_DIRT_PATH);
    private static final MaterialRule PM_DIRT_EMBERS = makeStateRule(PumpkinPasturesBlocks.PM_CHARRED_DIRT_EMBERS);
    private static final MaterialRule PM_ROCKY_DIRT = makeStateRule(PumpkinPasturesBlocks.PM_ROCKY_DIRT);
    private static final MaterialRule PM_DIRT_PATH = makeStateRule(PumpkinPasturesBlocks.PM_DIRT_PATH);
    private static final MaterialRule PM_ROCKY_DIRT_PATH = makeStateRule(PumpkinPasturesBlocks.PM_ROCKY_DIRT_PATH);
    private static final MaterialRule PM_GRASSY_DIRT = makeStateRule(PumpkinPasturesBlocks.PM_GRASSY_DIRT);
    private static final MaterialRule PM_DENSE_GRASSY_DIRT = makeStateRule(PumpkinPasturesBlocks.PM_DENSE_GRASSY_DIRT);

    // Cacti Canyon Material Rules
    private static final MaterialRule CC_GRASS = makeStateRule(CactiCanyonBlocks.CC_GRASS_BLOCK);
    private static final MaterialRule CC_DIRT = makeStateRule(CactiCanyonBlocks.CC_DIRT);
    private static final MaterialRule CC_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_SANDSTONE);
    private static final MaterialRule CC_YELLOW_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_YELLOW_SANDSTONE);
    private static final MaterialRule CC_RED_SANDSTONE = makeStateRule(CactiCanyonBlocks.CC_RED_SANDSTONE);
    private static final MaterialRule CC_SAND = makeStateRule(CactiCanyonBlocks.CC_SAND);

    // Soggy Swamp Material Rules
    private static final MaterialRule SS_GRASS = makeStateRule(SoggySwampBlocks.SS_GRASS_BLOCK);
    private static final MaterialRule SS_DIRT = makeStateRule(SoggySwampBlocks.SS_DIRT);

    // Dingy Jungle Material Rules
    private static final MaterialRule DJ_GRASS = makeStateRule(DingyJungleBlocks.DJ_GRASS_BLOCK);
    private static final MaterialRule DJ_PEBBLES = makeStateRule(DingyJungleBlocks.DJ_PEBBLES);
    private static final MaterialRule DJ_DIRTY_PEBBLES = makeStateRule(DingyJungleBlocks.DJ_DIRTY_PEBBLES);
    private static final MaterialRule DJ_GRASSY_MUD = makeStateRule(DingyJungleBlocks.DJ_GRASSY_MUD);
    private static final MaterialRule DJ_DENSE_GRASSY_MUD = makeStateRule(DingyJungleBlocks.DJ_DENSE_GRASSY_MUD);
    private static final MaterialRule DJ_DIRTY_MUD = makeStateRule(DingyJungleBlocks.DJ_DIRTY_MUD);
    private static final MaterialRule DJ_MUD = makeStateRule(DingyJungleBlocks.DJ_MUD);
    private static final MaterialRule DJ_DIRT = makeStateRule(DingyJungleBlocks.DJ_DIRT);

    // Coral Reef Material Rules
    private static final MaterialRule CR_DIRT = makeStateRule(CoralRiseBlocks.CR_DIRT);
    private static final MaterialRule CR_SANDY_DIRT = makeStateRule(CoralRiseBlocks.CR_SANDY_DIRT);
    private static final MaterialRule CR_TUBE_GRASS = makeStateRule(CoralRiseBlocks.CR_TUBE_CORAL_GRASS);
    private static final MaterialRule CR_FIRE_GRASS = makeStateRule(CoralRiseBlocks.CR_FIRE_CORAL_GRASS);
    private static final MaterialRule CR_SANDY_TUBE = makeStateRule(CoralRiseBlocks.CR_SANDY_TUBE_CORAL_BLOCK);
    private static final MaterialRule CR_SANDY_FIRE = makeStateRule(CoralRiseBlocks.CR_SANDY_FIRE_CORAL_BLOCK);
    private static final MaterialRule CR_DIRTY_TUBE = makeStateRule(CoralRiseBlocks.CR_DIRTY_TUBE_CORAL_BLOCK);
    private static final MaterialRule CR_DIRTY_FIRE = makeStateRule(CoralRiseBlocks.CR_DIRTY_FIRE_CORAL_BLOCK);

    // Globally used material conditions
    private static final MaterialCondition aboveWater = MaterialRules.water(-1, 0);
    private static final MaterialCondition stoneDepthFloorSurface1 = MaterialRules.stoneDepth(1, true, VerticalSurfaceType.FLOOR);

    // Construct final surface rule
    public static MaterialRule makeRules() {
        return MaterialRules.sequence(
            SoggySwampSurfaceRule(),     
            CreeperWoodsSurfaceRule(),
            PumpkinPasturesSurfaceRule(),
            CactiCanyonSurfaceRule(),
            CactiCanyonDesertSurfaceRule(),
            DingyJungleSurfaceRule(),
            CoralReefSurfaceRule(),
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

    private static MaterialRule PumpkinPasturesSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.PUMPKIN_PASTURES), MaterialRules.sequence(
            // Above water surface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.2020, 0.1010), MaterialRules.sequence(
                        // Dirt path
                        MaterialRules.condition(MaterialRules.not(MaterialRules.steepSlope()), MaterialRules.condition(MaterialRules.not(MaterialRules.hole()),
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.05, 0.0), MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.025, 0.0), PM_ROCKY_DIRT_PATH),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.345, -0.305), PM_ROCKY_DIRT_PATH),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.NOODLE_RIDGE_A, -0.3, -0.235), PM_CHAR_DIRT_PATH),
                                PM_DIRT_PATH
                            ))
                        )),
                        // Dirt
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.1315, 0.0500), MaterialRules.sequence(
                            // Rocky dirt
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.025, 0.0), PM_ROCKY_DIRT),
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.125, -0.075), PM_ROCKY_DIRT),
                            // Ashy/ember dirt
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.NOODLE_RIDGE_A, -0.35,-0.15), MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.NOODLE_RIDGE_A, -0.205, -0.195), PM_DIRT_EMBERS),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.NOODLE_RIDGE_A, -0.3, -0.235), PM_CHAR_DIRT),
                                PM_ASHY_DIRT
                            )),
                            PM_DIRT
                        )),
                        // Grassy dirt
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.1717, 0.0750), PM_GRASSY_DIRT),
                        PM_DENSE_GRASSY_DIRT
                    )),
                    PM_GRASS
                )),
                MaterialRules.condition(stoneDepthFloorSurface1, PM_DIRT),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, STONE),
                STONE
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, PM_DIRT),
                STONE
            )
        ));
    }

    private static MaterialRule CactiCanyonSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.CACTI_CANYON), MaterialRules.sequence(
            // Above water surface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(74), 1), MaterialRules.sequence(
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.909, -0.5454), CC_RED_SANDSTONE),
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.1818, 0.1818), CC_SANDSTONE),
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, 0.5454, 0.909), CC_YELLOW_SANDSTONE)
                    )),
                    CC_GRASS
                )),
                MaterialRules.condition(stoneDepthFloorSurface1, CC_DIRT),
                CC_SANDSTONE
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, CC_DIRT),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, CC_SANDSTONE),
                STONE
            )
        ));
    }

    private static MaterialRule CactiCanyonDesertSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.CACTI_CANYON_DESERT), MaterialRules.sequence(
            // Above water surface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, CC_SAND),
                CC_SANDSTONE
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, CC_SAND),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, CC_SANDSTONE),
                STONE
            )
        ));
    }

    private static MaterialRule DingyJungleSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.DINGY_JUNGLE), MaterialRules.sequence(
            // Above water surface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.1010, 0.1010), MaterialRules.sequence(
                        // Mud
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.0305, 0.0500), MaterialRules.sequence(
                            // dirt patches
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, 0.0, 0.1), DJ_DIRT),
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.025, 0.125), DJ_DIRTY_MUD),
                            DJ_MUD
                        )),
                        // Grassy mud transition to mud
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.0707, 0.0750), DJ_GRASSY_MUD),
                        DJ_DENSE_GRASSY_MUD
                    )),
                    DJ_GRASS
                )),
                MaterialRules.condition(stoneDepthFloorSurface1, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.252, -0.151), DJ_DIRTY_PEBBLES),
                    // Mud/dirt patches below surface (no grass transition)
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.0305, 0.0500), MaterialRules.sequence(
                        // dirt patches
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, 0.0, 0.1), DJ_DIRT),
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.025, 0.125), DJ_DIRTY_MUD),
                        DJ_MUD
                    )),
                    DJ_PEBBLES
                )),
                STONE
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.252, -0.151), DJ_DIRTY_PEBBLES),
                    // Mud/dirt patches below surface (no grass transition)
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.1315, 0.0500), MaterialRules.sequence(
                        // dirt patches
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.1, 0.1), DJ_DIRT),
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.125, 0.125), DJ_DIRTY_MUD),
                        DJ_MUD
                    )),
                    DJ_PEBBLES
                )),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, MaterialRules.sequence(
                    STONE
                ))
            )
        ));
    }

    private static MaterialRule CoralReefSurfaceRule() {
        return MaterialRules.condition(MaterialRules.biome(Biomes.CORAL_REEF), MaterialRules.sequence(
            // Above water surface builder
            MaterialRules.condition(aboveWater, MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, SAND),
                STONE
            )),
            // Underwater surface builder
            MaterialRules.sequence(
                MaterialRules.condition(stoneDepthFloorSurface1, MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, MaterialRules.sequence(
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.4747, -0.2727), MaterialRules.sequence(
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.4545, -0.3232), CR_TUBE_GRASS),
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.1818, 0.0507), CR_DIRTY_TUBE),
                            CR_SANDY_TUBE
                        )),
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, 0.2727, 0.4747), MaterialRules.sequence(
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, 0.3232, 0.4545), CR_FIRE_GRASS),
                            MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.1818, 0.0507), CR_DIRTY_FIRE),
                            CR_SANDY_FIRE
                        ))
                    )),
                    // dirt below coral grass blocks
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, -0.4545, -0.3232), CR_DIRT),
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SECONDARY, 0.3232, 0.4545), CR_DIRT),
                    // dirt patches and sandy dirt surrounding dirt
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.2020, -0.1818), CR_SANDY_DIRT),
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.1818, 0.0507), CR_DIRT),
                    MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, 0.0507, 0.1313), CR_SANDY_DIRT),
                    // default block
                    SAND
                )),
                STONE
            )
        ));
    }

    private static MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}