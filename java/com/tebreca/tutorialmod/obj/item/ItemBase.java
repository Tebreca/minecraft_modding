package com.tebreca.tutorialmod.obj.item;

import com.tebreca.tutorialmod.registry.IEntry;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemBase extends Item implements IEntry {

	public ItemBase(Builder properties) {
		super(properties);
	}

	@Override
	public void setRegistryNameForRegistration(ResourceLocation name) {
		this.setRegistryNameForRegistration(name);
	}

}
