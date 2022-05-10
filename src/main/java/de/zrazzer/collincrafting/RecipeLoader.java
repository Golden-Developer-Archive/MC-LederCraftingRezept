package de.zrazzer.collincrafting;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class RecipeLoader implements Listener {

    public void registerRecipes(){

        ItemStack leder = new ItemStack(Material.LEATHER);
        ItemMeta ledermeter = leder.getItemMeta();
        leder.setItemMeta(ledermeter);
        ShapedRecipe lederrezept = new ShapedRecipe(leder);
        lederrezept.shape("FNF", "FFF", "FFF");
        lederrezept.setIngredient('F', Material.ROTTEN_FLESH);

        Bukkit.addRecipe(lederrezept);

    }
}
