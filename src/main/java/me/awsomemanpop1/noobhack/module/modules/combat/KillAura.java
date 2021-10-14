package me.awsomemanpop1.noobhack.module.modules.combat;

import me.awsomemanpop1.noobhack.module.Module;
import net.minecraft.client.Minecraft;

import org.lwjgl.input.Keyboard;

import me.awsomemanpop1.noobhack.module.Category;

public class KillAura extends Module {
	
	public KillAura() {
		super("KillAura", "kills stuff", Category.COMBAT);
		this.setKey(Keyboard.KEY_K);
		toggled = true;
	}
	@Override
	public void onEnable() {
		if (Minecraft.getMinecraft().player != null)
			Minecraft.getMinecraft().player.sendChatMessage("holy crap, im trying to kill aura");
	
}
	@Override
	public void onDisable() {
		if (Minecraft.getMinecraft().player != null)
			Minecraft.getMinecraft().player.sendChatMessage("holy crap, I'm stupid");
	}
}
