package ashie404.javadungeons.blocks;

import com.mojang.serialization.MapCodec;

import ashie404.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FallingBlock;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class DungeonsFallingBlock extends FallingBlock {

    // generic falling block

    public BlockItem blockItem;

    protected MapCodec<? extends DungeonsFallingBlock> getCodec() { return null; }

    public DungeonsFallingBlock(float hardness, float resistance, BlockSoundGroup sounds, String id) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
        Registry.register(Registries.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registries.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings()));
    }

}