package ashie404.javadungeons.block;

import java.util.function.ToIntFunction;

import org.jetbrains.annotations.Nullable;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import ashie404.javadungeons.block.Properties.LitVariant;
import ashie404.javadungeons.block.entity.BrazierBlockEntity;
import ashie404.javadungeons.content.BlockEntities;
import ashie404.javadungeons.content.Particles;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class Brazier extends BlockWithEntity implements Waterloggable {

    // brazier block

    protected final VoxelShape shape;
    private final boolean soggySwamp;
    
    private static final VoxelShape DEFAULT_SHAPE = VoxelShapes.union(Block.createCuboidShape(-4.0D, 0.0D, -4.0D, 20.0D, 4.0D, 20.0D),Block.createCuboidShape(0.0D, 4.0D, 0.0D, 16.0D, 20.0D, 16.0D));
    private static final VoxelShape SS_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 17.0D, 16.0D); 
    
    public static final BooleanProperty WATERLOGGED = net.minecraft.state.property.Properties.WATERLOGGED;
    public static final EnumProperty<LitVariant> LIT_VARIANT = Properties.LIT_VARIANT;

    protected static final MapCodec<? extends Brazier> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((Codec.BOOL.fieldOf("soggy_swamp")).forGetter(block -> block.soggySwamp), Brazier.createSettingsCodec()).apply(instance, Brazier::new));

    protected MapCodec<? extends Brazier> getCodec() { return CODEC; }

    private static ToIntFunction<BlockState> getLightLevel() {
        return (blockState) -> { return blockState.get(LIT_VARIANT) != LitVariant.UNLIT ? 15 : 0; };
    }

    public static void extinguish(@Nullable Entity entity, WorldAccess world, BlockPos pos, BlockState state) {
        if (!world.isClient()) {
            if (state.get(LIT_VARIANT) == LitVariant.LIT_GREEN) {
                // if brazier is green lit (contains emerald), then spawn out emerald when extinguished
                world.spawnEntity(new ItemEntity((World)world, pos.getX(), pos.getY()+1.0D, pos.getZ(), new ItemStack(Items.EMERALD, 1)));
            } else if (state.get(LIT_VARIANT) == LitVariant.LIT_SOUL) {
                // if brazier is soul lit (contains soul sand), then spawn out soul sand when extinguished
                world.spawnEntity(new ItemEntity((World)world, pos.getX(), pos.getY()+1.0D, pos.getZ(), new ItemStack(Items.SOUL_SAND, 1)));
            }
            // play extinguished sound and emit block change event
            world.playSound(null, pos, SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, SoundCategory.BLOCKS, 1.0f, 1.0f);
            world.emitGameEvent(entity, GameEvent.BLOCK_CHANGE, pos);
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext entityCtx) {
		return shape;
	}

    public Brazier(boolean soggy_swamp, Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque().ticksRandomly().solid().luminance(getLightLevel()));
        this.soggySwamp = soggy_swamp;
        this.shape = soggy_swamp ? SS_SHAPE : DEFAULT_SHAPE;
        this.setDefaultState((BlockState)this.stateManager.getDefaultState().with(LIT_VARIANT, LitVariant.UNLIT).with(WATERLOGGED, false));
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return (BlockState)this.getDefaultState().with(LIT_VARIANT, LitVariant.UNLIT).with(WATERLOGGED, fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT_VARIANT);
        builder.add(WATERLOGGED);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        // If soggySwamp is true (Soggy Swamp brazier) then only check for block below current. 
        // If false (default brazier) then check for block below current, and non-diagonal adjacents. (due to its legs extending past 1 block on each non-diagonal side)
        return soggySwamp ? sideCoversSmallSquare(world, pos.down(), Direction.UP) :
            sideCoversSmallSquare(world, pos.down(), Direction.UP) && 
            sideCoversSmallSquare(world, pos.add(1, 0, 0).down(), Direction.UP) && sideCoversSmallSquare(world, pos.add(0, 0, 1).down(), Direction.UP) &&
            sideCoversSmallSquare(world, pos.add(-1, 0, 0).down(), Direction.UP) && sideCoversSmallSquare(world, pos.add(0, 0, -1).down(), Direction.UP);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        // if block is not waterlogged, and fluid filling is water, then allow fill with fluid
        if (!state.get(WATERLOGGED).booleanValue() && fluidState.getFluid() == Fluids.WATER) {
            if (!world.isClient()) {
                // check if lit and extinguish
                LitVariant lit = state.get(LIT_VARIANT);
                if (lit != LitVariant.UNLIT) {
                    Brazier.extinguish(null, world, pos, state);
                }
                // set waterlogged and unlit, then schedule fluid tick
                world.setBlockState(pos, (BlockState)state.with(LIT_VARIANT, LitVariant.UNLIT).with(WATERLOGGED, true), Block.NOTIFY_ALL_AND_REDRAW);
                world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
            }
            return true;
        }
        return false;
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        LitVariant currentVariant = state.get(LIT_VARIANT);
        Boolean waterlogged = state.get(WATERLOGGED);
        if (item == Items.FLINT_AND_STEEL && currentVariant == LitVariant.UNLIT && !waterlogged) {
            // light brazier when flint and steel is used, and play flint and steel use sound, emit block change event
            world.setBlockState(pos, state.with(LIT_VARIANT, LitVariant.LIT), Block.NOTIFY_ALL_AND_REDRAW);
            world.playSound(player, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0f, world.getRandom().nextFloat() * 0.4f + 0.8f);
            world.emitGameEvent((Entity)player, GameEvent.BLOCK_CHANGE, pos);
            return ActionResult.SUCCESS;
        } else if (item == Items.EMERALD && currentVariant == LitVariant.LIT) {
            // turn brazier fire green when emerald is used and fire is lit
            world.setBlockState(pos, state.with(LIT_VARIANT, LitVariant.LIT_GREEN), Block.NOTIFY_ALL_AND_REDRAW);
            world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_RESONATE, SoundCategory.BLOCKS, 1.0f, world.getRandom().nextFloat() * 0.4f + 0.8f);
            if (!player.isCreative()) {
                itemStack.decrement(1);
            }
            world.emitGameEvent((Entity)player, GameEvent.BLOCK_CHANGE, pos);
            return ActionResult.SUCCESS;
        } else if (item == Items.SOUL_SAND && currentVariant == LitVariant.LIT) {
            // turn brazier fire into soul fire when soul sand is used and fire is lit
            world.setBlockState(pos, state.with(LIT_VARIANT, LitVariant.LIT_SOUL), Block.NOTIFY_ALL_AND_REDRAW);
            world.playSound(player, pos, SoundEvents.PARTICLE_SOUL_ESCAPE, SoundCategory.BLOCKS, 1.0f, world.getRandom().nextFloat() * 0.4f + 0.8f);
            if (!player.isCreative()) {
                itemStack.decrement(1);
            }
            world.emitGameEvent((Entity)player, GameEvent.BLOCK_CHANGE, pos);
            return ActionResult.SUCCESS;
        } else if (itemStack.isEmpty() && currentVariant == LitVariant.LIT_GREEN) {
            // if player has nothing in hand or offhand, allow player to grab emerald back from brazier.
            player.setStackInHand(hand, new ItemStack(Items.EMERALD, 1));
            world.setBlockState(pos, state.with(LIT_VARIANT, LitVariant.LIT), Block.NOTIFY_ALL_AND_REDRAW);
            world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_BREAK, SoundCategory.BLOCKS, 1.0f, world.getRandom().nextFloat() * 0.4f + 0.8f);
            world.emitGameEvent((Entity)player, GameEvent.BLOCK_CHANGE, pos);
            return ActionResult.SUCCESS;
        } else if (itemStack.isEmpty() && currentVariant == LitVariant.LIT_SOUL) {
            // if player has nothing in hand or offhand, allow player to grab soul sand back from brazier.
            player.setStackInHand(hand, new ItemStack(Items.SOUL_SAND, 1));
            world.setBlockState(pos, state.with(LIT_VARIANT, LitVariant.LIT), Block.NOTIFY_ALL_AND_REDRAW);
            world.playSound(player, pos, SoundEvents.BLOCK_SOUL_SAND_BREAK, SoundCategory.BLOCKS, 1.0f, world.getRandom().nextFloat() * 0.4f + 0.8f);
            world.emitGameEvent((Entity)player, GameEvent.BLOCK_CHANGE, pos);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED).booleanValue()) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        LitVariant variant = state.get(LIT_VARIANT);
        double d = (double)pos.getX() + 0.5;
        double e = (double)pos.getY() + 1.15;
        double f = (double)pos.getZ() + 0.5;
        switch (variant) {
            case LIT: world.addParticle(Particles.EMBERS, d, e, f, 0.0, 0.0, 0.0); break;
            case LIT_GREEN: world.addParticle(Particles.GREEN_EMBERS, d, e, f, 0.0, 0.0, 0.0); break;
            case LIT_SOUL: world.addParticle(Particles.SOUL_EMBERS, d, e, f, 0.0, 0.0, 0.0); break;
            default: return;
        }
    }

    /// Block entity functionality

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BrazierBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL;
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        if (world.isClient) {
            return validateTicker(type, BlockEntities.BRAZIER, BrazierBlockEntity::particleTick);
        }
        return null;
    }
}