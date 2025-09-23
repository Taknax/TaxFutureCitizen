/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.TaxFutureCitizenMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TaxFutureCitizenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaxFutureCitizenMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_BLACK.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_BLUE.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_BLUE_LIGHT.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_BROWN.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_CYAN.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_RED.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_ORANGE.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_PINK.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_PURPLE.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_GREEN.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_GREEN_LIGHT.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_MAGENTA.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_GRAY.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_GRAY_LIGHT.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_WHITE.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_YELLOW.get());
			tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_OFF.get());
			tabData.accept(TaxFutureCitizenModItems.JET_PACK_CHESTPLATE.get());
		}
	}
}