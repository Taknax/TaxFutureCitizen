/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tax.taknax.tax_future_citizen.init;

import tax.taknax.tax_future_citizen.block.MonitorBlock;
import tax.taknax.tax_future_citizen.TaxFutureCitizenMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class TaxFutureCitizenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TaxFutureCitizenMod.MODID);
	public static final RegistryObject<Block> MONITOR = REGISTRY.register("monitor", () -> new MonitorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}