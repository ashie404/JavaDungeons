package ashie404.javadungeons.blocks;

import java.util.Random;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;

import net.minecraft.block.SnowBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.sound.BlockSoundGroup;

public class LayeringBlock extends SnowBlock {

    // layering block

    // override to remove melting functionality
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    }

    public LayeringBlock(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
    }

}