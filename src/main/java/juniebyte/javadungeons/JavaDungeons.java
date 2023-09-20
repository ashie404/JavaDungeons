package juniebyte.javadungeons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import juniebyte.javadungeons.content.*;

public class JavaDungeons implements ModInitializer {

	public static final String MOD_ID = "dungeons";

	public static final Logger log = LogManager.getLogger(MOD_ID);

	public static final ItemGroup GENERIC = FabricItemGroup.builder()
		.icon(() -> new ItemStack(GenericBlocks.GREEN_LIT_BRAZIER))
		.displayName(Text.translatable("itemGroup.dungeons.generic")).build();
	public static final ItemGroup CREEPER_WOODS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(CreeperWoodsBlocks.CW_MOSSY_STONE_BRICKS))
		.displayName(Text.translatable("itemGroup.dungeons.creeper_woods")).build();
	public static final ItemGroup DESERT_TEMPLE = FabricItemGroup.builder()
		.icon(() -> new ItemStack(DesertTempleBlocks.DT_CHISELED_SANDY_STONE))
		.displayName(Text.translatable("itemGroup.dungeons.desert_temple")).build();
	public static final ItemGroup PUMPKIN_PASTURES = FabricItemGroup.builder()
		.icon(() -> new ItemStack(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES))
		.displayName(Text.translatable("itemGroup.dungeons.pumpkin_pastures")).build();
	public static final ItemGroup SOGGY_SWAMP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(SoggySwampBlocks.SS_GRASS_BLOCK))
		.displayName(Text.translatable("itemGroup.dungeons.soggy_swamp")).build();
	public static final ItemGroup CACTI_CANYON = FabricItemGroup.builder()
		.icon(() -> new ItemStack(CactiCanyonBlocks.CC_CACTUS))
		.displayName(Text.translatable("itemGroup.dungeons.cacti_canyon")).build();
	public static final ItemGroup REDSTONE_MINES = FabricItemGroup.builder()
		.icon(() -> new ItemStack(RedstoneMinesBlocks.RM_REDSTONE_CRYSTALS))
		.displayName(Text.translatable("itemGroup.dungeons.redstone_mines")).build();
	public static final ItemGroup FIERY_FORGE = FabricItemGroup.builder()
		.icon(() -> new ItemStack(FieryForgeBlocks.FF_EMBLEMED_DARK_STONE))
		.displayName(Text.translatable("itemGroup.dungeons.fiery_forge")).build();
	public static final ItemGroup WEAPONS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(Weapons.FIREBRAND))
		.displayName(Text.translatable("itemGroup.dungeons.weapons")).build();

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
