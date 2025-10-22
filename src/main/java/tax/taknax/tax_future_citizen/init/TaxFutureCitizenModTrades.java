/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package tax.taknax.tax_future_citizen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TaxFutureCitizenModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == TaxFutureCitizenModVillagerProfessions.COMPUTER_VILLAGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(TaxFutureCitizenModItems.CIRCUIT_PLATE.get()), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

					new ItemStack(TaxFutureCitizenModItems.CAPACITOR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(TaxFutureCitizenModItems.CHIP.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(TaxFutureCitizenModItems.MICRO_CHIP.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(TaxFutureCitizenModItems.BUTTON_GREEN.get()), 5, 7, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(TaxFutureCitizenModItems.BUTTON_RED.get()), 5, 7, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(TaxFutureCitizenModItems.DISPLAY.get()), 10, 5, 0.05f));
		}
	}
}