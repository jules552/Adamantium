package fr.jules552.mod.init;

import com.jcraft.jorbis.Block;

import fr.jules552.mod.Reference;
import fr.jules552.mod.init.Adamantium.ArmorAdamantium;
import fr.jules552.mod.init.Adamantium.AxeAdamantium;
import fr.jules552.mod.init.Adamantium.PickaxeAdamantium;
import fr.jules552.mod.init.Adamantium.ShovelAdamantium;
import fr.jules552.mod.init.Adamantium.ItemSword2;
import fr.jules552.mod.init.Adamantium.SwordAdamantium;
import fr.jules552.mod.init.Aluminium.ArmorAluminium;
import fr.jules552.mod.init.Aluminium.AxeAluminium;
import fr.jules552.mod.init.Aluminium.PickaxeAluminium;
import fr.jules552.mod.init.Aluminium.ShovelAluminium;
import fr.jules552.mod.init.Aluminium.SwordAluminium;
import fr.jules552.mod.init.CreativesTabs.AdamantiumCreativeTabs;
import fr.jules552.mod.init.Silver.ArmorSilver;
import fr.jules552.mod.init.Silver.AxeSilver;
import fr.jules552.mod.init.Silver.PickaxeSilver;
import fr.jules552.mod.init.Silver.ShovelSilver;
import fr.jules552.mod.init.Silver.SwordSilver;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber(modid = Reference.MOD_ID)

public class ItemsMod 
{
	//Nouveaux Matériaux

