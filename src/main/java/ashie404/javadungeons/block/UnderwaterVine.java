package ashie404.javadungeons.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.state.property.Properties;

public class UnderwaterVine extends VineBlock implements Waterloggable {

    // underwater vine block

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(UP, NORTH, EAST, SOUTH, WEST, WATERLOGGED);
    }
  
    public FluidState getFluidState(BlockState state) {
       return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
       if ((Boolean)state.get(WATERLOGGED)) {
          world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
       }

       return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        BlockState state = super.getPlacementState(ctx);
        if (state != null) {
            return state.with(WATERLOGGED, fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8);
        } else return null;
    }

    public UnderwaterVine(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false).with(UP, false).with(NORTH, false).with(EAST, false).with(SOUTH, false).with(WEST, false));
    }
}
