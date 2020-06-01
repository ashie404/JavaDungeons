package j0sh.javadungeons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import j0sh.javadungeons.content.*;

public class JavaDungeons implements ModInitializer {

	public static final String MOD_ID = "dungeons";

	public static final Logger log = LogManager.getLogger(MOD_ID);

	public static final ItemGroup GENERIC = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "generic"), () -> new ItemStack(GenericBlocks.GREEN_LIT_BRAZIER));
	public static final ItemGroup CREEPER_WOODS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "creeper_woods"), () -> new ItemStack(CreeperWoodsBlocks.CW_MOSSY_STONE_BRICKS));
	public static final ItemGroup DESERT_TEMPLE = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "desert_temple"), () -> new ItemStack(DesertTempleBlocks.DT_CHISELED_SANDY_STONE));
	public static final ItemGroup PUMPKIN_PASTURES = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "pumpkin_pastures"), () -> new ItemStack(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES));
	public static final ItemGroup SOGGY_SWAMP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "soggy_swamp"), () -> new ItemStack(SoggySwampBlocks.SS_GRASS_BLOCK));
	public static final ItemGroup CACTI_CANYON = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "cacti_canyon"), () -> new ItemStack(CactiCanyonBlocks.CC_CACTUS));
	public static final ItemGroup REDSTONE_MINES = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "redstone_mines"), () -> new ItemStack(RedstoneMinesBlocks.RM_REDSTONE_CRYSTALS));
	public static final ItemGroup FIERY_FORGE = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "fiery_forge"), () -> new ItemStack(FieryForgeBlocks.FF_EMBLEMED_DARK_STONE));
	public static final ItemGroup WEAPONS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "weapons"), () -> new ItemStack(Weapons.FIREBRAND));

	@Override
	public void onInitialize() {
		// other stuff
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
