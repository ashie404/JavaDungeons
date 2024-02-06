package ashie404.javadungeons;

import ashie404.javadungeons.content.*;
import ashie404.javadungeons.particles.GreenFlameParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

public class JavaDungeonsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockColorProvider GRASS_BLOCK_COLORS = (state, view, pos, tintIndex) -> {
            return view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D);
        };

        ItemColorProvider GRASS_ITEM_COLORS = (item, layer) -> GrassColors.getColor(0.5D, 1.0D);

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
            CreeperWoodsBlocks.CW_ROCKY_GRASSY_DIRT,
            CactiCanyonBlocks.CC_GRASS_BLOCK,
            CactiCanyonBlocks.CC_GRASSY_DIRT,
            CactiCanyonBlocks.CC_DENSE_GRASSY_DIRT
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
            CreeperWoodsBlocks.CW_ROCKY_GRASSY_DIRT.blockItem,
            CactiCanyonBlocks.CC_GRASS_BLOCK.blockItem,
            CactiCanyonBlocks.CC_GRASSY_DIRT.blockItem,
            CactiCanyonBlocks.CC_DENSE_GRASSY_DIRT.blockItem
        );

        // register render layers
        BlockRenderLayerMap.INSTANCE.putBlocks(
            RenderLayer.getCutout(),
            GenericBlocks.SHORT_GRASS,
            GenericBlocks.FERN,
            GenericBlocks.BERRY_BUSH_BLOCK,
            GenericBlocks.SQUID_COAST_LEAVES,
            GenericBlocks.FLOWERING_SQUID_COAST_LEAVES,
            GenericBlocks.WATER_PLANT,
            GenericBlocks.FLOWER_PATCH,
            GenericBlocks.DAISY_PATCH,
            GenericBlocks.DENSE_GRASSY_DIRT,
            GenericBlocks.GRASSY_DIRT,
            GenericBlocks.ROCKY_GRASSY_DIRT,
            GenericBlocks.GRASS_BLOCK,
            GenericBlocks.SHRUB,
            GenericBlocks.RIPPED_BANNER,
            GenericBlocks.TENT,
            GenericBlocks.DUNGEONS_LANTERN,
            GenericBlocks.HANGING_ROSES,
            GenericBlocks.YELLOW_TULIP,
            GenericBlocks.UNLIT_BRAZIER,
            GenericBlocks.LIT_BRAZIER,
            GenericBlocks.GREEN_LIT_BRAZIER,
            GenericBlocks.TRAY,
            GenericBlocks.TEAPOT,
            GenericBlocks.CHAINS,
            GenericBlocks.VINE,
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
            PumpkinPasturesBlocks.PM_SHRUB,
            PumpkinPasturesBlocks.PM_DEAD_SAPLING,
            PumpkinPasturesBlocks.PM_SAPLING,
            PumpkinPasturesBlocks.PM_FERN,
            PumpkinPasturesBlocks.PM_RED_AUTUMNAL_SAPLING,
            PumpkinPasturesBlocks.PM_YELLOW_AUTUMNAL_SAPLING,
            PumpkinPasturesBlocks.PM_TALL_FERN,
            PumpkinPasturesBlocks.PM_DRY_TALL_GRASS,
            PumpkinPasturesBlocks.PM_CHARRED_TALL_GRASS,
            CactiCanyonBlocks.CC_CACTUS,
            CactiCanyonBlocks.CC_SMALL_CACTUS,
            CactiCanyonBlocks.CC_FERN,
            CactiCanyonBlocks.CC_FLOWERS,
            CactiCanyonBlocks.CC_YUCCA,
            CactiCanyonBlocks.CC_TALL_CACTUS,
            CactiCanyonBlocks.CC_GRASS_BLOCK,
            CactiCanyonBlocks.CC_GRASSY_DIRT,
            CactiCanyonBlocks.CC_DENSE_GRASSY_DIRT,
            CactiCanyonBlocks.CC_DESERT_GRASS,
            RedstoneMinesBlocks.RM_SHRUB,
            SoggySwampBlocks.SS_SWAMP_SAPLING
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(
            RenderLayer.getTranslucent(),
            GenericBlocks.GLASS,
            GenericBlocks.BLUE_GLASS,
            GenericBlocks.BROWN_GLASS,
            GenericBlocks.BLACK_GLASS,
            GenericBlocks.GREEN_GLASS,
            GenericBlocks.YELLOW_GLASS,
            GenericBlocks.RED_GLASS,
            GenericBlocks.LIME_GLASS,
            GenericBlocks.LIGHT_GRAY_GLASS,
            GenericBlocks.PINK_GLASS,
            GenericBlocks.MAGENTA_GLASS,
            GenericBlocks.LIGHT_BLUE_GLASS,
            GenericBlocks.ORANGE_GLASS,
            GenericBlocks.GRAY_GLASS,
            GenericBlocks.PURPLE_GLASS,
            GenericBlocks.CYAN_GLASS,
            CreeperWoodsBlocks.CW_GLOW_MUSHROOM
        );

        // set up particles
        ParticleFactoryRegistry.getInstance().register(Particles.GREEN_FLAME, GreenFlameParticle.Factory::new);
    }
}