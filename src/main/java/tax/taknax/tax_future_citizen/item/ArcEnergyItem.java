package tax.taknax.tax_future_citizen.item;

import tax.taknax.tax_future_citizen.procedures.ArcEnergyRightclickedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class ArcEnergyItem extends Item {
	public ArcEnergyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ArcEnergyRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}
}