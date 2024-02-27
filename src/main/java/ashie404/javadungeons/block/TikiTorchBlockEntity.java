package ashie404.javadungeons.block;

import ashie404.javadungeons.content.BlockEntities;
import ashie404.javadungeons.content.Particles;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class TikiTorchBlockEntity extends BlockEntity {

    // tiki torch block entity
    
    public TikiTorchBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntities.TIKI_TORCH, pos, state);
    }

    public static void particleTick(World world, BlockPos pos, BlockState state, TikiTorchBlockEntity be) {
        Random random = world.getRandom();
        if (random.nextFloat() > 0.62) {
            double d = (double)pos.getX() + 0.5;
            double e = (double)pos.getY() + 1.85;
            double f = (double)pos.getZ() + 0.5;
            world.addParticle(Particles.FLAME, d, e, f, 0.0, 0.0, 0.0);
        }
    }
}