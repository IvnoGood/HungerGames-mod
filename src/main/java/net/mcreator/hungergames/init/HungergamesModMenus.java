
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hungergames.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.hungergames.world.inventory.PoisonusguiMenu;
import net.mcreator.hungergames.HungergamesMod;

public class HungergamesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HungergamesMod.MODID);
	public static final RegistryObject<MenuType<PoisonusguiMenu>> POISONUSGUI = REGISTRY.register("poisonusgui", () -> IForgeMenuType.create(PoisonusguiMenu::new));
}
