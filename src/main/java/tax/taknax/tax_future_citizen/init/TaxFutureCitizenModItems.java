/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.item.SpaceshipWarpItem;
import tax.taknax.tax_future_citizen.item.SpaceSuitItem;
import tax.taknax.tax_future_citizen.item.MicroChipItem;
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
import tax.taknax.tax_future_citizen.item.FluxCatalystItem;
import tax.taknax.tax_future_citizen.item.FluxCatalystConusmedItem;
import tax.taknax.tax_future_citizen.item.DisplayItem;
import tax.taknax.tax_future_citizen.item.CircuitPlateItem;
import tax.taknax.tax_future_citizen.item.CircuitCItem;
import tax.taknax.tax_future_citizen.item.CircuitBItem;
import tax.taknax.tax_future_citizen.item.CircuitAItem;
import tax.taknax.tax_future_citizen.item.ChipItem;
import tax.taknax.tax_future_citizen.item.CapacitorItem;
import tax.taknax.tax_future_citizen.item.ButtonsGreenRedItem;
import tax.taknax.tax_future_citizen.item.ButtonRedItem;
import tax.taknax.tax_future_citizen.item.ButtonGreenItem;
import tax.taknax.tax_future_citizen.TaxFutureCitizenMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

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
	public static final RegistryObject<Item> FLUX_CATALYST = REGISTRY.register("flux_catalyst", () -> new FluxCatalystItem());
	public static final RegistryObject<Item> FLUX_CATALYST_CONUSMED = REGISTRY.register("flux_catalyst_conusmed", () -> new FluxCatalystConusmedItem());
	public static final RegistryObject<Item> CYBORG_ZOMBIE_SPAWN_EGG = REGISTRY.register("cyborg_zombie_spawn_egg", () -> new ForgeSpawnEggItem(TaxFutureCitizenModEntities.CYBORG_ZOMBIE, -16751002, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> MICRO_CHIP = REGISTRY.register("micro_chip", () -> new MicroChipItem());
	public static final RegistryObject<Item> DISPLAY = REGISTRY.register("display", () -> new DisplayItem());
	public static final RegistryObject<Item> BUTTON_RED = REGISTRY.register("button_red", () -> new ButtonRedItem());
	public static final RegistryObject<Item> BUTTON_GREEN = REGISTRY.register("button_green", () -> new ButtonGreenItem());
	public static final RegistryObject<Item> CHIP = REGISTRY.register("chip", () -> new ChipItem());
	public static final RegistryObject<Item> CAPACITOR = REGISTRY.register("capacitor", () -> new CapacitorItem());
	public static final RegistryObject<Item> CIRCUIT_PLATE = REGISTRY.register("circuit_plate", () -> new CircuitPlateItem());
	public static final RegistryObject<Item> CIRCUIT_A = REGISTRY.register("circuit_a", () -> new CircuitAItem());
	public static final RegistryObject<Item> CIRCUIT_B = REGISTRY.register("circuit_b", () -> new CircuitBItem());
	public static final RegistryObject<Item> CIRCUIT_C = REGISTRY.register("circuit_c", () -> new CircuitCItem());
	public static final RegistryObject<Item> MONITOR = block(TaxFutureCitizenModBlocks.MONITOR, new Item.Properties().stacksTo(1));
	public static final RegistryObject<Item> BUTTONS_GREEN_RED = REGISTRY.register("buttons_green_red", () -> new ButtonsGreenRedItem());
	public static final RegistryObject<Item> SPACESHIP_WARP = REGISTRY.register("spaceship_warp", () -> new SpaceshipWarpItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}