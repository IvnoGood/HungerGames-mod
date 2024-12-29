package net.mcreator.hungergames.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;

import net.mcreator.hungergames.network.HungergamesModVariables;

public class DataOnKeyPressedProcedure {
	public static void execute(LevelAccessor world) {
		world.getLevelData().getGameRules().getRule(GameRules.RULE_SNOW_ACCUMULATION_HEIGHT).set((int) HungergamesModVariables.deaths, world.getServer());
	}
}
