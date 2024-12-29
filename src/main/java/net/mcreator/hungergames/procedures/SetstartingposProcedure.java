package net.mcreator.hungergames.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.hungergames.network.HungergamesModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetstartingposProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Created location for position id: " + DoubleArgumentType.getDouble(arguments, "positionid") + " and for locaction: " + new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX())), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Created location for position id:" + DoubleArgumentType.getDouble(arguments, "positionid") + " and for locaction: " + new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY())), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Created location for position id:" + DoubleArgumentType.getDouble(arguments, "positionid") + " and for locaction: " + new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ())), false);
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 1) {
			HungergamesModVariables.MapVariables.get(world).pos1x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos1y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos1z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 2) {
			HungergamesModVariables.MapVariables.get(world).pos2x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos2y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos2z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 3) {
			HungergamesModVariables.MapVariables.get(world).pos3x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos3y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos3z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 4) {
			HungergamesModVariables.MapVariables.get(world).pos4x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos4y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos4z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 5) {
			HungergamesModVariables.MapVariables.get(world).pos5x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos5y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos5z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 6) {
			HungergamesModVariables.MapVariables.get(world).pos6x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos6y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos6z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 7) {
			HungergamesModVariables.MapVariables.get(world).pos7x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos7y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos7z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 8) {
			HungergamesModVariables.MapVariables.get(world).pos8x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos8y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos8z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 9) {
			HungergamesModVariables.MapVariables.get(world).pos9x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos9y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos9z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 10) {
			HungergamesModVariables.MapVariables.get(world).pos10x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos10y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos10z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 11) {
			HungergamesModVariables.MapVariables.get(world).pos11x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos11y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos11z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 12) {
			HungergamesModVariables.MapVariables.get(world).pos12x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos12y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos12z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 13) {
			HungergamesModVariables.MapVariables.get(world).pos13x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos13y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos13z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
		if (DoubleArgumentType.getDouble(arguments, "positionid") == 14) {
			HungergamesModVariables.MapVariables.get(world).pos14x = new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos14y = new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
			HungergamesModVariables.MapVariables.get(world).pos14z = new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ();
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
