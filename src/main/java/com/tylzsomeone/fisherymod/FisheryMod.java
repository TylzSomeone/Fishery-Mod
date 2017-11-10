package com.tylzsomeone.fisherymod;

import com.tylzsomeone.fisherymod.item.ModItems;
import com.tylzsomeone.fisherymod.proxy.CommonProxy;
import com.tylzsomeone.fisherymod.tab.CreativeTabFishery;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FisheryMod.MODID, version = FisheryMod.VERSION, name = FisheryMod.NAME) /*Specifies this is a mod for forge to load*/
public class FisheryMod {
    public static final String MODID = "fisherymod";
    public static final String VERSION = "0.0.2";
    public static final String NAME = "Fishery Mod";

    @SidedProxy(clientSide = "com.tylzsomeone.fisherymod.proxy.ClientProxy", serverSide = "com.tylzsomeone.fisherymod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static FisheryMod instance;

    public static CreativeTabFishery tabFishery;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabFishery = new CreativeTabFishery(CreativeTabs.getNextID(), "tab_fishery");
        ModItems.preInit();
        proxy.preInit(event);
        System.out.println("Something smells fishy...");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)    {
        proxy.init(event);
        System.out.println("Must be the fish...");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }
}
