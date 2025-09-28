package tax.taknax.tax_future_citizen.procedures;

import tax.taknax.tax_future_citizen.init.TaxFutureCitizenModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LightsaberIgnitionSoundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_BLACK.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_BLUE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_BLUE_LIGHT.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_BROWN.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_CYAN.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_GRAY.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_GRAY_LIGHT.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_GREEN.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_GREEN_LIGHT.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_MAGENTA.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_ORANGE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_PINK.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_PURPLE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_RED.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_WHITE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TaxFutureCitizenModItems.LIGHTSABER_YELLOW.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("tax_future_citizen:lightsaber_ignition")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("tax_future_citizen:lightsaber_ignition")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}