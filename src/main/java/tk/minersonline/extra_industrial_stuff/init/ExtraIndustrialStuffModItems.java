
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.minersonline.extra_industrial_stuff.init;

import tk.minersonline.extra_industrial_stuff.item.SteelSwordItem;
import tk.minersonline.extra_industrial_stuff.item.SteelShovelItem;
import tk.minersonline.extra_industrial_stuff.item.SteelPickaxeItem;
import tk.minersonline.extra_industrial_stuff.item.SteelIngotItem;
import tk.minersonline.extra_industrial_stuff.item.SteelHoeItem;
import tk.minersonline.extra_industrial_stuff.item.SteelAxeItem;
import tk.minersonline.extra_industrial_stuff.item.SteelArmorItem;
import tk.minersonline.extra_industrial_stuff.ExtraIndustrialStuffMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ExtraIndustrialStuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraIndustrialStuffMod.MODID);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(ExtraIndustrialStuffModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> STEEL_CASING = block(ExtraIndustrialStuffModBlocks.STEEL_CASING);
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
