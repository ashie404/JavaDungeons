package juniebyte.javadungeons.biome;

import juniebyte.javadungeons.content.ConfiguredFeatures;
import juniebyte.javadungeons.content.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placer.DoublePlantPlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import static juniebyte.javadungeons.content.Biomes.calcSkyColor;
import static juniebyte.javadungeons.content.SurfaceBuilders.newConfiguredSurfaceBuilder;

public class CactiCanyonBiome extends Biome {
	static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = newConfiguredSurfaceBuilder("cacti_canyon", new ConfiguredSurfaceBuilder<>(SurfaceBuilders.CACTI_CANYON,
			new TernarySurfaceConfig(
					CactiCanyonBlocks.CC_GRASS_BLOCK.getDefaultState(),
					CactiCanyonBlocks.CC_SANDSTONE.getDefaultState(),
					CactiCanyonBlocks.CC_DIRT.getDefaultState()
			))
	);
	static final Precipitation PRECIPATATION = Precipitation.NONE;
	static final Category CATEGORY = Biome.Category.MESA;
	static final float DEPTH = 0.1F;
	static final float SCALE = 0.2F;
	static final float TEMPERATURE = 2.0F;
	static final float DOWNFALL = 0.0F;
	static final int WATER_COLOR = 4159204;
	static final int WATER_FOG_COLOR = 329011;
	static final Biome.Weather WEATHER = new Biome.Weather(PRECIPATATION, TEMPERATURE, TemperatureModifier.NONE, DOWNFALL);
	static final SpawnSettings.Builder SPAWN_SETTINGS = new SpawnSettings.Builder();
	static final GenerationSettings.Builder GENERATION_SETTINGS = (new GenerationSettings.Builder()).surfaceBuilder(SURFACE_BUILDER);

	public CactiCanyonBiome() {
		super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeEffects.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).grassColor(0x197862).foliageColor(0x197862).fogColor(12638463).skyColor(calcSkyColor(0.8F)).moodSound(BiomeMoodSound.CAVE).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.build());
	}

    static  {
		GENERATION_SETTINGS.structureFeature(ConfiguredStructureFeatures.MINESHAFT);
		GENERATION_SETTINGS.structureFeature(ConfiguredStructureFeatures.STRONGHOLD);
		GENERATION_SETTINGS.structureFeature(StructureFeature.RUINED_PORTAL.configure(new RuinedPortalFeatureConfig(RuinedPortalFeature.Type.STANDARD)));

        DefaultBiomeFeatures.addLandCarvers(GENERATION_SETTINGS);

        DefaultBiomeFeatures.addDefaultUndergroundStructures(GENERATION_SETTINGS);

		GENERATION_SETTINGS.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS,
				ConfiguredFeatures.registerConfiguredFeature("dungeons_water_lake",
						Features.DUNGEONS_WATER_LAKE.configure(new SingleStateFeatureConfig(Fluids.DUNGEONS_WATER.getDefaultState()))
								.range(net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.BOTTOM_TO_TOP).spreadHorizontally()
				)
		);

        DefaultBiomeFeatures.addDungeons(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addMineables(GENERATION_SETTINGS);

        // add cacti canyon dirt
		GENERATION_SETTINGS.feature(
                GenerationStep.Feature.UNDERGROUND_ORES,
				ConfiguredFeatures.registerConfiguredFeature("cc_dirt", Feature.ORE.configure(
                        new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, CactiCanyonBlocks.CC_DIRT.getDefaultState(), 33)
                ).uniformRange(YOffset.fixed(30), YOffset.getTop()))
        );

        DefaultBiomeFeatures.addDefaultOres(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultDisks(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultMushrooms(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultVegetation(GENERATION_SETTINGS);

        // add cacti canyon vegatation
		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.registerConfiguredFeature("desert_grass", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_DESERT_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(4).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1)))));

		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.registerConfiguredFeature("cc_fern", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_FERN.getDefaultState()), new SimpleBlockPlacer())).tries(32).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(2)))));

		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.registerConfiguredFeature("cactus", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_CACTUS.getDefaultState()), new SimpleBlockPlacer())).tries(4).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1)))));

		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.registerConfiguredFeature("small_cacti", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_SMALL_CACTUS.getDefaultState()), new SimpleBlockPlacer())).tries(2).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1)))));

		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.registerConfiguredFeature("flowers", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_FLOWERS.getDefaultState()), new SimpleBlockPlacer())).tries(8).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1)))));

		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.registerConfiguredFeature("yucca", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_YUCCA.getDefaultState()), new DoublePlantPlacer())).tries(2).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1)))));

		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.registerConfiguredFeature("tall_cacti", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_TALL_CACTUS.getDefaultState()), new DoublePlantPlacer())).tries(1).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1)))));

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
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SLIME, 100, 4, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        SPAWN_SETTINGS.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.WITCH, 5, 1, 1));
    }

    @Override
    public int getGrassColorAt(double x, double z) {
        return 0x71B518;
    }

    @Override
    public int getFoliageColor() {
        return 0x71B518;
    }
}
