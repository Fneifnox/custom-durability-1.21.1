package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class AdvancedNetheriteCompat {

    public static void setDurabilityAndUnbreakableNetheriteIronTools() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteIronSword = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_sword"));
            Item netheriteIronShovel = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_shovel"));
            Item netheriteIronPickaxe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_pickaxe"));
            Item netheriteIronAxe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_axe"));
            Item netheriteIronHoe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_hoe"));

            if (!CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronSword()) {
                context.modify(netheriteIronSword, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronTools.durabilityForNetheriteIronSword()));
            }
            else {
                context.modify(netheriteIronSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronSword())));
            }

            if (!CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronShovel()) {
                context.modify(netheriteIronShovel, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronTools.durabilityForNetheriteIronShovel()));
            }
            else {
                context.modify(netheriteIronShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronShovel())));
            }

            if (!CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronPickaxe()) {
                context.modify(netheriteIronPickaxe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronTools.durabilityForNetheriteIronPickaxe()));
            }
            else {
                context.modify(netheriteIronPickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronPickaxe())));
            }

            if (!CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronAxe()) {
                context.modify(netheriteIronAxe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronTools.durabilityForNetheriteIronAxe()));
            }
            else {
                context.modify(netheriteIronAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronAxe())));
            }

            if (!CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronHoe()) {
                context.modify(netheriteIronHoe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronTools.durabilityForNetheriteIronHoe()));
            }
            else {
                context.modify(netheriteIronHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronTools.unbreakableNetheriteIronHoe())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetheriteGoldTools() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteGoldSword = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_sword"));
            Item netheriteGoldShovel = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_shovel"));
            Item netheriteGoldPickaxe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_pickaxe"));
            Item netheriteGoldAxe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_axe"));
            Item netheriteGoldHoe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_hoe"));

            if (!CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldSword()) {
                context.modify(netheriteGoldSword, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldTools.durabilityForNetheriteGoldSword()));
            }
            else {
                context.modify(netheriteGoldSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldSword())));
            }

            if (!CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldShovel()) {
                context.modify(netheriteGoldShovel, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldTools.durabilityForNetheriteGoldShovel()));
            }
            else {
                context.modify(netheriteGoldShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldShovel())));
            }

            if (!CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldPickaxe()) {
                context.modify(netheriteGoldPickaxe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldTools.durabilityForNetheriteGoldPickaxe()));
            }
            else {
                context.modify(netheriteGoldPickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldPickaxe())));
            }

            if (!CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldAxe()) {
                context.modify(netheriteGoldAxe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldTools.durabilityForNetheriteGoldAxe()));
            }
            else {
                context.modify(netheriteGoldAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldAxe())));
            }

            if (!CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldHoe()) {
                context.modify(netheriteGoldHoe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldTools.durabilityForNetheriteGoldHoe()));
            }
            else {
                context.modify(netheriteGoldHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldTools.unbreakableNetheriteGoldHoe())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetheriteEmeraldTools() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteEmeraldSword = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_sword"));
            Item netheriteEmeraldShovel = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_shovel"));
            Item netheriteEmeraldPickaxe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_pickaxe"));
            Item netheriteEmeraldAxe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_axe"));
            Item netheriteEmeraldHoe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_hoe"));

            if (!CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldSword()) {
                context.modify(netheriteEmeraldSword, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldTools.durabilityForNetheriteEmeraldSword()));
            }
            else {
                context.modify(netheriteEmeraldSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldSword())));
            }

            if (!CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldShovel()) {
                context.modify(netheriteEmeraldShovel, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldTools.durabilityForNetheriteEmeraldShovel()));
            }
            else {
                context.modify(netheriteEmeraldShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldShovel())));
            }

            if (!CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldPickaxe()) {
                context.modify(netheriteEmeraldPickaxe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldTools.durabilityForNetheriteEmeraldPickaxe()));
            }
            else {
                context.modify(netheriteEmeraldPickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldPickaxe())));
            }

            if (!CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldAxe()) {
                context.modify(netheriteEmeraldAxe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldTools.durabilityForNetheriteEmeraldAxe()));
            }
            else {
                context.modify(netheriteEmeraldAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldAxe())));
            }

            if (!CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldHoe()) {
                context.modify(netheriteEmeraldHoe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldTools.durabilityForNetheriteEmeraldHoe()));
            }
            else {
                context.modify(netheriteEmeraldHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldTools.unbreakableNetheriteEmeraldHoe())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetheriteDiamondTools() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteDiamondSword = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_sword"));
            Item netheriteDiamondShovel = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_shovel"));
            Item netheriteDiamondPickaxe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_pickaxe"));
            Item netheriteDiamondAxe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_axe"));
            Item netheriteDiamondHoe = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_hoe"));

            if (!CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondSword()) {
                context.modify(netheriteDiamondSword, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondTools.durabilityForNetheriteDiamondSword()));
            }
            else {
                context.modify(netheriteDiamondSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondSword())));
            }

            if (!CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondShovel()) {
                context.modify(netheriteDiamondShovel, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondTools.durabilityForNetheriteDiamondShovel()));
            }
            else {
                context.modify(netheriteDiamondShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondShovel())));
            }

            if (!CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondPickaxe()) {
                context.modify(netheriteDiamondPickaxe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondTools.durabilityForNetheriteDiamondPickaxe()));
            }
            else {
                context.modify(netheriteDiamondPickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondPickaxe())));
            }

            if (!CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondAxe()) {
                context.modify(netheriteDiamondAxe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondTools.durabilityForNetheriteDiamondAxe()));
            }
            else {
                context.modify(netheriteDiamondAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondAxe())));
            }

            if (!CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondHoe()) {
                context.modify(netheriteDiamondHoe, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondTools.durabilityForNetheriteDiamondHoe()));
            }
            else {
                context.modify(netheriteDiamondHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondTools.unbreakableNetheriteDiamondHoe())));
            }
        });
    }


    public static void setDurabilityAndUnbreakableNetheriteIronArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteIronHelmet = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_helmet"));
            Item netheriteIronChestplate = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_chestplate"));
            Item netheriteIronLeggings = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_leggings"));
            Item netheriteIronBoots = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_iron_boots"));

            if (!CONFIG.advancedNetherite.netheriteIronArmor.unbreakableNetheriteIronHelmet()) {
                context.modify(netheriteIronHelmet, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronArmor.durabilityForNetheriteIronHelmet()));
            }
            else {
                context.modify(netheriteIronHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronArmor.unbreakableNetheriteIronHelmet())));
            }

            if (!CONFIG.advancedNetherite.netheriteIronArmor.unbreakableNetheriteIronChestplate()) {
                context.modify(netheriteIronChestplate, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronArmor.durabilityForNetheriteIronChestplate()));
            }
            else {
                context.modify(netheriteIronChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronArmor.unbreakableNetheriteIronChestplate())));
            }

            if (!CONFIG.advancedNetherite.netheriteIronArmor.unbreakableNetheriteIronLeggings()) {
                context.modify(netheriteIronLeggings, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronArmor.durabilityForNetheriteIronLeggings()));
            }
            else {
                context.modify(netheriteIronLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronArmor.unbreakableNetheriteIronLeggings())));
            }

            if (!CONFIG.advancedNetherite.netheriteIronArmor.unbreakableNetheriteIronBoots()) {
                context.modify(netheriteIronBoots, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteIronArmor.durabilityForNetheriteIronBoots()));
            }
            else {
                context.modify(netheriteIronBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteIronArmor.unbreakableNetheriteIronBoots())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetheriteGoldArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteGoldHelmet = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_helmet"));
            Item netheriteGoldChestplate = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_chestplate"));
            Item netheriteGoldLeggings = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_leggings"));
            Item netheriteGoldBoots = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_gold_boots"));

            if (!CONFIG.advancedNetherite.netheriteGoldArmor.unbreakableNetheriteGoldHelmet()) {
                context.modify(netheriteGoldHelmet, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldArmor.durabilityForNetheriteGoldHelmet()));
            }
            else {
                context.modify(netheriteGoldHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldArmor.unbreakableNetheriteGoldHelmet())));
            }

            if (!CONFIG.advancedNetherite.netheriteGoldArmor.unbreakableNetheriteGoldChestplate()) {
                context.modify(netheriteGoldChestplate, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldArmor.durabilityForNetheriteGoldChestplate()));
            }
            else {
                context.modify(netheriteGoldChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldArmor.unbreakableNetheriteGoldChestplate())));
            }

            if (!CONFIG.advancedNetherite.netheriteGoldArmor.unbreakableNetheriteGoldLeggings()) {
                context.modify(netheriteGoldLeggings, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldArmor.durabilityForNetheriteGoldLeggings()));
            }
            else {
                context.modify(netheriteGoldLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldArmor.unbreakableNetheriteGoldLeggings())));
            }

            if (!CONFIG.advancedNetherite.netheriteGoldArmor.unbreakableNetheriteGoldBoots()) {
                context.modify(netheriteGoldBoots, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteGoldArmor.durabilityForNetheriteGoldBoots()));
            }
            else {
                context.modify(netheriteGoldBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteGoldArmor.unbreakableNetheriteGoldBoots())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetheriteEmeraldArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteEmeraldHelmet = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_helmet"));
            Item netheriteEmeraldChestplate = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_chestplate"));
            Item netheriteEmeraldLeggings = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_leggings"));
            Item netheriteEmeraldBoots = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_emerald_boots"));

            if (!CONFIG.advancedNetherite.netheriteEmeraldArmor.unbreakableNetheriteEmeraldHelmet()) {
                context.modify(netheriteEmeraldHelmet, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldArmor.durabilityForNetheriteEmeraldHelmet()));
            }
            else {
                context.modify(netheriteEmeraldHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldArmor.unbreakableNetheriteEmeraldHelmet())));
            }

            if (!CONFIG.advancedNetherite.netheriteEmeraldArmor.unbreakableNetheriteEmeraldChestplate()) {
                context.modify(netheriteEmeraldChestplate, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldArmor.durabilityForNetheriteEmeraldChestplate()));
            }
            else {
                context.modify(netheriteEmeraldChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldArmor.unbreakableNetheriteEmeraldChestplate())));
            }

            if (!CONFIG.advancedNetherite.netheriteEmeraldArmor.unbreakableNetheriteEmeraldLeggings()) {
                context.modify(netheriteEmeraldLeggings, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldArmor.durabilityForNetheriteEmeraldLeggings()));
            }
            else {
                context.modify(netheriteEmeraldLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldArmor.unbreakableNetheriteEmeraldLeggings())));
            }

            if (!CONFIG.advancedNetherite.netheriteEmeraldArmor.unbreakableNetheriteEmeraldBoots()) {
                context.modify(netheriteEmeraldBoots, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteEmeraldArmor.durabilityForNetheriteEmeraldBoots()));
            }
            else {
                context.modify(netheriteEmeraldBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteEmeraldArmor.unbreakableNetheriteEmeraldBoots())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetheriteDiamondArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteDiamondHelmet = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_helmet"));
            Item netheriteDiamondChestplate = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_chestplate"));
            Item netheriteDiamondLeggings = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_leggings"));
            Item netheriteDiamondBoots = Registries.ITEM.get(Identifier.of("advancednetherite", "netherite_diamond_boots"));

            if (!CONFIG.advancedNetherite.netheriteDiamondArmor.unbreakableNetheriteDiamondHelmet()) {
                context.modify(netheriteDiamondHelmet, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondArmor.durabilityForNetheriteDiamondHelmet()));
            }
            else {
                context.modify(netheriteDiamondHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondArmor.unbreakableNetheriteDiamondHelmet())));
            }

            if (!CONFIG.advancedNetherite.netheriteDiamondArmor.unbreakableNetheriteDiamondChestplate()) {
                context.modify(netheriteDiamondChestplate, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondArmor.durabilityForNetheriteDiamondChestplate()));
            }
            else {
                context.modify(netheriteDiamondChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondArmor.unbreakableNetheriteDiamondChestplate())));
            }

            if (!CONFIG.advancedNetherite.netheriteDiamondArmor.unbreakableNetheriteDiamondLeggings()) {
                context.modify(netheriteDiamondLeggings, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondArmor.durabilityForNetheriteDiamondLeggings()));
            }
            else {
                context.modify(netheriteDiamondLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondArmor.unbreakableNetheriteDiamondLeggings())));
            }

            if (!CONFIG.advancedNetherite.netheriteDiamondArmor.unbreakableNetheriteDiamondBoots()) {
                context.modify(netheriteDiamondBoots, components -> components.add(MAX_DAMAGE, CONFIG.advancedNetherite.netheriteDiamondArmor.durabilityForNetheriteDiamondBoots()));
            }
            else {
                context.modify(netheriteDiamondBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.advancedNetherite.netheriteDiamondArmor.unbreakableNetheriteDiamondBoots())));
            }
        });
    }
}
