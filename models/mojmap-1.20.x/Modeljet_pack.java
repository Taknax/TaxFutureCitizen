// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljet_pack<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jet_pack"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modeljet_pack(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(8, 16)
				.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
				.addBox(1.0F, 1.0F, 2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-4.0F, 1.0F, 2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 21)
				.addBox(-1.0F, 3.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
				.addBox(2.0F, -0.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 12).mirror()
				.addBox(-3.0F, -0.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 25)
				.addBox(-3.0F, 3.0F, 4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
				.addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
				.addBox(-3.0F, 1.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
				.addBox(-2.0F, 2.5F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30).mirror()
				.addBox(1.0F, 1.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 12)
				.addBox(-4.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 12).addBox(3.0F,
						-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(13, 12).mirror()
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(7, 14).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(6, 26).addBox(-2.0F, -2.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(6, 21).addBox(-2.0F, -1.5F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(6, 21).addBox(-2.0F, -1.5F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(13, 12)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
				.addBox(-1.5F, 7.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
				.addBox(-1.01F, 6.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 14).mirror()
				.addBox(-1.0F, -2.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 26)
				.mirror().addBox(1.0F, -2.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 21).addBox(1.0F, -1.5F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 21)
				.addBox(1.0F, -1.5F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}