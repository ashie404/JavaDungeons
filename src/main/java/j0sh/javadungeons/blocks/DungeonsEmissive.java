package j0sh.javadungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.tag.Tag;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import j0sh.javadungeons.JavaDungeons;

public class DungeonsEmissive extends Block {

    // emissive block

    public BlockItem blockItem;

    @Override
    public int getLuminance(BlockState state) {
        return 16;
    }

    public DungeonsEmissive(Block base, Boolean byHand, Tag<Item> tool, ItemGroup group, String id) {
        super(FabricBlockSettings.copy(base).breakByHand(byHand).breakByTool(tool).collidable(false).build());
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

}