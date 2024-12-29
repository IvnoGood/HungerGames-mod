package net.mcreator.hungergames.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.hungergames.network.HungergamesModVariables;
import net.mcreator.hungergames.HungergamesMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OresProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (HungergamesModVariables.MapVariables.get(world).toggleblockregen) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(12000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.COAL_ORE.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.IRON_ORE) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(12000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.IRON_ORE.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(12000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.REDSTONE_ORE.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_ORE) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(12000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.GOLD_ORE.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAPIS_ORE) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(12000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.LAPIS_ORE.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_ORE) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(12000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.DIAMOND_ORE.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EMERALD_ORE) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(12000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.EMERALD_ORE.defaultBlockState(), 3);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Activate Block Regen !"), false);
		}
	}
}
