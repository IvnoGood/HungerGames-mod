package net.mcreator.hungergames.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.hungergames.network.HungergamesModVariables;
import net.mcreator.hungergames.HungergamesMod;

public class TestOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		world.getLevelData().getGameRules().getRule(GameRules.RULE_SNOW_ACCUMULATION_HEIGHT).set((int) HungergamesModVariables.deaths, world.getServer());
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Set"), true);
		HungergamesMod.queueServerWork(50, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos1x, HungergamesModVariables.MapVariables.get(world).pos1y, HungergamesModVariables.MapVariables.get(world).pos1z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos1x, HungergamesModVariables.MapVariables.get(world).pos1y, HungergamesModVariables.MapVariables.get(world).pos1z, _ent.getYRot(),
							_ent.getXRot());
			}
		});
	}
}
