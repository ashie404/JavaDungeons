package j0sh.javadungeons.fluids;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

public abstract class DungeonsBaseFluid extends FlowableFluid {
   /**
    * @return is the given fluid an instance of this fluid?
    */
   @Override
   public boolean matchesType(Fluid fluid)
   {
      return fluid == getStill() || fluid == getFlowing();
   }
   
   /**
    * @return is the fluid infinite like water?
    */
   @Override
   protected boolean isInfinite() {
      return true;
   }

   @Environment(EnvType.CLIENT)
   public void randomDisplayTick(World world, BlockPos pos, FluidState state, Random random) {
      if (!state.isStill() && !state.get(FALLING)) {
         if (random.nextInt(64) == 0) {
            world.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_WATER_AMBIENT, SoundCategory.BLOCKS, random.nextFloat() * 0.25F + 0.75F, random.nextFloat() + 0.5F, false);
         }
      } else if (random.nextInt(10) == 0) {
         world.addParticle(ParticleTypes.UNDERWATER, (double)pos.getX() + (double)random.nextFloat(), (double)pos.getY() + (double)random.nextFloat(), (double)pos.getZ() + (double)random.nextFloat(), 0.0D, 0.0D, 0.0D);
      }
   }
   
   /**
    * Perform actions when fluid flows into a replaceable block. Water drops
    * the block's loot table. Lava plays the "block.lava.extinguish" sound.
    */
   @Override
   protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
      final BlockEntity blockEntity = state.getBlock().hasBlockEntity() ? world.getBlockEntity(pos) : null;
      Block.dropStacks(state, world.getWorld(), pos, blockEntity);
   }
   
   /**
    * Lava returns true if its FluidState is above a certain height and the
    * Fluid is Water.
    * 
    * @return if the given Fluid can flow into this FluidState?
    */
   @Overridek
   protected boolean canBeReplacedWith(FluidState fluidState, BlockView blocView, BlockPos blockPos, Fluid fluid, Direction direction) {
      return direction == Direction.DOWN && !fluid.isIn(FluidTags.WATER);
   }

   @Override
   protected int getFlowSpeed(WorldView worldView)
   {
      return 4;
   }
   
   /**
    * Water returns 1. Lava returns 2 in the Overworld and 1 in the Nether.
    */
   @Override
   protected int getLevelDecreasePerBlock(WorldView worldView)
   {
      return 1;
   }
   
   /**
    * Water returns 5. Lava returns 30 in the Overworld and 10 in the Nether.
    */
   @Override
   public int getTickRate(WorldView worldView)
   {
      return 5;
   }
   
   /**
    * Water and Lava both return 100.0F.
    */
   @Override
   protected float getBlastResistance()
   {
      return 100.0F;
   }
}