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
public class ArbreProcedure {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(6000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.OAK_LOG.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_LOG) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(6000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.SPRUCE_LOG.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_LOG) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(6000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BIRCH_LOG.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_LOG) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(6000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.JUNGLE_LOG.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(6000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.ACACIA_LOG.defaultBlockState(), 3);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG) {
				HungergamesMod.queueServerWork(5, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
				HungergamesMod.queueServerWork(6000, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.DARK_OAK_LOG.defaultBlockState(), 3);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Activate Block Regeneration !"), false);
		}
	}
}
