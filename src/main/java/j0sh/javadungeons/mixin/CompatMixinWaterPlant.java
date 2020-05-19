package j0sh.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import j0sh.javadungeons.blocks.DungeonsWaterPlant;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import virtuoel.towelette.api.Fluidloggable;
import virtuoel.towelette.util.FluidUtils;

@Mixin(DungeonsWaterPlant.class)
public class CompatMixinWaterPlant implements Fluidloggable {
    @Overwrite
    public FluidState getFluidState(BlockState state) {
        return FluidUtils.getFluidState(state);
    }
}