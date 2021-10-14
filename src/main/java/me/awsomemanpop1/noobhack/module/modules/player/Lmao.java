package me.awsomemanpop1.noobhack.module.modules.player;

import me.awsomemanpop1.noobhack.module.Module;

import org.lwjgl.input.Keyboard;

import me.awsomemanpop1.noobhack.module.Category;

public class Lmao extends Module {
	
	public Lmao() {
		super("Lmao", "lol", Category.PLAYER);
		this.setKey(Keyboard.KEY_B);
		toggled = false;
	}
	
}
