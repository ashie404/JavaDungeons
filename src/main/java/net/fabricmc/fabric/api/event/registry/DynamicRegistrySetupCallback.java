package net.fabricmc.fabric.api.event.registry;

import net.minecraft.util.registry.DynamicRegistryManager;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

/**
 * This event gets triggered when a new {@link DynamicRegistryManager} gets created, but before it gets filled.
 * Therefore, this is the ideal place to register callbacks to dynamic registries.
 * For example, the following code is used to register a callback that gets triggered for any registered Biome, both JSON and code defined.
 *
 * <pre>
 * {@code
 * DynamicRegistrySetupCallback.EVENT.register(registryManager -> {
 *     Registry<Biome> biomes = registryManager.get(Registry.BIOME_KEY);
 *     RegistryEntryAddedCallback.event(biomes).register((rawId, id, object) -> {
 *         // Do something
 *     });
 * });
 * }
 * </pre>
 */
@FunctionalInterface
public interface DynamicRegistrySetupCallback {
	void onSetupRegistry(DynamicRegistryManager registryManager);

	Event<DynamicRegistrySetupCallback> EVENT = EventFactory.createArrayBacked(
			DynamicRegistrySetupCallback.class,
			callbacks -> registryManager -> {
				for (DynamicRegistrySetupCallback callback : callbacks) {
					callback.onSetupRegistry(registryManager);
				}
			}
	);
}