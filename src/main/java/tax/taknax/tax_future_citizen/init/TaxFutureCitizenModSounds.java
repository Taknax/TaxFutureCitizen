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
	public static final RegistryObject<SoundEvent> LIGHTSABER_IGNITION = REGISTRY.register("lightsaber_ignition", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "lightsaber_ignition")));
	public static final RegistryObject<SoundEvent> LIGHTSABER_SWING = REGISTRY.register("lightsaber_swing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "lightsaber_swing")));
	public static final RegistryObject<SoundEvent> FLUX_CATALYST = REGISTRY.register("flux_catalyst", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "flux_catalyst")));
	public static final RegistryObject<SoundEvent> JET_PACK_SOUND = REGISTRY.register("jet_pack_sound", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "jet_pack_sound")));
	public static final RegistryObject<SoundEvent> JET_PACK_SOUND_2 = REGISTRY.register("jet_pack_sound_2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "jet_pack_sound_2")));
	public static final RegistryObject<SoundEvent> COMPUTER_VILLAGER = REGISTRY.register("computer_villager", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "computer_villager")));
	public static final RegistryObject<SoundEvent> WARP = REGISTRY.register("warp", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "warp")));
}