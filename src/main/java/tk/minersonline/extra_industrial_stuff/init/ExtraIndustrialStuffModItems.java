
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.minersonline.extra_industrial_stuff.init;

import tk.minersonline.extra_industrial_stuff.item.StealSwordItem;
import tk.minersonline.extra_industrial_stuff.item.StealShovelItem;
import tk.minersonline.extra_industrial_stuff.item.StealPickaxeItem;
import tk.minersonline.extra_industrial_stuff.item.StealItem;
import tk.minersonline.extra_industrial_stuff.item.StealHoeItem;
import tk.minersonline.extra_industrial_stuff.item.StealAxeItem;
import tk.minersonline.extra_industrial_stuff.item.StealArmorItem;
import tk.minersonline.extra_industrial_stuff.ExtraIndustrialStuffMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ExtraIndustrialStuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraIndustrialStuffMod.MODID);
	public static final RegistryObject<Item> STEAL = REGISTRY.register("steal", () -> new StealItem());
	public static final RegistryObject<Item> STEAL_ORE = block(ExtraIndustrialStuffModBlocks.STEAL_ORE);
	public static final RegistryObject<Item> STEAL_BLOCK = block(ExtraIndustrialStuffModBlocks.STEAL_BLOCK);
	public static final RegistryObject<Item> STEAL_PICKAXE = REGISTRY.register("steal_pickaxe", () -> new StealPickaxeItem());
	public static final RegistryObject<Item> STEAL_AXE = REGISTRY.register("steal_axe", () -> new StealAxeItem());
	public static final RegistryObject<Item> STEAL_SWORD = REGISTRY.register("steal_sword", () -> new StealSwordItem());
	public static final RegistryObject<Item> STEAL_SHOVEL = REGISTRY.register("steal_shovel", () -> new StealShovelItem());
	public static final RegistryObject<Item> STEAL_HOE = REGISTRY.register("steal_hoe", () -> new StealHoeItem());
	public static final RegistryObject<Item> STEAL_ARMOR_HELMET = REGISTRY.register("steal_armor_helmet", () -> new StealArmorItem.Helmet());
	public static final RegistryObject<Item> STEAL_ARMOR_CHESTPLATE = REGISTRY.register("steal_armor_chestplate", () -> new StealArmorItem.Chestplate());
	public static final RegistryObject<Item> STEAL_ARMOR_LEGGINGS = REGISTRY.register("steal_armor_leggings", () -> new StealArmorItem.Leggings());
	public static final RegistryObject<Item> STEAL_ARMOR_BOOTS = REGISTRY.register("steal_armor_boots", () -> new StealArmorItem.Boots());
	public static final RegistryObject<Item> STEAL_CASING = block(ExtraIndustrialStuffModBlocks.STEAL_CASING);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
