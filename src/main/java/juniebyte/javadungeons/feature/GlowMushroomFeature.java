package juniebyte.javadungeons.feature;

import com.mojang.serialization.Codec;
import juniebyte.javadungeons.content.CreeperWoodsBlocks;
import juniebyte.javadungeons.content.Tags;
import net.minecraft.block.BlockState;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Random;

public class GlowMushroomFeature extends Feature<CountConfig> {
    public GlowMushroomFeature(Codec<CountConfig> configFactory) {
        super(configFactory);
    }

    @Override
    public boolean generate(FeatureContext<CountConfig> context) {
        CountConfig config = context.getConfig();
        Random random = context.getRandom();
        StructureWorldAccess world = context.getWorld();
        BlockPos pos = context.getOrigin();
        int i = 0;

        int randomCount = context.getConfig().getCount().get(random);

        for(int j = 0; j < randomCount; ++j) {
            int posX = random.nextInt(8) - random.nextInt(8);
            int posZ = random.nextInt(8) - random.nextInt(8);
            int posY = world.getTopY(Heightmap.Type.WORLD_SURFACE, pos.getX() + posX, pos.getZ() + posZ);
            BlockPos blockPos2 = new BlockPos(pos.getX() + posX, posY, pos.getZ() + posZ);

            BlockState blockState = CreeperWoodsBlocks.CW_GLOW_MUSHROOM.getDefaultState()
                    .with(SeaPickleBlock.WATERLOGGED, false)
                    .with(SeaPickleBlock.PICKLES, random.nextInt(4) + 1);

            // check if the block below is plantable on
            if (world.getBlockState(blockPos2.down()).isIn(Tags.PLANTABLE)
                    && blockState.canPlaceAt(world, blockPos2))
                world.setBlockState(blockPos2, blockState, 2);

            ++i;
        }

        return i > 0;
    }
}
