package juniebyte.javadungeons.mixin;

import net.fabricmc.fabric.api.InternalBiomeData;
import net.fabricmc.fabric.api.InternalBiomeUtils;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.BuiltinBiomes;
import net.minecraft.world.biome.layer.AddRiversLayer;
import net.minecraft.world.biome.layer.util.LayerRandomnessSource;
import net.minecraft.world.biome.layer.util.LayerSampler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

/**
 * Sets river biomes specified with {@link juniebyte.javadungeons.utils.BiomeUtils#setRiverBiome(RegistryKey, RegistryKey)}.
 */
@Mixin(AddRiversLayer.class)
public class MixinAddRiversLayer {
	@Inject(at = @At("HEAD"), method = "sample", cancellable = true)
	private void sample(LayerRandomnessSource rand, LayerSampler landSampler, LayerSampler riverSampler, int x, int z, CallbackInfoReturnable<Integer> info) {
		int landBiomeId = landSampler.sample(x, z);
		RegistryKey<Biome> landBiomeKey = BuiltinBiomes.fromRawId(landBiomeId);

		int riverBiomeId = riverSampler.sample(x, z);
		Map<RegistryKey<Biome>, RegistryKey<Biome>> overworldRivers = InternalBiomeData.getOverworldRivers();

		if (overworldRivers.containsKey(landBiomeKey) && BuiltinBiomes.fromRawId(riverBiomeId) == BiomeKeys.RIVER) {
			RegistryKey<Biome> riverBiome = overworldRivers.get(landBiomeKey);
			info.setReturnValue(riverBiome == null ? landBiomeId : InternalBiomeUtils.getRawId(riverBiome));
		}
	}
}