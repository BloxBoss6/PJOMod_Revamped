package bloxboss6.mod.objects.armor.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCustomArmor - BloxBoss6
 * Created using Tabula 7.1.0
 */
public class ModelCustomArmor extends ModelBiped {
    public ModelRenderer custom;

    public ModelCustomArmor() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.custom = new ModelRenderer(this, 0, 70);
        this.custom.setRotationPoint(-4.0F, 0.0F, -2.0F);
        this.custom.addBox(2.0F, 0.0F, -2.0F, 4, 3, 1, 0.0F);

        this.bipedBody.addChild(custom);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        super.render(entity, f, f1, f2, f3, f4, f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
