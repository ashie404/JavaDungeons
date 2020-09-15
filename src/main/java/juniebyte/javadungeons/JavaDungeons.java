package juniebyte.javadungeons;

import juniebyte.javadungeons.content.*;
import juniebyte.javadungeons.utils.BiomeUtils;
import juniebyte.javadungeons.utils.PointOfInterestRegistry;
import juniebyte.javadungeons.utils.PointOfInterestTypeCustom;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.BiomeLoadingCallback;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.DefaultBiomeCreator;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

	public static final RegistryKey<Biome> TEST_CRIMSON_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "test_crimson_forest"));
	public static final RegistryKey<Biome> TEST_PLAINS = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "test_plains"));


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
//		SurfaceBuilders.init();
//		Features.init();
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

		//Loop over existing biomes
//		BuiltinRegistries.BIOME.forEach(this::handleBiome);
		//Listen for other biomes being registered
//		RegistryEntryAddedCallback.event(BuiltinRegistries.BIOME).register((rawId, identifier, newBiome) -> handleBiome(newBiome));

		// Works fine
		BiomeUtils.register(TEST_PLAINS, DefaultBiomeCreator.createPlains(false));
		BiomeUtils.register(TEST_CRIMSON_FOREST, DefaultBiomeCreator.createCrimsonForest());

		// TODO: Not working
//		BiomeUtils.addToOverworld(TEST_PLAINS);

		// Works fine
		BiomeUtils.addToNether(TEST_CRIMSON_FOREST, new Biome.MixedNoisePoint(0.0f, 0.5f, 0.0f, 0.0f, 0.1f));

		// TODO: Not working (should this work?)
//		BiomeUtils.addToNether(BiomeKeys.BEACH, new Biome.MixedNoisePoint(0.0f, 0.5f, 0.0f, 0.0f, 0.275f));

		// Works fine
		BiomeLoadingCallback.EVENT.register((biomeRegistryKey, biomeBuilder) -> {
			if (biomeRegistryKey.equals(BiomeKeys.PLAINS)) {
				biomeBuilder.structureFeature(() -> ConfiguredStructureFeatures.DESERT_PYRAMID);
			}
		});

		log.info("JavaDungeons initialized!");
	}
	
	public Identifier id(String idk) {
		return new Identifier(MOD_ID, idk);
	}

	private void handleBiome(Biome biome) {
		if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
			BiomeUtils.addFeatureToBiome(biome, GenerationStep.Feature.UNDERGROUND_ORES,
					Feature.ORE.configure(
							new OreFeatureConfig(
									OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
									Blocks.DIAMOND_BLOCK.getDefaultState(),
									8 //Ore vein size
							))
							.method_30377(64) //Max y level
							.spreadHorizontally()
							.repeat(16) //Number of veins per chunk
			);
		}
	}
}
