package ashie404.javadungeons.block;

import com.mojang.serialization.MapCodec;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class GlowingPlant extends PlantBlock {

    // glowing plant block

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
    
    protected static final MapCodec<? extends GlowingPlant> CODEC = createCodec(GlowingPlant::new);
    protected MapCodec<? extends GlowingPlant> getCodec() { return CODEC; }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public GlowingPlant(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).luminance(12).nonOpaque().collidable(false));
    }

}