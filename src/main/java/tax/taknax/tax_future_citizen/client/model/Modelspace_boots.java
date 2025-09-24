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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelspace_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "modelspace_boots"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelspace_boots(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -2.01F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 16).addBox(-3.0F, 9.99F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.2F, 10.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-1.2F, 10.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-1.2F, 9.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-2.2F, 9.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-2.2F, 8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-3.2F, 8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-3.2F, 7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(-4.2F, 7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 23)
						.addBox(-4.2F, 6.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 23).addBox(-4.2F, 6.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 25)
						.addBox(-4.2F, 5.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 25).addBox(-4.2F, 5.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 27)
						.addBox(-4.2F, 4.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 27).addBox(-4.2F, 4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29)
						.addBox(-4.2F, 3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29).addBox(-4.2F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29)
						.addBox(-3.2F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29).addBox(-2.2F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 23)
						.addBox(-1.3F, 7.0F, 2.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 25).addBox(-1.8F, 6.6F, 2.25F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -0.01F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(0, 16).addBox(-3.0F, 10.0F, -2.99F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(0, 23).addBox(0.0F, 10.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(0.0F, 10.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(0.0F, 9.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(1.0F, 9.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(1.0F, 8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(2.0F, 8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(2.0F, 7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(3.0F, 7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 23)
						.addBox(3.0F, 6.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 23).addBox(3.0F, 6.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 25)
						.addBox(3.0F, 5.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 25).addBox(3.0F, 5.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 27)
						.addBox(3.0F, 4.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 27).addBox(3.0F, 4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29)
						.addBox(3.0F, 3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29).addBox(3.0F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29)
						.addBox(2.0F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 29).addBox(1.0F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 0).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}