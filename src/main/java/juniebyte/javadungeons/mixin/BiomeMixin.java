package juniebyte.javadungeons.mixin;

import net.fabricmc.fabric.api.HasBeenProcessedProvider;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Biome.class)
public class BiomeMixin implements HasBeenProcessedProvider {
	@Unique
	private boolean fabric_hasBeenProcessed = false;

	@Override
	public boolean hasBeenProcessed() {
		return fabric_hasBeenProcessed;
	}

	@Override
	public void setProcessed() {
		fabric_hasBeenProcessed = true;
	}
}