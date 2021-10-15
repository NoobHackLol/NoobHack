package me.awsomemanpop1.noobhack;

import org.lwjgl.input.Keyboard;

import me.awsomemanpop1.noobhack.module.ModuleManager;
import me.awsomemanpop1.noobhack.proxy.CommonProxy;
//import me.awsomemanpop1.noobhack.settings.SettingsManager;
import me.awsomemanpop1.noobhack.ui.Hud;
import me.awsomemanpop1.noobhack.util.Refrence;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
//import me.awsomemanpop1.noobhack.clickgui.ClickGui;
import me.awsomemanpop1.noobhack.module.Module;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION)
public class Main {

//    public SettingsManager settingsManager;
//  public ClickGui clickGui;
	
	public static ModuleManager moduleManager;
	public static Hud hud;

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init (FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(instance);
		MinecraftForge.EVENT_BUS.register(new Hud());
		moduleManager = new ModuleManager();
		hud = new Hud();
		//clickGui = new ClickGui();
		
	}
	
	@EventHandler
	public void PostInit (FMLPreInitializationEvent event) {
		
	}
	
	@SubscribeEvent
	public void key(KeyInputEvent e) {
		if(Minecraft.getMinecraft().world == null || Minecraft.getMinecraft().player == null)
			return;
	try {
		if(Keyboard.isCreated()) {
			if((Keyboard.getEventKeyState())) {
				int keyCode = Keyboard.getEventKey();
				if(keyCode<= 0)
					return;
				for(Module m : moduleManager.modules) {
					if(m.getKey() == keyCode && keyCode > 0) {
						m.toggle();
					}
				}
			}
		}
	} catch(Exception q)  {q.printStackTrace(); }
	}
	
}
