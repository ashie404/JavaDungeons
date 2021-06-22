package juniebyte.javadungeons.mixin;

import juniebyte.javadungeons.content.Tags;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// mixin so that plants can be planted on custom soil blocks

@Mixin(PlantBlock.class)
public class MixinPlantBlock {
    @Inject(method = "canPlantOnTop", at = @At("HEAD"), cancellable = true)
	protected void hookPlantOnTop(BlockState state, BlockView view, BlockPos pos, CallbackInfoReturnable<Boolean> callback) {
		if (state.isIn(Tags.PLANTABLE)) {
			callback.setReturnValue(true);
		}
	}
}