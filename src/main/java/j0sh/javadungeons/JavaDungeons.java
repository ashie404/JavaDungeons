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

	public static final ItemGroup GENERIC = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "generic"), () -> new ItemStack(GenericBlocks.EMBLEMED_ANDESITE));
	public static final ItemGroup CREEPER_WOODS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "creeper_woods"), () -> new ItemStack(CreeperWoodsBlocks.CW_MOSSY_STONE_BRICKS));
	public static final ItemGroup DESERT_TEMPLE = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "desert_temple"), () -> new ItemStack(DesertTempleBlocks.DT_CHISELED_SANDY_STONE));
	public static final ItemGroup PUMPKIN_PASTURES = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "pumpkin_pastures"), () -> new ItemStack(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES));
	public static final ItemGroup REDSTONE_MINES = null;//FabricItemGroupBuilder.build(new Identifier(MOD_ID, "redstone_mines"), () -> new ItemStack(RedstoneMinesBlocks.TALL_REDSTONE_CRYSTAL));
	public static final ItemGroup CUSTOM_VARIANTS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "misc"), () -> new ItemStack(GenericBlocks.DIMENSIONAL_RECTIFIER));


	@Override
	public void onInitialize() {
		// other stuff
		Tags.init();
		Sounds.init();
		Recipes.init();
		Fluids.init();

		// blocks
		GenericBlocks.init();
		CreeperWoodsBlocks.init();
		DesertTempleBlocks.init();
		PumpkinPasturesBlocks.init();
		//RedstoneMinesBlocks.init();

		// worldgen
		Features.init();
		Biomes.init();

		log.info("JavaDungeons initialized!");
	}
}
