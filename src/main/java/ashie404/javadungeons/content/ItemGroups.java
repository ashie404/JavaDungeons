package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ItemGroups {
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

    public static void init() {
        // register item groups
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("generic"), GENERIC);
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("creeper_woods"), CREEPER_WOODS);
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("desert_temple"), DESERT_TEMPLE);
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("pumpkin_pastures"), PUMPKIN_PASTURES);
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("soggy_swamp"), SOGGY_SWAMP);
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("cacti_canyon"), CACTI_CANYON);
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("redstone_mines"), REDSTONE_MINES);
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("fiery_forge"), FIERY_FORGE);
		Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID("weapons"), WEAPONS);
    }
}
