
package net.mcreator.hungergames.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.hungergames.world.inventory.PoisonusguiMenu;
import net.mcreator.hungergames.procedures.CoordinateszchangeminusProcedure;
import net.mcreator.hungergames.procedures.CoordinatesychangeplusProcedure;
import net.mcreator.hungergames.procedures.CoordinatesychangeProcedure;
import net.mcreator.hungergames.procedures.CoordinatesxchangeminusProcedure;
import net.mcreator.hungergames.procedures.CoordinatesxchangeProcedure;
import net.mcreator.hungergames.procedures.CoodinateszchangeProcedure;
import net.mcreator.hungergames.HungergamesMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoisonusguiButtonMessage {
	private final int buttonID, x, y, z;

	public PoisonusguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PoisonusguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PoisonusguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PoisonusguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = PoisonusguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CoordinatesxchangeProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			CoordinatesychangeProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			CoodinateszchangeProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			CoordinatesxchangeminusProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			CoordinatesychangeplusProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			CoordinateszchangeminusProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HungergamesMod.addNetworkMessage(PoisonusguiButtonMessage.class, PoisonusguiButtonMessage::buffer, PoisonusguiButtonMessage::new, PoisonusguiButtonMessage::handler);
	}
}
