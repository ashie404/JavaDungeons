package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.fluids.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.Registries;

public class Fluids {

    // dungeons water
    public static Item DUNGEONS_WATER_BUCKET;

    public static FlowableFluid DUNGEONS_WATER_STILL;
    public static FlowableFluid DUNGEONS_WATER_FLOWING;

    public static Block DUNGEONS_WATER;
    
    // soggy swamp water
    public static Item SOGGY_SWAMP_WATER_BUCKET;

    public static FlowableFluid SOGGY_SWAMP_WATER_STILL;
    public static FlowableFluid SOGGY_SWAMP_WATER_FLOWING;

    public static Block SOGGY_SWAMP_WATER;

    public static void init() {
        DUNGEONS_WATER_STILL = Registry.register(Registries.FLUID, JavaDungeons.ID("dungeons_water"), new DungeonsWaterFluid.Still());
        DUNGEONS_WATER_FLOWING = Registry.register(Registries.FLUID, JavaDungeons.ID("dungeons_flowing_water"), new DungeonsWaterFluid.Flowing());
        DUNGEONS_WATER_BUCKET = Registry.register(Registries.ITEM, JavaDungeons.ID("dungeons_water_bucket"), new BucketItem(DUNGEONS_WATER_STILL, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
        DUNGEONS_WATER = Registry.register(Registries.BLOCK, JavaDungeons.ID("dungeons_water"), new FluidBlock(DUNGEONS_WATER_STILL, FabricBlockSettings.create().liquid()){});

        SOGGY_SWAMP_WATER_STILL = Registry.register(Registries.FLUID, JavaDungeons.ID("soggy_swamp_water"), new SoggySwampWaterFluid.Still());
        SOGGY_SWAMP_WATER_FLOWING = Registry.register(Registries.FLUID, JavaDungeons.ID("soggy_swamp_flowing_water"), new SoggySwampWaterFluid.Flowing());
        SOGGY_SWAMP_WATER_BUCKET = Registry.register(Registries.ITEM, JavaDungeons.ID("soggy_swamp_water_bucket"), new BucketItem(SOGGY_SWAMP_WATER_STILL, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
        SOGGY_SWAMP_WATER = Registry.register(Registries.BLOCK, JavaDungeons.ID("soggy_swamp_water"), new FluidBlock(SOGGY_SWAMP_WATER_STILL, FabricBlockSettings.create().liquid()){});

        // add water bucket items to their respective groups
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("generic"))).register(content -> {
            content.add(DUNGEONS_WATER_BUCKET);
        });
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("soggy_swamp"))).register(content -> {
            content.add(SOGGY_SWAMP_WATER_BUCKET);
        });
    }
}