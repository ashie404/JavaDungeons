package j0sh.javadungeons.biome;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import j0sh.javadungeons.content.*;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.CountExtraChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;

import java.util.OptionalInt;

public class CharredPumpkinPasturesBiome extends Biome {

    public CharredPumpkinPasturesBiome() {
        super(new Settings().configureSurfaceBuilder(SurfaceBuilders.CHARRED_PUMPKIN_PASTURES,
            new TernarySurfaceConfig(
                PumpkinPasturesBlocks.PM_CHARRED_GRASS_BLOCK.getDefaultState(),
                PumpkinPasturesBlocks.PM_CHARRED_DIRT.getDefaultState(),
                PumpkinPasturesBlocks.PM_CHARRED_DIRT.getDefaultState()
            ))
            .precipitation(Precipitation.NONE).category(Category.PLAINS)
            .depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).effects((new BiomeEffects.Builder())
            .waterColor(4159204).waterFogColor(329011).fogColor(12638463)
            .moodSound(BiomeMoodSound.CAVE).build()).parent(null)
            .noises(ImmutableList.of(new MixedNoisePoint(0.0F, 0.0F, 0.0F, 0.0F, 1.0F)))
            .parent(null)
        );
        
        this.addStructureFeature(Feature.VILLAGE.configure(new StructurePoolFeatureConfig("village/plains/town_centers", 6)));
        this.addStructureFeature(Feature.PILLAGER_OUTPOST.configure(FeatureConfig.DEFAULT));
        this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL)));
        this.addStructureFeature(Feature.STRONGHOLD.configure(FeatureConfig.DEFAULT));

        DefaultBiomeFeatures.addLandCarvers(this);
        DefaultBiomeFeatures.addDefaultStructures(this);

        this.addFeature(GenerationStep.Feature.LOCAL_MODIFICATIONS,
		    Features.DUNGEONS_WATER_LAKE.configure(new SingleStateFeatureConfig(Fluids.DUNGEONS_WATER.getDefaultState()))
            .createDecoratedFeature(Decorator.WATER_LAKE.configure(new ChanceDecoratorConfig(10))));

        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addDefaultDisks(this);

        // add dungeons vegetation
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_CHARRED_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build()
        ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(2))));

        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_DEAD_SAPLING.getDefaultState()), new SimpleBlockPlacer())).tries(16).build()
        ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));    

        // autumnal trees
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.TREE.configure(
                (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_CHARRED_LOG.getDefaultState()),
                    new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
                    new LargeOakFoliagePlacer(2, 0, 4, 0, 4),
                    new LargeOakTrunkPlacer(3, 11, 0),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).method_27374().build()
        ).createDecoratedFeature(Decorator.COUNT_EXTRA_HEIGHTMAP.configure(new CountExtraChanceDecoratorConfig(2, 0.1F, 1))));
        
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(
                new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_BURNT_PUMPKIN.getDefaultState()),
                new SimpleBlockPlacer())
            .tries(16).whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK))
            .cannotProject().build()).createDecoratedFeature(Decorator.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceDecoratorConfig(3)))
        );

        DefaultBiomeFeatures.addFrozenTopLayer(this);

        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.HORSE, 5, 2, 6));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.DONKEY, 1, 1, 3));
        this.addSpawn(SpawnGroup.AMBIENT, new SpawnEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.WITCH, 5, 1, 1));
    }

    @Override
    public int getGrassColorAt(double x, double z) {
        return 0xCD934C;
    }
  
    @Override
    public int getFoliageColor() {
        return 0xCD934C;
    }
}