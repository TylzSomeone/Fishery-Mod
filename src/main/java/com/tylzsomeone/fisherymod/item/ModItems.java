package com.tylzsomeone.fisherymod.item;

import com.tylzsomeone.fisherymod.FisheryMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item fisheryItem;

    public static void preInit() {

        fisheryItem = new ItemFisheryItem("fishery_item");

        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(fisheryItem, new ResourceLocation(FisheryMod.MODID, "fishery_item"));
    }

    public static void registerRenders() {
        registerRender(fisheryItem);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(FisheryMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
//adding a comment to test