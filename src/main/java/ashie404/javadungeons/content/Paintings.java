package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Paintings {

    public static void init() {
        // register dungeons painting variants
        registerPaintingVariant("arch_illager_cool_guy", 32, 32);
        registerPaintingVariant("arch_illager_portrait", 32, 32);
        registerPaintingVariant("crocodile", 32, 32);
        registerPaintingVariant("tropical", 32, 32);
        registerPaintingVariant("redstone_mines", 32, 16);
        registerPaintingVariant("blue_fields", 16, 16);
        registerPaintingVariant("creeper", 16, 16);
        registerPaintingVariant("cacti_canyon", 32, 64);
    }

    private static void registerPaintingVariant(String name, int width, int height) {
        Registry.register(Registries.PAINTING_VARIANT, JavaDungeons.ID(name), new PaintingVariant(width, height));
    }
}