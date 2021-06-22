package juniebyte.javadungeons.mixin;

import juniebyte.javadungeons.content.Tags;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Feature.class)
public class MixinFeature {
	@Inject(method = "isSoil(Lnet/minecraft/block/BlockState;)Z", at = @At("HEAD"), cancellable = true)
	private static void hookIsSoil(BlockState state, CallbackInfoReturnable<Boolean> cir) {
		if (state.isIn(Tags.PLANTABLE)) {
			cir.setReturnValue(true);
		}
	}
}