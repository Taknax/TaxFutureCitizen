package tax.taknax.tax_future_citizen.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class JetPackTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("displayFuel",
				((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("fuel") / 20));
		if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.LEVITATION)) {
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("fuel",
					((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("fuel") - 1));
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("fuel") == 0) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.LEVITATION);
			}
		}
	}
}