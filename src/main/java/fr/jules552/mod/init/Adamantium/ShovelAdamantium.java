package fr.jules552.mod.init.Adamantium;

import fr.jules552.mod.init.ItemsMod;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ShovelAdamantium extends ItemSpade {

	public ShovelAdamantium(ToolMaterial material) {
		super(material);
	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if (repair.getItem() == ItemsMod.adamantium_ingot) {
			return true;
		}
		return false;
	}

}
