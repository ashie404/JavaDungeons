package juniebyte.javadungeons.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.SpawnSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(SpawnSettings.class)
public interface SpawnSettingsAccessor {
	@Accessor
	Map<EntityType<?>, SpawnSettings.SpawnDensity> getSpawnCosts();
}