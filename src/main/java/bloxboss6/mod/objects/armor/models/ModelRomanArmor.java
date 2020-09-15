package bloxboss6.mod.objects.armor.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelRomanArmor - BloxBoss6
 * Created using Tabula 7.1.0
 */
public class ModelRomanArmor extends ModelBiped {
    public ModelRenderer romanHead;
    public ModelRenderer romanHeadwear;
    public ModelRenderer romanBody;
    public ModelRenderer romanBodyWear;
    public ModelRenderer romanRightArm;
    public ModelRenderer romanRightArmwear;
    public ModelRenderer romanLeftArm;
    public ModelRenderer romanLeftArmwear;
    public ModelRenderer romanRightLeg;
    public ModelRenderer romanLeftLeg;

    public ModelRomanArmor() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.romanHead = new ModelRenderer(this, 0, 64);
        this.romanHead.setRotationPoint(-4.0F, -8.0F, -4.0F);
        this.romanHead.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.25F);
        this.romanHeadwear = new ModelRenderer(this, 32, 64);
        this.romanHeadwear.setRotationPoint(-4.0F, -8.0F, -4.0F);
        this.romanHeadwear.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.5F);

        this.romanBody = new ModelRenderer(this, 16, 80);
        this.romanBody.setRotationPoint(-4.0F, 0.0F, -2.0F);
        this.romanBody.addBox(0.0F, 0.0F, 0.0F, 8, 12, 4, 0.25F);
        this.romanBodyWear = new ModelRenderer(this, 16, 96);
        this.romanBodyWear.setRotationPoint(-4.0F, 0.0F, -2.0F);
        this.romanBodyWear.addBox(0.0F, 0.0F, 0.0F, 8, 12, 4, 0.5F);

        this.romanRightArm = new ModelRenderer(this, 40, 80);
        this.romanRightArm.setRotationPoint(-3.0F, -2.0F, -2.0F);
        this.romanRightArm.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.25F);
        this.romanRightArmwear = new ModelRenderer(this, 40, 96);
        this.romanRightArmwear.setRotationPoint(-3.0F, -2.0F, -2.0F);
        this.romanRightArmwear.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.5F);

        this.romanLeftArm = new ModelRenderer(this, 32, 112);
        this.romanLeftArm.setRotationPoint(-1.0F, -2.0F, -2.0F);
        this.romanLeftArm.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.25F);
        this.romanLeftArmwear = new ModelRenderer(this, 48, 112);
        this.romanLeftArmwear.setRotationPoint(-1.0F, -2.0F, -2.0F);
        this.romanLeftArmwear.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.5F);

        this.romanRightLeg = new ModelRenderer(this, 0, 80);
        this.romanRightLeg.setRotationPoint(-2.0F, 0.0F, -2.0F);
        this.romanRightLeg.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.25F);

        this.romanLeftLeg = new ModelRenderer(this, 16, 112);
        this.romanLeftLeg.setRotationPoint(-2.0F, 0.0F, -2.0F);
        this.romanLeftLeg.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.25F);

        this.bipedHead.addChild(this.romanHead);
        this.bipedHead.addChild(this.romanHeadwear);
        this.bipedBody.addChild(this.romanBody);
        this.bipedBody.addChild(this.romanBodyWear);
        this.bipedRightArm.addChild(this.romanRightArm);
        this.bipedRightArm.addChild(this.romanRightArmwear);
        this.bipedLeftArm.addChild(this.romanLeftArm);
        this.bipedLeftArm.addChild(this.romanLeftArmwear);
        this.bipedRightLeg.addChild(this.romanRightLeg);
        this.bipedLeftLeg.addChild(this.romanLeftLeg);
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
