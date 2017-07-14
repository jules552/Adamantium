package fr.jules552.mod.proxy;

import fr.jules552.mod.init.ItemsMod;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import fr.jules552.mod.init.BlocksMod;

public class ClientProxy extends CommonProxy {

	@Override
public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		BlocksMod.registerItemBlockModels();
		ItemsMod.registerRenders();
		
		
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		
		
	}
		
}


