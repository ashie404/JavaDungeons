package juniebyte.javadungeons.fluids;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

import juniebyte.javadungeons.content.Fluids;

public abstract class SoggySwampWaterFluid extends DungeonsBaseFluid {
   @Override
	public Fluid getStill()
	{
		return Fluids.SOGGY_SWAMP_WATER_STILL;
	}
 
	@Override
	public Fluid getFlowing()
	{
		return Fluids.SOGGY_SWAMP_WATER_FLOWING;
	}
 
	@Override
	public Item getBucketItem()
	{
		return Fluids.SOGGY_SWAMP_WATER_BUCKET;
    }

    @Override
	protected BlockState toBlockState(FluidState fluidState) {
		// getBlockStateLevel converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
		return Fluids.SOGGY_SWAMP_WATER.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
	}
    
    public static class Flowing extends SoggySwampWaterFluid {
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
  
    public static class Still extends SoggySwampWaterFluid {
        @Override
        public int getLevel(FluidState state) {
           return 8;
        }
        
        @Override
        public boolean isStill(FluidState state) {
           return true;
        }
    }
}