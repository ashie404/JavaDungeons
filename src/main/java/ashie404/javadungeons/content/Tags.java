package ashie404.javadungeons.content;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import ashie404.javadungeons.JavaDungeons;
import net.minecraft.block.Block;

public class Tags {
    public static final TagKey<Block> PLANTABLE = TagKey.of(RegistryKeys.BLOCK, JavaDungeons.ID("plantable"));
    public static final TagKey<Block> DESERT_PLANTABLE = TagKey.of(RegistryKeys.BLOCK, JavaDungeons.ID("desert_plantable"));

    public static void init() {
        // stub to load class into memory/init static fields
    }
}