package j0sh.javadungeons.biome;

import j0sh.javadungeons.content.CactiCanyonBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placer.DoublePlantPlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public final class CactiCanyonDesertBiome extends Biome {
   public CactiCanyonDesertBiome() {
      super((new Biome.Settings()).configureSurfaceBuilder(SurfaceBuilder.DEFAULT,
        new TernarySurfaceConfig(CactiCanyonBlocks.CC_SAND.getDefaultState(), CactiCanyonBlocks.CC_SANDSTONE.getDefaultState(), Blocks.GRAVEL.getDefaultState()))
        .precipitation(Biome.Precipitation.NONE).category(Biome.Category.DESERT)
        .depth(0.125F).scale(0.05F).temperature(2.0F).downfall(0.0F).effects(
                new BiomeEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .build()
              ).parent(null)
      );

      this.addStructureFeature(Feature.VILLAGE.configure(new StructurePoolFeatureConfig("village/desert/town_centers", 6)));
      this.addStructureFeature(Feature.PILLAGER_OUTPOST.configure(FeatureConfig.DEFAULT));
      this.addStructureFeature(Feature.DESERT_PYRAMID.configure(FeatureConfig.DEFAULT));
      this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL)));
      this.addStructureFeature(Feature.STRONGHOLD.configure(FeatureConfig.DEFAULT));
      DefaultBiomeFeatures.addLandCarvers(this);
      DefaultBiomeFeatures.addDefaultStructures(this);
      DefaultBiomeFeatures.addDesertLakes(this);
      DefaultBiomeFeatures.addDungeons(this);
      DefaultBiomeFeatures.addMineables(this);
      DefaultBiomeFeatures.addDefaultOres(this);
      DefaultBiomeFeatures.addDefaultDisks(this);
      DefaultBiomeFeatures.addDefaultFlowers(this);
      DefaultBiomeFeatures.addDefaultGrass(this);
      DefaultBiomeFeatures.addDesertDeadBushes(this);
      DefaultBiomeFeatures.addDefaultMushrooms(this);
      DefaultBiomeFeatures.addDesertVegetation(this);
      // add cacti canyon vegatation
      /*this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
        (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_DESERT_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(2).build()
    ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP.configure(new CountDecoratorConfig(1))));

    this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
        (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_FERN.getDefaultState()), new SimpleBlockPlacer())).tries(6).build()
    ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP.configure(new CountDecoratorConfig(2))));  

    this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
        (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_CACTUS.getDefaultState()), new SimpleBlockPlacer())).tries(1).build()
    ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP.configure(new CountDecoratorConfig(1))));     

    this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
        (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_SMALL_CACTUS.getDefaultState()), new SimpleBlockPlacer())).tries(1).build()
    ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP.configure(new CountDecoratorConfig(1))));     

    this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
        (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_FLOWERS.getDefaultState()), new SimpleBlockPlacer())).tries(1).build()
    ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP.configure(new CountDecoratorConfig(1))));  

    this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
        (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_YUCCA.getDefaultState()), new DoublePlantPlacer())).tries(1).build()
    ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP.configure(new CountDecoratorConfig(1))));  

    this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
        (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(CactiCanyonBlocks.CC_TALL_CACTUS.getDefaultState()), new DoublePlantPlacer())).tries(1).build()
    ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP.configure(new CountDecoratorConfig(1))));  */
      DefaultBiomeFeatures.addSprings(this);
      DefaultBiomeFeatures.addDesertFeatures(this);
      DefaultBiomeFeatures.addFrozenTopLayer(this);
      this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.RABBIT, 4, 2, 3));
      this.addSpawn(SpawnGroup.AMBIENT, new Biome.SpawnEntry(EntityType.BAT, 10, 8, 8));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.SPIDER, 100, 4, 4));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.SKELETON, 100, 4, 4));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.CREEPER, 100, 4, 4));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.SLIME, 100, 4, 4));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.WITCH, 5, 1, 1));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.ZOMBIE, 19, 4, 4));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 1, 1, 1));
      this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.HUSK, 80, 4, 4));
   }
}