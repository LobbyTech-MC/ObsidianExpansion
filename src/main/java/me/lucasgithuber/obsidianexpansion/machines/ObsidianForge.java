package me.lucasgithuber.obsidianexpansion.machines;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.machines.MachineLayout;
import io.github.mooy1.infinitylib.machines.MachineRecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.lucasgithuber.obsidianexpansion.Items;
import me.lucasgithuber.obsidianexpansion.utils.ObsidianForgeGroup;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;

@ParametersAreNonnullByDefault
public final class ObsidianForge extends io.github.mooy1.infinitylib.machines.CraftingBlock implements EnergyNetComponent {

    public static final int[] INPUT_SLOTS = {
            0, 1, 2, 3, 4, 5,
            9, 10, 11, 12, 13, 14,
            18, 19, 20, 21, 22, 23,
            27, 28, 29, 30, 31, 32,
            36, 37, 38, 39, 40, 41,
            45, 46, 47, 48, 49, 50
    };
    private static final int RECIPE_SLOT = 7;
    public static final MachineRecipeType TYPE = new MachineRecipeType("omc_obsidian_forge",
            new CustomItemStack(Items.OBSIDIAN_FORGE, Items.OBSIDIAN_FORGE.getDisplayName(),
                    "", "&cUse a categoria \"&3Equipamentos\" &cpara ver as receitas corretas!"));

    private final int energy;

    public ObsidianForge(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe, int energy) {
        super(category, item, type, recipe);
        addRecipesFrom(TYPE);
        layout(new MachineLayout()
                .inputSlots(INPUT_SLOTS)
                .outputSlots(new int[]{
                        53
                })
                .statusSlot(8)
                .inputBorder(new int[]{6,15,24,33,42,51})
                .outputBorder(new int[]{43,44,52

                }).background(new int[]{16,17,25,26,34,35})
        );
        this.energy = energy;
    }

    @Override
    protected void setup(BlockMenuPreset preset) {
        super.setup(preset);
        preset.addItem(7, new CustomItemStack(Material.KNOWLEDGE_BOOK, ChatColor.GREEN+"Receitas"), ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    protected void onNewInstance(BlockMenu menu, Block b) {
        super.onNewInstance(menu, b);
        menu.addMenuClickHandler(RECIPE_SLOT, (p, slot, item, action) -> {
            ObsidianForgeGroup.open(p, menu);
            return false;
        });
    }

    @Override
    protected void craft(Block b, BlockMenu menu, Player p) {
        int charge = getCharge(menu.getLocation());
        if (charge < this.energy) {
            p.sendMessage(
                    ChatColor.RED + "Carga insuficiente!",
                    ChatColor.GREEN + "Carga: " + ChatColor.RED + charge + ChatColor.GREEN + "/" + this.energy + " J"
            );
        } else {
            super.craft(b, menu, p);
        }
    }

    @Override
    protected void onSuccessfulCraft(BlockMenu menu, ItemStack toOutput) {
        setCharge(menu.getLocation(), 0);
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public int getCapacity() {
        return this.energy;
    }
}