
package tk.minersonline.extra_industrial_stuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StealItem extends Item {
	public StealItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
