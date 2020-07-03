package com.rena.entities.render;

import com.rena.RenasMobs;
import com.rena.entities.ExampleEntity;

import com.rena.entities.model.ExampleEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ExampleEntityRender extends MobRenderer<ExampleEntity, ExampleEntityModel<ExampleEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(RenasMobs.MOD_ID, "textures/entity/example_entity.png");

    public ExampleEntityRender(EntityRendererManager renderMangerIn) {
        super(renderMangerIn, new ExampleEntityModel<ExampleEntity>(), 0.5f);
    }
    @Override
    public ResourceLocation getEntityTexture(ExampleEntity entity){
        return TEXTURE;
    }
}