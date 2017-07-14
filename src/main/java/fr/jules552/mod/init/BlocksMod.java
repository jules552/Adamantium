package fr.jules552.mod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Blocks.AdamantiumMinerai;
import Blocks.AluminiumMinerai;
import Blocks.BlockAdamantium;
import Blocks.BlockAluminium;
import Blocks.BlockSilver;
import Blocks.BlockXray;
import Blocks.LumineuxBlock;
import Blocks.PadBounceBlue;
import Blocks.PadBounceGreen;
import Blocks.PadBounceRed;
import Blocks.SilverMinerai;
import Blocks.SpikeBlock;
import fr.jules552.mod.Reference;

@EventBusSubscriber(modid = Reference.MOD_ID)

public class BlocksMod 
{
	
	public static final Block ADAMANTIUM_BLOCK = new BlockAdamantium(Material.IRON).setRegistryName("adamantium_block").setCreativeTab(ItemsMod.tabCustomTab).setHardness(5.0F).setUnlocalizedName("adamantium_block");
	public static final Block ADAMANTIUM_ORE = new AdamantiumMinerai(Material.ROCK).setRegistryName("adamantium_ore").setCreativeTab(ItemsMod.tabCustomTab).setHardness(5.0F).setUnlocalizedName("adamantium_ore");
	public static final Block SILVER_BLOCK = new BlockSilver(Material.IRON).setRegistryName("silver_block").setCreativeTab(ItemsMod.tabCustomTab).setHardness(5.0F).setUnlocalizedName("silver_block");
	public static final Block SILVER_ORE = new SilverMinerai(Material.ROCK).setRegistryName("silver_ore").setCreativeTab(ItemsMod.tabCustomTab).setHardness(5.0F).setUnlocalizedName("silver_ore");
	public static final Block ALUMINIUM_BLOCK = new BlockAluminium(Material.ROCK).setRegistryName("aluminium_block").setCreativeTab(ItemsMod.tabCustomTab).setHardness(5.0F).setUnlocalizedName("aluminium_block");
	public static final Block ALUMINIUM_ORE = new AluminiumMinerai(Material.ROCK).setRegistryName("aluminium_ore").setCreativeTab(ItemsMod.tabCustomTab).setHardness(5.0F).setUnlocalizedName("aluminium_ore");
	public static final Block LIGHT_BLOCK = new LumineuxBlock(Material.WEB).setRegistryName("light_block").setCreativeTab(ItemsMod.tabCustomTab).setBlockUnbreakable().setLightLevel(1.0F).setUnlocalizedName("light_block");
	public static final Block XRAY_BLOCK = new BlockXray(Material.GLASS).setRegistryName("xray_block").setCreativeTab(ItemsMod.tabCustomTab).setHardness(5.0F).setUnlocalizedName("xray_block");
	public static final Block BOUNCE_PAD_RED = new PadBounceRed().setRegistryName("bounce_pad_red").setCreativeTab(ItemsMod.tabCustomTab).setHardness(0.0F).setUnlocalizedName("bounce_pad_red");
	public static final Block BOUNCE_PAD_BLUE = new PadBounceBlue().setRegistryName("bounce_pad_blue").setCreativeTab(ItemsMod.tabCustomTab).setHardness(0.0F).setUnlocalizedName("bounce_pad_blue");
	public static final Block BOUNCE_PAD_GREEN = new PadBounceGreen().setRegistryName("bounce_pad_green").setCreativeTab(ItemsMod.tabCustomTab).setHardness(0.0F).setUnlocalizedName("bounce_pad_green");
	public static final Block SPIKE_BLOCK = new SpikeBlock(Material.CLAY).setRegistryName("spike_block").setCreativeTab(ItemsMod.tabCustomTab).setHardness(0.0F).setUnlocalizedName("spike_block");

	
	   
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(BlocksMod.ADAMANTIUM_BLOCK);
        event.getRegistry().register(BlocksMod.ADAMANTIUM_ORE);
        event.getRegistry().register(BlocksMod.SILVER_BLOCK);
        event.getRegistry().register(BlocksMod.SILVER_ORE);
        event.getRegistry().register(BlocksMod.ALUMINIUM_BLOCK);
        event.getRegistry().register(BlocksMod.ALUMINIUM_ORE);
        event.getRegistry().register(BlocksMod.LIGHT_BLOCK);
        event.getRegistry().register(BlocksMod.XRAY_BLOCK);
        event.getRegistry().register(BlocksMod.BOUNCE_PAD_GREEN);
        event.getRegistry().register(BlocksMod.BOUNCE_PAD_BLUE);
        event.getRegistry().register(BlocksMod.BOUNCE_PAD_RED);
        event.getRegistry().register(BlocksMod.SPIKE_BLOCK);
    }

	
	public static void registerTextRecipies()
	{
		//Les Crafts
		
		//Crafts pour Adamantium
		GameRegistry.addSmelting(BlocksMod.ADAMANTIUM_ORE, new ItemStack(ItemsMod.adamantium_ingot), 1.8F);
		
		//Crafts pour Silver
		GameRegistry.addSmelting(BlocksMod.SILVER_ORE, new ItemStack(ItemsMod.silver_ingot), 0.8F);
		
		
		//Crafts pour Aluminium
		GameRegistry.addSmelting(BlocksMod.ALUMINIUM_ORE, new ItemStack(ItemsMod.aluminium_ingot), 0.7F);
		
	}
	
	@SideOnly (Side.CLIENT)
	 public static void registerItemBlockModels (){
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (ADAMANTIUM_BLOCK), 0, new ModelResourceLocation (Reference.MOD_ID+":adamantium_block", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (ADAMANTIUM_ORE), 0, new ModelResourceLocation (Reference.MOD_ID+":adamantium_ore", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (SILVER_BLOCK), 0, new ModelResourceLocation (Reference.MOD_ID+":silver_block", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (SILVER_ORE), 0, new ModelResourceLocation (Reference.MOD_ID+":silver_ore", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (ALUMINIUM_BLOCK), 0, new ModelResourceLocation (Reference.MOD_ID+":aluminium_block", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (ALUMINIUM_ORE), 0, new ModelResourceLocation (Reference.MOD_ID+":aluminium_ore", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (LIGHT_BLOCK), 0, new ModelResourceLocation (Reference.MOD_ID+":light_block", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (XRAY_BLOCK), 0, new ModelResourceLocation (Reference.MOD_ID+":xray_block", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (BOUNCE_PAD_RED), 0, new ModelResourceLocation (Reference.MOD_ID+":bounce_pad_red", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (BOUNCE_PAD_BLUE), 0, new ModelResourceLocation (Reference.MOD_ID+":bounce_pad_blue", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (BOUNCE_PAD_GREEN), 0, new ModelResourceLocation (Reference.MOD_ID+":bounce_pad_green", "inventory"));
	  ModelLoader.setCustomModelResourceLocation (Item.getItemFromBlock (SPIKE_BLOCK), 0, new ModelResourceLocation (Reference.MOD_ID+":spike_block", "inventory"));
	 }
	
	 @SubscribeEvent
	    public static void registerItemBlock(RegistryEvent.Register<Item> event)
	    {
		 event.getRegistry().register(new ItemBlock(BlocksMod.ADAMANTIUM_BLOCK).setRegistryName("adamantium_block"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.ADAMANTIUM_ORE).setRegistryName("adamantium_ore"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.SILVER_BLOCK).setRegistryName("silver_block"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.SILVER_ORE).setRegistryName("silver_ore"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.ALUMINIUM_BLOCK).setRegistryName("aluminium_block"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.ALUMINIUM_ORE).setRegistryName("aluminium_ore"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.LIGHT_BLOCK).setRegistryName("light_block"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.XRAY_BLOCK).setRegistryName("xray_block"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.BOUNCE_PAD_GREEN).setRegistryName("bounce_pad_green"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.BOUNCE_PAD_BLUE).setRegistryName("bounce_pad_blue"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.BOUNCE_PAD_RED).setRegistryName("bounce_pad_red"));
	    	event.getRegistry().register(new ItemBlock(BlocksMod.SPIKE_BLOCK).setRegistryName("spike_block"));
	        
	        
	    }

}
