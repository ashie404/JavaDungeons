package j0sh.javadungeons.content;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import j0sh.javadungeons.entities.*;
import j0sh.javadungeons.JavaDungeons;

public class Entities {

    public static EntityType<GlaiveEntity> GLAIVE_ENTITY; 

    public static void init() {
        GLAIVE_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(JavaDungeons.MOD_ID, "glaive_entity"),
            FabricEntityTypeBuilder.create(EntityCategory.MISC, (EntityType.EntityFactory<GlaiveEntity>) GlaiveEntity::new).build()
        );
    }

}