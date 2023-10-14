
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.minersonline.extra_industrial_stuff.init;

import tk.minersonline.extra_industrial_stuff.block.StealOreBlock;
import tk.minersonline.extra_industrial_stuff.block.StealCasingBlock;
import tk.minersonline.extra_industrial_stuff.block.StealBlockBlock;
import tk.minersonline.extra_industrial_stuff.ExtraIndustrialStuffMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ExtraIndustrialStuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraIndustrialStuffMod.MODID);
	public static final RegistryObject<Block> STEAL_ORE = REGISTRY.register("steal_ore", () -> new StealOreBlock());
	public static final RegistryObject<Block> STEAL_BLOCK = REGISTRY.register("steal_block", () -> new StealBlockBlock());
	public static final RegistryObject<Block> STEAL_CASING = REGISTRY.register("steal_casing", () -> new StealCasingBlock());
}
