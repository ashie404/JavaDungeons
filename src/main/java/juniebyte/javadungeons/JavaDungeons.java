package juniebyte.javadungeons;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import juniebyte.javadungeons.content.*;

public class JavaDungeons implements ModInitializer {

	public static final String MOD_ID = "dungeons";

	public static final Logger log = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// other stuff
		ItemGroups.init();
		Tags.init();
		Sounds.init();
		Fluids.init();
		Particles.init();
		Properties.init();
		Recipes.init();
		Containers.init();
		Paintings.init();

		// blocks
		GenericBlocks.init();
		CreeperWoodsBlocks.init();
		SoggySwampBlocks.init();
		DesertTempleBlocks.init();
		PumpkinPasturesBlocks.init();
		CactiCanyonBlocks.init();
		RedstoneMinesBlocks.init();
		FieryForgeBlocks.init();

		// items
		Weapons.init();

		// worldgen
		SurfaceBuilders.init();
		Features.init();
		Biomes.init();

		log.info("JavaDungeons initialized!");
	}
}
