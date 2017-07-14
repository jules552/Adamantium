package fr.jules552.mod.init.Adamantium;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.tools.nsc.doc.model.Public;
import fr.jules552.mod.Adamantium;
import fr.jules552.mod.Reference;
import fr.jules552.mod.init.ItemsMod;

public class ArmorAdamantium extends ItemArmor {
	public ArmorAdamantium(final ArmorMaterial material, final EntityEquipmentSlot equipmentSlotIn, final String armourName) {
		super(material, -1, equipmentSlotIn);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		if (armorType == EntityEquipmentSlot.LEGS)
			return Reference.MOD_ID + ":" + "textures/models/armor/adamantiumarmor_layer_2.png";
		else
			return Reference.MOD_ID + ":" + "textures/models/armor/adamantiumarmor_layer_1.png";
	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if (repair.getItem() == ItemsMod.adamantium_ingot) {
			return true;
		}
		return false;
	}

	@SideOnly(Side.CLIENT)

	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (this.armorType == EntityEquipmentSlot.HEAD) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 210, 0, true, false));
		}
		if (this.armorType == EntityEquipmentSlot.CHEST) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 20, 0, true, false));
			;
		}
		if (this.armorType == EntityEquipmentSlot.LEGS) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 20, 0, true, false));
			;
		}
		if (this.armorType == EntityEquipmentSlot.FEET) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(8), 20, 1, true, false));
			;
		}
		{

		}
	}

}
