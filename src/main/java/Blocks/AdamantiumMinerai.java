package Blocks;

import fr.jules552.mod.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class AdamantiumMinerai extends Block {

	public AdamantiumMinerai(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 2);
	}


}
