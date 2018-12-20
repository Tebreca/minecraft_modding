package com.tebreca.tutorialmod.main;

import static com.tebreca.tutorialmod.main.Global.MODID;
import static com.tebreca.tutorialmod.registry.RegistryManager.getEntriesSafe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tebreca.tutorialmod.obj.item.ItemInit;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(MODID)
public class Main {

	public static final Logger LOGGER = LogManager.getLogger(Main.class);

	public Main() {
			MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void onItemRegistry(Register<Item> event) {
		event.getRegistry().registerAll(getEntriesSafe(ItemInit.INSTANCE));
	}
}
