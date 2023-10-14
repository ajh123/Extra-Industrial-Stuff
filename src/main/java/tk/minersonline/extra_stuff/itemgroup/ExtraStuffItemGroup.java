
package tk.minersonline.extra_stuff.itemgroup;

import tk.minersonline.extra_stuff.ExtraStuffModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

@ExtraStuffModElements.ModElement.Tag
public class ExtraStuffItemGroup extends ExtraStuffModElements.ModElement {
	public ExtraStuffItemGroup(ExtraStuffModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabextra_stuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.REDSTONE_WIRE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
