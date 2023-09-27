package ashie404.javadungeons.mixin;

import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.Feature;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import ashie404.javadungeons.content.Tags;

@Mixin(Feature.class)
public class MixinFeature {
	@Inject(method = "isSoil", at = @At("HEAD"), cancellable = true)
	private static void hookIsSoil(Block block, CallbackInfoReturnable<Boolean> callback) {
		if (block.getDefaultState().isIn(Tags.PLANTABLE)) {
			callback.setReturnValue(true);
		}
	}
}