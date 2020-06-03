package j0sh.javadungeons.blocks;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.content.GenericBlocks;
import j0sh.javadungeons.content.Properties;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;

public class DungeonsTray extends Block {

    // tray block

    public BlockItem blockItem;

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
        return (BlockState)this.getDefaultState().with(CONTAINS, Properties.Contains.EMPTY);
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
                switch (state.get(CONTAINS)) {
                    case YELLOW_TULIP:
                        player.setStackInHand(hand, new ItemStack(GenericBlocks.YELLOW_TULIP, 1));
                        world.setBlockState(pos, state.with(CONTAINS, Properties.Contains.EMPTY));
                        return ActionResult.SUCCESS;
                    default:
                        return ActionResult.PASS;
                }
            } else {
                return ActionResult.PASS;
            }
        } else if (block == GenericBlocks.YELLOW_TULIP) {
            if (!player.abilities.creativeMode) {
                itemStack.decrement(1);
            }
            world.setBlockState(pos, state.with(CONTAINS, Properties.Contains.YELLOW_TULIP));
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

    public DungeonsTray(Material material, float hardness, float resistance, BlockSoundGroup sounds, ItemGroup group, String id) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds).nonOpaque());
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(CONTAINS, Properties.Contains.EMPTY)));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

    static {
        CONTAINS = Properties.CONTAINS;
    }

}