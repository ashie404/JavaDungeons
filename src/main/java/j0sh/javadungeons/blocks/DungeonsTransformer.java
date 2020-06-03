package j0sh.javadungeons.blocks;

import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
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
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.gui.DungeonsTransformerScreenHandler;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

public class DungeonsTransformer extends Block {
   public static final TranslatableText CONTAINER_NAME = new TranslatableText("container.dungeons.dungeons_transformer", new Object[0]);
   public static final DirectionProperty FACING;
   public static final Identifier ID = new Identifier(JavaDungeons.MOD_ID, "dungeons_transformer");
   public BlockItem blockItem;

   public DungeonsTransformer() {
      super(FabricBlockSettings.copy(Blocks.OBSIDIAN));
      this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
      Registry.register(Registry.BLOCK, ID, this);
      Registry.register(Registry.ITEM, ID, blockItem = new BlockItem(this, new Item.Settings().group(JavaDungeons.GENERIC)));
   }

   public BlockState getPlacementState(ItemPlacementContext ctx) {
      return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
   }

   public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
      if (world.isClient) {
         return ActionResult.SUCCESS;
      } else {
         ContainerProviderRegistry.INSTANCE.openContainer(ID, player, buf -> buf.writeBlockPos(pos));
         //player.openContainer(state.createContainerFactory(world, pos));
         return ActionResult.SUCCESS;
      }
   }

   public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
      return new SimpleNamedScreenHandlerFactory((i, playerInventory, playerEntity) -> {
         return new DungeonsTransformerScreenHandler(i, playerInventory, ScreenHandlerContext.create(world, pos));
      }, CONTAINER_NAME);
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

   public boolean canPathfindThrough(BlockState world, BlockView view, BlockPos pos, NavigationType env) {
      return false;
   }

   static {
      FACING = HorizontalFacingBlock.FACING;
   }
}
