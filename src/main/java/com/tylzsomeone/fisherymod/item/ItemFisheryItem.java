package com.tylzsomeone.fisherymod.item;

import com.tylzsomeone.fisherymod.FisheryMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ItemFisheryItem extends Item {

    public ItemFisheryItem(String name) {
        setUnlocalizedName(name);
        setCreativeTab(FisheryMod.tabFishery);
        setMaxStackSize(1);

    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("This item is useless right now, yay");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}
