package ashie404.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import ashie404.javadungeons.block.Brazier;
import ashie404.javadungeons.block.Properties.LitVariant;
import ashie404.javadungeons.content.Tags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

// mixin so that plants can be planted on custom soil blocks

@Mixin(ShovelItem.class)
public class MixinShovelItem {
    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
	public void hookUseOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> callback) {
		World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.getBlock() instanceof Brazier && blockState.get(Brazier.LIT_VARIANT) != LitVariant.UNLIT) {
            Brazier.extinguish(world, blockPos, blockState);
        }
	}
}