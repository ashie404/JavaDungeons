package juniebyte.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;

import juniebyte.javadungeons.blocks.DungeonsFoodBox;
import juniebyte.javadungeons.blocks.DungeonsSack;
import juniebyte.javadungeons.blocks.DungeonsTopSlab;
import virtuoel.towelette.api.Fluidloggable;

@Mixin({
    DungeonsFoodBox.class,
    DungeonsSack.class,
    DungeonsTopSlab.class
})
public class CompatMixinFluidloggable implements Fluidloggable {
}*/
