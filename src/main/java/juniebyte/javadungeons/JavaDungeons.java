package juniebyte.javadungeons;

import io.github.vampirestudios.vampirelib.utils.registry.RegistryHelper;
import juniebyte.javadungeons.content.*;
import juniebyte.javadungeons.utils.PointOfInterestRegistry;
import juniebyte.javadungeons.utils.PointOfInterestTypeCustom;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JavaDungeons implements ModInitializer {

	public static final String MOD_ID = "dungeons";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static final ItemGroup GENERIC = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "generic"), () -> new ItemStack(GenericBlocks.GREEN_LIT_BRAZIER));
	public static final ItemGroup CREEPER_WOODS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "creeper_woods"), () -> new ItemStack(CreeperWoodsBlocks.CW_MOSSY_STONE_BRICKS));
	public static final ItemGroup DESERT_TEMPLE = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "desert_temple"), () -> new ItemStack(DesertTempleBlocks.DT_CHISELED_SANDY_STONE));
	public static final ItemGroup PUMPKIN_PASTURES = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "pumpkin_pastures"), () -> new ItemStack(PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES));
	public static final ItemGroup SOGGY_SWAMP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "soggy_swamp"), () -> new ItemStack(SoggySwampBlocks.SS_GRASS_BLOCK));
	public static final ItemGroup CACTI_CANYON = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "cacti_canyon"), () -> new ItemStack(CactiCanyonBlocks.CC_CACTUS));
	public static final ItemGroup REDSTONE_MINES = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "redstone_mines"), () -> new ItemStack(RedstoneMinesBlocks.RM_REDSTONE_CRYSTALS));
	public static final ItemGroup FIERY_FORGE = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "fiery_forge"), () -> new ItemStack(FieryForgeBlocks.FF_EMBLEMED_DARK_STONE));
	public static final ItemGroup WEAPONS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "weapons"), () -> new ItemStack(Weapons.FIREBRAND));
	public static final ItemGroup ARMORS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "armors"), () -> new ItemStack(Armors.PHANTOM_ARMOR));

	public static final RegistryHelper REGISTRY_HELPER = RegistryHelper.createRegistryHelper(MOD_ID);

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
		Armors.init();

		// worldgen
		SurfaceBuilders.init();
		Features.init();
		JDConfiguredFeatures.init();
		Biomes.init();
		Registry.register(Registry.VILLAGER_PROFESSION, id("gift_wrapper"), VillagerProfessionBuilder.create()
				.id(id("gift_wrapper"))
				.workstation(PointOfInterestRegistry.register(new PointOfInterestTypeCustom("gift_wrapper_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.GLASS), 1, 1)))
				.build());
		Registry.register(Registry.VILLAGER_PROFESSION, id("luxury_merchant"), VillagerProfessionBuilder.create()
				.id(id("luxury_merchant"))
				.workstation(PointOfInterestRegistry.register(new PointOfInterestTypeCustom("luxury_merchant_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.BLUE_STAINED_GLASS), 1, 1)))
				.build());
		Registry.register(Registry.VILLAGER_PROFESSION, id("quest_giver"), VillagerProfessionBuilder.create()
				.id(id("quest_giver"))
				.workstation(PointOfInterestRegistry.register(new PointOfInterestTypeCustom("quest_giver_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.PURPLE_STAINED_GLASS), 1, 1)))
				.build());
		Registry.register(Registry.VILLAGER_PROFESSION, id("shop_keeper"), VillagerProfessionBuilder.create()
				.id(id("shop_keeper"))
				.workstation(PointOfInterestRegistry.register(new PointOfInterestTypeCustom("shop_keeper_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.WHITE_STAINED_GLASS), 1, 1)))
				.build());
		Registry.register(Registry.VILLAGER_PROFESSION, id("mystery_merchant"), VillagerProfessionBuilder.create()
				.id(id("mystery_merchant"))
				.workstation(PointOfInterestRegistry.register(new PointOfInterestTypeCustom("mystery_merchant_poi", PointOfInterestTypeCustom.getAllStatesOf(Blocks.PINK_STAINED_GLASS), 1, 1)))
				.build());

		LOGGER.info("JavaDungeons initialized!");
	}
	
	public Identifier id(String idk) {
		return new Identifier(MOD_ID, idk);
	}

}
