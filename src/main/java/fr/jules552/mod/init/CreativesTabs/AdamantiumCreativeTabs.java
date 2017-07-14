package fr.jules552.mod.init.CreativesTabs;

import fr.jules552.mod.init.BlocksMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AdamantiumCreativeTabs extends CreativeTabs {

	public AdamantiumCreativeTabs() {
		super("Adamantium");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlocksMod.ADAMANTIUM_BLOCK));
	}

}
