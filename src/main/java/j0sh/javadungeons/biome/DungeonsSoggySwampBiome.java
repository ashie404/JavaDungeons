//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package j0sh.javadungeons.biome;

import com.google.common.collect.ImmutableList;
import j0sh.javadungeons.content.Features;
import j0sh.javadungeons.content.Fluids;
import j0sh.javadungeons.content.SoggySwampBlocks;
import j0sh.javadungeons.content.SurfaceBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.DecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.MineshaftFeature.Type;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public final class DungeonsSoggySwampBiome extends Biome {
    public DungeonsSoggySwampBiome() {
        super(new Biome.Settings().configureSurfaceBuilder(SurfaceBuilders.SOGGY_SWAMP,
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
        this.addStructureFeature(Feature.SWAMP_HUT.configure(FeatureConfig.DEFAULT));
        this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, Type.NORMAL)));
        this.addStructureFeature(Feature.RUINED_PORTAL.configure(new RuinedPortalFeatureConfig(net.minecraft.world.gen.feature.RuinedPortalFeature.Type.SWAMP)));
        DefaultBiomeFeatures.addLandCarvers(this);
        DefaultBiomeFeatures.addDefaultStructures(this);
        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addClay(this);
        DefaultBiomeFeatures.addSwampFeatures(this);
        DefaultBiomeFeatures.addDefaultMushrooms(this);
        DefaultBiomeFeatures.addSwampVegetation(this);

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
        return d < -0.1D ? 5011004 : 6975545;
    }

    @Environment(EnvType.CLIENT)
    public int getFoliageColor() {
        return 6975545;
    }
}
