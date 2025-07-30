package me.lucasgithuber.obsidianexpansion;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.lucasgithuber.obsidianexpansion.items.AngelGem;
import me.lucasgithuber.obsidianexpansion.items.AngelGemT2;
import me.lucasgithuber.obsidianexpansion.items.AngelGemT3;
import me.lucasgithuber.obsidianexpansion.items.ContainmentPick;
import me.lucasgithuber.obsidianexpansion.machines.AdvancedObsidianGenerator;
import me.lucasgithuber.obsidianexpansion.machines.ObsidianForge;
import me.lucasgithuber.obsidianexpansion.machines.ObsidianReactor;
import me.lucasgithuber.obsidianexpansion.machines.VoidObsidianGenerator;
import me.lucasgithuber.obsidianexpansion.resources.DragonScale;
import me.lucasgithuber.obsidianexpansion.resources.PhantomScale;
import me.lucasgithuber.obsidianexpansion.utils.Armor;
import me.lucasgithuber.obsidianexpansion.utils.Categories;
import net.md_5.bungee.api.ChatColor;


public class Items{
    public static final SlimefunItemStack OBSIDIAN_FORGE = new SlimefunItemStack(
            "OMC_OBSIDIAN_FORGE",
            Material.SMITHING_TABLE,
            "&l&5黑曜石锻造桌",
            "&8用于合成更先进的机器物品",
            "",
            "&b机器"
    );
    public static final SlimefunItemStack CONTAINMENT_PICK = new SlimefunItemStack(
            "OMC_CONTAINMENT_PICK",
            Material.NETHERITE_PICKAXE,
            ChatColor.DARK_RED + "&l强化刷怪笼之镐",
            ChatColor.RED + "用于收集刷怪笼",
            "",
            "&8工具"
    );
    public static final SlimefunItemStack NETHERITE_GEN = new SlimefunItemStack(
            "OMC_NETHERITE_GEN",
            Material.NETHERITE_BLOCK,
            "&l&4下界合金转换机",
            "&8将圆石转换为下界合金锭",
            "",
            "&2机器",
            MachineLore.energy(1600)+"/t"
    );
    public static final SlimefunItemStack OBSIDIAN_REACTOR = new SlimefunItemStack(
            "OMC_OBSIDIAN_ENERGY",
            Material.OBSIDIAN,
            "&5&l黑曜石发电机",
            "&8利用黑曜石发电机",
            "",
            "&a发电机",
            MachineLore.energyBuffer(80),
            MachineLore.energyPerSecond(80)
    );
    public static final SlimefunItemStack ADVANCED_OBSIDIAN_ENERGY = new SlimefunItemStack(
            "OMC_ADVANCED_OBSIDIAN_ENERGY",
            Material.CRYING_OBSIDIAN,
            "&b&l高级&5&l黑曜石发电机",
            "&8更高效的发电机",
            "",
            "&a发电机",
            MachineLore.energyBuffer(1024),
            MachineLore.energyPerSecond(1024)
    );
    public static final SlimefunItemStack ADVANCED_OBSIDIAN_GEN = new SlimefunItemStack(
            "OMC_ADVANCED_OBSIDIAN_GEN",
            Material.POLISHED_ANDESITE,
            "&c&l黑曜石发生器",
            "&5无限生产黑曜石",
            "",
            "&2资源发生器"
    );
    public static final SlimefunItemStack VOID_OBSIDIAN_GEN = new SlimefunItemStack(
            "OMC_VOID_OBSIDIAN_GEN",
            Material.POLISHED_BLACKSTONE_BRICKS,
            "&8&l虚空&c&l黑曜石发生器",
            "&5无限生产黑曜石",
            "",
            "&2资源发生器"
    );
    //recursos
    public static final SlimefunItemStack SINGLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN",
            Material.OBSIDIAN,
            "&7&l压缩黑曜石 x1",
            "&7&l 9 &7个黑曜石",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack DOUBLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN_2",
            Material.OBSIDIAN,
            "&7&l压缩黑曜石 x2",
            "&7&l 81 &7个黑曜石",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack TRIPLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN_3",
            Material.OBSIDIAN,
            "&7&l压缩黑曜石 x3",
            "&7&l 729 &7个黑曜石",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack QUADRUPLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN_4",
            Material.OBSIDIAN,
            "&8&l压缩黑曜石 x4",
            "&l&7 6561 &7个黑曜石",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack QUINTUPLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN_5",
            Material.CRYING_OBSIDIAN,
            "&8&l压缩黑曜石 x5",
            "&l&7 59049 &7个黑曜石",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack OBSIDIAN_PLATE = new SlimefunItemStack(
            "OMC_OBSIDIAN_PLATE",
            Material.NETHERITE_INGOT,
            "&5&l黑曜石板",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack CONTAINMENT_INGOT = new SlimefunItemStack(
            "OMC_CONTAINMENT_INGOT",
            Material.NETHERITE_INGOT,
            "&4&l远古黑曜石板",
            "&a神秘且珍奇",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack VOID_CORE = new SlimefunItemStack(
            "OMC_VOID_CORE",
            Material.NETHERITE_BLOCK,
            ChatColor.of("#31004C")+"虚空核心",
            ChatColor.of("#31004C")+"感受深渊的力量吧！",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack ADVANCED_VOID_CORE = new SlimefunItemStack(
            "OMC_ADVANCED_VOID_CORE",
            Material.BEDROCK,
            "&4&l深渊&8&l黑曜石核心",
            "&0&l拥有坚硬的外壳",
            "&0&l与神秘的内芯...",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack OBSIDIAN_GEAR = new SlimefunItemStack(
            "OMC_OBSIDIAN_GEAR",
            Material.POLISHED_BLACKSTONE,
            "&7&l黑曜石齿轮",
            "",
            "&2材料"
    );
    public static final SlimefunItemStack DRAGON_SCALE = new SlimefunItemStack(
            "OMC_DRAGON_SCALE",
            Material.AMETHYST_SHARD,
            "&d&l龙角",
            "",
            "&7资源"
    );
    public static final SlimefunItemStack PHANTOM_SCALE = new SlimefunItemStack(
            "OMC_PHANTOM_SCALE",
            Material.FEATHER,
            "&5&l幽魂元",
            "",
            "&7资源"
    );
    //angel gem
    public static final SlimefunItemStack ANGEL_GEM = new SlimefunItemStack("OMC_ANGEL_GEM",
            Material.NETHERITE_BLOCK,
            "&6&l强化飞行核心 &5&lI",
            "",
            "&f给予你永久飞行能力",
            "&f可以调节飞行速度",
            "",
            "&f&o像鸟一样飞翔~",
            "",
            "&7最大速度: 0.1",
            "&7飞行开关: <enabled>",
            "&7飞行速度: <speed>"
    );
    public static final SlimefunItemStack ANGEL_GEM_2 = new SlimefunItemStack("OMC_ANGEL_GEM_2",
            Material.NETHERITE_BLOCK,
            "&6&l强化飞行核心 &5&lII",
            "",
            "&f给予你永久飞行能力",
            "&f可以调节飞行速度",
            "",
            "&f&o像鸟一样飞翔~",
            "",
            "&7最大速度: 0.2",
            "&7飞行开关: <enabled>",
            "&7飞行速度: <speed>"
    );
    public static final SlimefunItemStack ANGEL_GEM_3 = new SlimefunItemStack("OMC_ANGEL_GEM_3",
            Material.NETHERITE_BLOCK,
            "&6&l强化飞行核心 &5&lIII",
            "",
            "&f给予你永久飞行能力",
            "&f可以调节飞行速度",
            "",
            "&f&o像鸟一样飞翔~",
            "",
            "&7最大速度: 0.3",
            "&7飞行开关: <enabled>",
            "&7飞行速度: <speed>"
    );
    //armadura
    public static final SlimefunItemStack OBSIDIAN_HELMET = new SlimefunItemStack(
            "OMC_HELMET",
            Material.NETHERITE_HELMET,
            "&5&l虚空之冠",
            ChatColor.of("#2E004A")+"&l吾主",
            ChatColor.of("#2E004A")+"&l一统于天下...",
            "&5&l鬼可控否？",
            "&5&l答曰:否...",
            "&7满面疮痍",
            "&7未能止其步履",
            "&7囷囷而延",
            "&7夜视 I",
            "&7水下呼吸 I"
    );
    public static final SlimefunItemStack OBSIDIAN_CHESTPLATE = new SlimefunItemStack(
            "OMC_CHEST",
            Material.NETHERITE_CHESTPLATE,
            "&5&l捍卫者之铠",
            ChatColor.of("#2E004A")+"&l醉卧沙场君莫笑",
            ChatColor.of("#2E004A")+"&l古来征战几人回",
            "&7力量 II",
            "&7抗性提升 II",
            "&7饱和 IV"
    );
    public static final SlimefunItemStack OBSIDIAN_LEGGINGS = new SlimefunItemStack(
            "OMC_LEGGINGS",
            Material.NETHERITE_LEGGINGS,
            "&5&l鬼泣之裤",
            ChatColor.of("#2E004A")+"&l鬼泣于黑暗",
            ChatColor.of("#2E004A")+"&l魂出于於菟",
            "&7幸运 II",
            "&7生命恢复 II",
            "&7急迫 III"
    );
    public static final SlimefunItemStack OBSIDIAN_BOOTS = new SlimefunItemStack(
            "OMC_BOOTS",
            Material.NETHERITE_BOOTS,
            "&5&l穹顶之靴",
            ChatColor.of("#2E004A")+"&l当天堂塌陷，地狱升起",
            ChatColor.of("#2E004A")+"&l人间是否还会存在",
            "&7海豚的恩惠 III",
            "&7速度 I",
            "&7跳跃提升 III",
            "&7生命提升 I"
    );
    public static void setup(ObsidianExpansion omc) {
        //pick
        new ContainmentPick(Categories.OMC_ITEMS, CONTAINMENT_PICK, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                CONTAINMENT_INGOT,CONTAINMENT_INGOT,CONTAINMENT_INGOT,
                null, getItem("AV_ILLUMIUM"), null,
                null, getItem("AV_DARKSTEEL"), null
        }).register(omc);
        new SlimefunItem(Categories.OMC_ITEMS, CONTAINMENT_INGOT, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                getItem("AV_DARKSTEEL"), SlimefunItems.EARTH_RUNE, getItem("AV_DARKSTEEL"),
                getItem("DEMONIC_INGOT"), VOID_CORE, getItem("DEMONIC_INGOT"),
                getItem("AV_DARKSTEEL"), SlimefunItems.EARTH_RUNE, getItem("AV_DARKSTEEL"),
        }).register(omc);
        //maquinas
        new ObsidianReactor(Categories.OMC_GENERATORS, OBSIDIAN_REACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.WITHER_PROOF_OBSIDIAN, OBSIDIAN_PLATE, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                OBSIDIAN_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, OBSIDIAN_PLATE,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, OBSIDIAN_PLATE, SlimefunItems.WITHER_PROOF_OBSIDIAN
        }).setCapacity(80).setEnergyProduction(40).register(omc);
        new ObsidianReactor(Categories.OMC_GENERATORS, ADVANCED_OBSIDIAN_ENERGY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                getItem("MACHINE_CORE"), OBSIDIAN_REACTOR, getItem("MACHINE_CORE"),
                OBSIDIAN_REACTOR, SlimefunItems.ENERGIZED_CAPACITOR, OBSIDIAN_REACTOR,
                getItem("MACHINE_CORE"), OBSIDIAN_REACTOR, getItem("MACHINE_CORE")
        }).setCapacity(1024).setEnergyProduction(512).register(omc);
        new AdvancedObsidianGenerator(Categories.OMC_GENERATORS, ADVANCED_OBSIDIAN_GEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.NETHERITE_PICKAXE), SlimefunItems.GEO_MINER, new ItemStack(Material.NETHERITE_PICKAXE),
                new ItemStack(Material.DISPENSER), VOID_CORE, new ItemStack(Material.DISPENSER),
                getItem("MACHINE_CIRCUIT"), getItem("MACHINE_CORE"), getItem("MACHINE_CIRCUIT")
        }).energyPerTick(800).register(omc);
        new VoidObsidianGenerator(Categories.OMC_GENERATORS, VOID_OBSIDIAN_GEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SlimefunItems.GEO_MINER, SlimefunItems.PROGRAMMABLE_ANDROID_MINER,
                new ItemStack(Material.LAVA_BUCKET), ADVANCED_OBSIDIAN_GEN, new ItemStack(Material.LAVA_BUCKET),
                getItem("MACHINE_PLATE"), getItem("INFINITE_MACHINE_CORE"), getItem("MACHINE_PLATE")
        }).energyPerTick(40000).register(omc);
        new ObsidianForge(Categories.OMC_MACHINES, OBSIDIAN_FORGE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                OBSIDIAN_PLATE, new ItemStack(Material.CRAFTING_TABLE), OBSIDIAN_PLATE,
                OBSIDIAN_GEAR, SlimefunItems.CRAFTING_MOTOR, OBSIDIAN_GEAR,
                new ItemStack(Material.SMOOTH_QUARTZ), new ItemStack(Material.SMOOTH_QUARTZ), new ItemStack(Material.SMOOTH_QUARTZ),
        }, 10000000).register(omc);
        //angel gem
        new AngelGem(Categories.OMC_ITEMS, ANGEL_GEM, RecipeType.MAGIC_WORKBENCH,
                new ItemStack[]{
                        SlimefunItems.INFUSED_ELYTRA, getItem("ADVANCED_NETHER_STAR_REACTOR"), SlimefunItems.INFUSED_ELYTRA,
                        getItem("VEX_GEM"), VOID_CORE, getItem("VEX_GEM"),
                        PHANTOM_SCALE, getItem("VEX_GEM"), PHANTOM_SCALE
                }).register(omc);
        new AngelGemT2(Categories.OMC_ITEMS, ANGEL_GEM_2, RecipeType.MAGIC_WORKBENCH,
                new ItemStack[]{
                        new ItemStack(Material.ELYTRA), getItem("STAINLESS_STEEL_ROTOR"), new ItemStack(Material.ELYTRA),
                        getItem("VEX_GEM"), ANGEL_GEM, getItem("VEX_GEM"),
                        PHANTOM_SCALE, getItem("VEX_GEM"), PHANTOM_SCALE
                }).register(omc);
        new AngelGemT3(Categories.OMC_ITEMS, ANGEL_GEM_3, RecipeType.MAGIC_WORKBENCH,
                new ItemStack[]{
                        SlimefunItems.ELYTRA_SCALE, SlimefunItems.AIR_RUNE, SlimefunItems.ELYTRA_SCALE,
                        getItem("VEX_GEM"), ANGEL_GEM_2, getItem("VEX_GEM"),
                        PHANTOM_SCALE, getItem("VEX_GEM"), PHANTOM_SCALE
                }).register(omc);
        //recursos
        new SlimefunItem(Categories.OMC_RESOURCES, SINGLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN)
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, DOUBLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN,
                SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN,
                SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, TRIPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN,
                DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN,
                DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, QUADRUPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN,
                TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN,
                TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, QUINTUPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN,
                QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN,
                QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, OBSIDIAN_PLATE, RecipeType.COMPRESSOR, new ItemStack[]{
                new ItemStack(Material.OBSIDIAN, 4), null, null,
                null, null, null,
                null, null, null
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, VOID_CORE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"),
                getItem("VOID_INGOT"), QUADRUPLE_COMPRESSED_OBSIDIAN, getItem("VOID_INGOT"),
                getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT")
        }).register(omc);
        new UnplaceableBlock(Categories.OMC_ITEMS, OBSIDIAN_GEAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, OBSIDIAN_PLATE, null,
                OBSIDIAN_PLATE, new ItemStack(Material.STICK), OBSIDIAN_PLATE,
                null, OBSIDIAN_PLATE, null
        }).register(omc);
        new DragonScale(Categories.OMC_DROPS, DRAGON_SCALE, RecipeType.MOB_DROP, new ItemStack[]{
                null, null, null,
                null, new CustomItemStack(Material.ENDERMAN_SPAWN_EGG, "&a末影龙"), null,
                null, null, null
        }).register(omc);
        new PhantomScale(Categories.OMC_DROPS, PHANTOM_SCALE, RecipeType.MOB_DROP, new ItemStack[]{
                null, null, null,
                null, new CustomItemStack(Material.PHANTOM_SPAWN_EGG, "&a幻翼"), null,
                null, null, null
        }).register(omc);

        new UnplaceableBlock(Categories.OMC_FORGE_CHEAT, ADVANCED_VOID_CORE, ObsidianForge.TYPE, new ItemStack[]{
                SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                DOUBLE_COMPRESSED_OBSIDIAN, QUINTUPLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, SlimefunItems.EARTH_RUNE, QUINTUPLE_COMPRESSED_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                TRIPLE_COMPRESSED_OBSIDIAN, SlimefunItems.ENDER_RUNE, VOID_CORE, VOID_CORE, DOUBLE_COMPRESSED_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, VOID_CORE, VOID_CORE, SlimefunItems.ENDER_RUNE, TRIPLE_COMPRESSED_OBSIDIAN,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, QUINTUPLE_COMPRESSED_OBSIDIAN, SlimefunItems.EARTH_RUNE, DOUBLE_COMPRESSED_OBSIDIAN, QUINTUPLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
        }).register(omc);
        //armadura
        new Armor(Categories.OMC_FORGE_CHEAT, OBSIDIAN_HELMET, new PotionEffect[]{
                new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.CONDUIT_POWER, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 0, false, false, false),
        }, new ItemStack[]{
                DRAGON_SCALE, getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"), DRAGON_SCALE,
                getItem("VOID_INGOT"), DRAGON_SCALE, ADVANCED_VOID_CORE, ADVANCED_VOID_CORE, DRAGON_SCALE, getItem("VOID_INGOT"),
                getItem("VOID_INGOT"), getItem("INFINITE_INGOT"), ADVANCED_VOID_CORE, ADVANCED_VOID_CORE, getItem("INFINITE_INGOT"), getItem("VOID_INGOT"),
                getItem("INFINITE_INGOT"), DRAGON_SCALE, getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), DRAGON_SCALE, getItem("INFINITE_INGOT"),
                null, getItem("INFINITE_INGOT"), null, null, getItem("INFINITE_INGOT"), null,
                null, null, null, null, null, null,
        }, new Particle[]{Particle.HEART}).register(omc);
        new Armor(Categories.OMC_FORGE_CHEAT, OBSIDIAN_CHESTPLATE, new PotionEffect[]{
                new PotionEffect(PotionEffectType.STRENGTH, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.RESISTANCE, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.SATURATION, 600, 3, false, false, false),
        }, new ItemStack[]{
                null, DRAGON_SCALE, null, null, DRAGON_SCALE, null,
                DRAGON_SCALE, getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"), DRAGON_SCALE,
                DRAGON_SCALE, getItem("VOID_INGOT"), ADVANCED_VOID_CORE, ADVANCED_VOID_CORE, getItem("VOID_INGOT"), DRAGON_SCALE,
                DRAGON_SCALE, getItem("INFINITE_INGOT"), ADVANCED_VOID_CORE, ADVANCED_VOID_CORE, getItem("INFINITE_INGOT"), DRAGON_SCALE,
                null, getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), null,
                null, null, getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), null, null
        }, new Particle[]{Particle.HEART}).register(omc);
        new Armor(Categories.OMC_FORGE_CHEAT, OBSIDIAN_LEGGINGS, new PotionEffect[]{
                new PotionEffect(PotionEffectType.HASTE, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.REGENERATION, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.LUCK, 600, 1, false, false, false),
        }, new ItemStack[]{
                null, DRAGON_SCALE, getItem("VOID_INGOT"), getItem("VOID_INGOT"), DRAGON_SCALE, null,
                DRAGON_SCALE, ADVANCED_VOID_CORE, getItem("VOID_INGOT"), getItem("VOID_INGOT"), ADVANCED_VOID_CORE, DRAGON_SCALE,
                DRAGON_SCALE, getItem("VOID_INGOT"), getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), getItem("VOID_INGOT"), DRAGON_SCALE,
                DRAGON_SCALE, getItem("VOID_INGOT"), null, null, getItem("VOID_INGOT"), DRAGON_SCALE,
                DRAGON_SCALE, getItem("VOID_INGOT"), null, null, getItem("VOID_INGOT"), DRAGON_SCALE,
                null, getItem("INFINITE_INGOT"), null, null, getItem("INFINITE_INGOT"), null
        }, new Particle[]{Particle.HEART}).register(omc);
        new Armor(Categories.OMC_FORGE_CHEAT, OBSIDIAN_BOOTS, new PotionEffect[]{
                new PotionEffect(PotionEffectType.SPEED, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.JUMP_BOOST, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.HEALTH_BOOST, 600, 0, false, false, false),
        }, new ItemStack[]{
                DRAGON_SCALE, DRAGON_SCALE, null, null, DRAGON_SCALE, DRAGON_SCALE,
                DRAGON_SCALE, ADVANCED_VOID_CORE, null, null, ADVANCED_VOID_CORE, DRAGON_SCALE,
                DRAGON_SCALE, getItem("INFINITE_INGOT"), null, null, getItem("INFINITE_INGOT"), DRAGON_SCALE,
                getItem("VOID_INGOT"), getItem("VOID_INGOT"), null, null, getItem("VOID_INGOT"), getItem("VOID_INGOT"),
                getItem("VOID_INGOT"), getItem("VOID_INGOT"), null, null, getItem("VOID_INGOT"), getItem("VOID_INGOT"),
                getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), null, null, getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT")
        }, new Particle[]{Particle.HEART}).register(omc);
    }
    static {
        ItemMeta meta = OBSIDIAN_HELMET.getItemMeta();
        meta.setUnbreakable(true);

        OBSIDIAN_HELMET.setItemMeta(meta);
        OBSIDIAN_HELMET.addUnsafeEnchantment(Enchantment.PROTECTION, 30);
        OBSIDIAN_HELMET.addUnsafeEnchantment(Enchantment.THORNS, 10);
        OBSIDIAN_HELMET.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 10);

    }
    static {
        ItemMeta chestMeta = OBSIDIAN_CHESTPLATE.getItemMeta();
        chestMeta.setUnbreakable(true);

        OBSIDIAN_CHESTPLATE.setItemMeta(chestMeta);
        OBSIDIAN_CHESTPLATE.addUnsafeEnchantment(Enchantment.PROTECTION, 30);
        OBSIDIAN_CHESTPLATE.addUnsafeEnchantment(Enchantment.BLAST_PROTECTION, 30);
        OBSIDIAN_CHESTPLATE.addUnsafeEnchantment(Enchantment.THORNS, 10);
    }
    static {
        ItemMeta legsMeta = OBSIDIAN_LEGGINGS.getItemMeta();
        legsMeta.setUnbreakable(true);
        OBSIDIAN_LEGGINGS.setItemMeta(legsMeta);
        OBSIDIAN_LEGGINGS.addUnsafeEnchantment(Enchantment.PROTECTION, 30);
        OBSIDIAN_LEGGINGS.addUnsafeEnchantment(Enchantment.FIRE_PROTECTION, 30);
        OBSIDIAN_LEGGINGS.addUnsafeEnchantment(Enchantment.THORNS, 10);
    }
    static {
        ItemMeta bootsMeta = OBSIDIAN_BOOTS.getItemMeta();
        bootsMeta.setUnbreakable(true);
        OBSIDIAN_BOOTS.setItemMeta(bootsMeta);
        OBSIDIAN_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION, 30);
        OBSIDIAN_BOOTS.addUnsafeEnchantment(Enchantment.FEATHER_FALLING, 30);
        OBSIDIAN_BOOTS.addUnsafeEnchantment(Enchantment.THORNS, 10);
    }
    @Nullable
    private static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById(id);
        return item != null ? item.getItem() : null;
    }
}
