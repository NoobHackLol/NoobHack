package me.awsomemanpop1.noobhack.module.modules.player;

import me.awsomemanpop1.noobhack.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import org.lwjgl.input.Keyboard;

import me.awsomemanpop1.noobhack.module.Category;

public class Sprint extends Module {
	
	public Sprint() {
		super("Sprint", "auto spint when you hold w", Category.PLAYER);
		this.setKey(Keyboard.KEY_M);
		toggled = false;
	}
	
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent e) {
		KeyBinding.setKeyBindState(Minecraft.getMinecraft().gameSettings.keyBindSprint.getKeyCode(), true);
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		KeyBinding.setKeyBindState(Minecraft.getMinecraft().gameSettings.keyBindSprint.getKeyCode(), false);
	}
				}




	
	

