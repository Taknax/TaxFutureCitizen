package tax.taknax.tax_future_citizen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ChipItem extends Item {
	public ChipItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}