package ashie404.javadungeons.blocks;

import com.mojang.serialization.MapCodec;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.SnowyBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.world.ServerWorld;

public class GrassBlock extends SnowyBlock {

    // spreadable grass block

    

    private Block dirtVariant;
    private Block pathVariant;
    private boolean canTill = false;
    private boolean canPath = false;

    public MapCodec<GrassBlock> getCodec() { return createCodec(GrassBlock::new); }

    private GrassBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    // Non-pathable/tillable constructor
    public GrassBlock(float hardness, float resistance, BlockSoundGroup sounds, Block dirtBlock) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).ticksRandomly());
        dirtVariant = dirtBlock; 
    }

    // Pathable/tillable constructor
    public GrassBlock(float hardness, float resistance, boolean tillable, BlockSoundGroup sounds, Block pathBlock, Block dirtBlock) {
        this(hardness, resistance, sounds, dirtBlock);
        canPath = true;
        canTill = tillable;
        pathVariant = pathBlock;
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
        return GrassBlock.canSurvive(state, world, pos) && !world.getFluidState(blockPos).isIn(FluidTags.WATER);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!GrassBlock.canSurvive(state, world, pos)) {
            world.setBlockState(pos, dirtVariant.getDefaultState());
            return;
        }
        if (world.getLightLevel(pos.up()) >= 9) {
            BlockState blockState = this.getDefaultState();
            for (int i = 0; i < 4; ++i) {
                BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if (!world.getBlockState(blockPos).isOf(dirtVariant) || !GrassBlock.canSpread(blockState, world, blockPos)) continue;
                world.setBlockState(blockPos, (BlockState)blockState.with(SNOWY, world.getBlockState(blockPos.up()).isOf(Blocks.SNOW)));
            }
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().getItem().getDefaultStack().isIn(ItemTags.SHOVELS) && world.getBlockState(pos.up()).isAir() && canPath) {
            world.playSound(
                null,
                pos,
                SoundEvents.ITEM_SHOVEL_FLATTEN,
                SoundCategory.BLOCKS, 
                1.0f,
                1.0f
            );
            world.setBlockState(pos, pathVariant.getDefaultState());
            return ActionResult.SUCCESS;
        } else if (player.getMainHandStack().getItem().getDefaultStack().isIn(ItemTags.HOES) && world.getBlockState(pos.up()).isAir() && canTill) {
            world.playSound(
                null,
                pos,
                SoundEvents.ITEM_HOE_TILL,
                SoundCategory.BLOCKS, 
                1.0f,
                1.0f
            );
            world.setBlockState(pos, Blocks.FARMLAND.getDefaultState());
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

}