package j0sh.javadungeons.blocks;

import j0sh.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.function.ToIntFunction;

public class DungeonsPoweredEmissive extends RedstoneLampBlock {

    // redstone emissive block

    public BlockItem blockItem;
    private static ToIntFunction<BlockState> createLightLevelFromBlockState() {
        return (blockState) -> (Boolean)blockState.get(Properties.LIT) ? 15 : 0;
    }

    public DungeonsPoweredEmissive(Material material, BlockSoundGroup sounds, ItemGroup group, String id) {
        super(FabricBlockSettings.of(material).sounds(sounds).lightLevel(createLightLevelFromBlockState()));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return super.getAmbientOcclusionLightLevel(state, world, pos);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        return state.with(LIT, shouldActivate(world.getWorld(), pos));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(LIT, shouldActivate(ctx.getWorld(), ctx.getBlockPos()));
    }

    private static boolean shouldActivate(World world, BlockPos pos) {
        if(world.getEmittedRedstonePower(pos.down(), Direction.DOWN) > 0) {
            return true;
        } else return world.getEmittedRedstonePower(pos.up(), Direction.UP) > 0;
    }

}