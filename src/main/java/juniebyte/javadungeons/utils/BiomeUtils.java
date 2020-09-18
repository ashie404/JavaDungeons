package juniebyte.javadungeons.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.mixin.BuiltinBiomesAccessor;
import net.fabricmc.fabric.api.FabricBiomesInternal;
import net.fabricmc.fabric.api.InternalBiomeData;
import net.fabricmc.fabric.api.OverworldClimate;
import net.fabricmc.fabric.api.VariantTransformer;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.layer.util.LayerRandomnessSource;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class BiomeUtils {

    /**
     * Used to add a feature to an existing biome.
     *
     * @param biome The target biome
     * @param generationStep The generation step
     * @param configuredFeature The feature to add to the biome
     */
    public static void addFeatureToBiome(Biome biome, GenerationStep.Feature generationStep, ConfiguredFeature<?, ?> configuredFeature) {
        List<List<Supplier<ConfiguredFeature<?, ?>>>> features = biome.getGenerationSettings().getFeatures();

        int generationStepIndex = generationStep.ordinal();

        while (features.size() <= generationStepIndex) {
            features.add(Lists.newArrayList());
        }

        List<Supplier<ConfiguredFeature<?, ?>>> stepList = features.get(generationStepIndex);

        if (stepList instanceof ImmutableList) {
            features.set(generationStepIndex, stepList = new ArrayList<>(stepList));
        }

        stepList.add(() -> configuredFeature);
    }

    public static RegistryKey<Biome> register(RegistryKey<Biome> key, Biome biome) {
        return FabricBiomesInternal.register(key, biome);
    }

    public static RegistryKey<Biome> addToOverworld(RegistryKey<Biome> key) {
        return FabricBiomesInternal.addToOverworld(key);
    }

    public static RegistryKey<Biome> addToNether(RegistryKey<Biome> key, Biome.MixedNoisePoint mixedNoisePoint) {
        return FabricBiomesInternal.addToNether(key, mixedNoisePoint);
    }

    public static void addNetherBiome(RegistryKey<Biome> biome, Biome.MixedNoisePoint mixedNoisePoint) {
        InternalBiomeData.addNetherBiome(biome, mixedNoisePoint);
    }

    public static void addContinentalBiome(RegistryKey<Biome> biome, OverworldClimate climate, double weight) {
        InternalBiomeData.addOverworldContinentalBiome(climate, biome, weight);
    }

    public static void addHillsBiome(RegistryKey<Biome> parent, RegistryKey<Biome> hills, double weight) {
        InternalBiomeData.addOverworldHillsBiome(parent, hills, weight);
    }

    public static void addShoreBiome(RegistryKey<Biome> parent, RegistryKey<Biome> shore, double weight) {
        InternalBiomeData.addOverworldShoreBiome(parent, shore, weight);
    }

    public static void addEdgeBiome(RegistryKey<Biome> parent, RegistryKey<Biome> edge, double weight) {
        InternalBiomeData.addOverworldEdgeBiome(parent, edge, weight);
    }

    public static void addBiomeVariant(RegistryKey<Biome> replaced, RegistryKey<Biome> variant, double chance, OverworldClimate... climates) {
        InternalBiomeData.addOverworldBiomeReplacement(replaced, variant, chance, climates);
    }

    public static void setRiverBiome(RegistryKey<Biome> parent, RegistryKey<Biome> river) {
        InternalBiomeData.setOverworldRiverBiome(parent, river);
    }

    public static int transformBiome(LayerRandomnessSource random, RegistryKey<Biome> existing, OverworldClimate climate) {
        Map<RegistryKey<Biome>, VariantTransformer> overworldVariantTransformers = InternalBiomeData.getOverworldVariantTransformers();
        VariantTransformer transformer = overworldVariantTransformers.get(existing);

        if (transformer != null) {
            RegistryKey<Biome> key = transformer.transformBiome(existing, random, climate);
            return getRawId(key);
        }

        return getRawId(existing);
    }

    public static int getRawId(RegistryKey<Biome> key) {
        return BuiltinRegistries.BIOME.getRawId(BuiltinRegistries.BIOME.getOrThrow(key));
    }

    /**
     * Makes sure that the given registry key is mapped in {@link net.minecraft.world.biome.BuiltinBiomes}. This mapping may be absent
     * if mods register their biomes only in {@link BuiltinRegistries#BIOME}, and not using the
     * private method in {@link net.minecraft.world.biome.BuiltinBiomes}.
     */
    public static void ensureIdMapping(RegistryKey<Biome> biomeKey) {
        int rawId = getRawId(biomeKey);
        Int2ObjectMap<RegistryKey<Biome>> biomes = BuiltinBiomesAccessor.getBY_RAW_ID();

        if (!biomes.containsKey(rawId)) {
            JavaDungeons.LOGGER.debug("Automatically creating layer-related raw-id mapping for biome {}", biomeKey);
            biomes.put(rawId, biomeKey);
        }
    }
}
