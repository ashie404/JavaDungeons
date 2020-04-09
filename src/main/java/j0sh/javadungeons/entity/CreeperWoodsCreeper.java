package j0sh.javadungeons.entity;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class CreeperWoodsCreeper extends CreeperEntity {

    public static final String MOD_ID = "dungeons";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "JavaDungeons";

    public CreeperWoodsCreeper(EntityType<? extends CreeperEntity> entityType, World world) {
        super(entityType, world);
    }

    public static final EntityType<CreeperWoodsCreeper> Cw_Creeper = Registry.register(Registry.ENTITY_TYPE,new Identifier(MOD_ID, "Creeper"),FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, CreeperWoodsCreeper::new).size(EntityDimensions.fixed(1, 2)).build());
   

}