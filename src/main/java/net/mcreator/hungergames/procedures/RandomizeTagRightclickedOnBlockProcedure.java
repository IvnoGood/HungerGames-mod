package net.mcreator.hungergames.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class RandomizeTagRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Math.random();
		if (random < 0.7) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"data merge block ~ ~ ~ {LootTable:\"hungergames:chests/around\"}");
		} else if (random < 0.5) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"data merge block ~ ~ ~ {LootTable:\"hungergames:chests/rarearound\"}");
		} else if (random < 0.2) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"data merge block ~ ~ ~ {LootTable:\"hungergames:chests/epicaround\"}");
		}
	}
}
