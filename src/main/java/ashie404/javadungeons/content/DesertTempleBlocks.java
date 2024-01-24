package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class DesertTempleBlocks {

    // andesite related
    public static SlabStairBlock DT_SANDY_ANDESITE;
    public static BaseBlock DT_CHISELED_SANDY_ANDESITE;
    public static BaseBlock DT_CHISELED_SANDY_ANDESITE_2;
    public static Pillar DT_SANDY_ANDESITE_PILLAR;

    // stone brick related
    public static SlabStairBlock DT_SANDY_STONE_BRICKS;
    public static BaseBlock DT_CRACKED_SANDY_STONE_BRICKS;
    public static SlabStairBlock DT_SANDY_STONE_TILES;
    public static BaseBlock DT_CHISELED_SANDY_STONE;

    // stone related
    public static BaseBlock DT_SANDY_COBBLESTONE;

    public static void init() {
        // andesite related
        DT_SANDY_ANDESITE = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_andesite", "dt_sandy_andesite_slab", "dt_sandy_andesite_stairs");
        DT_CHISELED_SANDY_ANDESITE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_chiseled_sandy_andesite");
        DT_CHISELED_SANDY_ANDESITE_2 = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_chiseled_sandy_andesite_2");
        DT_SANDY_ANDESITE_PILLAR = new Pillar(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_andesite_pillar");

        // stone brick related
        DT_SANDY_STONE_BRICKS = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_stone_bricks", "dt_sandy_stone_brick_slab", "dt_sandy_stone_brick_stairs");
        DT_CRACKED_SANDY_STONE_BRICKS = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_cracked_sandy_stone_bricks");
        DT_SANDY_STONE_TILES = new SlabStairBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_stone_tiles", "dt_sandy_stone_tiles_slab", "dt_sandy_stone_tiles_stairs");
        DT_CHISELED_SANDY_STONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_chiseled_sandy_stone");

        // stone related
        DT_SANDY_COBBLESTONE = new BaseBlock(1.5F, 6.0F, BlockSoundGroup.STONE, "dt_sandy_cobblestone");

        // add blocks to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(JavaDungeons.MOD_ID, "desert_temple"))).register(content -> {
            content.add(DT_SANDY_ANDESITE.base.blockItem);
            content.add(DT_SANDY_ANDESITE.slab.blockItem);
            content.add(DT_SANDY_ANDESITE.stairs.blockItem);
            content.add(DT_CHISELED_SANDY_ANDESITE.blockItem);
            content.add(DT_CHISELED_SANDY_ANDESITE_2.blockItem);
            content.add(DT_SANDY_ANDESITE_PILLAR.blockItem);
            content.add(DT_SANDY_STONE_BRICKS.base.blockItem);
            content.add(DT_SANDY_STONE_BRICKS.slab.blockItem);
            content.add(DT_SANDY_STONE_BRICKS.stairs.blockItem);
            content.add(DT_CRACKED_SANDY_STONE_BRICKS.blockItem);
            content.add(DT_SANDY_STONE_TILES.base.blockItem);
            content.add(DT_SANDY_STONE_TILES.slab.blockItem);
            content.add(DT_SANDY_STONE_TILES.stairs.blockItem);
            content.add(DT_CHISELED_SANDY_STONE.blockItem);
            content.add(DT_SANDY_COBBLESTONE.blockItem);
        });
    }
}