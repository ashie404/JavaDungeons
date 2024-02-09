package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.registry.RegistryHelper;

public class Paintings {

    public static void init() {
        JavaDungeons.log.info("Registering Painting Variants!");
        // register dungeons painting variants
        RegistryHelper.registerPainting("arch_illager_cool_guy", 32, 32);
        RegistryHelper.registerPainting("arch_illager_portrait", 32, 32);
        RegistryHelper.registerPainting("crocodile", 32, 32);
        RegistryHelper.registerPainting("tropical", 32, 32);
        RegistryHelper.registerPainting("redstone_mines", 32, 16);
        RegistryHelper.registerPainting("blue_fields", 16, 16);
        RegistryHelper.registerPainting("creeper", 16, 16);
        RegistryHelper.registerPainting("cacti_canyon", 32, 64);
    }
}