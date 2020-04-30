package j0sh.javadungeons.biome;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.BranchedTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;
import net.minecraft.world.gen.feature.RandomFeatureConfig;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SingleStateFeatureConfig;
import net.minecraft.world.gen.feature.MineshaftFeature;
import net.minecraft.world.gen.feature.VillageFeatureConfig;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.CountExtraChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import j0sh.javadungeons.content.*;

public class PumpkinPasturesBiome extends Biome {

    public PumpkinPasturesBiome() {
        super(new Biome.Settings().configureSurfaceBuilder(SurfaceBuilder.DEFAULT, 
            new TernarySurfaceConfig(
                GenericBlocks.GRASS_BLOCK.getDefaultState(), 
                GenericBlocks.DIRT.getDefaultState(), 
                GenericBlocks.DIRT.getDefaultState()
            ))
            .precipitation(Biome.Precipitation.RAIN).category(Biome.Category.PLAINS)
            .depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F)
            .waterColor(4159204).waterFogColor(329011)
            .parent((String)null
        ));
        
        this.addStructureFeature(Feature.VILLAGE.configure(new VillageFeatureConfig("village/plains/town_centers", 6)));
        this.addStructureFeature(Feature.PILLAGER_OUTPOST.configure(FeatureConfig.DEFAULT));
        this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL)));
        this.addStructureFeature(Feature.STRONGHOLD.configure(FeatureConfig.DEFAULT));

        DefaultBiomeFeatures.addLandCarvers(this);
        DefaultBiomeFeatures.addDefaultStructures(this);

        this.addFeature(GenerationStep.Feature.LOCAL_MODIFICATIONS,
		    Features.DUNGEONS_WATER_LAKE.configure(new SingleStateFeatureConfig(Fluids.DUNGEONS_WATER.getDefaultState()))
            .createDecoratedFeature(Decorator.WATER_LAKE.configure(new ChanceDecoratorConfig(10))));

        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addPlainsTallGrass(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addDefaultDisks(this);
        DefaultBiomeFeatures.addDefaultGrass(this);

        // add dungeons vegetation
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.SHORT_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build()
        ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(2))));
            
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(GenericBlocks.FERN.getDefaultState()), new SimpleBlockPlacer())).tries(32).build()
        ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(2))));  
            
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(
            (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_SHRUB.getDefaultState()), new SimpleBlockPlacer())).tries(16).build()
        ).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));     

        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addDefaultMushrooms(this);

        // autumnal trees
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.configure(
            new RandomFeatureConfig(
                ImmutableList.of(
                    Feature.NORMAL_TREE.configure(
                        (new BranchedTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), 
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_LEAVES.getDefaultState()), 
                        new BlobFoliagePlacer(2, 0)))
                        .baseHeight(4).heightRandA(2).foliageHeight(3)
                        .noVines().treeDecorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).build()
                    ).withChance(0.2F), 
                    Feature.FANCY_TREE.configure(
                        (new BranchedTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), 
                        new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.getDefaultState()), 
                        new BlobFoliagePlacer(2, 0)))
                        .baseHeight(4).heightRandA(2).foliageHeight(3)
                        .noVines().treeDecorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).build()
                    ).withChance(0.2F)
                ), 
                Feature.NORMAL_TREE.configure(
                    (new BranchedTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), 
                    new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.getDefaultState()), 
                    new BlobFoliagePlacer(2, 0)))
                    .baseHeight(4).heightRandA(2).foliageHeight(3)
                    .noVines().treeDecorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).build()
                )
            )
        ).createDecoratedFeature(Decorator.COUNT_EXTRA_HEIGHTMAP.configure(new CountExtraChanceDecoratorConfig(2, 0.1F, 1))));

        // pumpkin patches
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(
                new SimpleBlockStateProvider(Blocks.PUMPKIN.getDefaultState()),
                new SimpleBlockPlacer())
            .tries(16).whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK))
            .cannotProject().build()).createDecoratedFeature(Decorator.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceDecoratorConfig(2)))
        );
        
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(
                new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_BURNT_PUMPKIN.getDefaultState()),
                new SimpleBlockPlacer())
            .tries(16).whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK))
            .cannotProject().build()).createDecoratedFeature(Decorator.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceDecoratorConfig(8)))
        );

        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, 
            Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig.Builder(
                new SimpleBlockStateProvider(PumpkinPasturesBlocks.PM_ROTTED_PUMPKIN.getDefaultState()),
                new SimpleBlockPlacer())
            .tries(16).whitelist(ImmutableSet.of(GenericBlocks.GRASS_BLOCK))
            .cannotProject().build()).createDecoratedFeature(Decorator.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceDecoratorConfig(4)))
        );

        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addFrozenTopLayer(this);

        this.addSpawn(EntityCategory.CREATURE, new Biome.SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(EntityCategory.CREATURE, new Biome.SpawnEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(EntityCategory.CREATURE, new Biome.SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(EntityCategory.CREATURE, new Biome.SpawnEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(EntityCategory.CREATURE, new Biome.SpawnEntry(EntityType.HORSE, 5, 2, 6));
        this.addSpawn(EntityCategory.CREATURE, new Biome.SpawnEntry(EntityType.DONKEY, 1, 1, 3));
        this.addSpawn(EntityCategory.AMBIENT, new Biome.SpawnEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(EntityType.WITCH, 5, 1, 1));
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