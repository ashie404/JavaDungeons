package juniebyte.javadungeons.mixin;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.VanillaLayeredBiomeSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

/**
 * This accessor gives us access to the hardcoded list of overworld biomes.
 */
@Mixin(VanillaLayeredBiomeSource.class)
public interface VanillaLayeredBiomeSourceAccessor {
	@Accessor
	static List<RegistryKey<Biome>> getBIOMES() {
		throw new AssertionError("mixin");
	}

	@Accessor
	static void setBIOMES(List<RegistryKey<Biome>> biomes) {
		throw new AssertionError("mixin");
	}
}