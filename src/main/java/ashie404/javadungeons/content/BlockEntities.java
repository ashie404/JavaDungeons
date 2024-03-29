package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.block.entity.*;
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

    public static final BlockEntityType<TikiTorchBlockEntity> TIKI_TORCH = Registry.register(
        Registries.BLOCK_ENTITY_TYPE,
        JavaDungeons.ID("tiki_torch"),
        FabricBlockEntityTypeBuilder.create(TikiTorchBlockEntity::new, 
            DingyJungleBlocks.DJ_TIKI_TORCH).build()
    );

    public static final BlockEntityType<SackBlockEntity> SACK = Registry.register(
        Registries.BLOCK_ENTITY_TYPE,
        JavaDungeons.ID("sack"),
        FabricBlockEntityTypeBuilder.create(SackBlockEntity::new, 
            GenericBlocks.SACK, GenericBlocks.SMALL_SACK).build()
    );
    
    public static void init() {
        // stub to load class into memory/init static fields
    }
}
