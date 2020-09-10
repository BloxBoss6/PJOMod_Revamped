package bloxboss6.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSatyr - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelSatyr extends ModelBase {
    public ModelRenderer SatyrRightArm;
    public ModelRenderer SatyrLeftLeg;
    public ModelRenderer LegJoined;
    public ModelRenderer SatyrRightLeg;
    public ModelRenderer SatyrBody;
    public ModelRenderer SatyrHeadwear;
    public ModelRenderer SatyrLeftArm;
    public ModelRenderer SatyrHead;
    public ModelRenderer SatyrRightArmChild;
    public ModelRenderer SatyrRightArmChildChild;
    public ModelRenderer SatyrRightArmChildChild_1;
    public ModelRenderer SatyrRightArmChildChild_2;
    public ModelRenderer SatyrRightArmChildChild_3;
    public ModelRenderer SatyrRightArmChildChild_4;
    public ModelRenderer SatyrRightArmChildChild_5;
    public ModelRenderer SatyrRightArmChildChild_6;
    public ModelRenderer SatyrRightArmChildChild_7;
    public ModelRenderer SatyrRightArmChildChild_8;
    public ModelRenderer SatyrRightArmChildChild_9;
    public ModelRenderer SatyrRightArmChildChild_10;
    public ModelRenderer SatyrRightArmChildChild_11;
    public ModelRenderer SatyrRightArmChildChild_12;
    public ModelRenderer SatyrLeftLegChild;
    public ModelRenderer SatyrLeftLegChild_1;
    public ModelRenderer SatyrLeftLegChild_2;
    public ModelRenderer SatyrRightLegChild;
    public ModelRenderer SatyrRightLegChild_1;
    public ModelRenderer SatyrRightLegChild_2;
    public ModelRenderer SatyrHeadChild;
    public ModelRenderer SatyrHeadChild_1;
    public ModelRenderer SatyrHeadChild_2;

    public ModelSatyr() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.SatyrLeftLegChild = new ModelRenderer(this, 2, 20);
        this.SatyrLeftLegChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrLeftLegChild.addBox(-1.850000023841858F, 2.0F, -2.9000000953674316F, 3, 4, 3, 0.0F);
        this.setRotateAngle(SatyrLeftLegChild, 0.5101597309112549F, 0.0F, 0.0F);
        this.SatyrRightLegChild_2 = new ModelRenderer(this, 2, 20);
        this.SatyrRightLegChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightLegChild_2.addBox(-1.850000023841858F, 4.199999809265137F, 1.399999976158142F, 3, 6, 3, 0.0F);
        this.setRotateAngle(SatyrRightLegChild_2, -0.2843141257762909F, 0.0F, 0.0F);
        this.SatyrRightLegChild = new ModelRenderer(this, 0, 26);
        this.SatyrRightLegChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightLegChild.addBox(-2.3499999046325684F, 10.0F, -2.0F, 4, 2, 4, 0.0F);
        this.SatyrRightArmChildChild = new ModelRenderer(this, 0, 36);
        this.SatyrRightArmChildChild.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.SatyrRightArmChildChild.addBox(9.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.SatyrRightArmChildChild_12 = new ModelRenderer(this, 10, 36);
        this.SatyrRightArmChildChild_12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_12.addBox(2.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F);
        this.SatyrRightArmChildChild_9 = new ModelRenderer(this, 10, 39);
        this.SatyrRightArmChildChild_9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_9.addBox(3.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.SatyrRightLegChild_1 = new ModelRenderer(this, 2, 20);
        this.SatyrRightLegChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightLegChild_1.addBox(-1.850000023841858F, 2.0F, -2.9000000953674316F, 3, 4, 3, 0.0F);
        this.setRotateAngle(SatyrRightLegChild_1, 0.5101597309112549F, 0.0F, 0.0F);
        this.LegJoined = new ModelRenderer(this, 1, 17);
        this.LegJoined.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.LegJoined.addBox(-2.0F, 0.0F, -1.5F, 4, 2, 3, 0.0F);
        this.SatyrRightArmChildChild_8 = new ModelRenderer(this, 8, 45);
        this.SatyrRightArmChildChild_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_8.addBox(6.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.SatyrRightArmChildChild_2 = new ModelRenderer(this, 8, 32);
        this.SatyrRightArmChildChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_2.addBox(6.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
        this.SatyrRightArmChildChild_11 = new ModelRenderer(this, 16, 37);
        this.SatyrRightArmChildChild_11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_11.addBox(7.0F, -2.0F, 0.0F, 2, 3, 1, 0.0F);
        this.SatyrRightArmChildChild_5 = new ModelRenderer(this, 0, 42);
        this.SatyrRightArmChildChild_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_5.addBox(10.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
        this.SatyrHeadwear = new ModelRenderer(this, 32, 0);
        this.SatyrHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.setRotateAngle(SatyrHeadwear, 0.0F, -0.25132691860198975F, 0.0F);
        this.SatyrRightArmChildChild_1 = new ModelRenderer(this, 15, 32);
        this.SatyrRightArmChildChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_1.addBox(4.0F, -5.0F, 0.0F, 4, 4, 1, 0.0F);
        this.SatyrBody = new ModelRenderer(this, 16, 16);
        this.SatyrBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.SatyrHead = new ModelRenderer(this, 0, 0);
        this.SatyrHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(SatyrHead, 0.0F, -0.25132691860198975F, 0.0F);
        this.SatyrHeadChild_2 = new ModelRenderer(this, 57, 24);
        this.SatyrHeadChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrHeadChild_2.addBox(-1.0F, -0.5F, -4.25F, 2, 1, 1, 0.0F);
        this.SatyrLeftLegChild_1 = new ModelRenderer(this, 2, 20);
        this.SatyrLeftLegChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrLeftLegChild_1.addBox(-1.850000023841858F, 4.199999809265137F, 1.399999976158142F, 3, 6, 3, 0.0F);
        this.setRotateAngle(SatyrLeftLegChild_1, -0.2843141257762909F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_7 = new ModelRenderer(this, 8, 34);
        this.SatyrRightArmChildChild_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_7.addBox(8.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F);
        this.SatyrRightArmChildChild_10 = new ModelRenderer(this, 0, 44);
        this.SatyrRightArmChildChild_10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_10.addBox(7.0F, -7.0F, 0.0F, 3, 3, 1, 0.0F);
        this.SatyrRightArmChild = new ModelRenderer(this, 0, 32);
        this.SatyrRightArmChild.setRotationPoint(-0.5F, 9.699999809265137F, 2.3499999046325684F);
        this.SatyrRightArmChild.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(SatyrRightArmChild, 1.5707963705062866F, 0.7853981852531433F, -1.5707963705062866F);
        this.SatyrLeftArm = new ModelRenderer(this, 40, 16);
        this.SatyrLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.SatyrLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(SatyrLeftArm, -6.342001602984642E-28F, 0.0F, 0.0F);
        this.SatyrRightArm = new ModelRenderer(this, 40, 16);
        this.SatyrRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.SatyrRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(SatyrRightArm, 6.342001602984642E-28F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_3 = new ModelRenderer(this, 7, 42);
        this.SatyrRightArmChildChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_3.addBox(2.0F, -6.0F, 0.0F, 3, 2, 1, 0.0F);
        this.SatyrRightArmChildChild_6 = new ModelRenderer(this, 0, 39);
        this.SatyrRightArmChildChild_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_6.addBox(8.0F, -8.0F, 0.0F, 4, 2, 1, 0.0F);
        this.SatyrLeftLegChild_2 = new ModelRenderer(this, 0, 26);
        this.SatyrLeftLegChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrLeftLegChild_2.addBox(-2.3499999046325684F, 10.0F, -2.0F, 4, 2, 4, 0.0F);
        this.SatyrHeadChild_1 = new ModelRenderer(this, 58, 20);
        this.SatyrHeadChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrHeadChild_1.addBox(-4.300000190734863F, -8.800000190734863F, 0.0F, 1, 2, 1, 0.0F);
        this.SatyrLeftLeg = new ModelRenderer(this, 0, 16);
        this.SatyrLeftLeg.setRotationPoint(1.899999976158142F, 12.0F, 0.0F);
        this.SatyrLeftLeg.addBox(-2.25F, 0.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(SatyrLeftLeg, 1.2684003205969285E-27F, 0.0F, 0.0F);
        this.SatyrRightLeg = new ModelRenderer(this, 0, 16);
        this.SatyrRightLeg.setRotationPoint(-1.899999976158142F, 12.0F, 0.0F);
        this.SatyrRightLeg.addBox(-2.25F, 0.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(SatyrRightLeg, -1.2684003205969285E-27F, 0.0F, 0.0F);
        this.SatyrHeadChild = new ModelRenderer(this, 58, 20);
        this.SatyrHeadChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrHeadChild.addBox(3.25F, -8.75F, 0.0F, 1, 2, 1, 0.0F);
        this.SatyrRightArmChildChild_4 = new ModelRenderer(this, 8, 45);
        this.SatyrRightArmChildChild_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SatyrRightArmChildChild_4.addBox(3.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F);
        this.SatyrLeftLeg.addChild(this.SatyrLeftLegChild);
        this.SatyrRightLeg.addChild(this.SatyrRightLegChild_2);
        this.SatyrRightLeg.addChild(this.SatyrRightLegChild);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_12);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_9);
        this.SatyrRightLeg.addChild(this.SatyrRightLegChild_1);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_8);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_2);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_11);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_5);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_1);
        this.SatyrHead.addChild(this.SatyrHeadChild_2);
        this.SatyrLeftLeg.addChild(this.SatyrLeftLegChild_1);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_7);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_10);
        this.SatyrRightArm.addChild(this.SatyrRightArmChild);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_3);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_6);
        this.SatyrLeftLeg.addChild(this.SatyrLeftLegChild_2);
        this.SatyrHead.addChild(this.SatyrHeadChild_1);
        this.SatyrHead.addChild(this.SatyrHeadChild);
        this.SatyrRightArmChild.addChild(this.SatyrRightArmChildChild_4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.LegJoined.render(f5);
        this.SatyrHeadwear.render(f5);
        this.SatyrBody.render(f5);
        this.SatyrHead.render(f5);
        this.SatyrLeftArm.render(f5);
        this.SatyrRightArm.render(f5);
        this.SatyrLeftLeg.render(f5);
        this.SatyrRightLeg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }



    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.SatyrLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.SatyrRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.SatyrRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / 2;
        this.SatyrLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / 2;

        this.SatyrHead.rotateAngleY = netHeadYaw * 0.017453292F;
        this.SatyrHead.rotateAngleX = headPitch * 0.017453292F;
        this.SatyrHeadwear.rotateAngleY = netHeadYaw * 0.017453292F;
        this.SatyrHeadwear.rotateAngleX = headPitch * 0.017453292F;
    }
}
