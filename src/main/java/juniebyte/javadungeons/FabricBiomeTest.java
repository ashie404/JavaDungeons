package juniebyte.javadungeons;

import juniebyte.javadungeons.utils.BiomeUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.DefaultBiomeCreator;

import static juniebyte.javadungeons.JavaDungeons.MOD_ID;

/**
 * <b>NOTES FOR TESTING:</b>
 * When running with this test-mod, also test this when running a dedicated server since there
 * are significant differences between server + client and how they sync biomes.
 *
 * <p>Ingame, you can use <code>/locatebiome</code> since we use nether- and end-biomes in the overworld,
 * and vice-versa, making them easy to find to verify the injection worked.
 *
 * <p>If you don't find a biome right away, teleport far away (~10000 blocks) from spawn and try again.
 */
public class FabricBiomeTest implements ModInitializer {

	private static final RegistryKey<Biome> TEST_CRIMSON_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "test_crimson_forest"));

	private static final RegistryKey<Biome> CUSTOM_PLAINS = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "custom_plains"));

	@Override
	public void onInitialize() {
		Registry.register(BuiltinRegistries.BIOME, TEST_CRIMSON_FOREST.getValue(), DefaultBiomeCreator.createCrimsonForest());

		BiomeUtils.addNetherBiome(BiomeKeys.BEACH, new Biome.MixedNoisePoint(0.0F, 0.5F, 0.0F, 0.0F, 0.1F));
		BiomeUtils.addNetherBiome(TEST_CRIMSON_FOREST, new Biome.MixedNoisePoint(0.0F, 0.5F, 0.0F, 0.0F, 0.275F));

//		Registry.register(BuiltinRegistries.BIOME, CUSTOM_PLAINS.getValue(), DefaultBiomeCreator.createPlains(false));
//		BiomeUtils.addBiomeVariant(BiomeKeys.PLAINS, CUSTOM_PLAINS, 1);

		BiomeUtils.addEdgeBiome(BiomeKeys.PLAINS, BiomeKeys.END_BARRENS, 0.9);

		BiomeUtils.addShoreBiome(BiomeKeys.FOREST, BiomeKeys.NETHER_WASTES, 0.9);

		BiomeUtils.addHillsBiome(BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.BASALT_DELTAS, 0.9);

		BiomeUtils.addContinentalBiome(BiomeKeys.END_HIGHLANDS, OverworldClimate.DRY, 0.5);
	}
}