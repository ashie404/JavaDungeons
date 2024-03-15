package ashie404.javadungeons.content;

import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class ItemGroups {
    public static final ItemGroup GENERIC = FabricItemGroup.builder()
		.icon(() -> new ItemStack(GenericBlocks.BRAZIER))
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
	public static final ItemGroup DINGY_JUNGLE = FabricItemGroup.builder()
		.icon(() -> new ItemStack(DingyJungleBlocks.DJ_FLOWERING_JUNGLE_PLANT))
		.displayName(Text.translatable("itemGroup.dungeons.dingy_jungle")).build();
	public static final ItemGroup CORAL_RISE = FabricItemGroup.builder()
		.icon(() -> new ItemStack(CoralRiseBlocks.CR_PURPLE_LARGE_CORAL_COLONY))
		.displayName(Text.translatable("itemGroup.dungeons.coral_rise")).build();
	public static final ItemGroup WEAPONS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(Weapons.FIREBRAND))
		.displayName(Text.translatable("itemGroup.dungeons.weapons")).build();

    public static void init() {
        // register item groups
		RegistryHelper.registerItemGroup("generic", GENERIC);
		RegistryHelper.registerItemGroup("creeper_woods", CREEPER_WOODS);
		RegistryHelper.registerItemGroup("desert_temple", DESERT_TEMPLE);
		RegistryHelper.registerItemGroup("pumpkin_pastures", PUMPKIN_PASTURES);
		RegistryHelper.registerItemGroup("soggy_swamp", SOGGY_SWAMP);
		RegistryHelper.registerItemGroup("cacti_canyon", CACTI_CANYON);
		RegistryHelper.registerItemGroup("redstone_mines", REDSTONE_MINES);
		RegistryHelper.registerItemGroup("fiery_forge", FIERY_FORGE);
		RegistryHelper.registerItemGroup("dingy_jungle", DINGY_JUNGLE);
		RegistryHelper.registerItemGroup("coral_rise", CORAL_RISE);
		RegistryHelper.registerItemGroup("weapons", WEAPONS);
    }
}
