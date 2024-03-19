package ashie404.javadungeons.worldgen.feature;

import com.mojang.serialization.Codec;

import ashie404.javadungeons.block.UnderwaterPlant;
import ashie404.javadungeons.block.UnderwaterTallPlant;
import ashie404.javadungeons.content.CoralRiseBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallSeagrassBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class SeaweedFeature
extends Feature<ProbabilityConfig> {
    public SeaweedFeature(Codec<ProbabilityConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(FeatureContext<ProbabilityConfig> context) {
        boolean bl = false;
        Random random = context.getRandom();
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();
        ProbabilityConfig probabilityConfig = context.getConfig();
        int i = random.nextInt(8) - random.nextInt(8);
        int j = random.nextInt(8) - random.nextInt(8);
        int k = structureWorldAccess.getTopY(Heightmap.Type.OCEAN_FLOOR, blockPos.getX() + i, blockPos.getZ() + j);
        BlockPos blockPos2 = new BlockPos(blockPos.getX() + i, k, blockPos.getZ() + j);
        if (structureWorldAccess.getBlockState(blockPos2).isOf(Blocks.WATER)) {
            boolean bl2 = random.nextDouble() < (double)probabilityConfig.probability;
            boolean bl3 = random.nextDouble()*2.0 < (double)probabilityConfig.probability;
            BlockState blockState = bl3 && bl2 ? CoralRiseBlocks.CR_TALL_TUBE_CORAL.getDefaultState() : bl2 ? CoralRiseBlocks.CR_TALL_SEAWEED.getDefaultState() : CoralRiseBlocks.CR_SEAWEED.getDefaultState();
            if (random.nextBoolean() && !bl2) {
                BlockState below = structureWorldAccess.getBlockState(blockPos2.down());
                if (below.isOf(CoralRiseBlocks.CR_TUBE_CORAL_GRASS)) {
                    blockState = CoralRiseBlocks.CR_TUBE_CORAL.getDefaultState();
                } else if (below.isOf(CoralRiseBlocks.CR_FIRE_CORAL_GRASS)) {
                    blockState = CoralRiseBlocks.CR_FIRE_CORAL.getDefaultState();
                }
            }
            if (blockState.canPlaceAt(structureWorldAccess, blockPos2)) {
                if (bl2) {
                    BlockState blockState22 = (BlockState)blockState.with(TallSeagrassBlock.HALF, DoubleBlockHalf.UPPER).with(UnderwaterTallPlant.WATERLOGGED, true);
                    BlockPos blockPos3 = blockPos2.up();
                    if (structureWorldAccess.getBlockState(blockPos3).isOf(Blocks.WATER)) {
                        structureWorldAccess.setBlockState(blockPos2, blockState.with(UnderwaterPlant.WATERLOGGED, true), Block.NOTIFY_LISTENERS);
                        structureWorldAccess.setBlockState(blockPos3, blockState22, Block.NOTIFY_LISTENERS);
                    }
                } else {
                    structureWorldAccess.setBlockState(blockPos2, blockState.with(UnderwaterPlant.WATERLOGGED, true), Block.NOTIFY_LISTENERS);
                }
                bl = true;
            }
        }
        return bl;
    }
}

