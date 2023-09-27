package juniebyte.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import juniebyte.javadungeons.content.CactiCanyonBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CactusBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

// mixin so that the cactus can be planted on cacti canyon sand.

@Mixin(CactusBlock.class)
public class MixinCactusBlock {
    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
	public void hookCanPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> callback) {
		BlockState blockState = world.getBlockState(pos.down());

		if ((blockState.isOf(Blocks.CACTUS) || blockState.isOf(CactiCanyonBlocks.CC_SAND)) && !world.getBlockState(pos.up()).isLiquid()) {
			callback.setReturnValue(true);
		}
	}
}