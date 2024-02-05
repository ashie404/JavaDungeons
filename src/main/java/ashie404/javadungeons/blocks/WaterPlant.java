package ashie404.javadungeons.blocks;

import com.mojang.serialization.MapCodec;

import ashie404.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidFillable;

import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.block.PlantBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class WaterPlant extends PlantBlock implements FluidFillable {

    // water plant block

    public BlockItem blockItem;

    protected MapCodec<? extends WaterPlant> getCodec() { return createCodec(WaterPlant::new); }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8 ? super.getPlacementState(ctx) : null;
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
        return floor.isSideSolidFullSquare(view, pos, Direction.UP) && floor.getBlock() != Blocks.MAGMA_BLOCK;
    }

    private WaterPlant(AbstractBlock.Settings settings) {
        super(settings);
    }

    public WaterPlant(float hardness, float resistance, BlockSoundGroup sounds, String id) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).nonOpaque().collidable(false));
        Registry.register(Registries.BLOCK, JavaDungeons.ID(id), this);
        Registry.register(Registries.ITEM,JavaDungeons.ID(id), blockItem = new BlockItem(this, new Item.Settings()));
    }

    public boolean canFillWithFluid(PlayerEntity entity, BlockView view, BlockPos pos, BlockState state, Fluid fluid) {
        return false;
    }
  
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return false;
    }

    public FluidState getFluidState(BlockState state) {
        return Fluids.WATER.getStill(false);
    }
}