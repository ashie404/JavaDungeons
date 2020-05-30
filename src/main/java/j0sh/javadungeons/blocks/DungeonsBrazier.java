package j0sh.javadungeons.blocks;

import java.util.Random;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.content.Particles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.IWorld;

public class DungeonsBrazier extends Block {

    // brazier block

    public BlockItem blockItem;

    public String type;

    protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 13.0D, 15.0D);

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityContext entityCtx) {
		return SHAPE;
	}

    public DungeonsBrazier(Material material, float hardness, float resistance, BlockSoundGroup sounds, ItemGroup group, String type, String id) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds).nonOpaque().lightLevel(type != "unlit" ? 15 : 0));
        this.type = type;
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        return facing == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (type != "unlit") {
            double d = (double)pos.getX() + 0.5D;
            double e = (double)pos.getY() + 0.7D;
            double f = (double)pos.getZ() + 0.5D;
            world.addParticle(ParticleTypes.SMOKE, d, e, f, 0.0D, 0.0D, 0.0D);
            world.addParticle(type != "green_lit" ? ParticleTypes.FLAME : Particles.GREEN_FLAME, d, e, f, 0.0D, 0.0D, 0.0D);
        }
    }
}