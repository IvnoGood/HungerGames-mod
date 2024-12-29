
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hungergames.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hungergames.block.StartglassBlock;
import net.mcreator.hungergames.block.PoisonusBlock;
import net.mcreator.hungergames.block.DeathblockBlock;
import net.mcreator.hungergames.HungergamesMod;

public class HungergamesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HungergamesMod.MODID);
	public static final RegistryObject<Block> POISONUS = REGISTRY.register("poisonus", () -> new PoisonusBlock());
	public static final RegistryObject<Block> DEATHBLOCK = REGISTRY.register("deathblock", () -> new DeathblockBlock());
	public static final RegistryObject<Block> STARTGLASS = REGISTRY.register("startglass", () -> new StartglassBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
