package j0sh.javadungeons.entities;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;

import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import j0sh.javadungeons.JavaDungeons;

public class Creeper extends CreeperEntity {

    public Creeper(EntityType<? extends CreeperEntity> entityType, World world) {
        super(entityType, world);
    }

    public static final EntityType<Creeper> Cw_Creeper = Registry.register(Registry.ENTITY_TYPE,new Identifier(JavaDungeons.MOD_ID, "Creeper"),FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, Creeper::new).size(EntityDimensions.fixed(1, 2)).build());
   
}