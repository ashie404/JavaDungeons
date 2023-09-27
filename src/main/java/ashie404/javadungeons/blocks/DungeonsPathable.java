package ashie404.javadungeons.blocks;

import ashie404.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.World;

public class DungeonsPathable extends Block {

    // path-able block

    public BlockItem blockItem;
    public Block pathBlock;

    public boolean canTill;

    public DungeonsPathable(float hardness, float resistance, boolean canTill, BlockSoundGroup sounds, Block pathBlock, String id) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
        Registry.register(Registries.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registries.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings()));
        this.pathBlock = pathBlock;
        this.canTill = canTill;
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
            world.setBlockState(pos, pathBlock.getDefaultState());
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