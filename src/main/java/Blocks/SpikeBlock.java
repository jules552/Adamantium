package Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SpikeBlock extends Block{

	protected static final AxisAlignedBB BOUNCE_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
	
	public SpikeBlock(Material materialIn) {
		super(materialIn);
		this.blockSoundType = blockSoundType.METAL;
		this.translucent = false;
	}

	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {    
        entityIn.attackEntityFrom(DamageSource.CACTUS, 2.0F);     
        super.onEntityWalk(worldIn, pos, entityIn);
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
}