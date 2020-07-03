package com.rena.entities.model;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.rena.entities.ExampleEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.WolfEntity;

public class ExampleEntityModel<T extends ExampleEntity> extends EntityModel<T> {
	private final ModelRenderer Body;
	private final ModelRenderer head;
	private final ModelRenderer middleBody;
	private final ModelRenderer rearBody;
	private final ModelRenderer tail;
	private final ModelRenderer Legs;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;

	public ExampleEntityModel() {
		textureWidth = 232;
		textureHeight = 15;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, -10.5F, -7.0F);
		Body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(20, 0).addBox(-3.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(26, 0).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-1.5F, -0.0156F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-9.0F, -3.5F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(66, 0).addBox(-9.0F, -5.5F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(72, 0).addBox(-5.0F, -5.5F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(78, 0).addBox(-7.6893F, -0.4967F, -3.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(92, 0).addBox(3.0F, -3.5F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(112, 0).addBox(7.0F, -5.5F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(118, 0).addBox(3.0F, -5.5F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(124, 0).addBox(4.5F, -0.5F, -3.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		middleBody = new ModelRenderer(this);
		middleBody.setRotationPoint(0.0F, -10.0F, 2.0F);
		Body.addChild(middleBody);
		setRotationAngle(middleBody, 1.5708F, 0.0F, 0.0F);
		middleBody.setTextureOffset(138, 0).addBox(-4.0F, -7.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		rearBody = new ModelRenderer(this);
		rearBody.setRotationPoint(-1.0F, -10.0F, 2.0F);
		Body.addChild(rearBody);
		setRotationAngle(rearBody, 4.7124F, 0.0F, 3.1416F);
		rearBody.setTextureOffset(162, 0).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 6.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-1.0F, -12.0F, 8.0F);
		Body.addChild(tail);
		setRotationAngle(tail, -1.9199F, 0.0F, 3.1416F);
		tail.setTextureOffset(224, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Legs);
		

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-2.5F, -8.0F, 7.0F);
		Legs.addChild(leg0);
		leg0.setTextureOffset(192, 0).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.5F, -8.0F, 7.0F);
		Legs.addChild(leg1);
		leg1.setTextureOffset(200, 0).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.5F, -8.0F, -4.0F);
		Legs.addChild(leg2);
		leg2.setTextureOffset(208, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.5F, -8.0F, -4.0F);
		Legs.addChild(leg3);
		leg3.setTextureOffset(216, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	public ExampleEntityModel(ModelRenderer body, ModelRenderer head, ModelRenderer middleBody, ModelRenderer rearBody, ModelRenderer tail, ModelRenderer legs, ModelRenderer leg0, ModelRenderer leg1, ModelRenderer leg2, ModelRenderer leg3) {
        Body = body;
        this.head = head;
        this.middleBody = middleBody;
        this.rearBody = rearBody;
        this.tail = tail;
        Legs = legs;
        this.leg0 = leg0;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.leg3 = leg3;
    }

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha){
		Body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn,red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}