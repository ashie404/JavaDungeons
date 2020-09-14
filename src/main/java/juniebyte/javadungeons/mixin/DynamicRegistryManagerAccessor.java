package juniebyte.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.util.registry.DynamicRegistryManager;

@Mixin(DynamicRegistryManager.class)
public interface DynamicRegistryManagerAccessor {
	@Accessor("BUILTIN")
	static DynamicRegistryManager.Impl getBuiltin() {
		throw new AbstractMethodError();
	}
}