package net.fabricmc.fabric.api;

import com.mojang.serialization.Lifecycle;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.DynamicRegistrySetupCallback;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class FabricBiomesEntrypoint implements ModInitializer {
	@Override
	public void onInitialize() {
		DynamicRegistrySetupCallback.EVENT.register(registryManager ->
				RegistryEntryAddedCallback.event(registryManager.get(Registry.BIOME_KEY)).register((rawId, id, biome) ->
						onEntryAdded(rawId, id, biome, registryManager)
				)
		);
	}

	@SuppressWarnings("ConstantConditions")
	public void onEntryAdded(int rawId, Identifier id, Biome oldBiome, DynamicRegistryManager registryManager) {
		if (!((HasBeenProcessedProvider) oldBiome).hasBeenProcessed()) {
			// Obtain registry and key
			MutableRegistry<Biome> biomeRegistry = registryManager.get(Registry.BIOME_KEY);
			RegistryKey<Biome> key = RegistryKey.of(Registry.BIOME_KEY, id);

			// Create builder, pass to event and rebuild biome
			FabricBiomeBuilder builder = FabricBiomeBuilder.of(oldBiome, registryManager);
			BiomeLoadingCallback.EVENT.invoker().onBiomeLoading(key, builder);
			Biome newBiome = builder.build();

			// Mark as processed to prevent re-triggering
			((HasBeenProcessedProvider) newBiome).setProcessed();
			biomeRegistry.set(rawId, key, newBiome, Lifecycle.stable());
		}
	}
}