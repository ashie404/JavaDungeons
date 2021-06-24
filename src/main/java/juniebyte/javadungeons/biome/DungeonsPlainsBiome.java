package juniebyte.javadungeons.biome;

import com.google.common.collect.ImmutableSet;
import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.content.GenericBlocks;
import juniebyte.javadungeons.content.JDConfiguredFeatures;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.structure.PillagerOutpostGenerator;
import net.minecraft.structure.PlainsVillageData;
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
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import static juniebyte.javadungeons.content.Biomes.calcSkyColor;
import static juniebyte.javadungeons.content.SurfaceBuilders.newConfiguredSurfaceBuilder;

public class DungeonsPlainsBiome extends Biome {
	static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = newConfiguredSurfaceBuilder("plains", new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT,
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
	static final Biome.Weather WEATHER = new Biome.Weather(PRECIPATATION, TEMPERATURE, TemperatureModifier.NONE, DOWNFALL);
	static final SpawnSettings.Builder SPAWN_SETTINGS = new SpawnSettings.Builder();
	static final GenerationSettings.Builder GENERATION_SETTINGS = (new GenerationSettings.Builder()).surfaceBuilder(SURFACE_BUILDER);

	public DungeonsPlainsBiome() {
		super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).grassColor(0x197862).foliageColor(0x197862).fogColor(12638463).skyColor(calcSkyColor(0.8F)).moodSound(BiomeMoodSound.CAVE).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.build());
	}

    static {
        GENERATION_SETTINGS.structureFeature(Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, new Identifier(JavaDungeons.MOD_ID, "plains_village"), StructureFeature.VILLAGE.configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 6))));
        GENERATION_SETTINGS.structureFeature(Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, new Identifier(JavaDungeons.MOD_ID, "plains_outpost"), StructureFeature.PILLAGER_OUTPOST.configure(new StructurePoolFeatureConfig(() -> PillagerOutpostGenerator.STRUCTURE_POOLS, 7))));
        GENERATION_SETTINGS.structureFeature(Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, new Identifier(JavaDungeons.MOD_ID, "plains_mineshaft"), StructureFeature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004F, MineshaftFeature.Type.NORMAL))));
        GENERATION_SETTINGS.structureFeature(Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, new Identifier(JavaDungeons.MOD_ID, "plains_stronghold"), StructureFeature.STRONGHOLD.configure(FeatureConfig.DEFAULT)));
        GENERATION_SETTINGS.structureFeature(Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, new Identifier(JavaDungeons.MOD_ID, "plains_ruined_portal"), StructureFeature.RUINED_PORTAL.configure(new RuinedPortalFeatureConfig(RuinedPortalFeature.Type.STANDARD))));

        DefaultBiomeFeatures.addLandCarvers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(GENERATION_SETTINGS);

		GENERATION_SETTINGS.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, JDConfiguredFeatures.DUNGEONS_WATER_LAKE);

        DefaultBiomeFeatures.addDungeons(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addForestFlowers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addMineables(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultOres(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultDisks(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultFlowers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultMushrooms(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultVegetation(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addPlainsFeatures(GENERATION_SETTINGS);

        // add dungeons vegetation
		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, JDConfiguredFeatures.registerConfiguredFeature("short_grass", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.SHORT_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(2)))));

		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, JDConfiguredFeatures.registerConfiguredFeature("fern", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.FERN.getDefaultState()), new SimpleBlockPlacer())).tries(32).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(2)))));

		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION, JDConfiguredFeatures.registerConfiguredFeature("shrub", Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.SHRUB.getDefaultState()), new SimpleBlockPlacer())).tries(16).build()
        ).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1)))));

        // add berry bush blocks
		GENERATION_SETTINGS.feature(GenerationStep.Feature.VEGETAL_DECORATION,
				JDConfiguredFeatures.registerConfiguredFeature("berry_bushes",
						Feature.RANDOM_PATCH.configure(
								new RandomPatchFeatureConfig.Builder(
										new SimpleBlockStateProvider(GenericBlocks.BERRY_BUSH_BLOCK.getDefaultState()),
										new SimpleBlockPlacer()
								).tries(64)
								.whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK))
								.cannotProject().build()).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1))
						)
				)
		);

        DefaultBiomeFeatures.addPlainsTallGrass(GENERATION_SETTINGS);
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
        return 0x638F42;
    }
  
    @Override
    public int getFoliageColor() {
        return 0x668E38;
    }
}
