package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DungeonsPathable extends Block {

    public Block pathBlock;

    public boolean canTill;

    public DungeonsPathable(Material material, float hardness, float resistance, boolean canTill, BlockSoundGroup sounds, Block pathBlock) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds));
        this.pathBlock = pathBlock;
        this.canTill = canTill;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().isIn(FabricToolTags.SHOVELS) && world.getBlockState(pos.up()).isAir()) {
            world.playSound(
                null,
                pos,
                SoundEvents.ITEM_SHOVEL_FLATTEN,
                SoundCategory.BLOCKS, 
                1.0f,
                1.0f
            );
            world.setBlockState(pos, pathBlock.getDefaultState());
            return ActionResult.SUCCESS;
        } else if (player.getMainHandStack().isIn(FabricToolTags.HOES) && world.getBlockState(pos.up()).isAir() && canTill) {
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