package ashie404.javadungeons.content;

import net.minecraft.sound.SoundEvent;
import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.registry.RegistryHelper;

public class Sounds {
    public static final SoundEvent CW_GLOW_MUSHROOM_STEP = RegistryHelper.registerSound("cw_glow_mushroom_step");

    public static void init() {
        JavaDungeons.log.info("Registering Sounds!");
    }
}