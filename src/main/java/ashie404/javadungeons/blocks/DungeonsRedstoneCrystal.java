package ashie404.javadungeons.blocks;

import ashie404.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.ShapeContext;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsRedstoneCrystal extends Block {

    // redstone crystal block

    public BlockItem blockItem;

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public DungeonsRedstoneCrystal(float hardness, float resistance, BlockSoundGroup sounds, String id) {
        super(FabricBlockSettings.create().pistonBehavior(PistonBehavior.DESTROY).strength(hardness, resistance).sounds(sounds).nonOpaque().luminance(12));
        Registry.register(Registries.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registries.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings()));
    }

    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }
  
    public int getWeakRedstonePower(BlockState state, BlockView view, BlockPos pos, Direction facing) {
        return 8;
    }
}