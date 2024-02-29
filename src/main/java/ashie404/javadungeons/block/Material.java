package ashie404.javadungeons.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.AbstractBlock.OffsetType;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;

public class Material {
    // Basic material definitions that all blocks use

    public static final Settings MOSS = FabricBlockSettings.create().strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK).mapColor(MapColor.GREEN);
    public static final Settings GRASS = FabricBlockSettings.create().strength(0.6F).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN);
    public static final Settings EARTH = FabricBlockSettings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL).mapColor(MapColor.DIRT_BROWN);
        public static final Settings SAND = FabricBlockSettings.copyOf(EARTH).sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW);
    public static final Settings CORAL = FabricBlockSettings.create().instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.CORAL);

    public static final Settings LEAVES = FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.DARK_GREEN);
    public static final Settings PLANT = FabricBlockSettings.create().strength(0.0F).sounds(BlockSoundGroup.GRASS).breakInstantly();
        public static final Settings REPLACABLE_PLANT = FabricBlockSettings.copyOf(PLANT).replaceable().offset(OffsetType.XZ);
        public static final Settings OFFSET_XZ_PLANT = FabricBlockSettings.copyOf(PLANT).offset(OffsetType.XZ);

    public static final Settings FABRIC = FabricBlockSettings.create().instrument(Instrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).mapColor(MapColor.OFF_WHITE);

    public static final Settings WOOD = FabricBlockSettings.create().instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).mapColor(MapColor.BROWN);
    public static final Settings LOG = FabricBlockSettings.create().instrument(Instrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).mapColor(MapColor.BROWN);
    public static final Settings MELON = FabricBlockSettings.create().instrument(Instrument.DIDGERIDOO).strength(1.0F).sounds(BlockSoundGroup.WOOD).mapColor(MapColor.ORANGE);

    public static final Settings STONE = FabricBlockSettings.create().instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY);
        public static final Settings COBBLESTONE = FabricBlockSettings.copyOf(STONE).strength(2.0F, 6.0F);
        public static final Settings SANDSTONE = FabricBlockSettings.copyOf(COBBLESTONE).mapColor(MapColor.PALE_YELLOW);
        public static final Settings DARK_STONE = FabricBlockSettings.copyOf(STONE).mapColor(MapColor.DEEPSLATE_GRAY);
        public static final Settings QUARTZ = FabricBlockSettings.copyOf(STONE).strength(0.8F).mapColor(MapColor.OFF_WHITE);
        public static final Settings DARK_QUARTZ = FabricBlockSettings.copyOf(QUARTZ).mapColor(MapColor.DEEPSLATE_GRAY);

    public static final Settings METAL = FabricBlockSettings.create().requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL).mapColor(MapColor.IRON_GRAY);
    public static final Settings CAST_IRON = FabricBlockSettings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.LANTERN).mapColor(MapColor.IRON_GRAY);

    public static final Settings CRYSTAL = FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.AMETHYST_CLUSTER);

    public static final Settings SOFT_METAL = FabricBlockSettings.create().strength(0.3F).sounds(BlockSoundGroup.METAL).mapColor(MapColor.IRON_GRAY);

    public static final Settings COBWEB = FabricBlockSettings.create().requiresTool().strength(4.0f).solid().noCollision().mapColor(MapColor.LIGHT_GRAY);

    public static final Settings GLASS = FabricBlockSettings.create().instrument(Instrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS);
}