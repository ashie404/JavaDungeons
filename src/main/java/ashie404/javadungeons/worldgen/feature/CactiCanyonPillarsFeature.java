package ashie404.javadungeons.worldgen.feature;

import org.joml.Math;

import com.mojang.serialization.Codec;

import ashie404.javadungeons.content.CactiCanyonBlocks;
import ashie404.javadungeons.worldgen.noise.FastNoiseLite;
import ashie404.javadungeons.worldgen.noise.FastNoiseLite.FractalType;
import ashie404.javadungeons.worldgen.noise.FastNoiseLite.NoiseType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.HeightLimitView;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.chunk.BlockColumn;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class CactiCanyonPillarsFeature extends Feature<DefaultFeatureConfig>  {

    private final FastNoiseLite noise = new FastNoiseLite();

    private final BlockState[] SANDSTONES = {
        CactiCanyonBlocks.CC_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_ORANGE_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_PINK_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_YELLOW_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_RED_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_BROWN_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_PURPLE_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_GREEN_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_BLUE_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_LIGHT_GREEN_SANDSTONE.getDefaultState(),
    };

    private double getNoiseSampleAt(double x, double y, double z) {
        return noise.GetNoise(x, y, z);
    }

    public CactiCanyonPillarsFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
        // configure noise
        noise.SetNoiseType(NoiseType.OpenSimplex2S);
        noise.SetFractalOctaves(4);
        noise.SetFractalType(FractalType.Ridged);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess world = context.getWorld();
        BlockPos origin = context.getOrigin();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        Chunk chunk = world.getChunk(origin);
        HeightLimitView heightLimitView = chunk.getHeightLimitView();
        ChunkPos chunkPos = chunk.getPos();
        noise.SetSeed((int)world.getSeed()); // set random seed to world seed
        BlockColumn blockColumn = new BlockColumn(){

            @Override
            public BlockState getState(int y) {
                return chunk.getBlockState(mutable.setY(y));
            }

            @Override
            public void setState(int y, BlockState state) {
                if (y >= heightLimitView.getBottomY() && y < heightLimitView.getTopY()) {
                    chunk.setBlockState(mutable.setY(y), state, false);
                    if (!state.getFluidState().isEmpty()) {
                        chunk.markBlockForPostProcessing(mutable);
                    }
                }
            }

            public String toString() {
                return "ChunkBlockColumn " + chunkPos;
            }
        };

        for (int cx = 0; cx <= 15; cx++) {
            for (int cz = 0; cz <= 15; cz++) {
                BlockPos current = origin.add(cx, 0, cz);
                mutable.setX(cx).setZ(cz);

                int x = current.getX();
                int z = current.getZ();
                placePillar(blockColumn, x, chunk.getHeightmap(Type.WORLD_SURFACE).get(cx, cz), z, heightLimitView);
            }
        }

        return false;
    }

    private void placePillar(BlockColumn col, int x, int surfaceY, int z, HeightLimitView chunk) {
        BlockState state;
        int y;

        double pillarNoise = Math.min(Math.abs(getNoiseSampleAt(x, 0.0, z) * 4.75), getNoiseSampleAt(x * 0.2, 38.4, z * 0.2) * 8.0);
        double pillarNoise2 = Math.abs(getNoiseSampleAt(x * 0.75, 76.8, z * 0.75) * 1.5);
        if (pillarNoise <= 0.0) return;

        int canyonPillar = MathHelper.floor(64.0 + Math.min(pillarNoise * pillarNoise * 2.5, Math.ceil(pillarNoise2 * 50.0) + 24.0));
        int canyonPillar2 = surfaceY+(canyonPillar/2);
        int pillar = Math.min(canyonPillar, canyonPillar2);
        if (surfaceY > pillar) return;

        for (y = pillar; y >= chunk.getBottomY() && !(state = col.getState(y)).isOf(Blocks.STONE); --y) {
            if (!state.isOf(Blocks.WATER)) continue;
            return;
        }
        for (y = pillar; y >= chunk.getBottomY() && col.getState(y).isAir(); y--) {
            col.setState(y, SANDSTONES[
                // Select sandstone color based on y level
                y > 109 ? 0 :
                y > 104 ? 2 :
                y > 102 ? 1 :
                y > 101 ? 4 :
                y > 99 ? 1 :
                y > 97 ? 0 :
                y > 95 ? 3 :
                y > 92 ? 4 :
                y > 91 ? 0 :
                y > 89 ? 2 :
                y > 88 ? 3 :
                y > 87 ? 8 :
                y > 86 ? 9 :
                y > 85 ? 3 :
                y > 83 ? 0 :
                y > 80 ? 3 :
                y > 79 ? 7 :
                y > 78 ? 4 :
                y > 74 ? 3 :
                y > 71 ? 1 :
                y > 70 ? 8 :
                y > 66 ? 6 : 5
            ]);
        }
    }
}
