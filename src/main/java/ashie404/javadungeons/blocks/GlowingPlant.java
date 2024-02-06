package ashie404.javadungeons.blocks;

import com.mojang.serialization.MapCodec;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.sound.BlockSoundGroup;

public class GlowingPlant extends PlantBlock {

    // glowing plant block

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    protected MapCodec<? extends GlowingPlant> getCodec() { return createCodec(GlowingPlant::new); }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    private GlowingPlant(AbstractBlock.Settings settings) {
        super(settings);
    }

    public GlowingPlant(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).luminance(12).nonOpaque().collidable(false));
    }

}