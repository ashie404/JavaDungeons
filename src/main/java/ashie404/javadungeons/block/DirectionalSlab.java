package ashie404.javadungeons.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;

public class DirectionalSlab extends SlabBlock {

    // directional slab 

    public static final DirectionProperty FACING = Properties.FACING;

    public DirectionalSlab(Settings settings) {
        super(FabricBlockSettings.copyOf(settings));
        this.setDefaultState((BlockState)this.stateManager.getDefaultState().with(WATERLOGGED, false).with(TYPE, SlabType.BOTTOM).with(FACING, Direction.NORTH));
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)super.getPlacementState(ctx).with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, FACING);
    }

}