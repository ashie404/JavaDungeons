//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package juniebyte.javadungeons.biome;

import com.google.common.collect.ImmutableList;
import juniebyte.javadungeons.content.Features;
import juniebyte.javadungeons.content.Fluids;
import juniebyte.javadungeons.content.SoggySwampBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.MineshaftFeature.Type;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.feature.RuinedPortalFeature;

public final class SoggySwampBiome extends Biome {
    public SoggySwampBiome() {
        super(new Biome.Settings().configureSurfaceBuilder(SurfaceBuilder.SWAMP,
                new TernarySurfaceConfig(
                        SoggySwampBlocks.SS_GRASS_BLOCK.getDefaultState(),
                        SoggySwampBlocks.SS_DIRT.getDefaultState(),
                        SoggySwampBlocks.SS_DIRT.getDefaultState()
                ))
                .precipitation(Biome.Precipitation.RAIN).category(Category.SWAMP)
                .depth(-0.05F).scale(0.1F).temperature(0.8F).downfall(0.9F).effects(
                        new BiomeEffects.Builder()
                                .waterColor(6388580)
                                .waterFogColor(2302743)
                                .fogColor(12638463)
                                .moodSound(BiomeMoodSound.CAVE)
                                .build()
                ).parent(null)
                .noises(ImmutableList.of(new Biome.MixedNoisePoint(0.0F, 0.0F, 0.0F, 0.0F, 1.0F)))
        );
        this.addStructureFeature(StructureFeature.SWAMP_HUT.configure(FeatureConfig.DEFAULT));
        this.addStructureFeature(StructureFeature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, Type.NORMAL)));
        this.addStructureFeature(StructureFeature.RUINED_PORTAL.configure(new RuinedPortalFeatureConfig(RuinedPortalFeature.Type.SWAMP)));
        DefaultBiomeFeatures.addLandCarvers(this);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(this);
        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addClay(this);
        // add swamp features without swamp trees
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.FLOWER.configure(DefaultBiomeFeatures.BLUE_ORCHID_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_32.configure(new CountDecoratorConfig(1))));
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.GRASS_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(5))));
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.DEAD_BUSH_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(1))));
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.LILY_PAD_CONFIG).createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(4))));
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.BROWN_MUSHROOM_CONFIG).createDecoratedFeature(Decorator.COUNT_CHANCE_HEIGHTMAP.configure(new CountChanceDecoratorConfig(8, 0.25F))));
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.RED_MUSHROOM_CONFIG).createDecoratedFeature(Decorator.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new CountChanceDecoratorConfig(8, 0.125F))));

        // swamp trees
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.TREE.configure(
                (new TreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_LOG.getDefaultState()),
                        new SimpleBlockStateProvider(SoggySwampBlocks.SS_SWAMP_LEAVES.getDefaultState()),
                        new BlobFoliagePlacer(3, 0, 0, 0, 3),
                        new StraightTrunkPlacer(5, 3, 0),
                        new TwoLayersFeatureSize(1, 0, 1)
                )).maxWaterDepth(1).decorators(ImmutableList.of(new LeaveVineTreeDecorator())).build()).createDecoratedFeature(Decorator.COUNT_EXTRA_HEIGHTMAP.configure(new CountExtraChanceDecoratorConfig(2, 0.1F, 1)))
        );

        DefaultBiomeFeatures.addDefaultMushrooms(this);


        this.addFeature(GenerationStep.Feature.LOCAL_MODIFICATIONS,
                Features.DUNGEONS_WATER_LAKE.configure(new SingleStateFeatureConfig(Fluids.SOGGY_SWAMP_WATER.getDefaultState()))
                        .createDecoratedFeature(Decorator.WATER_LAKE.configure(new ChanceDecoratorConfig(10))));

        this.addFeature(net.minecraft.world.gen.GenerationStep.Feature.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeagrassFeatureConfig(64, 0.6D)).createDecoratedFeature(Decorator.TOP_SOLID_HEIGHTMAP.configure(DecoratorConfig.DEFAULT)));
        DefaultBiomeFeatures.addFossils(this);
        DefaultBiomeFeatures.addFrozenTopLayer(this);
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(SpawnGroup.AMBIENT, new SpawnEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.WITCH, 5, 1, 1));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SLIME, 1, 1, 1));
    }

    @Environment(EnvType.CLIENT)
    public int getGrassColorAt(double x, double z) {
        double d = FOLIAGE_NOISE.sample(x * 0.0225D, z * 0.0225D, false);
        return d < -0.1D ? 0x6a7565 : 0x6c6e4f;
    }

    @Environment(EnvType.CLIENT)
    public int getFoliageColor() {
        return 0x6c6e4f;
    }

}