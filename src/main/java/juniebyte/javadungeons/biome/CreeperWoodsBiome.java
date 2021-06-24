package juniebyte.javadungeons.biome;

import static juniebyte.javadungeons.JavaDungeons.MOD_ID;
import static juniebyte.javadungeons.content.Biomes.calcSkyColor;
import static juniebyte.javadungeons.content.SurfaceBuilders.newConfiguredSurfaceBuilder;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import juniebyte.javadungeons.content.CreeperWoodsBlocks;
import juniebyte.javadungeons.content.Features;
import juniebyte.javadungeons.content.GenericBlocks;
import juniebyte.javadungeons.content.JDConfiguredFeatures;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.CountNoiseDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.RandomFeatureConfig;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class CreeperWoodsBiome extends Biome {
    static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = newConfiguredSurfaceBuilder("plains", new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT,
            new TernarySurfaceConfig(
                    CreeperWoodsBlocks.CW_GRASS_BLOCK.getDefaultState(),
                    CreeperWoodsBlocks.CW_DIRT.getDefaultState(),
                    CreeperWoodsBlocks.CW_DIRT.getDefaultState()
            ))
    );
    static final Precipitation PRECIPATATION = Precipitation.RAIN;
    static final Category CATEGORY = Category.PLAINS;
    static final float DEPTH = 0.1F;
    static final float SCALE = 0.2F;
    static final float TEMPERATURE = 0.7F;
    static final float DOWNFALL = 0.8F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final Biome.Weather WEATHER = new Biome.Weather(PRECIPATATION, TEMPERATURE, TemperatureModifier.NONE, DOWNFALL);
    static final SpawnSettings.Builder SPAWN_SETTINGS = new SpawnSettings.Builder();
    static final GenerationSettings.Builder GENERATION_SETTINGS = (new GenerationSettings.Builder()).surfaceBuilder(SURFACE_BUILDER);

    public CreeperWoodsBiome() {
        super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeEffects.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).grassColor(0x197862).foliageColor(0x2bcca6).fogColor(12638463).skyColor(calcSkyColor(0.8F)).moodSound(BiomeMoodSound.CAVE).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.build());
    }


    //Reason: We need to call this statically before the class is constructed to add our biomes to the Generation Settings `feature` list on time and mob spawns to the Spawn Settings `spawners` map.
    //Why: Using the constructor it'd fire too late and never add the features/spawners to these lists.
    static {
        GENERATION_SETTINGS.structureFeature(ConfiguredStructureFeatures.MINESHAFT);
        GENERATION_SETTINGS.structureFeature(ConfiguredStructureFeatures.STRONGHOLD);
        GENERATION_SETTINGS.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL);

        DefaultBiomeFeatures.addLandCarvers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(GENERATION_SETTINGS);

        GENERATION_SETTINGS.feature(GenerationStep.Feature.LAKES, JDConfiguredFeatures.DUNGEONS_WATER_LAKE);

        DefaultBiomeFeatures.addDungeons(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addForestFlowers(GENERATION_SETTINGS);

        GENERATION_SETTINGS.feature(GenerationStep.Feature.UNDERGROUND_ORES, Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "cw_dirt"), Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, CreeperWoodsBlocks.CW_DIRT.getDefaultState(), 33)).decorate(Decorator.COUNT_NOISE.configure(new CountNoiseDecoratorConfig(10, 0, 256)))));
        GENERATION_SETTINGS.feature(GenerationStep.Feature.UNDERGROUND_ORES, Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "gravel"), Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, Blocks.GRAVEL.getDefaultState(), 33)).decorate(Decorator.COUNT_NOISE.configure(new CountNoiseDecoratorConfig(8, 0, 256)))));
        GENERATION_SETTINGS.feature(GenerationStep.Feature.UNDERGROUND_ORES, Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "granite"), Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, Blocks.GRANITE.getDefaultState(), 33)).decorate(Decorator.COUNT_NOISE.configure(new CountNoiseDecoratorConfig(10, 0, 80)))));
        GENERATION_SETTINGS.feature(GenerationStep.Feature.UNDERGROUND_ORES, Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "diorite"), Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, Blocks.DIORITE.getDefaultState(), 33)).decorate(Decorator.COUNT_NOISE.configure(new CountNoiseDecoratorConfig(10, 0, 80)))));
        GENERATION_SETTINGS.feature(GenerationStep.Feature.UNDERGROUND_ORES, Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "andesite"), Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, Blocks.ANDESITE.getDefaultState(), 33)).decorate(Decorator.COUNT_NOISE.configure(new CountNoiseDecoratorConfig(10, 0, 80)))));

        // mossy stone
        GENERATION_SETTINGS.feature(GenerationStep.Feature.UNDERGROUND_ORES,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "mossy_stone"), Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        CreeperWoodsBlocks.CW_MOSSY_STONE.getDefaultState(), 33)).decorate(Decorator.COUNT_NOISE.configure(new CountNoiseDecoratorConfig(10, 0, 128))))
        );

        DefaultBiomeFeatures.addDefaultOres(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultDisks(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addForestTrees(GENERATION_SETTINGS);

        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "cw_trees"),
                Feature.RANDOM_SELECTOR.configure(
                        new RandomFeatureConfig(
                                ImmutableList.of(
                                        ConfiguredFeatures.BIRCH_BEES_0002.withChance(0.2F),
                                        JDConfiguredFeatures.CW_FANCY_OAK_TREE.withChance(0.1F)
                                ),
                                JDConfiguredFeatures.CW_OAK_TREE
                        )
                ).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP)
                        .decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1))))
        );

        // glow shrooms
        //TODO
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "glow_plants"),
                Features.GLOW_PLANTS.configure(new CountConfig(4))
                        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(3)))));

        // pop flower and flower patches
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pop_flower"), Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(
                        new SimpleBlockStateProvider(CreeperWoodsBlocks.CW_POP_FLOWER.getDefaultState()),
                        new SimpleBlockPlacer())
                        .tries(64).whitelist(ImmutableSet.of(CreeperWoodsBlocks.CW_GRASS_BLOCK))
                        .cannotProject().build()).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
                )
        );
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "flower_patch"), Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(
                        new SimpleBlockStateProvider(CreeperWoodsBlocks.CW_FLOWER_PATCH.getDefaultState()),
                        new SimpleBlockPlacer())
                        .tries(64).whitelist(ImmutableSet.of(CreeperWoodsBlocks.CW_GRASS_BLOCK))
                        .cannotProject().build()).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
                )
        );

        DefaultBiomeFeatures.addForestGrass(GENERATION_SETTINGS);

        // add dungeons vegetation
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "short_grass"), Feature.RANDOM_PATCH.configure(
                        new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.SHORT_GRASS.getDefaultState()), new SimpleBlockPlacer())
                                .tries(32)
                                .build()).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(2)))
                )
        );

        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "fern"), Feature.RANDOM_PATCH.configure(
                        new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.FERN.getDefaultState()), new SimpleBlockPlacer())
                                .tries(32)
                                .build()).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(2)))
                )
        );

        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "shrub"), Feature.RANDOM_PATCH.configure(
                        new RandomPatchFeatureConfig.Builder(
                                new SimpleBlockStateProvider(CreeperWoodsBlocks.CW_SHRUB.getDefaultState()),
                                new SimpleBlockPlacer()
                        ).tries(32).build()).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(2)))
                )
        );

        // add berry bush blocks
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "berry_bush"), Feature.RANDOM_PATCH.configure(
                        new RandomPatchFeatureConfig.Builder(
                                new SimpleBlockStateProvider(GenericBlocks.BERRY_BUSH_BLOCK.getDefaultState()),
                                new SimpleBlockPlacer()
                        ).tries(64).whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK))
                        .cannotProject().build()).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
                )
        );

        DefaultBiomeFeatures.addDefaultMushrooms(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultVegetation(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addSprings(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addFrozenTopLayer(GENERATION_SETTINGS);

        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 10, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 8, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.AMBIENT, new SpawnSettings.SpawnEntry(EntityType.BAT, 10, 8, 8));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.CREEPER, 150, 4, 16));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SLIME, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.WITCH, 5, 1, 1));
    }
}