package Blocks;

import fr.jules552.mod.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockAluminium extends Block {

	public BlockAluminium(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 1);
		this.setSoundType(blockSoundType.METAL);
		
	}
	
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
		return this == BlocksMod.ALUMINIUM_BLOCK;
	}

}
