
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hungergames.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.hungergames.HungergamesMod;

public class HungergamesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HungergamesMod.MODID);
	public static final RegistryObject<SoundEvent> LIGHTINTHEDARK = REGISTRY.register("lightinthedark", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hungergames", "lightinthedark")));
}
