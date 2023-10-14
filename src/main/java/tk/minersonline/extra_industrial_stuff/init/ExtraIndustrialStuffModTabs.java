
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.minersonline.extra_industrial_stuff.init;

import tk.minersonline.extra_industrial_stuff.ExtraIndustrialStuffMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ExtraIndustrialStuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraIndustrialStuffMod.MODID);
	public static final RegistryObject<CreativeModeTab> EXTRA_INDUSTRIAL_STUFF = REGISTRY.register("extra_industrial_stuff",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.extra_industrial_stuff.extra_industrial_stuff")).icon(() -> new ItemStack(ExtraIndustrialStuffModItems.STEEL_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_INGOT.get());
				tabData.accept(ExtraIndustrialStuffModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(ExtraIndustrialStuffModBlocks.STEEL_CASING.get().asItem());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_AXE.get());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_PICKAXE.get());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_SWORD.get());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_SHOVEL.get());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_HOE.get());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_ARMOR_HELMET.get());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_ARMOR_LEGGINGS.get());
				tabData.accept(ExtraIndustrialStuffModItems.STEEL_ARMOR_BOOTS.get());
			}).withSearchBar().build());
}
