package j0sh.javadungeons.blocks;

import j0sh.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.entity.EntityContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DungeonsRedstoneCrystalShort extends RedstoneBlock {

    public BlockItem blockItem;

    protected static final VoxelShape SHAPE = Block.createCuboidShape(3.0D, 0.0D, 2.0D, 11.0D, 12.5D, 11.0D);

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos,
            EntityContext entityCtx) {
        return SHAPE;
    }

    public DungeonsRedstoneCrystalShort(Block base, Boolean byHand, Tag<Item> tool, ItemGroup group, String id) {
        super(FabricBlockSettings.copy(base).breakByHand(byHand).breakByTool(tool).build());
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }



}