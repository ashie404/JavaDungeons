package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.World;

public class PathableBlock extends Block {

    // path-able block

    private Block pathVariant;
    private boolean canTill;

    public PathableBlock(float hardness, float resistance, boolean tillable, BlockSoundGroup sounds, Block pathVariant) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
        
        this.pathVariant = pathVariant;
        this.canTill = tillable;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().getItem().getDefaultStack().isIn(ItemTags.SHOVELS) && world.getBlockState(pos.up()).isAir()) {
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