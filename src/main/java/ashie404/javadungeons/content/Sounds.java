package ashie404.javadungeons.content;

import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import ashie404.javadungeons.JavaDungeons;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Sounds {
    public static final SoundEvent CW_GLOW_MUSHROOM_STEP = register(JavaDungeons.ID("cw_glow_mushroom_step"));

    public static SoundEvent register(Identifier id) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}