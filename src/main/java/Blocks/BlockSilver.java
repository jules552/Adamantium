package Blocks;

import fr.jules552.mod.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockSilver extends Block {

	public BlockSilver(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 1);
		this.setSoundType(blockSoundType.METAL);
	}
	
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
		return this == BlocksMod.SILVER_BLOCK;
	}

}
