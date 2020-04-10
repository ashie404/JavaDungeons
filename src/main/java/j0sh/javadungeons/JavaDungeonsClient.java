package j0sh.javadungeons;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;

import j0sh.javadungeons.blocks.DimensionalRectifier;
import j0sh.javadungeons.container.DimensionalRectifierContainer;
import j0sh.javadungeons.gui.DimensionalRectifierScreen;
import j0sh.javadungeons.content.*;
import j0sh.javadungeons.fluids.DungeonsWaterFluid;

public class JavaDungeonsClient implements ClientModInitializer {

    private static final RenderLayer CUTOUT_BLOCK_LAYER = RenderLayer.getCutout();
    private static final RenderLayer TRANSLUCENT_BLOCK_LAYER = RenderLayer.getTranslucent();

    private static final BlockColorProvider GRASS_BLOCK_COLORS = (state, view, pos, tintIndex) -> {
        return view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D);
    };

    private static final BlockColorProvider RED_AUTUMNAL_COLORS = (state, view, pos, tintIndex) -> {
        return 0xEF3C2E;
    };

    private static final BlockColorProvider YELLOW_AUTUMNAL_COLORS = (state, view, pos, tintIndex) -> {
        return 0xFBC02D;
    };

    private static final ItemColorProvider RED_AUTUMNAL_ITEM_COLORS = (item, layer) -> {
        return 0xEF3C2E;
    };

    private static final ItemColorProvider YELLOW_AUTUMNAL_ITEM_COLORS = (item, layer) -> {
        return 0xFBC02D;
    };

    private static final ItemColorProvider GRASS_ITEM_COLORS = (item, layer) -> GrassColors.getColor(0.5D, 1.0D);

    @Override
    public void onInitializeClient() {

        // register dimensional rectifier container and GUI
        ScreenProviderRegistry.INSTANCE.<DimensionalRectifierContainer>registerFactory(DimensionalRectifier.ID, (container) -> new DimensionalRectifierScreen(
            container, 
            MinecraftClient.getInstance().player.inventory, 
            DimensionalRectifier.CONTAINER_NAME
        ));

        // register color providers for grass blocks
        ColorProviderRegistry.BLOCK.register(
            GRASS_BLOCK_COLORS, 
            GenericBlocks.SHORT_GRASS, 
            GenericBlocks.GRASS_CLUMP,
            GenericBlocks.DENSE_GRASSY_DIRT,
            GenericBlocks.GRASSY_DIRT,
            GenericBlocks.SPARSE_GRASSY_DIRT,
            CreeperWoodsBlocks.CW_GRASS_BLOCK
        );

        // register color providers for grass items
        ColorProviderRegistry.ITEM.register(
            GRASS_ITEM_COLORS,
            GenericBlocks.SHORT_GRASS.blockItem,
            GenericBlocks.GRASS_CLUMP.blockItem,
            GenericBlocks.DENSE_GRASSY_DIRT.blockItem,
            GenericBlocks.GRASSY_DIRT.blockItem,
            GenericBlocks.SPARSE_GRASSY_DIRT.blockItem,
            CreeperWoodsBlocks.CW_GRASS_BLOCK.blockItem
        );

        // register color providers for autumnal stuff
        ColorProviderRegistry.BLOCK.register(
            YELLOW_AUTUMNAL_COLORS,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS,
            PumpkinPasturesBlocks.PM_AUTUMNAL_SHORT_GRASS,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS_CLUMP,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS_BLOCK,
            PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_LEAVES,
            PumpkinPasturesBlocks.PM_DENSE_AUTUMNAL_GRASSY_DIRT,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASSY_DIRT,
            PumpkinPasturesBlocks.PM_SPARSE_AUTUMNAL_GRASSY_DIRT
        );
        ColorProviderRegistry.BLOCK.register(
            RED_AUTUMNAL_COLORS,
            PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES
        );

        ColorProviderRegistry.ITEM.register(
            YELLOW_AUTUMNAL_ITEM_COLORS,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS.blockItem,
            PumpkinPasturesBlocks.PM_AUTUMNAL_SHORT_GRASS.blockItem,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS_CLUMP.blockItem,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS_BLOCK.blockItem,
            PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_LEAVES.blockItem,
            PumpkinPasturesBlocks.PM_DENSE_AUTUMNAL_GRASSY_DIRT.blockItem,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASSY_DIRT.blockItem,
            PumpkinPasturesBlocks.PM_SPARSE_AUTUMNAL_GRASSY_DIRT.blockItem
        );
        ColorProviderRegistry.ITEM.register(
            RED_AUTUMNAL_ITEM_COLORS,
            PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES.blockItem
        );

        // register render layers
        BlockRenderLayerMap.INSTANCE.putBlocks(
            CUTOUT_BLOCK_LAYER,
            GenericBlocks.SHORT_GRASS,
            GenericBlocks.GRASS_CLUMP,
            GenericBlocks.WATER_PLANT,
            GenericBlocks.DIMENSIONAL_RECTIFIER,
            GenericBlocks.DENSE_GRASSY_DIRT,
            GenericBlocks.GRASSY_DIRT,
            GenericBlocks.SPARSE_GRASSY_DIRT,
            CreeperWoodsBlocks.CW_GRASS_BLOCK,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS,
            PumpkinPasturesBlocks.PM_AUTUMNAL_SHORT_GRASS,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS_CLUMP,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASS_BLOCK,
            PumpkinPasturesBlocks.PM_DENSE_AUTUMNAL_GRASSY_DIRT,
            PumpkinPasturesBlocks.PM_AUTUMNAL_GRASSY_DIRT,
            PumpkinPasturesBlocks.PM_SPARSE_AUTUMNAL_GRASSY_DIRT,
            PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES,
            PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_LEAVES
        );

        // set up fluid rendering
        BlockRenderLayerMap.INSTANCE.putFluids(
            TRANSLUCENT_BLOCK_LAYER,
            Fluids.DUNGEONS_WATER_FLOWING,
            Fluids.DUNGEONS_WATER_STILL
        );
        DungeonsWaterFluid.setupFluidRendering(
            Fluids.DUNGEONS_WATER_STILL, // still fluid object
            Fluids.DUNGEONS_WATER_FLOWING, // flowing fluid object
            new Identifier(JavaDungeons.MOD_ID, "dungeons_water"), // texture identifier
            0xFFFFFF // tint color (white because water is colored in its file)
        );
    }    
}