package com.tebreca.tutorialmod.obj.item;

import com.tebreca.tutorialmod.registry.IEntryHolder;

import net.minecraft.item.Item.Builder;

public class ItemInit implements IEntryHolder<ItemBase>{
	
	public static final IEntryHolder<ItemBase> INSTANCE = new ItemInit();

	public final ItemBase item1 = new ItemBase(new Builder());
	
	@Override
	public Class<ItemBase> getType() {
		return ItemBase.class;
	}

	@Override
	public IEntryHolder<ItemBase> getInstance() {
		return INSTANCE;
	}

}
