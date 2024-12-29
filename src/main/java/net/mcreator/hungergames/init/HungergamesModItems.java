
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hungergames.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hungergames.item.RareTagItem;
import net.mcreator.hungergames.item.RandomizeTagItem;
import net.mcreator.hungergames.item.EpicTagItem;
import net.mcreator.hungergames.item.DefuseToolItem;
import net.mcreator.hungergames.item.CorneTagItem;
import net.mcreator.hungergames.item.CommonTagItem;
import net.mcreator.hungergames.HungergamesMod;

public class HungergamesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HungergamesMod.MODID);
	public static final RegistryObject<Item> DEFUSE_TOOL = REGISTRY.register("defuse_tool", () -> new DefuseToolItem());
	public static final RegistryObject<Item> POISONUS = block(HungergamesModBlocks.POISONUS);
	public static final RegistryObject<Item> DEATHBLOCK = block(HungergamesModBlocks.DEATHBLOCK);
	public static final RegistryObject<Item> COMMON_TAG = REGISTRY.register("common_tag", () -> new CommonTagItem());
	public static final RegistryObject<Item> RARE_TAG = REGISTRY.register("rare_tag", () -> new RareTagItem());
	public static final RegistryObject<Item> EPIC_TAG = REGISTRY.register("epic_tag", () -> new EpicTagItem());
	public static final RegistryObject<Item> CORNE_TAG = REGISTRY.register("corne_tag", () -> new CorneTagItem());
	public static final RegistryObject<Item> STARTGLASS = block(HungergamesModBlocks.STARTGLASS);
	public static final RegistryObject<Item> RANDOMIZE_TAG = REGISTRY.register("randomize_tag", () -> new RandomizeTagItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
