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
import ashie404.javadungeons.worldgen.DungeonsMaterialRules;
import ashie404.javadungeons.worldgen.feature.DungeonsFeatures;

public class JavaDungeons implements ModInitializer, TerraBlenderApi {

	public static final String MOD_ID = "dungeons";
	public static final Logger log = LogManager.getLogger(MOD_ID);

	public static Identifier ID(String id) {
		return new Identifier(MOD_ID, id);
	}

	@Override
	public void onInitialize() {
		// other stuff
		ItemGroups.init();
		Fluids.init();
		Sounds.init();
		Tags.init();
		Particles.init();
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
		// init worldgen features
		DungeonsFeatures.init();

		// add surface rules
		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, JavaDungeons.MOD_ID, DungeonsMaterialRules.makeRules());

		// register terrablender regions
		Regions.register(new DungeonsOverworldRegion(4));

        log.info("JavaDungeons worldgen initalized!");
    }
}
