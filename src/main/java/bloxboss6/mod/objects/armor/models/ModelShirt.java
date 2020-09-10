package bloxboss6.mod.objects.armor.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelShirt - BloxBoss6
 * Created using Tabula 7.1.0
 */
public class ModelShirt extends ModelBiped {
    public ModelRenderer shirtRightArm;
    public ModelRenderer shirtLeftArm;
    public ModelRenderer shirtBody;

    public ModelShirt() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.shirtLeftArm = new ModelRenderer(this, 28, 64);
        this.shirtLeftArm.mirror = true;
        this.shirtLeftArm.setRotationPoint(-1.5F, -2.5F, -2.5F);
        this.shirtLeftArm.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.shirtBody = new ModelRenderer(this, 0, 64);
        this.shirtBody.setRotationPoint(-4.5F, -0.5F, -2.5F);
        this.shirtBody.addBox(0.0F, 0.0F, 0.0F, 9, 12, 5, 0.0F);
        this.shirtRightArm = new ModelRenderer(this, 28, 64);
        this.shirtRightArm.setRotationPoint(-3.5F, -2.5F, -2.5F);
        this.shirtRightArm.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);

        this.bipedBody.addChild(shirtBody);
        this.bipedRightArm.addChild(shirtRightArm);
        this.bipedLeftArm.addChild(shirtLeftArm);
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
