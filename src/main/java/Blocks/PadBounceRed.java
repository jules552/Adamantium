package Blocks;

import java.util.Random;

import javax.annotation.Nullable;

import fr.jules552.mod.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab.EnumBlockHalf;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PadBounceRed extends BlockBreakable{
	
	protected static final AxisAlignedBB BOUNCE_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
	
	public PadBounceRed() {
		super(Material.CLAY, false, MapColor.GRASS);
		this.blockSoundType = blockSoundType.SLIME;
		this.translucent = true;
	}
	
	 @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.TRANSLUCENT;
	    }

	   
	    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
	    {
	            entityIn.fall(fallDistance, 0.0F);  
	    }

	   
	    public void onLanded(World worldIn, Entity entityIn)
	    { 
	            entityIn.motionY = 2.0D+entityIn.motionY; 
	    }
	    
	    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	        return BOUNCE_AABB;
	     }
	     
	    
	    public boolean isOpaqueCube(IBlockState state)
	    {
	        return false;
	    }
	    
	    @SideOnly(Side.CLIENT)
	    public float getAmbientOcclusionLightValue(IBlockState state)
	    {
	        return 1.0F;
	    }
	    
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return Item.getItemFromBlock(BlocksMod.BOUNCE_PAD_RED);
	    }
	    
	    
	      
}
