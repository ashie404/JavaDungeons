package juniebyte.javadungeons.feature;

import com.mojang.serialization.Codec;
import juniebyte.javadungeons.content.CreeperWoodsBlocks;
import juniebyte.javadungeons.content.Tags;
import net.minecraft.block.BlockState;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.SeaPickleFeatureConfig;

import java.util.Random;

public class GlowMushroomFeature extends Feature<SeaPickleFeatureConfig> {
    public GlowMushroomFeature(Codec<SeaPickleFeatureConfig> configFactory) {
        super(configFactory);
    }

    @Override
    public boolean generate(ServerWorldAccess world, StructureAccessor accessor, ChunkGenerator generator, Random random, BlockPos pos, SeaPickleFeatureConfig config) {
        int i = 0;

        for(int j = 0; j < config.count; ++j) {
            int k = random.nextInt(8) - random.nextInt(8);
            int l = random.nextInt(8) - random.nextInt(8);
            int m = world.getTopY(Heightmap.Type.WORLD_SURFACE, pos.getX() + k, pos.getZ() + l);
            BlockPos blockPos2 = new BlockPos(pos.getX() + k, m, pos.getZ() + l);

            BlockState blockState = CreeperWoodsBlocks.CW_GLOW_MUSHROOM.getDefaultState()
                    .with(SeaPickleBlock.WATERLOGGED, false)
                    .with(SeaPickleBlock.PICKLES, random.nextInt(4) + 1);

            // check if the block below is plantable on
            if (world.getBlockState(blockPos2.down()).getBlock().isIn(Tags.PLANTABLE)
                    && blockState.canPlaceAt(world, blockPos2))
                world.setBlockState(blockPos2, blockState, 2);

            ++i;
        }

        return i > 0;
    }
}