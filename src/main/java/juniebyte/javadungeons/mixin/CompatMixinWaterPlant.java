package juniebyte.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import juniebyte.javadungeons.blocks.DungeonsWaterPlant;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import virtuoel.towelette.api.Fluidloggable;
import virtuoel.towelette.util.FluidUtils;

@Mixin(DungeonsWaterPlant.class)
public class CompatMixinWaterPlant implements Fluidloggable {
    /**
     * @author juniebyte
     * @reason prevent fluid-logging with a fluid
     * other than water still being water
     *//*

    @Overwrite
    public FluidState getFluidState(BlockState state) {
        return FluidUtils.getFluidState(state);
    }
}*/
