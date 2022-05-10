package de.zrazzer.collincrafting;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new RecipeLoader().registerRecipes();

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new RecipeLoader(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
