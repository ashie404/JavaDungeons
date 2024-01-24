package ashie404.javadungeons.worldgen;

import com.mojang.serialization.Codec;

import ashie404.javadungeons.content.CreeperWoodsBlocks;
import ashie404.javadungeons.content.Tags;
import net.minecraft.block.BlockState;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class GlowMushroomFeature extends Feature<CountConfig> {
    public GlowMushroomFeature(Codec<CountConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(FeatureContext<CountConfig> context) {
        int i = 0;
        Random random = context.getRandom();
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();
        int j = ((CountConfig)context.getConfig()).getCount().get(random);

        for(int k = 0; k < j; ++k) {
            int l = random.nextInt(8) - random.nextInt(8);
            int m = random.nextInt(8) - random.nextInt(8);
            int n = structureWorldAccess.getTopY(Type.OCEAN_FLOOR, blockPos.getX() + l, blockPos.getZ() + m);
            BlockPos blockPos2 = new BlockPos(blockPos.getX() + l, n, blockPos.getZ() + m);

            BlockState blockState = CreeperWoodsBlocks.CW_GLOW_MUSHROOM.getDefaultState()
                    .with(SeaPickleBlock.WATERLOGGED, false)
                    .with(SeaPickleBlock.PICKLES, random.nextInt(4) + 1);

            // check if the block below is plantable on
            if (structureWorldAccess.getBlockState(blockPos2.down()).isIn(Tags.PLANTABLE) && blockState.canPlaceAt(structureWorldAccess, blockPos2))
                structureWorldAccess.setBlockState(blockPos2, blockState, 2);

            ++i;
        }

        return i > 0;
    }
}