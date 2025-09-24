/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.item.SpaceSuitItem;
import tax.taknax.tax_future_citizen.item.LightsaberYellowItem;
import tax.taknax.tax_future_citizen.item.LightsaberWhiteItem;
import tax.taknax.tax_future_citizen.item.LightsaberRedItem;
import tax.taknax.tax_future_citizen.item.LightsaberPurpleItem;
import tax.taknax.tax_future_citizen.item.LightsaberPinkItem;
import tax.taknax.tax_future_citizen.item.LightsaberOrangeItem;
import tax.taknax.tax_future_citizen.item.LightsaberOffItem;
import tax.taknax.tax_future_citizen.item.LightsaberMagentaItem;
import tax.taknax.tax_future_citizen.item.LightsaberGreenLightItem;
import tax.taknax.tax_future_citizen.item.LightsaberGreenItem;
import tax.taknax.tax_future_citizen.item.LightsaberGrayLightItem;
import tax.taknax.tax_future_citizen.item.LightsaberGrayItem;
import tax.taknax.tax_future_citizen.item.LightsaberCyanItem;
import tax.taknax.tax_future_citizen.item.LightsaberBrownItem;
import tax.taknax.tax_future_citizen.item.LightsaberBlueLightItem;
import tax.taknax.tax_future_citizen.item.LightsaberBlueItem;
import tax.taknax.tax_future_citizen.item.LightsaberBlackItem;
import tax.taknax.tax_future_citizen.item.ArcEnergyItem;
import tax.taknax.tax_future_citizen.TaxFutureCitizenMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class TaxFutureCitizenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaxFutureCitizenMod.MODID);
	public static final RegistryObject<Item> LIGHTSABER_BLACK = REGISTRY.register("lightsaber_black", () -> new LightsaberBlackItem());
	public static final RegistryObject<Item> LIGHTSABER_BLUE = REGISTRY.register("lightsaber_blue", () -> new LightsaberBlueItem());
	public static final RegistryObject<Item> LIGHTSABER_BLUE_LIGHT = REGISTRY.register("lightsaber_blue_light", () -> new LightsaberBlueLightItem());
	public static final RegistryObject<Item> LIGHTSABER_BROWN = REGISTRY.register("lightsaber_brown", () -> new LightsaberBrownItem());
	public static final RegistryObject<Item> LIGHTSABER_CYAN = REGISTRY.register("lightsaber_cyan", () -> new LightsaberCyanItem());
	public static final RegistryObject<Item> LIGHTSABER_RED = REGISTRY.register("lightsaber_red", () -> new LightsaberRedItem());
	public static final RegistryObject<Item> LIGHTSABER_ORANGE = REGISTRY.register("lightsaber_orange", () -> new LightsaberOrangeItem());
	public static final RegistryObject<Item> LIGHTSABER_PINK = REGISTRY.register("lightsaber_pink", () -> new LightsaberPinkItem());
	public static final RegistryObject<Item> LIGHTSABER_PURPLE = REGISTRY.register("lightsaber_purple", () -> new LightsaberPurpleItem());
	public static final RegistryObject<Item> LIGHTSABER_GREEN = REGISTRY.register("lightsaber_green", () -> new LightsaberGreenItem());
	public static final RegistryObject<Item> LIGHTSABER_GREEN_LIGHT = REGISTRY.register("lightsaber_green_light", () -> new LightsaberGreenLightItem());
	public static final RegistryObject<Item> LIGHTSABER_MAGENTA = REGISTRY.register("lightsaber_magenta", () -> new LightsaberMagentaItem());
	public static final RegistryObject<Item> LIGHTSABER_GRAY = REGISTRY.register("lightsaber_gray", () -> new LightsaberGrayItem());
	public static final RegistryObject<Item> LIGHTSABER_GRAY_LIGHT = REGISTRY.register("lightsaber_gray_light", () -> new LightsaberGrayLightItem());
	public static final RegistryObject<Item> LIGHTSABER_WHITE = REGISTRY.register("lightsaber_white", () -> new LightsaberWhiteItem());
	public static final RegistryObject<Item> LIGHTSABER_YELLOW = REGISTRY.register("lightsaber_yellow", () -> new LightsaberYellowItem());
	public static final RegistryObject<Item> LIGHTSABER_OFF = REGISTRY.register("lightsaber_off", () -> new LightsaberOffItem());
	public static final RegistryObject<Item> SPACE_SUIT_HELMET = REGISTRY.register("space_suit_helmet", () -> new SpaceSuitItem.Helmet());
	public static final RegistryObject<Item> SPACE_SUIT_CHESTPLATE = REGISTRY.register("space_suit_chestplate", () -> new SpaceSuitItem.Chestplate());
	public static final RegistryObject<Item> SPACE_SUIT_LEGGINGS = REGISTRY.register("space_suit_leggings", () -> new SpaceSuitItem.Leggings());
	public static final RegistryObject<Item> SPACE_SUIT_BOOTS = REGISTRY.register("space_suit_boots", () -> new SpaceSuitItem.Boots());
	public static final RegistryObject<Item> ARC_ENERGY = REGISTRY.register("arc_energy", () -> new ArcEnergyItem());
	// Start of user code block custom items
	// End of user code block custom items
}