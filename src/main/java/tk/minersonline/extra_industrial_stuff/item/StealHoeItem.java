
package tk.minersonline.extra_industrial_stuff.item;

import tk.minersonline.extra_industrial_stuff.init.ExtraIndustrialStuffModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class StealHoeItem extends HoeItem {
	public StealHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ExtraIndustrialStuffModItems.STEAL.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
