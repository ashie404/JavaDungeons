package j0sh.javadungeons.blocks;

import j0sh.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.tag.Tag;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class DungeonsRedstoneCrystalTall extends RedstoneBlock {

    public static DirectionProperty FACING;
    private static VoxelShape MAIN_CRYSTAL_X;
    private static VoxelShape SUB_CRYSTAL_X;
    private static VoxelShape MAIN_CRYSTAL_Z;
    private static VoxelShape SUB_CRYSTAL_Z;
    private static VoxelShape CRYSTAL_X;
    private static VoxelShape CRYSTAL_Z;
    private static int POWER;

    public BlockItem blockItem;

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState) this.getDefaultState().with(FACING, ctx.getPlayerFacing().rotateYClockwise());
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView view, BlockPos pos, Direction facing) {
        return POWER;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        Direction direction = (Direction) state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? CRYSTAL_X : CRYSTAL_Z;
    }

    public DungeonsRedstoneCrystalTall(Block base, Boolean byHand, Tag<Item> tool, ItemGroup group, int power,
            String id) {
        super(FabricBlockSettings.copy(base).breakByHand(byHand).breakByTool(tool).build());
        POWER = power;
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    static {


        FACING = HorizontalFacingBlock.FACING;
        MAIN_CRYSTAL_X = Block.createCuboidShape(4.35D, 0.0D, 4.05D, 11.9D, 16.0D, 13.55D);
        SUB_CRYSTAL_X = Block.createCuboidShape(9.85D, 0.05D, 2.65D, 13.5D, 3.05D, 6.45D);
        MAIN_CRYSTAL_Z = Block.createCuboidShape(4.0D, 0.0D, 4.65D, 13.5D, 16.0D, 11.25D);
        SUB_CRYSTAL_Z = Block.createCuboidShape(2.65D, 0.05D, 2.65D, 6.5D, 3.05D, 5.85D);
        CRYSTAL_X = VoxelShapes.union(MAIN_CRYSTAL_X, SUB_CRYSTAL_X);
        CRYSTAL_Z = VoxelShapes.union(MAIN_CRYSTAL_Z, SUB_CRYSTAL_Z);

    }
}