	public static ToolMaterial AdamantiumPick = EnumHelper.addToolMaterial("AdamantiumPick", 3, 2002, 15.0F, 3.0F, 11);
	public static ToolMaterial AdamantiumSwo = EnumHelper.addToolMaterial("AdamantiumSwo", 3, 2002, 15.0F, 5.0F, 11);
	public static ToolMaterial AdamantiumSho = EnumHelper.addToolMaterial("AdamantiumSho", 3, 2002, 15.0F, 2.0F, 11);
	public static ToolMaterial AdamantiumAx = EnumHelper.addToolMaterial("AdamantiumAx", 3, 2002, 15.0F, 7.0F, 11);
	public static ArmorMaterial AdamantiumArmor = EnumHelper.addArmorMaterial("AdamantiumArmor", "AdamantiumArmor", 50, new int[]{4, 7, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static ArmorMaterial SilverArmor = EnumHelper.addArmorMaterial("SilverArmor", "SilverArmor", 15, new int[]{2, 4, 5, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static ToolMaterial SilverPick = EnumHelper.addToolMaterial("SilverPick", 3, 196, 7.0F, 1.0F, 18);
	public static ToolMaterial SilverSwo = EnumHelper.addToolMaterial("SilverSwo", 3, 196, 15.0F, 1.5F, 18);
	public static ToolMaterial SilverSho = EnumHelper.addToolMaterial("SilverSho", 3, 196, 7.0F, 1.0F, 18);
	public static ToolMaterial SilverAx = EnumHelper.addToolMaterial("SilverAx", 3, 196, 5.0F, 1.0F, 18);
	public static ToolMaterial AluminiumPick = EnumHelper.addToolMaterial("AluminiumPick", 3, 225, 8.0F, 0.5F, 16);
	public static ToolMaterial AluminiumSwo = EnumHelper.addToolMaterial("AluminiumSwo", 3, 225, 15.0F, 1.0F, 16);
	public static ToolMaterial AluminiumSho = EnumHelper.addToolMaterial("AluminiumSho", 3, 225, 8.0F, 0.5F, 16);
	public static ToolMaterial AluminiumAx = EnumHelper.addToolMaterial("AluminiumAx", 3, 225, 6.0F, 0.5F, 16);
	public static ArmorMaterial AluminiumArmor = EnumHelper.addArmorMaterial("AluminiumArmor", "AluminiumArmor", 15, new int[]{2, 4, 4, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	
	
	
	//CreativeTabs
	public static CreativeTabs tabCustomTab = new AdamantiumCreativeTabs();
	
	//Les Items
	
	public static Item adamantium_ingot, adamantium_pickaxe, adamantium_sword, adamantium_shovel, adamantium_axe, adamantium_helmet, adamantium_chestplate, adamantium_leggings, adamantium_boots;
	public static Item silver_ingot, silver_helmet,silver_chestplate,silver_leggings,silver_boots, silver_pickaxe, silver_sword, silver_shovel, silver_axe;
	public static Item aluminium_ingot, aluminium_pickaxe, aluminium_sword, aluminium_shovel, aluminium_axe, aluminium_helmet, aluminium_chestplate, aluminium_leggings, aluminium_boots;
  
	
	static 
	{
		
		//Adamantium
		adamantium_ingot = new Item().setUnlocalizedName("adamantium_ingot").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("adamantium_ingot");
		adamantium_pickaxe = new PickaxeAdamantium(AdamantiumPick).setUnlocalizedName("adamantium_pickaxe").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("adamantium_pickaxe");
		adamantium_sword = new SwordAdamantium(AdamantiumSwo, 0).setUnlocalizedName("adamantium_sword").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("admantium_sword");
		adamantium_shovel = new ShovelAdamantium(AdamantiumSho).setUnlocalizedName("adamantium_shovel").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("adamantium_shovel");
		adamantium_axe = new AxeAdamantium(AdamantiumAx).setUnlocalizedName("adamantium_axe").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("adamantium_axe");
		adamantium_helmet = new ArmorAdamantium(AdamantiumArmor, EntityEquipmentSlot.HEAD, "adamantium_helmet").setUnlocalizedName("adamantium_helmet").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("adamantium_helmet");
		adamantium_chestplate = new ArmorAdamantium(AdamantiumArmor, EntityEquipmentSlot.CHEST, "adamantium_chestplate").setUnlocalizedName("adamantium_chestplate").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("adamantium_chestplate");
		adamantium_leggings = new ArmorAdamantium(AdamantiumArmor, EntityEquipmentSlot.LEGS, "adamantium_leggings").setUnlocalizedName("adamantium_leggings").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("adamantium_leggings");
		adamantium_boots = new ArmorAdamantium(AdamantiumArmor, EntityEquipmentSlot.FEET, "adamantium_boots").setUnlocalizedName("adamantium_boots").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("adamantium_boots");
		
		//Silver
		silver_ingot = new Item().setUnlocalizedName("silver_ingot").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_ingot");
		silver_helmet = new ArmorSilver(SilverArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("silver_helmet").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_helmet");
		silver_chestplate = new ArmorSilver(SilverArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("silver_chestplate").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_chestplate");
		silver_leggings = new ArmorSilver(SilverArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("silver_leggings").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_leggings");
		silver_boots = new ArmorSilver(SilverArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("silver_boots").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_boots");
		silver_pickaxe = new PickaxeSilver(SilverPick).setUnlocalizedName("silver_pickaxe").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_pickaxe");
		silver_sword = new SwordSilver(SilverSwo, 0).setUnlocalizedName("silver_sword").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_sword");
		silver_shovel = new ShovelSilver(SilverSho).setUnlocalizedName("silver_shovel").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_shovel");
		silver_axe = new AxeSilver(SilverAx).setUnlocalizedName("silver_axe").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("silver_axe");
		
		
			
		//Aluminium
		aluminium_ingot = new Item().setUnlocalizedName("aluminium_ingot").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_ingot");
		aluminium_pickaxe = new PickaxeAluminium(AluminiumPick).setUnlocalizedName("aluminium_pickaxe").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_pickaxe");
		aluminium_sword = new SwordAluminium(AluminiumSwo, 0).setUnlocalizedName("aluminium_sword").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_sword");
		aluminium_shovel = new ShovelAluminium(AluminiumSho).setUnlocalizedName("aluminium_shovel").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_shovel");
		aluminium_axe = new AxeAluminium(AluminiumAx).setUnlocalizedName("aluminium_axe").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_axe");
		aluminium_helmet = new ArmorAluminium(AluminiumArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("aluminium_helmet").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_helmet");
		aluminium_chestplate = new ArmorAluminium(AluminiumArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("aluminium_chestplate").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_chestplate");
		aluminium_leggings = new ArmorAluminium(AluminiumArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("aluminium_leggings").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_leggings");
	    aluminium_boots = new ArmorAluminium(AluminiumArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("aluminium_boots").setCreativeTab(ItemsMod.tabCustomTab).setRegistryName("aluminium_boots");
	    
	}
	
	
	
	@SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event)
    {
		   event.getRegistry().register(ItemsMod.adamantium_axe);
		   event.getRegistry().register(ItemsMod.adamantium_pickaxe);
		   event.getRegistry().register(ItemsMod.adamantium_shovel);
		   event.getRegistry().register(ItemsMod.adamantium_sword);
		   event.getRegistry().register(ItemsMod.adamantium_ingot);
		   event.getRegistry().register(ItemsMod.adamantium_helmet);
		   event.getRegistry().register(ItemsMod.adamantium_chestplate);
		   event.getRegistry().register(ItemsMod.adamantium_leggings);
		   event.getRegistry().register(ItemsMod.adamantium_boots);
		   
		   event.getRegistry().register(ItemsMod.silver_axe);
		   event.getRegistry().register(ItemsMod.silver_pickaxe);
		   event.getRegistry().register(ItemsMod.silver_shovel);
		   event.getRegistry().register(ItemsMod.silver_sword);
		   event.getRegistry().register(ItemsMod.silver_ingot);
		   event.getRegistry().register(ItemsMod.silver_helmet);
		   event.getRegistry().register(ItemsMod.silver_chestplate);
		   event.getRegistry().register(ItemsMod.silver_leggings);
		   event.getRegistry().register(ItemsMod.silver_boots);
		   
		   event.getRegistry().register(ItemsMod.aluminium_axe);
		   event.getRegistry().register(ItemsMod.aluminium_pickaxe);
		   event.getRegistry().register(ItemsMod.aluminium_shovel);
		   event.getRegistry().register(ItemsMod.aluminium_sword);
		   event.getRegistry().register(ItemsMod.aluminium_ingot);
		   event.getRegistry().register(ItemsMod.aluminium_helmet);
		   event.getRegistry().register(ItemsMod.aluminium_chestplate);
		   event.getRegistry().register(ItemsMod.aluminium_leggings);
		   event.getRegistry().register(ItemsMod.aluminium_boots);
    }
	
	
	
	public static void registerRenders()
	{
			
		//Renders Adamantium
		registerRender(adamantium_ingot);
		registerRender(adamantium_pickaxe);
		registerRender(adamantium_sword);
		registerRender(adamantium_shovel);
		registerRender(adamantium_axe);
		registerRender(adamantium_helmet);
		registerRender(adamantium_chestplate);
		registerRender(adamantium_leggings);
		registerRender(adamantium_boots);
		
		//Renders Silver
		registerRender(silver_ingot);
		registerRender(silver_helmet);
		registerRender(silver_chestplate);
		registerRender(silver_leggings);
		registerRender(silver_boots);
		registerRender(silver_pickaxe);
		registerRender(silver_sword);
		registerRender(silver_shovel);
		registerRender(silver_axe);
		
		//Renders Aluminium
		registerRender(aluminium_ingot);
		registerRender(aluminium_pickaxe);
		registerRender(aluminium_sword);
		registerRender(aluminium_shovel);
		registerRender(aluminium_axe);
		registerRender(aluminium_helmet);
		registerRender(aluminium_chestplate);
		registerRender(aluminium_leggings);
		registerRender(aluminium_boots);
		
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation (item, 0, new ModelResourceLocation (item.getRegistryName(), "inventory"));
	}

}