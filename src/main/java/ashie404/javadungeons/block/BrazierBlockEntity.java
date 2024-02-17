package ashie404.javadungeons.block;

import ashie404.javadungeons.content.BlockEntities;
import ashie404.javadungeons.content.Particles;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class BrazierBlockEntity extends BlockEntity {

    public BrazierBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntities.BRAZIER, pos, state);
    }

    public static void flameTick(World world, BlockPos pos, BlockState state, BrazierBlockEntity be) {
        Random random = world.getRandom();
        if (random.nextBoolean()) {
            double d = (double)pos.getX() + 0.5;
            double e = (double)pos.getY() + 1.2;
            double f = (double)pos.getZ() + 0.5;
            double rd1 = random.nextDouble();
            double rd2 = random.nextDouble();
            double g = random.nextBoolean() ? (0.1*rd1) : (-0.1*rd2);
            double h = random.nextBoolean() ? (0.1*rd2) : (-0.1*rd1);
            world.addParticle(Particles.FLAME, true, d+g, e, f+h, 0.0, 0.03*random.nextDouble(), 0.0);
        }
    }

    public static void greenFlameTick(World world, BlockPos pos, BlockState state, BrazierBlockEntity be) {
        Random random = world.getRandom();
        if (random.nextBoolean()) {
            double d = (double)pos.getX() + 0.5;
            double e = (double)pos.getY() + 1.2;
            double f = (double)pos.getZ() + 0.5;
            double rd1 = random.nextDouble();
            double rd2 = random.nextDouble();
            double g = random.nextBoolean() ? (0.1*rd1) : (-0.1*rd2);
            double h = random.nextBoolean() ? (0.1*rd2) : (-0.1*rd1);
            world.addParticle(Particles.GREEN_FLAME, true, d+g, e, f+h, 0.01*rd1, 0.03*random.nextDouble(), 0.01*rd2);
        }
    }
}