package me.awsomemanpop1.noobhack.module;

import net.minecraftforge.common.MinecraftForge;

public class Module {
	
	public String name, description;
	private int key;
	private Category category;
	public boolean toggled;
	public boolean visible = true;
	
	
	public Module(String name, String description, Category category) {
	super();
	this.name = name;
	this.description = description;
	this.key = 0;
	this.category = category;
	this.toggled = false;

	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getKey()  {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public boolean isToggled() {
		return toggled;
	}
	
	protected void enable() {
		onEnable();
		setToggled(true);
	}
	
	protected void disable() {
		onDisable();
		setToggled(false);
	}
	
	public void setToggled(boolean toggled) {
		this.toggled = toggled;
		
		if(this.toggled) {
			this.onEnable();
		}else {
			this.onDisable();
	
		}
	}
	
	public void toggle() {
		this.toggled = !this.toggled;
		
		if(this.toggled) {
			this.onEnable();
		}else {
			this.onDisable();
		}
	}
	
	public void onEnable() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	public void onDisable() {
		MinecraftForge.EVENT_BUS.unregister(this);
	}

	public void onUpdate() {
		
	}
	public String getName() {
		return this.name;
	}
	
	public Category getCategory() {
		return this.category;
	}
}
