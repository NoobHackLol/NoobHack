package me.awsomemanpop1.noobhack.module.modules.render;

import me.awsomemanpop1.noobhack.module.Module;
import net.minecraft.client.Minecraft;

import org.lwjgl.input.Keyboard;

import me.awsomemanpop1.noobhack.module.Category;

public class FullBright extends Module {
	private transient float nativeGamma;

	
	public FullBright() {
		super("FullBright", "lol", Category.RENDER);
		this.setKey(Keyboard.KEY_J);
		toggled = false;
	}

	@Override
	public void onEnable() {
		nativeGamma = Minecraft.getMinecraft().gameSettings.gammaSetting;
		Minecraft.getMinecraft().gameSettings.gammaSetting = 8f;
	}

	@Override
	public void onDisable() {
		if (nativeGamma < 1.0) // if game has closed with Full Bright enabled, the gamma will be ducked up
			Minecraft.getMinecraft().gameSettings.gammaSetting = nativeGamma;
		else
			Minecraft.getMinecraft().gameSettings.gammaSetting = 0.5f;
	
	}
}
