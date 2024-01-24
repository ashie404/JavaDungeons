package ashie404.javadungeons.blocks;

import net.minecraft.block.LeavesBlock;
import net.minecraft.item.BlockItem;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.sound.BlockSoundGroup;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import ashie404.javadungeons.JavaDungeons;

public class Leaves extends LeavesBlock {

    // leaves block

    public BlockItem blockItem;

    public Leaves(float hardness, float resistance, BlockSoundGroup sounds, String id) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).nonOpaque());
        Registry.register(Registries.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registries.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings()));
    }

}