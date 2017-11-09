package com.tylzsomeone.fisherymod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabFishery extends CreativeTabs {

    public CreativeTabFishery(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.ARROW; //this is the item icon for the creative tab
    }
}
