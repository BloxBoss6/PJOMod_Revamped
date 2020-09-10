package bloxboss6.mod.entity.render;

import bloxboss6.mod.entity.EntitySatyr;
import bloxboss6.mod.entity.model.ModelSatyr;
import bloxboss6.mod.util.Reference;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSatyr extends RenderLivingBase<EntitySatyr> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/satyr.png");

    public RenderSatyr(RenderManager manager) {
        super(manager, new ModelSatyr(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySatyr entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntitySatyr entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.0F, 0.1875F, 0.0F);
    }
}
