package j0sh.javadungeons.blocks;

import j0sh.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import virtuoel.towelette.api.Fluidloggable;

public class DungeonsStairs extends StairsBlock implements Fluidloggable {

    // stairs block

    public BlockItem blockItem;

    public DungeonsStairs(Material material, BlockSoundGroup sounds, Block base, ItemGroup group, String id) {
        super(base.getDefaultState(), FabricBlockSettings.of(material).sounds(sounds));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

}