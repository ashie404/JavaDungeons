package juniebyte.javadungeons.blocks;

import java.util.function.ToIntFunction;

import juniebyte.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;

import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class DungeonsPoweredEmissive extends RedstoneLampBlock {

    // redstone emissive block

    public BlockItem blockItem;

    private static ToIntFunction<BlockState> getLightLevel() {
        return (blockState) -> { return blockState.get(Properties.LIT) ? 15 : 0; };
    }

    public DungeonsPoweredEmissive(float hardness, float resistance, BlockSoundGroup sounds, ItemGroup group, String id) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).luminance(getLightLevel()));
        Registry.register(Registries.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registries.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings()));
    }

}