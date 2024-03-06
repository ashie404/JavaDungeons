package ashie404.javadungeons.block;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class UnderwaterPlant extends PlantBlock implements Waterloggable {

    // underwater plant block

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    protected static final VoxelShape[] SHAPES = {
        Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D), // regular underwater plant
        Block.createCuboidShape(2.0D, 0.0D, -8.0D, 14.0D, 13.0D, 24.0D),  // wide coral
        Block.createCuboidShape(-8.0D, 0.0D, -8.0D, 24.0D, 20.0D, 24.0D), // large coral short
        Block.createCuboidShape(-8.0D, 0.0D, -8.0D, 24.0D, 28.0D, 24.0D), // large coral tall
        Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 23.0D, 14.0D) // bubble coral
    };
    protected static final MapCodec<? extends UnderwaterPlant> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((Codec.INT.fieldOf("shape_index")).forGetter(block -> block.shapeIndex), UnderwaterPlant.createSettingsCodec()).apply(instance, UnderwaterPlant::new));

    protected MapCodec<? extends UnderwaterPlant> getCodec() { return CODEC; }
    public int shapeIndex = 0;

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isSideSolidFullSquare(world, pos, Direction.UP) && !floor.isOf(Blocks.MAGMA_BLOCK);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPES[shapeIndex];
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
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
        return (BlockState)this.getDefaultState().with(WATERLOGGED, fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8);
    }

    public UnderwaterPlant(int shape_index, Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque().collidable(false));
        this.shapeIndex = shape_index;
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false));
    }
}
