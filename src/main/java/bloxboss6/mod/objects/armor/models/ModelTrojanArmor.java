package bloxboss6.mod.objects.armor.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelTrojanArmor - BloxBoss6
 * Created using Tabula 7.1.0
 */
public class ModelTrojanArmor extends ModelBiped {
    public ModelRenderer trojanRightArm;
    public ModelRenderer trojanLeftArm;
    public ModelRenderer trojanBody;
    public ModelRenderer trojanHead;
    public ModelRenderer trojanRightLeg;
    public ModelRenderer trojanRightBoot;
    public ModelRenderer trojanLeftLeg;
    public ModelRenderer trojanLeftBoot;

    public ModelTrojanArmor() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.trojanRightArm = new ModelRenderer(this, 48, 82);
        this.trojanRightArm.setRotationPoint(-3.5F, -2.5F, -2.5F);
        this.trojanRightArm.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
        this.trojanHead = new ModelRenderer(this, 0, 64);
        this.trojanHead.setRotationPoint(-4.5F, -8.5F, -4.5F);
        this.trojanHead.addBox(0.0F, 0.0F, 0.0F, 9, 9, 9, 0.0F);
        this.trojanLeftArm = new ModelRenderer(this, 48, 82);
        this.trojanLeftArm.mirror = true;
        this.trojanLeftArm.setRotationPoint(-1.5F, -2.5F, -2.5F);
        this.trojanLeftArm.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
        this.trojanLeftBoot = new ModelRenderer(this, 0, 92);
        this.trojanLeftBoot.mirror = true;
        this.trojanLeftBoot.setRotationPoint(-2.5F, 5.5F, -2.5F);
        this.trojanLeftBoot.addBox(0.0F, 0.0F, 0.0F, 5, 7, 5, 0.0F);
        this.trojanRightBoot = new ModelRenderer(this, 0, 92);
        this.trojanRightBoot.setRotationPoint(-2.5F, 5.5F, -2.5F);
        this.trojanRightBoot.addBox(0.0F, 0.0F, 0.0F, 5, 7, 5, 0.0F);
        this.trojanRightLeg = new ModelRenderer(this, 0, 82);
        this.trojanRightLeg.setRotationPoint(-2.5F, -0.5F, -2.5F);
        this.trojanRightLeg.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.trojanBody = new ModelRenderer(this, 20, 82);
        this.trojanBody.setRotationPoint(-4.5F, 0.0F, -2.5F);
        this.trojanBody.addBox(0.0F, 0.0F, 0.0F, 9, 12, 5, 0.0F);
        this.trojanLeftLeg = new ModelRenderer(this, 0, 82);
        this.trojanLeftLeg.mirror = true;
        this.trojanLeftLeg.setRotationPoint(-2.5F, -0.5F, -2.5F);
        this.trojanLeftLeg.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.bipedRightArm.addChild(this.trojanRightArm);
        this.bipedHead.addChild(this.trojanHead);
        this.bipedLeftArm.addChild(this.trojanLeftArm);
        this.bipedLeftLeg.addChild(this.trojanLeftBoot);
        this.bipedRightLeg.addChild(this.trojanRightBoot);
        this.bipedRightLeg.addChild(this.trojanRightLeg);
        this.bipedBody.addChild(this.trojanBody);
        this.bipedLeftLeg.addChild(this.trojanLeftLeg);
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
