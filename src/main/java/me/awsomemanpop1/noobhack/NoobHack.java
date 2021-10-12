package me.awsomemanpop1.noobhack;

import me.awsomemanpop1.noobhack.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = me.awsomemanpop1.noobhack.util.Refrence.MOD_ID, name = me.awsomemanpop1.noobhack.util.Refrence.NAME, version = me.awsomemanpop1.noobhack.util.Refrence.VERSION)
public class NoobHack {

	@Instance
	public NoobHack instance;
	
	@SidedProxy(clientSide = me.awsomemanpop1.noobhack.util.Refrence.CLIENT_PROXY_CLASS, serverSide = me.awsomemanpop1.noobhack.util.Refrence.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init (FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(instance);
		
	}
	
	@EventHandler
	public void PostInit (FMLPreInitializationEvent event) {
		
	}
}	
