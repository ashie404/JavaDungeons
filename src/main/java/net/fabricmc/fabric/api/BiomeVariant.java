package net.fabricmc.fabric.api;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

/**
 * Represents a biome variant and its corresponding chance.
 */
final class BiomeVariant {
	private final RegistryKey<Biome> variant;
	private final double chance;

	/**
	 * @param variant the variant biome
	 * @param chance the chance of replacement of the biome into the variant
	 */
	BiomeVariant(final RegistryKey<Biome> variant, final double chance) {
		this.variant = variant;
		this.chance = chance;
	}

	/**
	 * @return the variant biome
	 */
	RegistryKey<Biome> getVariant() {
		return variant;
	}

	/**
	 * @return the chance of replacement of the biome into the variant
	 */
	double getChance() {
		return chance;
	}
}