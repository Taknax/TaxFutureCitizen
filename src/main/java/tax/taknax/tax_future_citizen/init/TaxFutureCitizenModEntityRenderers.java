/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.client.renderer.CyborgZombieRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaxFutureCitizenModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TaxFutureCitizenModEntities.CYBORG_ZOMBIE.get(), CyborgZombieRenderer::new);
	}
}