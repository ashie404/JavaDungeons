package juniebyte.javadungeons.mixin;

import net.fabricmc.fabric.api.InternalBiomeData;
import net.fabricmc.fabric.api.InternalBiomeUtils;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BuiltinBiomes;
import net.minecraft.world.biome.layer.AddEdgeBiomesLayer;
import net.minecraft.world.biome.layer.util.LayerRandomnessSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AddEdgeBiomesLayer.class)
public class MixinAddEdgeBiomesLayer {
	@Inject(at = @At("HEAD"), method = "sample", cancellable = true)
	private void sample(LayerRandomnessSource rand, int north, int east, int south, int west, int center, CallbackInfoReturnable<Integer> info) {
		RegistryKey<Biome> centerBiome = BuiltinBiomes.fromRawId(center);

		if (InternalBiomeData.getOverworldShores().containsKey(centerBiome) && InternalBiomeUtils.neighborsOcean(north, east, south, west)) {
			info.setReturnValue(InternalBiomeUtils.getRawId(InternalBiomeData.getOverworldShores().get(centerBiome).pickRandom(rand)));
		} else if (InternalBiomeData.getOverworldEdges().containsKey(centerBiome) && InternalBiomeUtils.isEdge(north, east, south, west, center)) {
			info.setReturnValue(InternalBiomeUtils.getRawId(InternalBiomeData.getOverworldEdges().get(centerBiome).pickRandom(rand)));
		}
	}
}