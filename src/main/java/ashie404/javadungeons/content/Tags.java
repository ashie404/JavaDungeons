package ashie404.javadungeons.content;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import ashie404.javadungeons.JavaDungeons;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class Tags {
    public static TagKey<Block> PLANTABLE;
    public static TagKey<Block> DESERT_PLANTABLE;

    public static void init() {
        PLANTABLE = TagKey.of(RegistryKeys.BLOCK, JavaDungeons.ID("plantable"));
        DESERT_PLANTABLE = TagKey.of(RegistryKeys.BLOCK, JavaDungeons.ID("desert_plantable"));
    }
}