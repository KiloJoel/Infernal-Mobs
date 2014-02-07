package com.sirolf2009.necromancy.entity.necroapi;

import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;

import com.sirolf2009.necroapi.BodyPartLocation;
import com.sirolf2009.necroapi.NecroEntityBiped;
import com.sirolf2009.necromancy.item.ItemBodyPart;

public class NecroEntityPigZombie extends NecroEntityBiped
{

    public NecroEntityPigZombie()
    {
        super("Pig Zombie");
        headItem = ItemBodyPart.getItemStackFromName("Pigzombie Head", 1);
        torsoItem = ItemBodyPart.getItemStackFromName("Pigzombie Torso", 1);
        armItem = ItemBodyPart.getItemStackFromName("Pigzombie Arm", 1);
        legItem = ItemBodyPart.getItemStackFromName("Pigzombie Legs", 1);
        texture = new ResourceLocation("textures/entity/zombie_pigman.png");
        textureHeight = 64;
    }

    @Override
    public void initRecipes()
    {
        initDefaultRecipes(Items.cooked_beef);
    }

    @Override
    public void setAttributes(EntityLiving minion, BodyPartLocation location)
    {
        if (location == BodyPartLocation.Head)
        {
            addAttributeMods(minion, "Head", 2.0D, 16.0D, 0D, 0D, 0.0D);
        }
        else if (location == BodyPartLocation.Torso)
        {
            addAttributeMods(minion, "Torso", 12.0D, 0D, 0D, 0D, 0D);
        }
        else if (location == BodyPartLocation.ArmLeft)
        {
            addAttributeMods(minion, "ArmL", 2.0D, 0D, 0D, 0D, 2.5D);
        }
        else if (location == BodyPartLocation.ArmRight)
        {
            addAttributeMods(minion, "ArmR", 2.0D, 0D, 0D, 0D, 2.5D);
        }
        else if (location == BodyPartLocation.Legs)
        {
            addAttributeMods(minion, "Legs", 2.0D, 0D, 0D, 0.5D, 0D);
        }
    }
}
