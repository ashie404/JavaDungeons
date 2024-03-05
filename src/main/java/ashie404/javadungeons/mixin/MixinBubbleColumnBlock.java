package ashie404.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import ashie404.javadungeons.content.CoralRiseBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.state.property.Properties;

// mixin so that the cactus can be planted on cacti canyon sand.

@Mixin(BubbleColumnBlock.class)
public class MixinBubbleColumnBlock {
    @Inject(method = "getBubbleState", at = @At("HEAD"), cancellable = true)
	private static void hookGetBubbleState(BlockState state, CallbackInfoReturnable<BlockState> callback) {
        if (state.isOf(CoralRiseBlocks.CR_BUBBLY_STONE)) {
            callback.setReturnValue((BlockState)Blocks.BUBBLE_COLUMN.getDefaultState().with(Properties.DRAG, false));
        }
	}
}