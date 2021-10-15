package me.awsomemanpop1.noobhack.module;

import java.util.ArrayList;
import java.util.List;

import me.awsomemanpop1.noobhack.Main;
//import me.awsomemanpop1.noobhack.module.modules.client.ClickGUI;
//import me.awsomemanpop1.noobhack.module.modules.combat.AutoClicker;
import me.awsomemanpop1.noobhack.module.modules.combat.KillAura;
import me.awsomemanpop1.noobhack.module.modules.player.Lmao;
import me.awsomemanpop1.noobhack.module.modules.player.Sprint;
import me.awsomemanpop1.noobhack.module.modules.render.FullBright;

public class ModuleManager {

	public ArrayList<Module> modules;
	
	public ModuleManager() {
		(modules = new ArrayList<Module>()).clear();
		//player
		this.modules.add(new Sprint());
		this.modules.add(new Lmao());
		//combat
		this.modules.add(new KillAura());
	//	this.modules.add(new ClickGUI());
	//	this.modules.add(new AutoClicker());
		//render
		this.modules.add(new FullBright());
	}
	
	public void onUpdate() {
		modules.stream().filter(Module::isToggled).forEach(Module::onUpdate);
	}
	
	public Module getModule (String name) {
		for(Module m : this.modules) {
			if(m.getName().equalsIgnoreCase(name)) {
				return m;
			}
		}
		return null;
	}
	
	public ArrayList<Module> getModuleList() {
		return this.modules;
	}
	
	public static List<Module> getModulesByCategory(Category c) {
		List<Module> modules = new ArrayList<Module>();
		
		for(Module m : Main.moduleManager.modules) {
			if(m.getCategory() == c)
				modules.add(m);
		}
		return modules;
	}
	
}
