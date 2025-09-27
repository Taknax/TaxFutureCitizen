package tax.taknax.tax_future_citizen.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

public class JetPackTimerProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Fuel: " + ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("displayFuel")) + " Arc Energy";
	}
}