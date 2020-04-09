package j0sh.javadungeons.entity.renderers;

import j0sh.javadungeons.entity.CWCreeper;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.util.Identifier;

public class CWCreeperRenderer extends MobEntityRenderer<CWCreeper, CreeperEntityModel<CWCreeper>> {

    public CWCreeperRenderer(EntityRenderDispatcher entityRenderDispatcher_1) {
        super(entityRenderDispatcher_1, new CreeperEntityModel<>(), 1);
    }

    @Override
    public Identifier getTexture(CWCreeper entity) {
        return new Identifier("dungeons:textures/entity/CwCreeper/Cw_Creeper.png");
    }

}