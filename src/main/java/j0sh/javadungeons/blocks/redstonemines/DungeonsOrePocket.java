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

public class DungeonsOrePocket extends RedstoneBlock {

    public static final DirectionProperty FACING;
    private static final VoxelShape MAIN_CRYSTAL_X;
    private static final VoxelShape CRYSTAL_X;
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
        return CRYSTAL_X;
    }


    //this registers the block
    public DungeonsOrePocket(Block base, Boolean byHand, Tag<Item> tool, ItemGroup group, int power, int lightLevel,
            String id) {
        super(FabricBlockSettings.copy(base).breakByHand(byHand).breakByTool(tool).lightLevel(lightLevel).build());
        POWER = power;
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, id),
        blockItem = new BlockItem(this, new Item.Settings().group(group)));
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

    //handels blocks state
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }
    
    //tells the game what to do if this is pushed by a piston
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.NORMAL;
     }
    
    //appends the FACING property
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    //Defines the hitbox
    static {
        FACING = HorizontalFacingBlock.FACING;
        MAIN_CRYSTAL_X = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
        CRYSTAL_X = VoxelShapes.union(MAIN_CRYSTAL_X);
    }

}