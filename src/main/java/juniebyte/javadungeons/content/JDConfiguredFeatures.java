package juniebyte.javadungeons.content;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.OptionalInt;

import static juniebyte.javadungeons.JavaDungeons.MOD_ID;

public class JDConfiguredFeatures {
    
    public static ConfiguredFeature<TreeFeatureConfig, ?> CW_OAK_TREE;
    public static ConfiguredFeature<TreeFeatureConfig, ?> CW_FANCY_OAK_TREE;
    public static ConfiguredFeature<TreeFeatureConfig, ?> PM_RED_AUTUMNAL_TREE;
    public static ConfiguredFeature<TreeFeatureConfig, ?> PM_FANCY_RED_AUTUMNAL_TREE;
    public static ConfiguredFeature<TreeFeatureConfig, ?> PM_YELLOW_AUTUMNAL_TREE;
    public static ConfiguredFeature<TreeFeatureConfig, ?> PM_FANCY_YELLOW_AUTUMNAL_TREE;
    public static ConfiguredFeature<TreeFeatureConfig, ?> SS_SWAMP_TREE;
    public static ConfiguredFeature<?, ?> CC_DIRT;
    public static ConfiguredFeature<?, ?> DUNGEONS_WATER_LAKE;
    public static ConfiguredFeature<?, ?> SWAMP_WATER_LAKE;
    public static ConfiguredFeature<?, ?> CC_GRASS;

    public static void init() {
        CW_OAK_TREE = registerConfiguredFeature("cw_oak_tree",
                Feature.TREE.configure(new TreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                        new StraightTrunkPlacer(4, 2, 0),
                        new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
                        new SimpleBlockStateProvider(CreeperWoodsBlocks.CW_OAK_SAPLING.getDefaultState()),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                ).decorators(ImmutableList.of(net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.VERY_RARE_BEEHIVES_TREES)).ignoreVines().build())
        );
        CW_FANCY_OAK_TREE = registerConfiguredFeature("cw_fancy_oak_tree",
                Feature.TREE.configure(new TreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                        new LargeOakTrunkPlacer(3, 11, 0),
                        new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
                        new SimpleBlockStateProvider(CreeperWoodsBlocks.CW_FANCY_OAK_SAPLING.getDefaultState()),
                        new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                        new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
                ).decorators(ImmutableList.of(net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.VERY_RARE_BEEHIVES_TREES)).ignoreVines().build())
        );
        PM_FANCY_RED_AUTUMNAL_TREE = registerConfiguredFeature("fancy_red_autumnal_tree",
                Feature.TREE.configure(new TreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                        new LargeOakTrunkPlacer(3, 11, 0),
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.getDefaultState()),
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_SAPLING.getDefaultState()),
                        new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                        new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
                ).ignoreVines().build())
        );
        PM_RED_AUTUMNAL_TREE = registerConfiguredFeature("red_autumnal_tree",
                Feature.TREE.configure(new TreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                        new StraightTrunkPlacer(4, 2, 0),
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.getDefaultState()),
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_SAPLING.getDefaultState()),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                ).ignoreVines().build())
        );
        PM_FANCY_YELLOW_AUTUMNAL_TREE = registerConfiguredFeature("fancy_yellow_autumnal_tree",
                Feature.TREE.configure(new TreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                        new LargeOakTrunkPlacer(3, 11, 0),
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_LEAVES.getDefaultState()),
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_SAPLING.getDefaultState()),
                        new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                        new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
                ).ignoreVines().build())
        );
        PM_YELLOW_AUTUMNAL_TREE = registerConfiguredFeature("yellow_autumnal_tree",
                Feature.TREE.configure(new TreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                        new StraightTrunkPlacer(4, 2, 0),
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_LEAVES.getDefaultState()),
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_SAPLING.getDefaultState()),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                ).ignoreVines().build())
        );
        SS_SWAMP_TREE = registerConfiguredFeature("swamp_tree",
                Feature.TREE.configure(new TreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_LOG.getDefaultState()),
                        new StraightTrunkPlacer(5, 3, 0),
                        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_LEAVES.getDefaultState()),
                        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_SAPLING.getDefaultState()),
                        new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                ).decorators(ImmutableList.of(new LeavesVineTreeDecorator())).build())
        );
        CC_DIRT = JDConfiguredFeatures.registerConfiguredFeature("cc_dirt", Feature.ORE.configure(
                new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, CactiCanyonBlocks.CC_DIRT.getDefaultState(), 33)
        ).uniformRange(YOffset.fixed(30), YOffset.getTop()));
        DUNGEONS_WATER_LAKE = JDConfiguredFeatures.registerConfiguredFeature("dungeons_water_lake",
                Features.DUNGEONS_WATER_LAKE.configure(new SingleStateFeatureConfig(Fluids.DUNGEONS_WATER.getDefaultState()))
                        .range(net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.BOTTOM_TO_TOP).spreadHorizontally().applyChance(4)
        );
        SWAMP_WATER_LAKE = JDConfiguredFeatures.registerConfiguredFeature("swamp_water_lake",
                Features.DUNGEONS_WATER_LAKE.configure(new SingleStateFeatureConfig(Fluids.SOGGY_SWAMP_WATER.getDefaultState()))
                        .range(net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.BOTTOM_TO_TOP).spreadHorizontally().applyChance(4)
        );
        CC_GRASS = JDConfiguredFeatures.registerConfiguredFeature("desert_grass", Feature.RANDOM_PATCH.configure(
                (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_DESERT_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(4).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1))));
    }

    public static <T extends FeatureConfig> ConfiguredFeature<T, ?> registerConfiguredFeature(String identifier, ConfiguredFeature<T, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, identifier), configuredFeature);
    }
}