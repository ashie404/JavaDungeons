package ashie404.javadungeons.worldgen;

import com.mojang.serialization.MapCodec;

import ashie404.javadungeons.biome.Biomes;
import ashie404.javadungeons.content.CactiCanyonBlocks;
import ashie404.javadungeons.content.CreeperWoodsBlocks;
import ashie404.javadungeons.content.GenericBlocks;
import ashie404.javadungeons.content.SoggySwampBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.dynamic.CodecHolder;
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

    public static MaterialRule makeRules() {
        MaterialCondition atOrAboveWaterLvl = MaterialRules.water(-1, 0);

        // Determine surface material
        MaterialRule grassSurface = MaterialRules.sequence(
            MaterialRules.condition(MaterialRules.biome(Biomes.SOGGY_SWAMP), 
                MaterialRules.sequence(MaterialRules.condition(atOrAboveWaterLvl, SS_GRASS), SS_DIRT)), 
            MaterialRules.condition(MaterialRules.biome(Biomes.CREEPER_WOODS), 
                MaterialRules.sequence(MaterialRules.condition(atOrAboveWaterLvl, CW_GRASS), CW_DIRT)), 
            MaterialRules.sequence(MaterialRules.condition(atOrAboveWaterLvl, GRASS), DIRT)
        );

        return MaterialRules.sequence(
            MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(Biomes.CACTI_CANYON), MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, 
                    MaterialRules.sequence(
                        MaterialRules.condition(MaterialRules.aboveY(YOffset.fixed(256), 0), ORANGE_SANDSTONE),
                        MaterialRules.condition(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(74), 1), 
                            MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.909, -0.5454), SANDSTONE),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.1818, 0.1818), SANDSTONE),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, 0.909, 0.5454), SANDSTONE),
                                MaterialRules.terracottaBands()
                        )),
                        MaterialRules.condition(atOrAboveWaterLvl, MaterialRules.sequence(
                            MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, RED_SANDSTONE),
                            SAND
                        )),
                        MaterialRules.condition(MaterialRules.not(MaterialRules.hole()), ORANGE_SANDSTONE),
                        MaterialRules.condition(MaterialRules.waterWithStoneDepth(-6, -1), PINK_SANDSTONE),
                        MaterialRules.sequence(
                            MaterialRules.condition(MaterialRules.stoneDepth(0, false, VerticalSurfaceType.CEILING), STONE),
                            GRAVEL
                        )
                    )
                ),
                MaterialRules.condition(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(63), -1), MaterialRules.sequence(
                    MaterialRules.condition(MaterialRules.aboveY(YOffset.fixed(63), 0), 
                        MaterialRules.condition(MaterialRules.not(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(74), 1)), YELLOW_SANDSTONE)),
                        MaterialRules.terracottaBands()
                )),
                MaterialRules.condition(MaterialRules.stoneDepth(0, true, VerticalSurfaceType.FLOOR), 
                    MaterialRules.condition(MaterialRules.waterWithStoneDepth(-6, -1), GRAY_SANDSTONE)
                )
            )),
            MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        ));
    }

    private static MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}