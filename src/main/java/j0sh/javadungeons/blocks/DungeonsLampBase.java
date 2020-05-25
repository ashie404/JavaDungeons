package j0sh.javadungeons.blocks;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.content.GenericBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class DungeonsLampBase extends Block {

    public final VoxelShape SHAPE = createCuboidShape(-4, 0, -4, 20, 16, 20);

    public DungeonsLampBase() {
        super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, "lamp_base"), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, "lamp_base"), new BlockItem(this, new Item.Settings().group(JavaDungeons.GENERIC)));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient) {
            if (world.getBlockState(pos.up()).isOf(GenericBlocks.LIGHTHOUSE_LAMP)) {
                world.setBlockState(pos.up(), world.getBlockState(pos.up()).cycle(DungeonsPoweredEmissive.LIT));
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.FAIL;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getRayTraceShape(BlockState state, BlockView world, BlockPos pos) {
        return SHAPE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

}