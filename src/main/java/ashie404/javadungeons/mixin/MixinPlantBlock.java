package ashie404.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import ashie404.javadungeons.content.Tags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

// mixin so that plants can be planted on custom soil blocks

@Mixin(PlantBlock.class)
public class MixinPlantBlock {
    @Inject(method = "canPlantOnTop", at = @At("HEAD"), cancellable = true)
	protected void hookPlantOnTop(BlockState state, BlockView view, BlockPos pos, CallbackInfoReturnable<Boolean> callback) {
		Block block = state.getBlock();

		if (block.getDefaultState().isIn(Tags.PLANTABLE)) {
			callback.setReturnValue(true);
		}
	}
}