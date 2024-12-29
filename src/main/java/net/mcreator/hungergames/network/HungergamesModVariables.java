package net.mcreator.hungergames.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.hungergames.HungergamesMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HungergamesModVariables {
	public static double deaths = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		HungergamesMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					HungergamesMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					HungergamesMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					HungergamesMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "hungergames_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				HungergamesMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "hungergames_mapvars";
		public double pos1x = 0;
		public double pos1y = 0;
		public double pos1z = 0;
		public double pos2x = 0;
		public double pos2y = 0;
		public double pos2z = 0;
		public double pos3x = 0;
		public double pos3y = 0;
		public double pos3z = 0;
		public double pos4x = 0;
		public double pos4y = 0;
		public double pos4z = 0;
		public double pos5x = 0;
		public double pos5y = 0;
		public double pos5z = 0;
		public double pos6x = 0;
		public double pos6y = 0;
		public double pos6z = 0;
		public double pos7x = 0;
		public double pos7y = 0;
		public double pos7z = 0;
		public double pos8x = 0;
		public double pos8y = 0;
		public double pos8z = 0;
		public double pos9x = 0;
		public double pos9y = 0;
		public double pos9z = 0;
		public double pos10x = 0;
		public double pos10y = 0;
		public double pos10z = 0;
		public double pos11x = 0;
		public double pos11y = 0;
		public double pos11z = 0;
		public double pos12x = 0;
		public double pos12y = 0;
		public double pos12z = 0;
		public double pos13x = 0;
		public double pos13y = 0;
		public double pos13z = 0;
		public double pos14x = 0;
		public double pos14y = 0;
		public double pos14z = 0;
		public boolean toggleblockregen = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			pos1x = nbt.getDouble("pos1x");
			pos1y = nbt.getDouble("pos1y");
			pos1z = nbt.getDouble("pos1z");
			pos2x = nbt.getDouble("pos2x");
			pos2y = nbt.getDouble("pos2y");
			pos2z = nbt.getDouble("pos2z");
			pos3x = nbt.getDouble("pos3x");
			pos3y = nbt.getDouble("pos3y");
			pos3z = nbt.getDouble("pos3z");
			pos4x = nbt.getDouble("pos4x");
			pos4y = nbt.getDouble("pos4y");
			pos4z = nbt.getDouble("pos4z");
			pos5x = nbt.getDouble("pos5x");
			pos5y = nbt.getDouble("pos5y");
			pos5z = nbt.getDouble("pos5z");
			pos6x = nbt.getDouble("pos6x");
			pos6y = nbt.getDouble("pos6y");
			pos6z = nbt.getDouble("pos6z");
			pos7x = nbt.getDouble("pos7x");
			pos7y = nbt.getDouble("pos7y");
			pos7z = nbt.getDouble("pos7z");
			pos8x = nbt.getDouble("pos8x");
			pos8y = nbt.getDouble("pos8y");
			pos8z = nbt.getDouble("pos8z");
			pos9x = nbt.getDouble("pos9x");
			pos9y = nbt.getDouble("pos9y");
			pos9z = nbt.getDouble("pos9z");
			pos10x = nbt.getDouble("pos10x");
			pos10y = nbt.getDouble("pos10y");
			pos10z = nbt.getDouble("pos10z");
			pos11x = nbt.getDouble("pos11x");
			pos11y = nbt.getDouble("pos11y");
			pos11z = nbt.getDouble("pos11z");
			pos12x = nbt.getDouble("pos12x");
			pos12y = nbt.getDouble("pos12y");
			pos12z = nbt.getDouble("pos12z");
			pos13x = nbt.getDouble("pos13x");
			pos13y = nbt.getDouble("pos13y");
			pos13z = nbt.getDouble("pos13z");
			pos14x = nbt.getDouble("pos14x");
			pos14y = nbt.getDouble("pos14y");
			pos14z = nbt.getDouble("pos14z");
			toggleblockregen = nbt.getBoolean("toggleblockregen");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("pos1x", pos1x);
			nbt.putDouble("pos1y", pos1y);
			nbt.putDouble("pos1z", pos1z);
			nbt.putDouble("pos2x", pos2x);
			nbt.putDouble("pos2y", pos2y);
			nbt.putDouble("pos2z", pos2z);
			nbt.putDouble("pos3x", pos3x);
			nbt.putDouble("pos3y", pos3y);
			nbt.putDouble("pos3z", pos3z);
			nbt.putDouble("pos4x", pos4x);
			nbt.putDouble("pos4y", pos4y);
			nbt.putDouble("pos4z", pos4z);
			nbt.putDouble("pos5x", pos5x);
			nbt.putDouble("pos5y", pos5y);
			nbt.putDouble("pos5z", pos5z);
			nbt.putDouble("pos6x", pos6x);
			nbt.putDouble("pos6y", pos6y);
			nbt.putDouble("pos6z", pos6z);
			nbt.putDouble("pos7x", pos7x);
			nbt.putDouble("pos7y", pos7y);
			nbt.putDouble("pos7z", pos7z);
			nbt.putDouble("pos8x", pos8x);
			nbt.putDouble("pos8y", pos8y);
			nbt.putDouble("pos8z", pos8z);
			nbt.putDouble("pos9x", pos9x);
			nbt.putDouble("pos9y", pos9y);
			nbt.putDouble("pos9z", pos9z);
			nbt.putDouble("pos10x", pos10x);
			nbt.putDouble("pos10y", pos10y);
			nbt.putDouble("pos10z", pos10z);
			nbt.putDouble("pos11x", pos11x);
			nbt.putDouble("pos11y", pos11y);
			nbt.putDouble("pos11z", pos11z);
			nbt.putDouble("pos12x", pos12x);
			nbt.putDouble("pos12y", pos12y);
			nbt.putDouble("pos12z", pos12z);
			nbt.putDouble("pos13x", pos13x);
			nbt.putDouble("pos13y", pos13y);
			nbt.putDouble("pos13z", pos13z);
			nbt.putDouble("pos14x", pos14x);
			nbt.putDouble("pos14y", pos14y);
			nbt.putDouble("pos14z", pos14z);
			nbt.putBoolean("toggleblockregen", toggleblockregen);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				HungergamesMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
