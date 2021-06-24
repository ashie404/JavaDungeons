package juniebyte.javadungeons.blocks;

import juniebyte.javadungeons.content.GenericBlocks;
import juniebyte.javadungeons.content.Properties;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class DungeonsTray extends Block {

    protected static final VoxelShape SHAPE = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 4.0D, 13.0D);

    public static final EnumProperty<Properties.Contains> CONTAINS;

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return SHAPE;
    }
    
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(CONTAINS, Properties.Contains.EMPTY);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CONTAINS);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        Block block = item instanceof BlockItem ? ((BlockItem)item).getBlock() : Blocks.AIR;
        if (block == Blocks.AIR) {
            if (itemStack.isEmpty()) {
                if (state.get(CONTAINS) == Properties.Contains.YELLOW_TULIP) {
                    player.setStackInHand(hand, new ItemStack(GenericBlocks.YELLOW_TULIP, 1));
                    world.setBlockState(pos, state.with(CONTAINS, Properties.Contains.EMPTY));
                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.PASS;
        } else if (block == GenericBlocks.YELLOW_TULIP) {
            if (!player.getAbilities().creativeMode) {
                itemStack.decrement(1);
            }
            world.setBlockState(pos, state.with(CONTAINS, Properties.Contains.YELLOW_TULIP));
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

    public DungeonsTray(Material material, float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds).nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState().with(CONTAINS, Properties.Contains.EMPTY));
    }

    static {
        CONTAINS = Properties.CONTAINS;
    }

}