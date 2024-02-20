package ashie404.javadungeons.block;

import com.mojang.serialization.MapCodec;

import ashie404.javadungeons.content.Tags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DesertPlant extends PlantBlock {

    // desert plant block

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
    protected static final MapCodec<? extends DesertPlant> CODEC = createCodec(DesertPlant::new);

    protected MapCodec<? extends DesertPlant> getCodec() { return CODEC; }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
        BlockState blockState = floor.getBlock().getDefaultState();
        return blockState.isIn(Tags.DESERT_PLANTABLE) || blockState.isIn(Tags.PLANTABLE);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public DesertPlant(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque().collidable(false));
    }
}