package j0sh.javadungeons.blocks;

import static j0sh.javadungeons.JavaDungeons.DDR_IDENTIFIER;
import static j0sh.javadungeons.JavaDungeons.GENERIC;
import static net.minecraft.block.Blocks.STONECUTTER;

import j0sh.javadungeons.container.DDRContainer;
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

class DDRBlock extends Block
{
    public static final String MOD_ID = "dungeons";
    private static final TranslatableText CONTAINER_NAME = new TranslatableText("dungeons.container.ddr", new Object[0]);
   public static final DirectionProperty FACING;
   protected static final VoxelShape SHAPE;
   public static BlockItem blockItem;

   public DDRBlock() {
      super(FabricBlockSettings.copy(STONECUTTER).build());
      this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));

      ContainerProviderRegistry.INSTANCE.registerFactory(DDR_IDENTIFIER, (syncId, identifier, player, buf) -> {
        final World world = player.world;
        final BlockPos pos = buf.readBlockPos();
        return world.getBlockState(pos).createContainerFactory(player.world, pos).createMenu(syncId, player.inventory, player);
    });

      Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dimensional_rectifier"), this);
      Registry.register(Registry.ITEM,new Identifier(MOD_ID, "dimensional_rectifier"), blockItem = new BlockItem(this, new Item.Settings().group(GENERIC)));
   }

   public BlockState getPlacementState(ItemPlacementContext ctx) {
      return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
   }

   public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
      if (world.isClient) {
         return ActionResult.SUCCESS;
      } else {
         ContainerProviderRegistry.INSTANCE.openContainer(DDR_IDENTIFIER, player, buf -> buf.writeBlockPos(pos));
         return ActionResult.SUCCESS;
      }
   }

   public NameableContainerFactory createContainerFactory(BlockState state, World world, BlockPos pos) {
      return new SimpleNamedContainerFactory((i, playerInventory, playerEntity) -> {
         return new DDRContainer(i, playerInventory, BlockContext.create(world, pos));
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