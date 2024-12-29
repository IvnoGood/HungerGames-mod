package net.mcreator.hungergames.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.hungergames.world.inventory.PoisonusguiMenu;
import net.mcreator.hungergames.procedures.ActualzProcedure;
import net.mcreator.hungergames.procedures.ActualyProcedure;
import net.mcreator.hungergames.procedures.ActualxProcedure;
import net.mcreator.hungergames.network.PoisonusguiButtonMessage;
import net.mcreator.hungergames.HungergamesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PoisonusguiScreen extends AbstractContainerScreen<PoisonusguiMenu> {
	private final static HashMap<String, Object> guistate = PoisonusguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_x;
	Button button_y;
	Button button_z;
	Button button_x1;
	Button button_y1;
	Button button_z1;

	public PoisonusguiScreen(PoisonusguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("hungergames:textures/screens/poisonusgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.hungergames.poisonusgui.label_poisonus"), 67, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hungergames.poisonusgui.label_change_coordinates"), 10, 30, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hungergames.poisonusgui.label_add"), 15, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hungergames.poisonusgui.label_substract"), 15, 88, -12829636, false);
		guiGraphics.drawString(this.font,

				ActualxProcedure.execute(world, x, y, z), 6, 16, -12829636, false);
		guiGraphics.drawString(this.font,

				ActualyProcedure.execute(world, x, y, z), 69, 16, -12829636, false);
		guiGraphics.drawString(this.font,

				ActualzProcedure.execute(world, x, y, z), 123, 16, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_x = Button.builder(Component.translatable("gui.hungergames.poisonusgui.button_x"), e -> {
			if (true) {
				HungergamesMod.PACKET_HANDLER.sendToServer(new PoisonusguiButtonMessage(0, x, y, z));
				PoisonusguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_x", button_x);
		this.addRenderableWidget(button_x);
		button_y = Button.builder(Component.translatable("gui.hungergames.poisonusgui.button_y"), e -> {
			if (true) {
				HungergamesMod.PACKET_HANDLER.sendToServer(new PoisonusguiButtonMessage(1, x, y, z));
				PoisonusguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_y", button_y);
		this.addRenderableWidget(button_y);
		button_z = Button.builder(Component.translatable("gui.hungergames.poisonusgui.button_z"), e -> {
			if (true) {
				HungergamesMod.PACKET_HANDLER.sendToServer(new PoisonusguiButtonMessage(2, x, y, z));
				PoisonusguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_z", button_z);
		this.addRenderableWidget(button_z);
		button_x1 = Button.builder(Component.translatable("gui.hungergames.poisonusgui.button_x1"), e -> {
			if (true) {
				HungergamesMod.PACKET_HANDLER.sendToServer(new PoisonusguiButtonMessage(3, x, y, z));
				PoisonusguiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 106, 30, 20).build();
		guistate.put("button:button_x1", button_x1);
		this.addRenderableWidget(button_x1);
		button_y1 = Button.builder(Component.translatable("gui.hungergames.poisonusgui.button_y1"), e -> {
			if (true) {
				HungergamesMod.PACKET_HANDLER.sendToServer(new PoisonusguiButtonMessage(4, x, y, z));
				PoisonusguiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 106, 30, 20).build();
		guistate.put("button:button_y1", button_y1);
		this.addRenderableWidget(button_y1);
		button_z1 = Button.builder(Component.translatable("gui.hungergames.poisonusgui.button_z1"), e -> {
			if (true) {
				HungergamesMod.PACKET_HANDLER.sendToServer(new PoisonusguiButtonMessage(5, x, y, z));
				PoisonusguiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 132, this.topPos + 106, 30, 20).build();
		guistate.put("button:button_z1", button_z1);
		this.addRenderableWidget(button_z1);
	}
}
