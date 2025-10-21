package tax.taknax.tax_future_citizen.client.renderer;

import tax.taknax.tax_future_citizen.entity.CyborgZombieEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class CyborgZombieRenderer extends HumanoidMobRenderer<CyborgZombieEntity, HumanoidModel<CyborgZombieEntity>> {
	public CyborgZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<CyborgZombieEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(CyborgZombieEntity entity) {
		return ResourceLocation.parse("tax_future_citizen:textures/entities/bionic_zombie.png");
	}
}