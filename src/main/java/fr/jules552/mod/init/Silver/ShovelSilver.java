package fr.jules552.mod.init.Silver;

import fr.jules552.mod.init.ItemsMod;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ShovelSilver extends ItemSpade {

	public ShovelSilver(ToolMaterial material) {
		super(material);

	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if (repair.getItem() == ItemsMod.silver_ingot) {
			return true;
		}
		return false;
	}

}
