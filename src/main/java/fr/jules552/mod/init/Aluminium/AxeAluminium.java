package fr.jules552.mod.init.Aluminium;

import java.util.Set;

import com.google.common.collect.Sets;

import fr.jules552.mod.init.ItemsMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

public class AxeAluminium extends ItemTool
{
private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
    
	public AxeAluminium(ToolMaterial material) {
		super(material, EFFECTIVE_ON);
        this.damageVsEntity = material.getDamageVsEntity();
        this.attackSpeed = -3.0F;
	}
	public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
	
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if(repair.getItem() == ItemsMod.aluminium_ingot)
		{
			return true;
		}
		return false;
	}

}
