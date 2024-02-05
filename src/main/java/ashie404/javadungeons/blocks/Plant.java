package ashie404.javadungeons.blocks;

import com.mojang.serialization.MapCodec;

import ashie404.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.sound.BlockSoundGroup;

public class Plant extends PlantBlock {

    // plant block

    public BlockItem blockItem;

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
    protected MapCodec<? extends Plant> getCodec() { return createCodec(Plant::new); }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    private Plant(AbstractBlock.Settings settings) {
        super(settings);
    }

    public Plant(float hardness, float resistance, BlockSoundGroup sounds, String id) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).nonOpaque().collidable(false));
        Registry.register(Registries.BLOCK, JavaDungeons.ID(id), this);
        Registry.register(Registries.ITEM,JavaDungeons.ID(id), blockItem = new BlockItem(this, new Item.Settings()));
    }

    

}