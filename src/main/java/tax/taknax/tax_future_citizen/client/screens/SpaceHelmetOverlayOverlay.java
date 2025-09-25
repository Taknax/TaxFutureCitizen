package tax.taknax.tax_future_citizen.client.screens;

import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayYelliowSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayWhiteSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayRedSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayPurpleSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayPinkSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayOrangeSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayOffSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayMagentaSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayLightGreenSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayLightGraySaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayLightBlueSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayLeggingsLabelProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayJetpackLabelProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayHelmetLabelProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayGreenSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayGraySaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayCyanSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayBrownSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayBootsLabelProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayBlueSaberProcedure;
import tax.taknax.tax_future_citizen.procedures.SpaceHelmetOverlayBlackSaberProcedure;

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
			if (SpaceHelmetOverlayBlackSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_black_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayBlueSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_blue_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayLightBlueSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_blue_light_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayBrownSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_brown_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayCyanSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_cyan_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayGraySaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_gray_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayLightGraySaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_gray_light_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayGreenSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_green_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayLightGreenSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_green_light_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayMagentaSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_magenta_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayOrangeSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_orange_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayPinkSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_pink_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayPurpleSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_purple_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayRedSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_red_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayWhiteSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_white_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayYelliowSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_yellow_item.png"), w / 2 + -207, h / 2 + -40, 0, 0, 16, 16, 16, 16);
			}
			if (SpaceHelmetOverlayOffSaberProcedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("tax_future_citizen:textures/screens/lightsaber_off_item.png"), w / 2 + -212, h / 2 + -35, 0, 0, 16, 16, 16, 16);
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