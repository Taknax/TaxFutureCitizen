/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.client.model.Modelspace_leggings;
import tax.taknax.tax_future_citizen.client.model.Modelspace_helmet;
import tax.taknax.tax_future_citizen.client.model.Modelspace_boots;
import tax.taknax.tax_future_citizen.client.model.Modeljet_pack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TaxFutureCitizenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelspace_helmet.LAYER_LOCATION, Modelspace_helmet::createBodyLayer);
		event.registerLayerDefinition(Modelspace_leggings.LAYER_LOCATION, Modelspace_leggings::createBodyLayer);
		event.registerLayerDefinition(Modeljet_pack.LAYER_LOCATION, Modeljet_pack::createBodyLayer);
		event.registerLayerDefinition(Modelspace_boots.LAYER_LOCATION, Modelspace_boots::createBodyLayer);
	}
}