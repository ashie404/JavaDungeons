package ashie404.javadungeons.block;

import java.util.Random;

import net.minecraft.block.BlockState;

import net.minecraft.block.SnowBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class LayeringBlock extends SnowBlock {

    // layering block

    // override to remove melting functionality
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    }

    public LayeringBlock(Settings settings) {
        super(settings);
    }

}