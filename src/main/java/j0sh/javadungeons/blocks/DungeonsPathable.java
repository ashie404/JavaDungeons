package j0sh.javadungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.Tag;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;

import j0sh.javadungeons.JavaDungeons;

public class DungeonsPathable extends Block {

    // path-able block

    public BlockItem blockItem;
    public Block pathBlock;

    public DungeonsPathable(Block base, Boolean byHand, Tag<Item> tool, Block pathBlock, ItemGroup group, String id) {
        super(FabricBlockSettings.copy(base).breakByHand(byHand).breakByTool(tool).build());
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
        this.pathBlock = pathBlock;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getMainHandStack().getItem().isIn(FabricToolTags.SHOVELS) && world.getBlockState(pos.up()).isAir()) {
            world.playSound(
                null,
                pos,
                SoundEvents.BLOCK_GRASS_PLACE,
                SoundCategory.BLOCKS, 
                1.0f,
                1.0f
            );
            world.setBlockState(pos, pathBlock.getDefaultState());
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

}