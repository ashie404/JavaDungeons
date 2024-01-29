package ashie404.javadungeons.blocks;

import com.mojang.serialization.MapCodec;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.content.CreeperWoodsBlocks;
import ashie404.javadungeons.content.GenericBlocks;
import ashie404.javadungeons.content.SoggySwampBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.SnowyBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;

public class GrassBlock extends SnowyBlock {

    // spreadable grass block

    public BlockItem blockItem;
    public Block dirtVariant;

    public MapCodec<GrassBlock> getCodec() {
        return null;
    }

    public GrassBlock(float hardness, float resistance, BlockSoundGroup sounds, DungeonsAreaType dAreaType, String id) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
        // determine grass block's respective dirt variant
        switch (dAreaType) {
            case GENERIC:
                this.dirtVariant = GenericBlocks.DIRT;
                break;
            case CREEPER_WOODS:
                this.dirtVariant = CreeperWoodsBlocks.CW_DIRT;
                break;
            case SOGGY_SWAMP:
                this.dirtVariant = SoggySwampBlocks.SS_DIRT;
                break;
            default:
                this.dirtVariant = GenericBlocks.DIRT;
        }
        Registry.register(Registries.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registries.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings()));
    }

    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.SNOW) && blockState.get(SnowBlock.LAYERS) == 1) {
            return true;
        }
        if (blockState.getFluidState().getLevel() == 8) {
            return false;
        }
        int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(world, blockPos));
        return i < world.getMaxLightLevel();
    }

    private static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        return canSurvive(state, world, pos) && !world.getFluidState(blockPos).isIn(FluidTags.WATER);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {
            world.setBlockState(pos, dirtVariant.getDefaultState());
            return;
        }
        if (world.getLightLevel(pos.up()) >= 9) {
            BlockState blockState = this.getDefaultState();
            for (int i = 0; i < 4; ++i) {
                BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if (!world.getBlockState(blockPos).isOf(dirtVariant) || !canSpread(blockState, world, blockPos)) continue;
                world.setBlockState(blockPos, (BlockState)blockState.with(SNOWY, world.getBlockState(blockPos.up()).isOf(Blocks.SNOW)));
            }
        }
    }

}