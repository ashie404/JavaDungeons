package juniebyte.javadungeons.mixin;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerType;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Map;

@Mixin(VillagerType.class)
public interface VillagerTypeAccessor {
	@Accessor("BIOME_TO_TYPE")
	static Map<RegistryKey<Biome>, VillagerType> getBiomeTypeToIdMap() {
		throw new AssertionError("Untransformed Accessor!");
	}

	@Invoker("<init>")
	static VillagerType callCreate(String string) {
		throw new AssertionError("Untransformed Accessor!");
	}
}