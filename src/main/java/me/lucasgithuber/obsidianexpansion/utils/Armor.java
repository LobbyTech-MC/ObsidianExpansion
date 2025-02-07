package me.lucasgithuber.obsidianexpansion.utils;

import javax.annotation.Nonnull;

import org.bukkit.NamespacedKey;
import org.bukkit.Particle;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectiveArmor;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import me.lucasgithuber.obsidianexpansion.ObsidianExpansion;
import me.lucasgithuber.obsidianexpansion.machines.ObsidianForge;


public final class Armor extends SlimefunArmorPiece implements ProtectiveArmor, Soulbound, NotPlaceable {

    private static final NamespacedKey KEY = ObsidianExpansion.createKey("obsidian_Helmet");

    public Armor(ItemGroup group, SlimefunItemStack item, PotionEffect[] effects, ItemStack[] recipe, Particle[] particles) {
        super(group, item, ObsidianForge.TYPE, recipe, effects);

    }
    @Nonnull
    @Override
    public ProtectionType[] getProtectionTypes() {
        return new ProtectionType[] {
                ProtectionType.BEES, ProtectionType.RADIATION, ProtectionType.FLYING_INTO_WALL
        };
    }

    @Override
    public boolean isFullSetRequired() {
        return false;
    }

    @Nonnull
    @Override
    public NamespacedKey getArmorSetId() {
        return KEY;
    }

}