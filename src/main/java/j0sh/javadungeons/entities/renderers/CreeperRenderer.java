package j0sh.javadungeons.entities.renderers;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.util.Identifier;

import j0sh.javadungeons.entities.Creeper;

public class CreeperRenderer extends MobEntityRenderer<Creeper, CreeperEntityModel<Creeper>> {

    public CreeperRenderer(EntityRenderDispatcher entityRenderDispatcher_1) {
        super(entityRenderDispatcher_1, new CreeperEntityModel<>(), 1);
    }

    @Override
    public Identifier getTexture(Creeper entity) {
        return new Identifier("dungeons:textures/entity/cw_creeper/cw_creeper.png");
    }

}