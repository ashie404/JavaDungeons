package j0sh.javadungeons.blocks;

import j0sh.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidFillable;
import net.minecraft.block.Material;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.block.PlantBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.minecraft.world.IWorld;

public class DungeonsWaterPlant extends PlantBlock implements FluidFillable {

    // water plant block

    public BlockItem blockItem;

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return fluidState.matches(FluidTags.WATER) && fluidState.getLevel() == 8 ? super.getPlacementState(ctx) : null;
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
        return floor.isSideSolidFullSquare(view, pos, Direction.UP) && floor.getBlock() != Blocks.MAGMA_BLOCK;
    }

    public DungeonsWaterPlant(Material material, float hardness, float resistance, BlockSoundGroup sounds, ItemGroup group, String id) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds).nonOpaque().collidable(false));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

    public boolean canFillWithFluid(BlockView view, BlockPos pos, BlockState state, Fluid fluid) {
        return false;
    }
  
    public boolean tryFillWithFluid(IWorld world, BlockPos pos, BlockState state, FluidState fluidState) {
        return false;
    }

    public FluidState getFluidState(BlockState state) {
        return Fluids.WATER.getStill(false);
    }
}