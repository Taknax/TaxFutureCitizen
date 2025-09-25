package tax.taknax.tax_future_citizen.client.screens;

import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayLeggingsLabelProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayJetpackLabelProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayHelmetLabelProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayBootsLabelProcedure;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SpaceHelmetOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (SpaceHelmetOverlayHelmetLabelProcedure.execute(entity)) {
			if (SpaceHelmetOverlayJetpackLabelProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/jet_pack_item.png"), w / 2 + -207, h / 2 + -94, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayBootsLabelProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/space_boots_item.png"), w / 2 + -207, h / 2 + -58, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayHelmetLabelProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/space_helmet_item.png"), w / 2 + -207, h / 2 + -112, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayLeggingsLabelProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/space_leggings_item.png"), w / 2 + -207, h / 2 + -76, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayJetpackLabelProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.tax_future_citizen.space_helmet_overlay.label_fuel"), w / 2 + -183, h / 2 + -91, -16711936, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}