package fr.jules552.mod.init.Aluminium;

import fr.jules552.mod.init.ItemsMod;
import fr.jules552.mod.init.Adamantium.ItemSword2;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class SwordAluminium extends ItemSword2 {

	public SwordAluminium(ToolMaterial material, float attackSpeed) {
		super(material, -2.4F);
	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if (repair.getItem() == ItemsMod.aluminium_ingot) {
			return true;
		}
		return false;
	}
}
