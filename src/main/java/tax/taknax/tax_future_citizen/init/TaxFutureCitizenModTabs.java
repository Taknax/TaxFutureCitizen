/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.TaxFutureCitizenMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TaxFutureCitizenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaxFutureCitizenMod.MODID);
	public static final RegistryObject<CreativeModeTab> CITIZEN = REGISTRY.register("citizen",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tax_future_citizen.citizen")).icon(() -> new ItemStack(TaxFutureCitizenModItems.SPACE_SUIT_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaxFutureCitizenModItems.SPACE_SUIT_HELMET.get());
				tabData.accept(TaxFutureCitizenModItems.SPACE_SUIT_CHESTPLATE.get());
				tabData.accept(TaxFutureCitizenModItems.SPACE_SUIT_LEGGINGS.get());
				tabData.accept(TaxFutureCitizenModItems.SPACE_SUIT_BOOTS.get());
				tabData.accept(TaxFutureCitizenModItems.LIGHTSABER_OFF.get());
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
				tabData.accept(TaxFutureCitizenModItems.FLUX_CATALYST.get());
				tabData.accept(TaxFutureCitizenModItems.FLUX_CATALYST_CONUSMED.get());
				tabData.accept(TaxFutureCitizenModItems.CYBORG_ZOMBIE_SPAWN_EGG.get());
			}).build());
}