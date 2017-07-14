package Blocks;

import fr.jules552.mod.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockAdamantium extends Block{

	public BlockAdamantium(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 2);
		this.setSoundType(blockSoundType.METAL);
		
	}

	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
		return this == BlocksMod.ADAMANTIUM_BLOCK;
	}
}
