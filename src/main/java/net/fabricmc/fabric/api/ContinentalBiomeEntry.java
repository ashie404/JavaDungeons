package net.fabricmc.fabric.api;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

/**
 * Represents a biome and its corresponding weight.
 */
final class ContinentalBiomeEntry {
	private final RegistryKey<Biome> biome;
	private final double weight;
	private final double upperWeightBound;

	/**
	 * @param biome the biome
	 * @param weight how often a biome will be chosen
	 * @param upperWeightBound the upper weight bound within the context of the other entries, used for the binary search
	 */
	ContinentalBiomeEntry(final RegistryKey<Biome> biome, final double weight, final double upperWeightBound) {
		this.biome = biome;
		this.weight = weight;
		this.upperWeightBound = upperWeightBound;
	}

	RegistryKey<Biome> getBiome() {
		return biome;
	}

	double getWeight() {
		return weight;
	}

	/**
	 * @return the upper weight boundary for the search
	 */
	double getUpperWeightBound() {
		return upperWeightBound;
	}
}