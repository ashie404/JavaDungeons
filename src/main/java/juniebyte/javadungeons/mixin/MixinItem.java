package juniebyte.javadungeons.mixin;

import net.fabricmc.fabric.api.ArmorProviderExtensions;
import net.fabricmc.fabric.api.ArmorRenderingRegistry;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Item.class)
public class MixinItem implements ArmorProviderExtensions {
	@Unique
	private ArmorRenderingRegistry.ModelProvider armorModelProvider;
	@Unique
	private ArmorRenderingRegistry.TextureProvider armorTextureProvider;

	@Override
	public ArmorRenderingRegistry.ModelProvider fabric_getArmorModelProvider() {
		return armorModelProvider;
	}

	@Override
	public ArmorRenderingRegistry.TextureProvider fabric_getArmorTextureProvider() {
		return armorTextureProvider;
	}

	@Override
	public void fabric_setArmorModelProvider(ArmorRenderingRegistry.ModelProvider provider) {
		armorModelProvider = provider;
	}

	@Override
	public void fabric_setArmorTextureProvider(ArmorRenderingRegistry.TextureProvider provider) {
		armorTextureProvider = provider;
	}
}