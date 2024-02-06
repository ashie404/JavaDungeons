package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.ShapeContext;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.sound.BlockSoundGroup;

public class RedstoneCrystal extends Block {

    // redstone crystal block

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public RedstoneCrystal(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().pistonBehavior(PistonBehavior.DESTROY).strength(hardness, resistance).sounds(sounds).nonOpaque().luminance(12));
    }

    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }
  
    public int getWeakRedstonePower(BlockState state, BlockView view, BlockPos pos, Direction facing) {
        return 8;
    }
}