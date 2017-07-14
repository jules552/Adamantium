package fr.jules552.mod.init.Adamantium;

import fr.jules552.mod.init.ItemsMod;
import net.minecraft.item.ItemStack;

public class SwordAdamantium extends ItemSword2 {

	public SwordAdamantium(ToolMaterial material, float attackSpeed) {
		super(material, -2.8F);

	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if (repair.getItem() == ItemsMod.adamantium_ingot) {
			return true;
		}
		return false;
	}

}
