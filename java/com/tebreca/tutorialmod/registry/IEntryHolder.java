package com.tebreca.tutorialmod.registry;

public interface IEntryHolder<T extends IEntry> {
	Class<? extends T> getType();
	
	IEntryHolder<T> getInstance();
	
}
