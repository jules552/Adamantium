package fr.jules552.mod.proxy;

import fr.jules552.mod.WorldGeneration.GenerationHelper;
import fr.jules552.mod.init.BlocksMod;
import fr.jules552.mod.init.ItemsMod;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public abstract class  CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		
		// Système de Générération
		OreDictionary.registerOre("AdamantiumOre", new ItemStack(BlocksMod.ADAMANTIUM_ORE));
		OreDictionary.registerOre("SilverOre", new ItemStack(BlocksMod.SILVER_ORE));
		OreDictionary.registerOre("AluminiumOre", new ItemStack(BlocksMod.ALUMINIUM_ORE));
		GameRegistry.registerWorldGenerator(new GenerationHelper(), 2);
		
	}
	
	public void init(FMLInitializationEvent event) {
		
		BlocksMod.registerTextRecipies();
		
	}

}
