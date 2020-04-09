package j0sh.javadungeons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;

import j0sh.javadungeons.content.CreeperWoodsBlocks;
import j0sh.javadungeons.content.GenericBlocks;

public class JavaDungeons implements ModInitializer {

	public static final String MOD_ID = "dungeons";
	public static final String VERSION = "1.0.0";
	public static final String NAME = "JavaDungeons";

	public static final ItemGroup CREEPER_WOODS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "creeper_woods"), () -> new ItemStack(CreeperWoodsBlocks.CW_MOSSY_STONE_BRICKS));
	public static final ItemGroup GENERIC = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "generic"), () -> new ItemStack(GenericBlocks.CRATE));

	@Override
	public void onInitialize() {
		GenericBlocks.init();
		CreeperWoodsBlocks.init();

		System.out.println("JavaDungeons initalized!");
	}
}
