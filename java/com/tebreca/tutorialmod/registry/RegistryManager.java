package com.tebreca.tutorialmod.registry;

import static com.tebreca.tutorialmod.main.Global.MODID;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.tebreca.tutorialmod.main.Main;

import net.minecraft.util.ResourceLocation;

public class RegistryManager {
	
	@SuppressWarnings("unchecked")
	public static <T extends IEntry> T[] getEntriesSafe(IEntryHolder<T> holder) {
		try{
			return (T[]) getEntries(holder).toArray();
		} catch(IllegalAccessException e) {
			Main.LOGGER.catching(e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends IEntry> List<T> getEntries(IEntryHolder<T> holder) throws IllegalAccessException {
		Class<? extends T> typeClass = holder.getType();

		List<T> entries = new ArrayList<>();
		for (Field field : holder.getClass().getFields()) {
			if (field.getType() == typeClass) {
				T toRegister = (T) field.get(holder);
				((IEntry) toRegister).setRegistryNameForRegistration(new ResourceLocation(MODID, field.getName()));
				entries.add(toRegister);
			}
		}

		return entries;
	}
}
