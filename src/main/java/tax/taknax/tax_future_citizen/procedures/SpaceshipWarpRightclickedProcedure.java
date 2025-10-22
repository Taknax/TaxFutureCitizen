package tax.taknax.tax_future_citizen.procedures;

import tax.taknax.tax_future_citizen.init.TaxFutureCitizenModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SpaceshipWarpRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(TaxFutureCitizenModItems.SPACESHIP_WARP.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("tax_future_citizen:warp")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("tax_future_citizen:warp")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("tax_future_citizen", "spaceship_modded2"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x, 185, z), BlockPos.containing(x, 185, z), new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false),
						_serverworld.random, 3);
			}
		}
	}
}