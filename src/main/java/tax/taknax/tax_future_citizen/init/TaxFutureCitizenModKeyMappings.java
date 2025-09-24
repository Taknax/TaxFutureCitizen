/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.network.JetPackKeyMessage;
import tax.taknax.tax_future_citizen.TaxFutureCitizenMod;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TaxFutureCitizenModKeyMappings {
	public static final KeyMapping JET_PACK_KEY = new KeyMapping("key.tax_future_citizen.jet_pack_key", GLFW.GLFW_KEY_H, "key.categories.space_suit") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TaxFutureCitizenMod.PACKET_HANDLER.sendToServer(new JetPackKeyMessage(0, 0));
				JetPackKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				JET_PACK_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - JET_PACK_KEY_LASTPRESS);
				TaxFutureCitizenMod.PACKET_HANDLER.sendToServer(new JetPackKeyMessage(1, dt));
				JetPackKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long JET_PACK_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(JET_PACK_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				JET_PACK_KEY.consumeClick();
			}
		}
	}
}