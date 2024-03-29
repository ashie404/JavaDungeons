package ashie404.javadungeons.block.entity;

import ashie404.javadungeons.block.Brazier;
import ashie404.javadungeons.block.Properties.LitVariant;
import ashie404.javadungeons.content.BlockEntities;
import ashie404.javadungeons.content.Particles;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class BrazierBlockEntity extends BlockEntity {

    // Brazier block entity
    
    public BrazierBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntities.BRAZIER, pos, state);
    }

    public static void particleTick(World world, BlockPos pos, BlockState state, BrazierBlockEntity be) {
        Random random = world.getRandom();
        LitVariant variant = state.get(Brazier.LIT_VARIANT);
        if (variant != LitVariant.UNLIT) {
            if (random.nextBoolean()) {
                double d = (double)pos.getX() + 0.5;
                double e = (double)pos.getY() + 1.2;
                double f = (double)pos.getZ() + 0.5;
                double rd1 = random.nextDouble();
                double rd2 = random.nextDouble();
                double g = random.nextBoolean() ? (0.1*rd1) : (-0.1*rd2);
                double h = random.nextBoolean() ? (0.1*rd2) : (-0.1*rd1);
                switch (variant) {
                    case LIT_GREEN: world.addParticle(Particles.GREEN_FLAME, true, d+g, e, f+h, h*0.1, 0.03*random.nextDouble(), g*0.1); break;
                    case LIT_SOUL: world.addParticle(Particles.SOUL_FLAME, true, d+g, e, f+h, h*0.1, 0.03*random.nextDouble(), g*0.1); break;
                    default: world.addParticle(Particles.FLAME, true, d+g, e, f+h, h*0.1, 0.03*random.nextDouble(), g*0.1); break;
                }
            }
        }
    }
}