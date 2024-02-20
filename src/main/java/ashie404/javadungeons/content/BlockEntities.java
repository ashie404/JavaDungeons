package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.BrazierBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockEntities {

    public static final BlockEntityType<BrazierBlockEntity> BRAZIER = Registry.register(
        Registries.BLOCK_ENTITY_TYPE,
        JavaDungeons.ID("brazier"),
        FabricBlockEntityTypeBuilder.create(BrazierBlockEntity::new, 
            GenericBlocks.BRAZIER, SoggySwampBlocks.SS_BRAZIER).build()
    );
    
    public static void init() {
        JavaDungeons.log.info("Registering block entities!");
    }
}
