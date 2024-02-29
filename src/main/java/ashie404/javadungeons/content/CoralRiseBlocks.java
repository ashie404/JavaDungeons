package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class CoralRiseBlocks {

    // earth blocks
    public static final Block CR_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_dirt");
    public static final Block CR_GRASS_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_grass_block");
    public static final Block CR_GRASSY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_grassy_dirt");
    public static final Block CR_GRASSY_SAND =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_grassy_sand");
    public static final Block CR_GRASSY_GRAVEL =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_grassy_gravel");
    public static final Block CR_SANDY_GRAVEL =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_sandy_gravel");
    public static final Block CR_DIRTY_GRAVEL =
        RegistryHelper.registerBlock(new Block(Material.EARTH), "cr_dirty_gravel");
    public static final Block CR_GRAVEL_SAND =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_gravel_sand");
    public static final Block CR_SANDY_ANDESITE =
        RegistryHelper.registerBlock(new Block(Material.STONE), "cr_sandy_andesite");
    public static final Block CR_SANDY_DIRT =
        RegistryHelper.registerBlock(new Block(Material.SAND), "cr_sandy_dirt");

    // coral blocks
    public static final Block CR_TUBE_CORAL_GRASS =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_tube_coral_grass");
    public static final Block CR_DEAD_TUBE_CORAL_GRASS =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dead_tube_coral_grass");
    public static final Block CR_FIRE_CORAL_GRASS =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_fire_coral_grass");
    public static final Block CR_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_tube_coral_block");
    public static final Block CR_DEAD_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dead_tube_coral_block");
    public static final Block CR_FIRE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_fire_coral_block");
    public static final Block CR_MIXED_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_mixed_coral_block");
    public static final Block CR_DIRTY_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dirty_tube_coral_block");
    public static final Block CR_DIRTY_DEAD_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dirty_dead_tube_coral_block");
    public static final Block CR_DIRTY_FIRE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dirty_fire_coral_block");
    public static final Block CR_SANDY_TUBE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_sandy_tube_coral_block");
    public static final Block CR_SANDY_FIRE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_sandy_fire_coral_block");
    public static final Block CR_GRASSY_FIRE_CORAL_BLOCK =
        RegistryHelper.registerBlock(new Block(Material.CORAL), "cr_dirty_fire_coral_block");

    // stone blocks



    // prismarine blocks


    

    public static void init() {
        // add to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("coral_rise"))).register(content -> {
            
        });
    }
}