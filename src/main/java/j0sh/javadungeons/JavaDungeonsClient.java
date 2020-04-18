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

    private static final ItemColorProvider GRASS_ITEM_COLORS = (item, layer) -> GrassColors.getColor(0.5D, 1.0D);

    @Override
    public void onInitializeClient() {

        // register dimensional rectifier container and GUI
        ScreenProviderRegistry.INSTANCE.<DimensionalRectifierContainer>registerFactory(DimensionalRectifier.ID, (container) -> new DimensionalRectifierScreen(
            container, 
            MinecraftClient.getInstance().player.inventory, 
            DimensionalRectifier.CONTAINER_NAME
        ));

        // register color providers
        ColorProviderRegistry.BLOCK.register(
            GRASS_BLOCK_COLORS,
            GenericBlocks.SHORT_GRASS,
            GenericBlocks.FERN,
            GenericBlocks.DENSE_GRASSY_DIRT,
            GenericBlocks.GRASSY_DIRT,
            GenericBlocks.GRASS_BLOCK,
            GenericBlocks.ROCKY_GRASSY_DIRT,
            CreeperWoodsBlocks.CW_GRASS_BLOCK,
            CreeperWoodsBlocks.CW_GRASSY_DIRT,
            CreeperWoodsBlocks.CW_DENSE_GRASSY_DIRT,
            CreeperWoodsBlocks.CW_ROCKY_GRASSY_DIRT
        );

        ColorProviderRegistry.ITEM.register(
            GRASS_ITEM_COLORS,
            GenericBlocks.SHORT_GRASS.blockItem,
            GenericBlocks.FERN.blockItem,
            GenericBlocks.DENSE_GRASSY_DIRT.blockItem,
            GenericBlocks.GRASSY_DIRT.blockItem,
            GenericBlocks.GRASS_BLOCK.blockItem,
            GenericBlocks.ROCKY_GRASSY_DIRT.blockItem,
            CreeperWoodsBlocks.CW_GRASS_BLOCK.blockItem,
            CreeperWoodsBlocks.CW_GRASSY_DIRT.blockItem,
            CreeperWoodsBlocks.CW_DENSE_GRASSY_DIRT.blockItem,
            CreeperWoodsBlocks.CW_ROCKY_GRASSY_DIRT.blockItem
        );

        // register render layers
        BlockRenderLayerMap.INSTANCE.putBlocks(
            CUTOUT_BLOCK_LAYER,
            GenericBlocks.SHORT_GRASS,
            GenericBlocks.FERN,
            GenericBlocks.BERRY_BUSH_BLOCK,
            GenericBlocks.WATER_PLANT,
            GenericBlocks.DIMENSIONAL_RECTIFIER,
            GenericBlocks.DENSE_GRASSY_DIRT,
            GenericBlocks.GRASSY_DIRT,
            GenericBlocks.ROCKY_GRASSY_DIRT,
            GenericBlocks.GRASS_BLOCK,
            GenericBlocks.SHRUB,
            CreeperWoodsBlocks.CW_GRASS_BLOCK,
            CreeperWoodsBlocks.CW_GRASSY_DIRT,
            CreeperWoodsBlocks.CW_DENSE_GRASSY_DIRT,
            CreeperWoodsBlocks.CW_SHRUB,
            CreeperWoodsBlocks.CW_POP_FLOWER,
            CreeperWoodsBlocks.CW_ROCKY_GRASSY_DIRT,
            CreeperWoodsBlocks.CW_FLOWER_PATCH,
            PumpkinPasturesBlocks.PM_RED_AUTUMNAL_LEAVES,
            PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_LEAVES,
            PumpkinPasturesBlocks.PM_CHARRED_GRASS,
            PumpkinPasturesBlocks.PM_SHRUB
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(
            TRANSLUCENT_BLOCK_LAYER,
            CreeperWoodsBlocks.CW_GLOW_MUSHROOM
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