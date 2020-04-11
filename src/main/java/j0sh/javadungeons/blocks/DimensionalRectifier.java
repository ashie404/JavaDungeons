package j0sh.javadungeons.blocks;

import j0sh.javadungeons.JavaDungeons;
import net.minecraft.block.Blocks;

import j0sh.javadungeons.container.DimensionalRectifierContainer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlacementEnvironment;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.container.BlockContext;
import net.minecraft.container.NameableContainerFactory;
import net.minecraft.container.SimpleNamedContainerFactory;
import net.minecraft.entity.EntityContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class DimensionalRectifier extends Block
{
   public static final Identifier ID = new Identifier(JavaDungeons.MOD_ID, "dimensional_rectifier");
   public static final TranslatableText CONTAINER_NAME = new TranslatableText("container.dungeons.dimensional_rectifier", new Object[0]);
   public static final DirectionProperty FACING;
   protected static final VoxelShape SHAPE;
   public static BlockItem blockItem;

   public DimensionalRectifier() {
      super(FabricBlockSettings.copy(Blocks.STONECUTTER).build());
      this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));

      ContainerProviderRegistry.INSTANCE.registerFactory(ID, (syncId, identifier, player, buf) -> {
        final World world = player.world;
        final BlockPos pos = buf.readBlockPos();
        return world.getBlockState(pos).createContainerFactory(player.world, pos).createMenu(syncId, player.inventory, player);
      });

      Registry.register(Registry.BLOCK, ID, this);
      Registry.register(Registry.ITEM, ID, blockItem = new BlockItem(this, new Item.Settings().group(JavaDungeons.CUSTOM_VARIANTS)));
   }

   public BlockState getPlacementState(ItemPlacementContext ctx) {
      return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
   }

   public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
      if (world.isClient) {
         return ActionResult.SUCCESS;
      } else {
         ContainerProviderRegistry.INSTANCE.openContainer(ID, player, buf -> buf.writeBlockPos(pos));
         return ActionResult.SUCCESS;
      }
   }

   public NameableContainerFactory createContainerFactory(BlockState state, World world, BlockPos pos) {
      return new SimpleNamedContainerFactory((i, playerInventory, playerEntity) -> {
         return new DimensionalRectifierContainer(i, playerInventory, BlockContext.create(world, pos));
      }, CONTAINER_NAME);
   }

   public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext context) {
      return SHAPE;
   }

   public boolean hasSidedTransparency(BlockState state) {
      return true;
   }

   public BlockRenderType getRenderType(BlockState state) {
      return BlockRenderType.MODEL;
   }

   public BlockState rotate(BlockState state, BlockRotation rotation) {
      return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
   }

   public BlockState mirror(BlockState state, BlockMirror mirror) {
      return state.rotate(mirror.getRotation((Direction)state.get(FACING)));
   }

   protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
      builder.add(FACING);
   }

   public boolean canPlaceAtSide(BlockState world, BlockView view, BlockPos pos, BlockPlacementEnvironment env) {
      return false;
   }

   static {
      FACING = HorizontalFacingBlock.FACING;
      SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D);
   }
}