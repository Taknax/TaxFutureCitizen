/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.TaxFutureCitizenMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class TaxFutureCitizenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TaxFutureCitizenMod.MODID);
	public static final RegistryObject<SoundEvent> JET_PACK_SOUND = REGISTRY.register("jet_pack_sound", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "jet_pack_sound")));
	public static final RegistryObject<SoundEvent> LIGHTSABER_SWING_SOUND = REGISTRY.register("lightsaber_swing_sound", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "lightsaber_swing_sound")));
	public static final RegistryObject<SoundEvent> LIGHTSABER_IGNITION_SOUND = REGISTRY.register("lightsaber_ignition_sound",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "lightsaber_ignition_sound")));
}