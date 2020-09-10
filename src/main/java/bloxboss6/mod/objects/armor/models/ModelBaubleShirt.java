package bloxboss6.mod.objects.armor.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

/**
 * ModelBaubleShirt - BloxBoss6
 * Created using Tabula 7.1.0
 */
public class ModelBaubleShirt extends ModelBase {
    public ModelRenderer shirtBody;
    public ModelRenderer shirtLeftArm;
    public ModelRenderer shirtRightArm;

    public ModelBaubleShirt() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        float s = 0.01F;

        this.shirtBody = new ModelRenderer(this, 0, 64);
        this.shirtBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shirtBody.addBox(-4.5F, 0.0F, -2.5F, 9, 12, 5, 0.0F);
        this.shirtLeftArm = new ModelRenderer(this, 28, 64);
        this.shirtLeftArm.mirror = true;
        this.shirtLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.shirtLeftArm.addBox(-1.5F, -2.0F, -2.5F, 5, 5, 5, 0.0F);
        this.shirtRightArm = new ModelRenderer(this, 28, 64);
        this.shirtRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.shirtRightArm.addBox(-3.5F, -2.0F, -2.5F, 5, 5, 5, 0.0F);
    }

    public void render(float f5) {
        shirtBody.render(f5);
        shirtLeftArm.render(f5);
        shirtRightArm.render(f5);
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
