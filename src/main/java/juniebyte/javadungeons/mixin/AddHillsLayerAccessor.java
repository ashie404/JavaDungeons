package juniebyte.javadungeons.mixin;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.world.biome.layer.AddHillsLayer;

@Mixin(AddHillsLayer.class)
public interface AddHillsLayerAccessor {
	/**
	 * This field contains a raw-id to raw-id map for establishing parent/child relationships that
	 * model derived biomes.
	 *
	 * <p>For example, it contains a mapping for 1 -> 129 where 1 is the raw id of plains, while 129 is the raw id
	 * of the sunflower plains, which is derived from plains.
	 */
	@Accessor("field_26727")
	static Int2IntMap getBaseToVariantMap() {
		throw new AssertionError("mixin");
	}
}