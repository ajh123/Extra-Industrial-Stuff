
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.minersonline.extra_industrial_stuff.init;

import tk.minersonline.extra_industrial_stuff.world.features.ores.StealOreFeature;
import tk.minersonline.extra_industrial_stuff.ExtraIndustrialStuffMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ExtraIndustrialStuffModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ExtraIndustrialStuffMod.MODID);
	public static final RegistryObject<Feature<?>> STEAL_ORE = REGISTRY.register("steal_ore", StealOreFeature::new);
}
