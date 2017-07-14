package Blocks;

import javax.annotation.Nullable;

import fr.jules552.mod.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LumineuxBlock extends Block {

	public LumineuxBlock(Material materialIn) {
		super(materialIn);
		this.setBlockUnbreakable();
		this.setLightOpacity(0);
		this.setResistance(6000001.0F);
		this.translucent = true;

	}
	 public EnumBlockRenderType getRenderType(IBlockState state)
	    {
	        return EnumBlockRenderType.INVISIBLE;
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
	    
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }
	    
}
