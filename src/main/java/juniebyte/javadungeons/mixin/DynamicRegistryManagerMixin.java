package juniebyte.javadungeons.mixin;

import net.fabricmc.fabric.api.FabricBiomesInternal;
import net.fabricmc.fabric.api.event.registry.DynamicRegistrySetupCallback;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(DynamicRegistryManager.class)
public class DynamicRegistryManagerMixin {
	@Inject(method = "create", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/dynamic/RegistryOps$class_5506$class_5507;<init>()V"), locals = LocalCapture.CAPTURE_FAILHARD)
	private static void onCreateImpl(CallbackInfoReturnable<DynamicRegistryManager.Impl> cir, DynamicRegistryManager.Impl registryManager) {
		MutableRegistry<Biome> biomeRegistry = registryManager.get(Registry.BIOME_KEY);
		RegistryEntryAddedCallback.event(biomeRegistry).register((rawId, id, object) -> {
			FabricBiomesInternal.onBiomeRegistered(rawId, RegistryKey.of(Registry.BIOME_KEY, id), biomeRegistry.get(id), biomeRegistry, registryManager);
		});
		DynamicRegistrySetupCallback.EVENT.invoker().onSetupRegistry(registryManager);
	}
}