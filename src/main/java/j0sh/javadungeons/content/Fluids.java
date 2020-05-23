package j0sh.javadungeons.content;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.Material;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import j0sh.javadungeons.fluids.*;
import j0sh.javadungeons.JavaDungeons;

public class Fluids {

    public static Item DUNGEONS_WATER_BUCKET;
    public static Item SOGGY_SWAMP_WATER_BUCKET;

    public static FlowableFluid DUNGEONS_WATER_STILL;
    public static FlowableFluid DUNGEONS_WATER_FLOWING;
    public static FlowableFluid SOGGY_SWAMP_WATER_STILL;
    public static FlowableFluid SOGGY_SWAMP_WATER_FLOWING;

    public static Block DUNGEONS_WATER;
    public static Block SOGGY_SWAMP_WATER;

    public static void init() {
        DUNGEONS_WATER_STILL = Registry.register(Registry.FLUID, new Identifier(JavaDungeons.MOD_ID, "dungeons_water"), new DungeonsWaterFluid.Still());
        DUNGEONS_WATER_FLOWING = Registry.register(Registry.FLUID, new Identifier(JavaDungeons.MOD_ID, "dungeons_flowing_water"), new DungeonsWaterFluid.Flowing());
        DUNGEONS_WATER_BUCKET = Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, "dungeons_water_bucket"), new BucketItem(DUNGEONS_WATER_STILL, new Item.Settings().group(JavaDungeons.GENERIC).recipeRemainder(Items.BUCKET).maxCount(1)));
        DUNGEONS_WATER = Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, "dungeons_water"), new FluidBlock(DUNGEONS_WATER_STILL, FabricBlockSettings.of(Material.WATER)){});

        SOGGY_SWAMP_WATER_STILL = Registry.register(Registry.FLUID, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp_water"), new SoggySwampWaterFluid.Still());
        SOGGY_SWAMP_WATER_FLOWING = Registry.register(Registry.FLUID, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp_flowing_water"), new SoggySwampWaterFluid.Flowing());
        SOGGY_SWAMP_WATER_BUCKET = Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp_water_bucket"), new BucketItem(SOGGY_SWAMP_WATER_STILL, new Item.Settings().group(JavaDungeons.GENERIC).recipeRemainder(Items.BUCKET).maxCount(1)));
        SOGGY_SWAMP_WATER = Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp_water"), new FluidBlock(SOGGY_SWAMP_WATER_STILL, FabricBlockSettings.of(Material.WATER)){});
    }
}