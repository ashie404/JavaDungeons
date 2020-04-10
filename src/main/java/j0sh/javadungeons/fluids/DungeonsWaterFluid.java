package j0sh.javadungeons.fluids;

import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockRenderView;

import java.util.function.Function;

import j0sh.javadungeons.content.Fluids;

public abstract class DungeonsWaterFluid extends DungeonsBaseFluid {
   @Override
	public Fluid getStill()
	{
		return Fluids.DUNGEONS_WATER_STILL;
	}
 
	@Override
	public Fluid getFlowing()
	{
		return Fluids.DUNGEONS_WATER_FLOWING;
	}
 
	@Override
	public Item getBucketItem()
	{
		return Fluids.DUNGEONS_WATER_BUCKET;
    }

    @Override
	protected BlockState toBlockState(FluidState fluidState)
	{
		// method_15741 converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
		return Fluids.DUNGEONS_WATER.getDefaultState().with(Properties.LEVEL_15, method_15741(fluidState));
	}
    
    public static class Flowing extends DungeonsWaterFluid {
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
           super.appendProperties(builder);
           builder.add(LEVEL);
        }
        
        @Override
        public int getLevel(FluidState state) {
           return (Integer)state.get(LEVEL);
        }
        
        @Override
        public boolean isStill(FluidState state) {
           return false;
        }
    }
  
    public static class Still extends DungeonsWaterFluid {
        @Override
        public int getLevel(FluidState state) {
           return 8;
        }
        
        @Override
        public boolean isStill(FluidState state) {
           return true;
        }
    }

   public static void setupFluidRendering(final Fluid still, final Fluid flowing, final Identifier textureFluidId, final int color)
	{
		final Identifier stillSpriteId = new Identifier(textureFluidId.getNamespace(), "block/" + textureFluidId.getPath() + "_still");
		final Identifier flowingSpriteId = new Identifier(textureFluidId.getNamespace(), "block/" + textureFluidId.getPath() + "_flow");
 
		// If they're not already present, add the sprites to the block atlas
		ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEX).register((atlasTexture, registry) ->
		{
			registry.register(stillSpriteId);
			registry.register(flowingSpriteId);
		});
 
		final Identifier fluidId = Registry.FLUID.getId(still);
		final Identifier listenerId = new Identifier(fluidId.getNamespace(), fluidId.getPath() + "_reload_listener");
 
		final Sprite[] fluidSprites = { null, null };
 
		ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener()
		{
			@Override
			public Identifier getFabricId()
			{
				return listenerId;
			}
 
			/**
			 * Get the sprites from the block atlas when resources are reloaded
			 */
			@Override
			public void apply(ResourceManager resourceManager)
			{
				final Function<Identifier, Sprite> atlas = MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEX);
				fluidSprites[0] = atlas.apply(stillSpriteId);
				fluidSprites[1] = atlas.apply(flowingSpriteId);
			}
		});
 
		// The FluidRenderer gets the sprites and color from a FluidRenderHandler during rendering
		final FluidRenderHandler renderHandler = new FluidRenderHandler()
		{
			@Override
			public Sprite[] getFluidSprites(BlockRenderView view, BlockPos pos, FluidState state)
			{
				return fluidSprites;
			}
 
			@Override
			public int getFluidColor(BlockRenderView view, BlockPos pos, FluidState state)
			{
				return color;
			}
		};
 
		FluidRenderHandlerRegistry.INSTANCE.register(still, renderHandler);
		FluidRenderHandlerRegistry.INSTANCE.register(flowing, renderHandler);
	}
}