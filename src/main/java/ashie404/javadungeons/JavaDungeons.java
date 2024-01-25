package ashie404.javadungeons;

import net.fabricmc.api.ModInitializer;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ashie404.javadungeons.biome.Biomes;
import ashie404.javadungeons.content.*;
import ashie404.javadungeons.worldgen.DungeonsOverworldRegion;

public class JavaDungeons implements ModInitializer, TerraBlenderApi {

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

		log.info("JavaDungeons initialized!");
	}

	@Override
    public void onTerraBlenderInitialized() {
		// worldgen init
		Features.init();
		Biomes.init();
		
		// register terrablender regions
		Regions.register(new DungeonsOverworldRegion(2));

        log.info("JavaDungeons worldgen initalized!");
    }
}
