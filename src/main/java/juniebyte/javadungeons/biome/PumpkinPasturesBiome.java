package juniebyte.javadungeons.biome;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import juniebyte.javadungeons.content.GenericBlocks;
import juniebyte.javadungeons.content.JDConfiguredFeatures;
import juniebyte.javadungeons.content.PumpkinPasturesBlocks;
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
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import static juniebyte.javadungeons.JavaDungeons.MOD_ID;
import static juniebyte.javadungeons.content.Biomes.calcSkyColor;
import static juniebyte.javadungeons.content.SurfaceBuilders.newConfiguredSurfaceBuilder;

public class PumpkinPasturesBiome extends Biome {
    static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = newConfiguredSurfaceBuilder("pumpkin_pastures", new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT,
            new TernarySurfaceConfig(
                GenericBlocks.GRASS_BLOCK.getDefaultState(), 
                GenericBlocks.DIRT.getDefaultState(), 
                GenericBlocks.DIRT.getDefaultState()
            ))
    );
    static final Precipitation PRECIPATATION = Precipitation.RAIN;
    static final Category CATEGORY = Category.PLAINS;
    static final float DEPTH = 0.125F;
    static final float SCALE = 0.05F;
    static final float TEMPERATURE = 0.8F;
    static final float DOWNFALL = 0.4F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final Biome.Weather WEATHER = new Biome.Weather(PRECIPATATION, TEMPERATURE, TemperatureModifier.NONE, DOWNFALL);
    static final SpawnSettings.Builder SPAWN_SETTINGS = new SpawnSettings.Builder();
    static final GenerationSettings.Builder GENERATION_SETTINGS = (new GenerationSettings.Builder()).surfaceBuilder(SURFACE_BUILDER);

    public PumpkinPasturesBiome() {
        super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeEffects.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).grassColor(0xCD934C).foliageColor(0xCD934C).fogColor(12638463).skyColor(calcSkyColor(0.8F)).moodSound(BiomeMoodSound.CAVE).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.build());
    }

    static {
        GENERATION_SETTINGS.structureFeature(ConfiguredStructureFeatures.MINESHAFT);
        GENERATION_SETTINGS.structureFeature(ConfiguredStructureFeatures.STRONGHOLD);
        GENERATION_SETTINGS.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL);

        DefaultBiomeFeatures.addLandCarvers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(GENERATION_SETTINGS);

        // need to add dungeons water lake feature

        DefaultBiomeFeatures.addDungeons(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addPlainsTallGrass(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addMineables(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultOres(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultDisks(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultGrass(GENERATION_SETTINGS);

        // add dungeons vegetation
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pm_short_grass"), Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.SHORT_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build()
        ).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(2)))));
            
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pm_general_fern"), Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.FERN.getDefaultState()), new SimpleBlockPlacer())).tries(32).build()
        ).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(2)))));  
            
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pm_shrub"), Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_SHRUB.getDefaultState()), new SimpleBlockPlacer())).tries(16).build()
        ).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))));    

        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pm_fern"), Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_FERN.getDefaultState()), new SimpleBlockPlacer())).tries(16).build()
        ).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))));     

        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pm_dead_sapling"), Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_DEAD_SAPLING.getDefaultState()), new SimpleBlockPlacer())).tries(16).build()
        ).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))));

        DefaultBiomeFeatures.addDefaultMushrooms(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultFlowers(GENERATION_SETTINGS);
        
        // autumnal trees
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pm_trees"),
            Feature.RANDOM_SELECTOR.configure(
            new RandomFeatureConfig(
                ImmutableList.of(
                    JDConfiguredFeatures.PM_YELLOW_AUTUMNAL_TREE.withChance(0.2F),
                    JDConfiguredFeatures.PM_FANCY_RED_AUTUMNAL_TREE.withChance(0.1F)
                ),
                JDConfiguredFeatures.PM_RED_AUTUMNAL_TREE
            )
        ).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP)
        .decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(2, 0.1F, 1)))));

        // pumpkin patches
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pumpkin_patch_0"),
                        Feature.RANDOM_PATCH.configure(
                                new RandomPatchFeatureConfig.Builder(
                                        new SimpleBlockStateProvider(Blocks.PUMPKIN.getDefaultState()),
                                        SimpleBlockPlacer.INSTANCE
                                ).tries(16).whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK)).cannotProject().build()
                        ).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(2)
                )
        );
        
        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pumpkin_patch_1"),
                Feature.RANDOM_PATCH.configure(
                        new RandomPatchFeatureConfig.Builder(
                                new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_BURNT_PUMPKIN.getDefaultState()),
                                SimpleBlockPlacer.INSTANCE
                        ).tries(16).whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK)).cannotProject().build()
                ).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(8)
            )
        );

        GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "pumpkin_patch_2"),
                        Feature.RANDOM_PATCH.configure(
                                new RandomPatchFeatureConfig.Builder(
                                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_ROTTED_PUMPKIN.getDefaultState()),
                                        SimpleBlockPlacer.INSTANCE
                                ).tries(16).whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK)).cannotProject().build()
                        ).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4)
                )
        );

        DefaultBiomeFeatures.addSprings(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addFrozenTopLayer(GENERATION_SETTINGS);

        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 10, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 8, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.HORSE, 5, 2, 6));
        SPAWN_SETTINGS.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.DONKEY, 1, 1, 3));
        SPAWN_SETTINGS.spawn(SpawnGroup.AMBIENT,  new SpawnSettings.SpawnEntry(EntityType.BAT, 10, 8, 8));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER,  new SpawnSettings.SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER,  new SpawnSettings.SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER,  new SpawnSettings.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER,  new SpawnSettings.SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER,  new SpawnSettings.SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER,  new SpawnSettings.SpawnEntry(EntityType.SLIME, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER,  new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER,  new SpawnSettings.SpawnEntry(EntityType.WITCH, 5, 1, 1));
    }
}
