package j0sh.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import virtuoel.towelette.api.Fluidloggable;
import j0sh.javadungeons.blocks.DungeonsWaterPlant;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;

@Mixin(DungeonsWaterPlant.class)
public class CompatMixinWaterPlant implements Fluidloggable {
    @Overwrite
    public FluidState getFluidState(BlockState state) {
        return virtuoel.towelette.util.FluidUtils.getFluidState(state);
    }
}