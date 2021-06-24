package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class DungeonsChains extends Block {

    public static final BooleanProperty ABOVE;
    public static final BooleanProperty BELOW;

    protected static final VoxelShape SHAPE = Block.createCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 16.0D, 11.0D);

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return SHAPE;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        // if this is a piece with a chain both above and below it, just return regular state
        if (world.getBlockState(pos.up()).getBlock() instanceof DungeonsChains && world.getBlockState(pos.down()).getBlock() instanceof DungeonsChains)
        {
            return super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos).with(ABOVE, false).with(BELOW, false);
        } else {
            boolean blockAbove = !world.isAir(pos.up()) && !(world.getBlockState(pos.up()).getBlock() instanceof DungeonsChains);
            boolean blockBelow = !world.isAir(pos.down()) && !(world.getBlockState(pos.down()).getBlock() instanceof DungeonsChains);
            return super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos).with(ABOVE, blockAbove).with(BELOW, blockBelow);
        }
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        if (world.getBlockState(pos.up()).getBlock() instanceof DungeonsChains && world.getBlockState(pos.down()).getBlock() instanceof DungeonsChains)
        {
            return this.getDefaultState().with(ABOVE, false).with(BELOW, false);
        } else {
            boolean blockAbove = !world.isAir(pos.up()) && !(world.getBlockState(pos.up()).getBlock() instanceof DungeonsChains);
            boolean blockBelow = !world.isAir(pos.down()) && !(world.getBlockState(pos.down()).getBlock() instanceof DungeonsChains);
            return this.getDefaultState().with(ABOVE, blockAbove).with(BELOW, blockBelow);
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ABOVE);
        builder.add(BELOW);
    }

    public DungeonsChains(Material material, float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds).nonOpaque().collidable(false));
        this.setDefaultState(this.stateManager.getDefaultState().with(ABOVE, false).with(BELOW, false));
    }

    static {
        ABOVE = BooleanProperty.of("above");
        BELOW = BooleanProperty.of("below");
    }

}