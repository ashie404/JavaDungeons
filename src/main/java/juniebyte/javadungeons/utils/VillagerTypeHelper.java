package juniebyte.javadungeons.utils;

import juniebyte.javadungeons.mixin.VillagerTypeAccessor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.VillagerType;
import net.minecraft.world.biome.Biome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

/**
 * Utilities related to the creation of {@link VillagerType}s.
 * Not to be confused with a {@link VillagerProfession}, a villager type defines the appearance of a villager.
 *
 * <p>Creation of custom villager types may be done via the use of a simple helper method.
 * Below is an example of how one wouldd create a villager type:
 * <blockquote><pre>
 * // Note: You should register your villager types via the corresponding registry
 * public static final VillagerType MOUNTAIN = VillagerTypeHelper.create(new Identifier("mymod", "mountain"));
 * </pre></blockquote>
 *
 * <p>Creation and registration of a villager type does not guarantee villagers of a specific type will be created in a world.
 * Typically the villager type is bound to a specific group of biomes.
 * Below is an example of allowing creation of mountain villagers in a mountain biome:
 * <blockquote><pre>
 * VillagerTypeHelper.mapBiomeToVillagerType(BiomeKeys.MOUNTAIN, MyVillagerTypes.MOUNTAIN);
 * </pre></blockquote>
 */
public final class VillagerTypeHelper {
	private static final Logger LOGGER = LogManager.getLogger();

	/**
	 * Creates a new villager type.
	 *
	 * @param id the id of the villager type
	 * @return a new villager type
	 */
	public static VillagerType create(Identifier id) {
		Objects.requireNonNull(id, "Id of villager type cannot be null");
		return VillagerTypeAccessor.callCreate(id.toString());
	}

	/**
	 * Maps a biome to villager type.
	 * This mapping is used when a new villager entity is created.
	 *
	 * @param biomeKey the registry key of the biome
	 * @param villagerType the villager type
	 */
	public static void mapBiomeToVillagerType(RegistryKey<Biome> biomeKey, VillagerType villagerType) {
		Objects.requireNonNull(biomeKey, "Biome registry key cannot be null");
		Objects.requireNonNull(villagerType, "Villager type cannot be null");

		if (VillagerTypeAccessor.getBiomeTypeToIdMap().put(biomeKey, villagerType) != null) {
			LOGGER.debug("Overriding existing Biome -> VillagerType registration for Biome {}", biomeKey.getValue().toString());
		}
	}

	private VillagerTypeHelper() {
	}
}