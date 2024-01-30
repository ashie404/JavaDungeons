package ashie404.javadungeons.blocks;

import java.util.function.ToIntFunction;

import ashie404.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;

import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class PoweredEmissive extends RedstoneLampBlock {

    // redstone emissive block

    public BlockItem blockItem;

    private static int lightLvl;

    private static ToIntFunction<BlockState> getLightLevel() {
        return (blockState) -> { return blockState.get(Properties.LIT) ? lightLvl : 0; };
    }

    public PoweredEmissive(int lightLevel, float hardness, float resistance, BlockSoundGroup sounds, String id) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).luminance(getLightLevel()));
        lightLvl = lightLevel;
        Registry.register(Registries.BLOCK, JavaDungeons.ID(id), this);
        Registry.register(Registries.ITEM,JavaDungeons.ID(id), blockItem = new BlockItem(this, new Item.Settings()));
    }

}