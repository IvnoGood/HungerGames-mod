package net.mcreator.hungergames.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.hungergames.network.HungergamesModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class ToggleblockregencommandProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (BoolArgumentType.getBool(arguments, "toggleregen")) {
			HungergamesModVariables.MapVariables.get(world).toggleblockregen = true;
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		} else {
			HungergamesModVariables.MapVariables.get(world).toggleblockregen = false;
			HungergamesModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
