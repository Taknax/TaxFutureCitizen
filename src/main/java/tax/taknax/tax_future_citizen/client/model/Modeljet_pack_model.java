package tax.taknax.tax_future_citizen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeljet_pack_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "modeljet_pack_model"), "main");
	public final ModelPart Body;
	public final ModelPart Larm;
	public final ModelPart Rarm;

	public Modeljet_pack_model(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Larm = root.getChild("Larm");
		this.Rarm = root.getChild("Rarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(13, 11).addBox(1.0F, 0.0F, 2.0F, 5.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, 0.0F, 2.0F, 5.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 25)
						.addBox(-4.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(23, 19).addBox(2.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(2.0F, 12.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 0).addBox(-4.0F, 12.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 32)
						.addBox(-4.0F, 0.0F, -3.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 26).addBox(-4.0F, 0.0F, 2.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 6)
						.addBox(2.0F, 0.0F, -3.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(2.0F, 0.0F, 2.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Larm = partdefinition.addOrReplaceChild("Larm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Rarm = partdefinition.addOrReplaceChild("Rarm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Larm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}