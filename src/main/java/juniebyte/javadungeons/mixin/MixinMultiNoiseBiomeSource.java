package juniebyte.javadungeons.mixin;

import com.mojang.datafixers.util.Pair;
import net.fabricmc.fabric.api.InternalBiomeData;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.MultiNoiseBiomeSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * This Mixin is responsible for adding mod-biomes to the NETHER preset in the MultiNoiseBiomeSource.
 */
@Mixin(MultiNoiseBiomeSource.Preset.class)
public class MixinMultiNoiseBiomeSource {
	// NOTE: This is a lambda-function in the NETHER preset field initializer
	@ModifyArgs(method = "getBiomeSource", at = @At(value = "INVOKE", target = "net/minecraft/world/biome/source/MultiNoiseBiomeSource.<init> (JLjava/util/List;Ljava/util/Optional;Lnet/minecraft/world/biome/source/MultiNoiseBiomeSource$1;)V"))
	private static void appendNetherBiomes(Args args, MultiNoiseBiomeSource.Preset preset, Registry<Biome> registry, Long seed) {
		List<Pair<Biome.MixedNoisePoint, Supplier<Biome>>> biomes = new ArrayList<>(args.get(1));

		// add fabric biome noise point data to list && BiomeSource biome list
		InternalBiomeData.getNetherBiomeNoisePoints().forEach((biomeKey, noisePoint) -> {
			Biome biome = registry.getOrThrow(biomeKey);
			// NOTE: Even though we have to pass in suppliers, BiomeSource's ctor will resolve them immediately
			biomes.add(Pair.of(noisePoint, () -> biome));
		});

		args.set(1, biomes);
	}
}