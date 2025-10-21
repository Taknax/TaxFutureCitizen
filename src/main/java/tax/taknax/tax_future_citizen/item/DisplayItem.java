package tax.taknax.tax_future_citizen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DisplayItem extends Item {
	public DisplayItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}