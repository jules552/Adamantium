package fr.jules552.mod.init.Aluminium;

import fr.jules552.mod.init.ItemsMod;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ShovelAluminium extends ItemSpade {

	public ShovelAluminium(ToolMaterial material) {
		super(material);
	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if (repair.getItem() == ItemsMod.aluminium_ingot) {
			return true;
		}
		return false;
	}

}
