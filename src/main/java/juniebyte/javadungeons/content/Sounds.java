package juniebyte.javadungeons.content;

import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import juniebyte.javadungeons.JavaDungeons;

public class Sounds {
    public static SoundEvent CW_GLOW_MUSHROOM_STEP;

    public static void init() {
        CW_GLOW_MUSHROOM_STEP = register(new Identifier(JavaDungeons.MOD_ID, "cw_glow_mushroom_step"));
    }

    public static SoundEvent register(Identifier id) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}