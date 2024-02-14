package ashie404.javadungeons;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ashie404.javadungeons.biome.DungeonsOverworldRegion;
import ashie404.javadungeons.content.*;
import ashie404.javadungeons.worldgen.surfacebuilder.DungeonsMaterialRules;

public class JavaDungeons implements ModInitializer, TerraBlenderApi {

	public static final String MOD_ID = "dungeons";
	public static final Logger log = LogManager.getLogger(MOD_ID);

	public static final Identifier ID(String id) {
		log.debug("modRegistry ID {}", id);
		return new Identifier(MOD_ID, id);
	}

	@Override
	public void onInitialize() {
		// other stuff
		ItemGroups.init();
		Sounds.init();
		Tags.init();
		Particles.init();
		Features.init();
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
		DingyJungleBlocks.init();

		// items
		Weapons.init();

		log.info("JavaDungeons initialized!");
	}

	@Override
    public void onTerraBlenderInitialized() {
		// add surface rules
		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, JavaDungeons.MOD_ID, DungeonsMaterialRules.makeRules());

		// register terrablender regions
		Regions.register(new DungeonsOverworldRegion(5));

        log.info("JavaDungeons worldgen initalized!");
    }
}
