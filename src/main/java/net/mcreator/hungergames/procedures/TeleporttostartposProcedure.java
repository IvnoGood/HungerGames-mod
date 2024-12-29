package net.mcreator.hungergames.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.hungergames.network.HungergamesModVariables;

import java.util.Comparator;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class TeleporttostartposProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 1) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos1x, HungergamesModVariables.MapVariables.get(world).pos1y, HungergamesModVariables.MapVariables.get(world).pos1z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos1x, HungergamesModVariables.MapVariables.get(world).pos1y, HungergamesModVariables.MapVariables.get(world).pos1z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 2) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos2x, HungergamesModVariables.MapVariables.get(world).pos2y, HungergamesModVariables.MapVariables.get(world).pos2z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos2x, HungergamesModVariables.MapVariables.get(world).pos2y, HungergamesModVariables.MapVariables.get(world).pos2z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 3) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos3x, HungergamesModVariables.MapVariables.get(world).pos3y, HungergamesModVariables.MapVariables.get(world).pos3z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos3x, HungergamesModVariables.MapVariables.get(world).pos3y, HungergamesModVariables.MapVariables.get(world).pos3z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 4) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos4x, HungergamesModVariables.MapVariables.get(world).pos4y, HungergamesModVariables.MapVariables.get(world).pos4z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos4x, HungergamesModVariables.MapVariables.get(world).pos4y, HungergamesModVariables.MapVariables.get(world).pos4z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 5) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos5x, HungergamesModVariables.MapVariables.get(world).pos5y, HungergamesModVariables.MapVariables.get(world).pos5z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos5x, HungergamesModVariables.MapVariables.get(world).pos5y, HungergamesModVariables.MapVariables.get(world).pos5z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 6) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos6x, HungergamesModVariables.MapVariables.get(world).pos6y, HungergamesModVariables.MapVariables.get(world).pos6z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos6x, HungergamesModVariables.MapVariables.get(world).pos6y, HungergamesModVariables.MapVariables.get(world).pos6z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 7) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos7x, HungergamesModVariables.MapVariables.get(world).pos7y, HungergamesModVariables.MapVariables.get(world).pos7z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos7x, HungergamesModVariables.MapVariables.get(world).pos7y, HungergamesModVariables.MapVariables.get(world).pos7z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 8) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos8x, HungergamesModVariables.MapVariables.get(world).pos8y, HungergamesModVariables.MapVariables.get(world).pos8z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos8x, HungergamesModVariables.MapVariables.get(world).pos8y, HungergamesModVariables.MapVariables.get(world).pos8z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 9) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos9x, HungergamesModVariables.MapVariables.get(world).pos9y, HungergamesModVariables.MapVariables.get(world).pos9z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos9x, HungergamesModVariables.MapVariables.get(world).pos9y, HungergamesModVariables.MapVariables.get(world).pos9z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 10) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos10x, HungergamesModVariables.MapVariables.get(world).pos10y, HungergamesModVariables.MapVariables.get(world).pos10z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos10x, HungergamesModVariables.MapVariables.get(world).pos10y, HungergamesModVariables.MapVariables.get(world).pos10z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 11) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos11x, HungergamesModVariables.MapVariables.get(world).pos11y, HungergamesModVariables.MapVariables.get(world).pos11z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos11x, HungergamesModVariables.MapVariables.get(world).pos11y, HungergamesModVariables.MapVariables.get(world).pos11z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 12) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos12x, HungergamesModVariables.MapVariables.get(world).pos12y, HungergamesModVariables.MapVariables.get(world).pos12z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos12x, HungergamesModVariables.MapVariables.get(world).pos12y, HungergamesModVariables.MapVariables.get(world).pos12z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 13) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos13x, HungergamesModVariables.MapVariables.get(world).pos13y, HungergamesModVariables.MapVariables.get(world).pos13z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos13x, HungergamesModVariables.MapVariables.get(world).pos13y, HungergamesModVariables.MapVariables.get(world).pos13z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 14) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(HungergamesModVariables.MapVariables.get(world).pos14x, HungergamesModVariables.MapVariables.get(world).pos14y, HungergamesModVariables.MapVariables.get(world).pos14z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(HungergamesModVariables.MapVariables.get(world).pos14x, HungergamesModVariables.MapVariables.get(world).pos14y, HungergamesModVariables.MapVariables.get(world).pos14z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
	}
}
