package io.github.thebusybiscuit.ecopower.generators;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.implementation.items.electric.generators.SolarGenerator;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

/**
 * The {@link HighEnergySolarGenerator} is simply a {@link SolarGenerator} which generates
 * a ton of energy.
 * 
 * @author TheBusyBiscuit
 *
 */
public class HighEnergySolarGenerator extends SolarGenerator {

    public HighEnergySolarGenerator(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int energy) {
        super(category, energy, energy, item, recipeType, recipe);
    }

}
