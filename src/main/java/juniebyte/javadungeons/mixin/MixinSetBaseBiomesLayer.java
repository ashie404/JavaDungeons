package juniebyte.javadungeons.mixin;

import net.fabricmc.fabric.api.InternalBiomeUtils;
import net.fabricmc.fabric.api.OverworldClimate;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.BuiltinBiomes;
import net.minecraft.world.biome.layer.SetBaseBiomesLayer;
import net.minecraft.world.biome.layer.util.LayerRandomnessSource;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Injects biomes into the arrays of biomes in the {@link SetBaseBiomesLayer}.
 */
@Mixin(SetBaseBiomesLayer.class)
public class MixinSetBaseBiomesLayer {
	@Shadow
	@Final
	@Mutable
	private static int[] SNOWY_BIOMES;

	@Shadow
	@Final
	@Mutable
	private static int[] COOL_BIOMES;

	@Shadow
	@Final
	@Mutable
	private static int[] TEMPERATE_BIOMES;

	@Shadow
	@Final
	@Mutable
	private static int[] DRY_BIOMES;

	@Inject(at = @At(value = "FIELD", target = "Lnet/minecraft/world/biome/layer/SetBaseBiomesLayer;chosenGroup1:[I"), method = "sample", cancellable = true)
	private void injectDryBiomes(LayerRandomnessSource random, int value, CallbackInfoReturnable<Integer> info) {
		InternalBiomeUtils.injectBiomesIntoClimate(random, DRY_BIOMES, OverworldClimate.DRY, info::setReturnValue);
	}

	@Inject(at = @At(value = "FIELD", target = "Lnet/minecraft/world/biome/layer/SetBaseBiomesLayer;TEMPERATE_BIOMES:[I"), method = "sample", cancellable = true)
	private void injectTemperateBiomes(LayerRandomnessSource random, int value, CallbackInfoReturnable<Integer> info) {
		InternalBiomeUtils.injectBiomesIntoClimate(random, TEMPERATE_BIOMES, OverworldClimate.TEMPERATE, info::setReturnValue);
	}

	@Inject(at = @At(value = "FIELD", target = "Lnet/minecraft/world/biome/layer/SetBaseBiomesLayer;SNOWY_BIOMES:[I"), method = "sample", cancellable = true)
	private void injectSnowyBiomes(LayerRandomnessSource random, int value, CallbackInfoReturnable<Integer> info) {
		InternalBiomeUtils.injectBiomesIntoClimate(random, SNOWY_BIOMES, OverworldClimate.SNOWY, info::setReturnValue);
	}

	@Inject(at = @At(value = "FIELD", target = "Lnet/minecraft/world/biome/layer/SetBaseBiomesLayer;COOL_BIOMES:[I"), method = "sample", cancellable = true)
	private void injectCoolBiomes(LayerRandomnessSource random, int value, CallbackInfoReturnable<Integer> info) {
		InternalBiomeUtils.injectBiomesIntoClimate(random, COOL_BIOMES, OverworldClimate.COOL, info::setReturnValue);
	}

	@Inject(at = @At("RETURN"), method = "sample", cancellable = true)
	private void transformVariants(LayerRandomnessSource random, int value, CallbackInfoReturnable<Integer> info) {
		int biomeId = info.getReturnValueI();
		RegistryKey<Biome> biome = BuiltinBiomes.fromRawId(biomeId);

		// Determine what special case this is...
		OverworldClimate climate;

		if (biome == BiomeKeys.BADLANDS_PLATEAU || biome == BiomeKeys.WOODED_BADLANDS_PLATEAU) {
			climate = OverworldClimate.DRY;
		} else if (biome == BiomeKeys.JUNGLE) {
			climate = OverworldClimate.TEMPERATE;
		} else if (biome == BiomeKeys.GIANT_TREE_TAIGA) {
			climate = OverworldClimate.TEMPERATE;
		} else {
			climate = null;
		}

		info.setReturnValue(InternalBiomeUtils.transformBiome(random, biome, climate));
	}
}