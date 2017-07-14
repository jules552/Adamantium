package fr.jules552.mod.init.Silver;

import fr.jules552.mod.init.ItemsMod;
import fr.jules552.mod.init.Adamantium.ItemSword2;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class SwordSilver extends ItemSword2 {

	public SwordSilver(ToolMaterial material, float attackSpeed) {
		super(material, -2.4F);

	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if (repair.getItem() == ItemsMod.silver_ingot) {
			return true;
		}
		return false;
	}
}
