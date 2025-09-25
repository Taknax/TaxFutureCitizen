package tax.taknax.tax_future_citizen.procedures;

import tax.taknax.tax_future_citizen.init.TaxFutureCitizenModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class ArcEnergyRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(Level.OVERWORLD);
			if (world != null) {
				entity.getPersistentData().putDouble("fuel", (itemstack.getOrCreateTag().getDouble("fuel") + 600));
			}
			world = _worldorig;
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(TaxFutureCitizenModItems.ARC_CATALYST.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}