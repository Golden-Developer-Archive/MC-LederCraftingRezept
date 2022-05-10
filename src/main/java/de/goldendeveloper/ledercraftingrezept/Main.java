package de.goldendeveloper.ledercraftingrezept;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemStack leder = new ItemStack(Material.LEATHER);
        ItemMeta ledermeter = leder.getItemMeta();
        leder.setItemMeta(ledermeter);
        ShapedRecipe lederrezept = new ShapedRecipe(leder);
        lederrezept.shape("FNF", "FFF", "FFF");
        lederrezept.setIngredient('F', Material.ROTTEN_FLESH);
        Bukkit.addRecipe(lederrezept);
    }

    @Override
    public void onDisable() {
    }
}
