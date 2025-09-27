package tax.taknax.tax_future_citizen.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

public class JetPackTimerProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("displayFuel") < 10) {
			return "Jet Pack: \u00A74" + (new java.text.DecimalFormat("##").format((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("displayFuel")))
					+ "\u00A7r Arc Energy";
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("displayFuel") < 20) {
			return "Jet Pack: \u00A76" + (new java.text.DecimalFormat("##").format((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("displayFuel")))
					+ "\u00A7r Arc Energy";
		}
		return "Jet Pack: " + (new java.text.DecimalFormat("##").format((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("displayFuel")))
				+ "\u00A7r Arc Energy";
	}
}