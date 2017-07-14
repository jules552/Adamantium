package fr.jules552.mod.init.Aluminium;

import java.util.List;

import fr.jules552.mod.Reference;
import fr.jules552.mod.init.ItemsMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorAluminium extends ItemArmor {

	public ArmorAluminium(ArmorMaterial material, EntityEquipmentSlot armorType) {
		super(material, 0, armorType);

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		if (armorType == EntityEquipmentSlot.LEGS)
			return Reference.MOD_ID + ":" + "textures/models/armor/aluminiumarmor_layer_2.png";
		else
			return Reference.MOD_ID + ":" + "textures/models/armor/aluminiumarmor_layer_1.png";
	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		if (repair.getItem() == ItemsMod.aluminium_ingot) {
			return true;
		}
		return false;
	}

}
