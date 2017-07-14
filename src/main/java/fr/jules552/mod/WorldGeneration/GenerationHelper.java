package fr.jules552.mod.WorldGeneration;

import java.util.Random;

import fr.jules552.mod.init.BlocksMod;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GenerationHelper implements IWorldGenerator

{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, net.minecraft.world.gen.IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) 
	
	{
		if (world.provider.getDimension() == -1){
			return;
		}
		
		if (world.provider.getDimension() == 0){
			this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
			this.generateSurface1(world, random, chunkX * 16, chunkZ * 16);
			this.generateSurface2(world, random, chunkX * 16, chunkZ * 16);
		}
		
		if (world.provider.getDimension() == 1){
			return;
		}
		
	}
	
	private void generateSurface (World world, Random random, int chunkX, int chunkZ) 
	{
		for (int k = 0; k < 1 /*SpawnChance*/; k++){
			BlockPos pos = new BlockPos (chunkX + random.nextInt(16), random.nextInt(12)/*Couche de généation*/, chunkZ + random.nextInt(16) );
			
			new WorldGenMinable(BlocksMod.ADAMANTIUM_ORE.getDefaultState(), 3 /*Filon Maximale*/).generate(world, random, pos); 
			}
			
		}
		
		private void generateSurface1 (World world, Random random, int chunkX, int chunkZ) 
		{
			for (int k = 0; k < 8 /*SpawnChance*/; k++){
				BlockPos pos = new BlockPos (chunkX + random.nextInt(16), random.nextInt(48)/*Couche de généation*/, chunkZ + random.nextInt(16) );
				
				new WorldGenMinable(BlocksMod.SILVER_ORE.getDefaultState(), 6 /*Filon Maximale*/).generate(world, random, pos);
			}
				
			}
			
			private void generateSurface2 (World world, Random random, int chunkX, int chunkZ) 
			{
				for (int k = 0; k < 8 /*SpawnChance*/; k++){
					BlockPos pos = new BlockPos (chunkX + random.nextInt(16), random.nextInt(48)/*Couche de généation*/, chunkZ + random.nextInt(16) );
					
					new WorldGenMinable(BlocksMod.ALUMINIUM_ORE.getDefaultState(), 6 /*Filon Maximale*/).generate(world, random, pos);
					
				}
		
		
	}
			
			

}
