package me.onlyrain.randomaddon;

import me.onlyrain.randomaddon.commands.BloatCommand;
import me.onlyrain.randomaddon.commands.StopCommand;
import me.onlyrain.randomaddon.modules.*;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Random extends MeteorAddon {
    public static final Category CATEGORY = new Category("Random", new ItemStack(Items.POPPY));

    @Override
    public void onInitialize() {
        // Modules
        Modules modules = Modules.get();

        // My
        modules.add(new HackerDetector());

        // LiveOverflowMod

        // Allah
        modules.add(new BackTP());
        modules.add(new Bot());
        modules.add(new ConsoleFlood());
        modules.add(new VelocityBoost());
        modules.add(new WorldGuardBypass());
        // Greteor
        modules.add(new GameTweaks());
        modules.add(new PrivateChat());
        modules.add(new EasyFilter());
        modules.add(new AutoMessage());
        // Mathax
        modules.add(new Sniper());

        // Commands
        // Allah
        Commands.add(new BloatCommand());
        Commands.add(new StopCommand());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "me.onlyrain.randomaddon";
    }
}