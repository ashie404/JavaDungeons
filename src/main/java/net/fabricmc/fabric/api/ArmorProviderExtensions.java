package net.fabricmc.fabric.api;

public interface ArmorProviderExtensions {
	/* @Nullable */
	ArmorRenderingRegistry.ModelProvider fabric_getArmorModelProvider();

	/* @Nullable */
	ArmorRenderingRegistry.TextureProvider fabric_getArmorTextureProvider();

	void fabric_setArmorModelProvider(/* @Nullable */ ArmorRenderingRegistry.ModelProvider provider);

	void fabric_setArmorTextureProvider(/* @Nullable */ ArmorRenderingRegistry.TextureProvider provider);
}