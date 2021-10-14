package me.awsomemanpop1.noobhack.module.modules.player;

import me.awsomemanpop1.noobhack.module.Module;

import org.lwjgl.input.Keyboard;

import me.awsomemanpop1.noobhack.module.Category;

public class Sprint extends Module {
	
	public Sprint() {
		super("Sprint", "auto spint when you hold w", Category.PLAYER);
		this.setKey(Keyboard.KEY_M);
		toggled = true;
	}
	
	
}
