package ashie404.javadungeons.registry;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.SlabStairBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class RegistryHelper {
    // Registers an item group
    public static void registerItemGroup(String id, ItemGroup group) {
        Registry.register(Registries.ITEM_GROUP, JavaDungeons.ID(id), group);
    }

    // Registers a painting
    public static void registerPainting(String id, int width, int height) {
        Registry.register(Registries.PAINTING_VARIANT, JavaDungeons.ID(id), new PaintingVariant(width, height));
    }
    
    // Registers a sound event
    public static SoundEvent registerSound(String idString) {
        Identifier id = JavaDungeons.ID(idString);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    // Registers a block and corresponding block item for it.
    public static Block registerBlock(Block block, String id) {
        Registry.register(Registries.BLOCK, JavaDungeons.ID(id), block);
        Registry.register(Registries.ITEM, JavaDungeons.ID(id), new BlockItem(block, new Item.Settings()));
        return block;
    }

    // Registers an item.
    public static Item registerItem(Item item, String id) {
        return Registry.register(Registries.ITEM, JavaDungeons.ID(id), item);
    }

    // Registers a BSS (Base Slab Stair) block and its corresponding block items.
    public static SlabStairBlock registerBSS(SlabStairBlock bss, String id) {
        registerBlock(bss.base, id);
        registerBlock(bss.slab, id + "_slab");
        registerBlock(bss.stairs, id + "_stairs");
        return bss;
    }

    // Registers a BSS (Base Slab Stair) block and its corresponding block items (allowing individual ID assignment)
    public static SlabStairBlock registerBSS(SlabStairBlock bss, String id, String slab_id, String stairs_id) {
        registerBlock(bss.base, id);
        registerBlock(bss.slab, slab_id);
        registerBlock(bss.stairs, stairs_id);
        return bss;
    }
}
