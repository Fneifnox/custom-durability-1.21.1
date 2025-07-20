package net.fneifnox.customdurability.armor;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class ArmorItems {

    public static void setDurabilityAndUnbreakableLeather() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item leatherHelmet = Registries.ITEM.get(Identifier.of("minecraft", "leather_helmet"));
            Item leatherChestplate = Registries.ITEM.get(Identifier.of("minecraft", "leather_chestplate"));
            Item leatherLeggings = Registries.ITEM.get(Identifier.of("minecraft", "leather_leggings"));
            Item leatherBoots = Registries.ITEM.get(Identifier.of("minecraft", "leather_boots"));

            if (!CONFIG.ArmorLeather.unbreakableLeatherHelmet()) {
                context.modify(leatherHelmet, components -> components.add(MAX_DAMAGE, CONFIG.ArmorLeather.durabilityForLeatherHelmet()));
            }
            else {
                context.modify(leatherHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorLeather.unbreakableLeatherHelmet())));
            }

            if (!CONFIG.ArmorLeather.unbreakableLeatherChestplate()) {
                context.modify(leatherChestplate, components -> components.add(MAX_DAMAGE, CONFIG.ArmorLeather.durabilityForLeatherChestplate()));
            }
            else {
                context.modify(leatherChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorLeather.unbreakableLeatherChestplate())));
            }

            if (!CONFIG.ArmorLeather.unbreakableLeatherLeggings()) {
                context.modify(leatherLeggings, components -> components.add(MAX_DAMAGE, CONFIG.ArmorLeather.durabilityForLeatherLeggings()));
            }
            else {
                context.modify(leatherLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorLeather.unbreakableLeatherLeggings())));
            }

            if (!CONFIG.ArmorLeather.unbreakableLeatherBoots()) {
                context.modify(leatherBoots, components -> components.add(MAX_DAMAGE, CONFIG.ArmorLeather.durabilityForLeatherBoots()));
            }
            else {
                context.modify(leatherBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorLeather.unbreakableLeatherBoots())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableChainmail() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item chainHelmet = Registries.ITEM.get(Identifier.of("minecraft", "chainmail_helmet"));
            Item chainChestplate = Registries.ITEM.get(Identifier.of("minecraft", "chainmail_chestplate"));
            Item chainLeggings = Registries.ITEM.get(Identifier.of("minecraft", "chainmail_leggings"));
            Item chainBoots = Registries.ITEM.get(Identifier.of("minecraft", "chainmail_boots"));

            if (!CONFIG.ArmorChainmail.unbreakableChainmailHelmet()) {
                context.modify(chainHelmet, components -> components.add(MAX_DAMAGE, CONFIG.ArmorChainmail.durabilityForChainmailHelmet()));
            }
            else {
                context.modify(chainHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorChainmail.unbreakableChainmailHelmet())));
            }

            if (!CONFIG.ArmorChainmail.unbreakableChainmailChestplate()) {
                context.modify(chainChestplate, components -> components.add(MAX_DAMAGE, CONFIG.ArmorChainmail.durabilityForChainmailChestplate()));
            }
            else {
                context.modify(chainChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorChainmail.unbreakableChainmailChestplate())));
            }

            if (!CONFIG.ArmorChainmail.unbreakableChainmailLeggings()) {
                context.modify(chainLeggings, components -> components.add(MAX_DAMAGE, CONFIG.ArmorChainmail.durabilityForChainmailLeggings()));
            }
            else {
                context.modify(chainLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorChainmail.unbreakableChainmailLeggings())));
            }

            if (!CONFIG.ArmorChainmail.unbreakableChainmailBoots()) {
                context.modify(chainBoots, components -> components.add(MAX_DAMAGE, CONFIG.ArmorChainmail.durabilityForChainmailBoots()));
            }
            else {
                context.modify(chainBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorChainmail.unbreakableChainmailBoots())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableIron() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item ironHelmet = Registries.ITEM.get(Identifier.of("minecraft", "iron_helmet"));
            Item ironChestplate = Registries.ITEM.get(Identifier.of("minecraft", "iron_chestplate"));
            Item ironLeggings = Registries.ITEM.get(Identifier.of("minecraft", "iron_leggings"));
            Item ironBoots = Registries.ITEM.get(Identifier.of("minecraft", "iron_boots"));

            if (!CONFIG.ArmorIron.unbreakableIronHelmet()) {
                context.modify(ironHelmet, components -> components.add(MAX_DAMAGE, CONFIG.ArmorIron.durabilityForIronHelmet()));
            }
            else {
                context.modify(ironHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorIron.unbreakableIronHelmet())));
            }

            if (!CONFIG.ArmorIron.unbreakableIronChestplate()) {
                context.modify(ironChestplate, components -> components.add(MAX_DAMAGE, CONFIG.ArmorIron.durabilityForIronChestplate()));
            }
            else {
                context.modify(ironChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorIron.unbreakableIronChestplate())));
            }

            if (!CONFIG.ArmorIron.unbreakableIronLeggings()) {
                context.modify(ironLeggings, components -> components.add(MAX_DAMAGE, CONFIG.ArmorIron.durabilityForIronLeggings()));
            }
            else {
                context.modify(ironLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorIron.unbreakableIronLeggings())));
            }

            if (!CONFIG.ArmorIron.unbreakableIronBoots()) {
                context.modify(ironBoots, components -> components.add(MAX_DAMAGE, CONFIG.ArmorIron.durabilityForIronBoots()));
            }
            else {
                context.modify(ironBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorIron.unbreakableIronBoots())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableGolden() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item goldenHelmet = Registries.ITEM.get(Identifier.of("minecraft", "golden_helmet"));
            Item goldenChestplate = Registries.ITEM.get(Identifier.of("minecraft", "golden_chestplate"));
            Item goldenLeggings = Registries.ITEM.get(Identifier.of("minecraft", "golden_leggings"));
            Item goldenBoots = Registries.ITEM.get(Identifier.of("minecraft", "golden_boots"));

            if (!CONFIG.ArmorGolden.unbreakableGoldenHelmet()) {
                context.modify(goldenHelmet, components -> components.add(MAX_DAMAGE, CONFIG.ArmorGolden.durabilityForGoldenHelmet()));
            }
            else {
                context.modify(goldenHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorGolden.unbreakableGoldenHelmet())));
            }

            if (!CONFIG.ArmorGolden.unbreakableGoldenChestplate()) {
                context.modify(goldenChestplate, components -> components.add(MAX_DAMAGE, CONFIG.ArmorGolden.durabilityForGoldenChestplate()));
            }
            else {
                context.modify(goldenChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorGolden.unbreakableGoldenChestplate())));
            }

            if (!CONFIG.ArmorGolden.unbreakableGoldenLeggings()) {
                context.modify(goldenLeggings, components -> components.add(MAX_DAMAGE, CONFIG.ArmorGolden.durabilityForGoldenLeggings()));
            }
            else {
                context.modify(goldenLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorGolden.unbreakableGoldenLeggings())));
            }

            if (!CONFIG.ArmorGolden.unbreakableGoldenBoots()) {
                context.modify(goldenBoots, components -> components.add(MAX_DAMAGE, CONFIG.ArmorGolden.durabilityForGoldenBoots()));
            }
            else {
                context.modify(goldenBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorGolden.unbreakableGoldenBoots())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableDiamond() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item diamondHelmet = Registries.ITEM.get(Identifier.of("minecraft", "diamond_helmet"));
            Item diamondChestplate = Registries.ITEM.get(Identifier.of("minecraft", "diamond_chestplate"));
            Item diamondLeggings = Registries.ITEM.get(Identifier.of("minecraft", "diamond_leggings"));
            Item diamondBoots = Registries.ITEM.get(Identifier.of("minecraft", "diamond_boots"));

            if (!CONFIG.ArmorDiamond.unbreakableDiamondHelmet()) {
                context.modify(diamondHelmet, components -> components.add(MAX_DAMAGE, CONFIG.ArmorDiamond.durabilityForDiamondHelmet()));
            }
            else {
                context.modify(diamondHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorDiamond.unbreakableDiamondHelmet())));
            }

            if (!CONFIG.ArmorDiamond.unbreakableDiamondChestplate()) {
                context.modify(diamondChestplate, components -> components.add(MAX_DAMAGE, CONFIG.ArmorDiamond.durabilityForDiamondChestplate()));
            }
            else {
                context.modify(diamondChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorDiamond.unbreakableDiamondChestplate())));
            }

            if (!CONFIG.ArmorDiamond.unbreakableDiamondLeggings()) {
                context.modify(diamondLeggings, components -> components.add(MAX_DAMAGE, CONFIG.ArmorDiamond.durabilityForDiamondLeggings()));
            }
            else {
                context.modify(diamondLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorDiamond.unbreakableDiamondLeggings())));
            }

            if (!CONFIG.ArmorDiamond.unbreakableDiamondBoots()) {
                context.modify(diamondBoots, components -> components.add(MAX_DAMAGE, CONFIG.ArmorDiamond.durabilityForDiamondBoots()));
            }
            else {
                context.modify(diamondBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorDiamond.unbreakableDiamondBoots())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetherite() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteHelmet = Registries.ITEM.get(Identifier.of("minecraft", "netherite_helmet"));
            Item netheriteChestplate = Registries.ITEM.get(Identifier.of("minecraft", "netherite_chestplate"));
            Item netheriteLeggings = Registries.ITEM.get(Identifier.of("minecraft", "netherite_leggings"));
            Item netheriteBoots = Registries.ITEM.get(Identifier.of("minecraft", "netherite_boots"));

            if (!CONFIG.ArmorNetherite.unbreakableNetheriteHelmet()) {
                context.modify(netheriteHelmet, components -> components.add(MAX_DAMAGE, CONFIG.ArmorNetherite.durabilityForNetheriteHelmet()));
            }
            else {
                context.modify(netheriteHelmet, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorNetherite.unbreakableNetheriteHelmet())));
            }

            if (!CONFIG.ArmorNetherite.unbreakableNetheriteChestplate()) {
                context.modify(netheriteChestplate, components -> components.add(MAX_DAMAGE, CONFIG.ArmorNetherite.durabilityForNetheriteChestplate()));
            }
            else {
                context.modify(netheriteChestplate, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorNetherite.unbreakableNetheriteChestplate())));
            }

            if (!CONFIG.ArmorNetherite.unbreakableNetheriteLeggings()) {
                context.modify(netheriteLeggings, components -> components.add(MAX_DAMAGE, CONFIG.ArmorNetherite.durabilityForNetheriteLeggings()));
            }
            else {
                context.modify(netheriteLeggings, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorNetherite.unbreakableNetheriteLeggings())));
            }

            if (!CONFIG.ArmorNetherite.unbreakableNetheriteBoots()) {
                context.modify(netheriteBoots, components -> components.add(MAX_DAMAGE, CONFIG.ArmorNetherite.durabilityForNetheriteBoots()));
            }
            else {
                context.modify(netheriteBoots, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ArmorNetherite.unbreakableNetheriteBoots())));
            }
        });
    }
}
