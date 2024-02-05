package ashie404.javadungeons.worldgen.feature;

import org.joml.Math;

import com.mojang.serialization.Codec;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.content.CactiCanyonBlocks;
import ashie404.javadungeons.worldgen.noise.FastNoiseLite;
import ashie404.javadungeons.worldgen.noise.FastNoiseLite.CellularDistanceFunction;
import ashie404.javadungeons.worldgen.noise.FastNoiseLite.FractalType;
import ashie404.javadungeons.worldgen.noise.FastNoiseLite.NoiseType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathConstants;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.HeightLimitView;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.chunk.BlockColumn;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig;
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
        CactiCanyonBlocks.CC_DARK_BROWN_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_PURPLE_SANDSTONE.getDefaultState(),
        CactiCanyonBlocks.CC_LIGHT_GREEN_SANDSTONE.getDefaultState()
    };

    private double getNoiseSampleAt(double x, double y, double z) {
        x *= 0.6; y *= 0.6; z *= 0.6; // transform coords
        return noise.GetNoise(x, y, z);
    }

    public CactiCanyonPillarsFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
        // configure noise
        noise.SetNoiseType(NoiseType.OpenSimplex2S);
        noise.SetFractalOctaves(4);
        noise.SetFractalGain(2.5f);
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
        int k;

        double e = Math.min(Math.abs(getNoiseSampleAt(x, 0.0, z) * 4.75), getNoiseSampleAt(x * 0.2, 64.0, z * 0.2) * 8.0);
        if (e <= 0.0) return;
        double h = Math.abs(getNoiseSampleAt(x * 0.75, 128.0, z * 0.75) * 1.5);

        double i = 64.0 + Math.min(e * e * 2.5, Math.ceil(h * 50.0) + 24.0);
        int canyonPillar = MathHelper.floor(i);
        int canyonPillarClamped = surfaceY+(canyonPillar/4);
        int j = Math.min(canyonPillar, canyonPillarClamped);
        if (surfaceY > j) return;
        for (k = j; k >= chunk.getBottomY() && !(state = col.getState(k)).isOf(Blocks.STONE); --k) {
            if (!state.isOf(Blocks.WATER)) continue;
            return;
        }
        for (k = j; k >= chunk.getBottomY() && col.getState(k).isAir(); k--) {
            col.setState(k, SANDSTONES[
                k > 109 ? 2 :
                k > 104 ? 6 :
                k > 99 ? 5 :
                k > 97 ? 0 :
                k > 93 ? 3 :
                k > 92 ? 4 :
                k > 91 ? 0 :
                k > 86 ? 2 :
                k > 83 ? 3 :
                k > 80 ? 3 :
                k > 79 ? 7 :
                k > 78 ? 1 :
                k > 74 ? 4 :
                k > 71 ? 5 : 6
            ]);
        }
    }
}
