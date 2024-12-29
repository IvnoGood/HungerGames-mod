package net.mcreator.hungergames.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.hungergames.network.HungergamesModVariables;
import net.mcreator.hungergames.HungergamesMod;

public class DeathblockRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		HungergamesMod.queueServerWork(60, () -> {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.REDSTONE_TORCH.defaultBlockState(), 3);
			HungergamesMod.queueServerWork(60, () -> {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.REDSTONE_TORCH.defaultBlockState(), 3);
			});
		});
		HungergamesModVariables.deaths = 0;
	}
}
