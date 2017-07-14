package Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import fr.jules552.mod.init.BlocksMod;

public class BlockXray extends Block {

	public BlockXray(Material materialIn) {
		super(materialIn);
		this.translucent = true;
		
	}
	
	  public boolean isOpaqueCube(IBlockState state)
	    {
	        return true;
	    }
	  
	  public boolean isFullBlock(IBlockState state)
	    {
	        return false;
	    }
	  
	  @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT;
	    }
	  
	  @SideOnly(Side.CLIENT)
	    public float getAmbientOcclusionLightValue(IBlockState state)
	    {
	        return 1.0F;
	    }
	 
	 
}
