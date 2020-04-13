package j0sh.javadungeons.blocks.redstonemines;

import j0sh.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityContext;
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
import net.minecraft.world.IWorld;
import net.minecraft.world.WorldView;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;

public class DungeonsRedstoneCrystalCluster extends RedstoneBlock {

    public static DirectionProperty FACING;
    private static VoxelShape MAIN_CRYSTAL_X;
    private static VoxelShape SUB_CRYSTAL_X;
    private static VoxelShape SUB_CRYSTAL_ONE_X;
    private static VoxelShape SUB_CRYSTAL_TWO_X;
    private static VoxelShape SUB_CRYSTAL_THREE_X;
    private static VoxelShape SUB_CRYSTAL_FOUR_X;
    private static VoxelShape MAIN_CRYSTAL_Z;
    private static VoxelShape SUB_CRYSTAL_Z;
    private static VoxelShape SUB_CRYSTAL_ONE_Z;
    private static VoxelShape SUB_CRYSTAL_TWO_Z;
    private static VoxelShape SUB_CRYSTAL_THREE_Z;
    private static VoxelShape SUB_CRYSTAL_FOUR_Z;
    private static VoxelShape CRYSTAL_X;
    private static VoxelShape CRYSTAL_Z;
    private static int POWER;

    public BlockItem blockItem;

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState) this.getDefaultState().with(FACING, ctx.getPlayerFacing().rotateYClockwise());
    }

    public int getWeakRedstonePower(BlockState state, BlockView view, BlockPos pos, Direction facing) {
        return POWER;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext context) {
        Direction direction = (Direction) state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? CRYSTAL_X : CRYSTAL_Z;
    }

    public DungeonsRedstoneCrystalCluster(Block base, Boolean byHand, Tag<Item> tool, ItemGroup group, int power, int lightLevel, String id) {
        super(FabricBlockSettings.copy(base).breakByHand(byHand).breakByTool(tool).lightLevel(lightLevel).build());
        POWER = power;
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

    //this looks to see if you can place the block, it wont if there is air below
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        return !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState downState = world.getBlockState(pos.down());
        return (downState  == Blocks.STONE.getDefaultState() || downState == Blocks.GRANITE.getDefaultState() || downState == Blocks.DIORITE.getDefaultState() || downState == Blocks.ANDESITE.getDefaultState() || downState == Blocks.COBBLESTONE.getDefaultState() || downState == Blocks.MOSSY_COBBLESTONE.getDefaultState() || downState == Blocks.BEDROCK.getDefaultState() || downState == Blocks.SMOOTH_STONE.getDefaultState() || downState == Blocks.GRAVEL.getDefaultState());
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
     }
    
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    static {
        
        
        FACING = HorizontalFacingBlock.FACING;

        MAIN_CRYSTAL_X = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);//
        SUB_CRYSTAL_X = Block.createCuboidShape(11.0D, 0.025D, 3.0D, 14.0D, 7.025D, 6.0D);//
        SUB_CRYSTAL_ONE_X = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 6.0D, 10.775D, 6.0D);//
        SUB_CRYSTAL_TWO_X = Block.createCuboidShape(6.0D, 0.0D, 12.0D, 9.0D, 7.0D, 14.0D);//
        SUB_CRYSTAL_THREE_X = Block.createCuboidShape(12.0D, 0.0D, 9.5D, 13.0D, 9.0D, 10.5D);//
        SUB_CRYSTAL_FOUR_X = Block.createCuboidShape(10.5D, 6.75D, 3.25D, 11.5D, 7.75D, 4.25D);//

        MAIN_CRYSTAL_Z = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);//
        SUB_CRYSTAL_Z = Block.createCuboidShape(2.0D, 0.025D, 6.0D, 4.0D, 7.025D, 9.0D);//
        SUB_CRYSTAL_ONE_Z = Block.createCuboidShape(10.0D, 0.0D, 3.0D, 13.0D, 10.775D, 6.0D);//
        SUB_CRYSTAL_TWO_Z = Block.createCuboidShape(10.0D, 0.0D, 11.0D, 13.0D, 7.0D, 14.0D);//
        SUB_CRYSTAL_THREE_Z = Block.createCuboidShape(5.5D, 0.0D, 12.0D, 6.5D, 9.0D, 13.0D);//
        SUB_CRYSTAL_FOUR_Z = Block.createCuboidShape(11.75D, 6.75D, 10.5D, 12.75D, 7.75D, 11.5D);//

        CRYSTAL_X = VoxelShapes.union(MAIN_CRYSTAL_X, SUB_CRYSTAL_X, SUB_CRYSTAL_ONE_X, SUB_CRYSTAL_TWO_X, SUB_CRYSTAL_THREE_X, SUB_CRYSTAL_FOUR_X);
        CRYSTAL_Z = VoxelShapes.union(MAIN_CRYSTAL_Z, SUB_CRYSTAL_Z, SUB_CRYSTAL_ONE_Z, SUB_CRYSTAL_TWO_Z, SUB_CRYSTAL_THREE_Z, SUB_CRYSTAL_FOUR_Z);
        
    }



}