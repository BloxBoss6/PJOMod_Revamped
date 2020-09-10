package bloxboss6.mod.entity.render;

import bloxboss6.mod.entity.EntitySpartus;
import bloxboss6.mod.entity.model.ModelSpartus;
import bloxboss6.mod.util.Reference;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.util.ResourceLocation;

public class RenderSpartus extends RenderBiped<EntitySpartus> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/spartus.png");

    public RenderSpartus(RenderManager manager) {
        super(manager, new ModelSpartus(), 0.5F);
        this.addLayer(new LayerBipedArmor(this)
        {
            protected void initArmor()
            {
                this.modelLeggings = new ModelSpartus(0.5F, true);
                this.modelArmor = new ModelSpartus(1.0F, true);
            }
        });
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySpartus entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntitySpartus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.0F, 0.1875F, 0.0F);
    }
}
