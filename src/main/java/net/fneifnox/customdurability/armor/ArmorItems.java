package net.fneifnox.customdurability.armor;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class ArmorItems {

    public static void setDurabilityAndUnbreakableLeather() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item leatherHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "leather_helmet"));
            Item leatherChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "leather_chestplate"));
            Item leatherLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "leather_leggings"));
            Item leatherBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "leather_boots"));

            if (!CONFIG.ArmorLeather.unbreakableLeatherHelmet()) {
                context.modify(leatherHelmet, components -> components.set(MAX_DAMAGE, CONFIG.ArmorLeather.durabilityForLeatherHelmet()));
            }
            else {
                context.modify(leatherHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
            if (!CONFIG.ArmorLeather.unbreakableLeatherChestplate()) {
                context.modify(leatherChestplate, components -> components.set(MAX_DAMAGE, CONFIG.ArmorLeather.durabilityForLeatherChestplate()));
            }
            else {
                context.modify(leatherChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorLeather.unbreakableLeatherLeggings()) {
                context.modify(leatherLeggings, components -> components.set(MAX_DAMAGE, CONFIG.ArmorLeather.durabilityForLeatherLeggings()));
            }
            else {
                context.modify(leatherLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorLeather.unbreakableLeatherBoots()) {
                context.modify(leatherBoots, components -> components.set(MAX_DAMAGE, CONFIG.ArmorLeather.durabilityForLeatherBoots()));
            }
            else {
                context.modify(leatherBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableCopper() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item copperHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_helmet"));
            Item copperChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_chestplate"));
            Item copperLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_leggings"));
            Item copperBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_boots"));

            if (!CONFIG.ArmorCopper.unbreakableCopperHelmet()) {
                context.modify(copperHelmet, components -> components.set(MAX_DAMAGE, CONFIG.ArmorCopper.durabilityForCopperHelmet()));
            }
            else {
                context.modify(copperHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
            if (!CONFIG.ArmorCopper.unbreakableCopperChestplate()) {
                context.modify(copperChestplate, components -> components.set(MAX_DAMAGE, CONFIG.ArmorCopper.durabilityForCopperChestplate()));
            }
            else {
                context.modify(copperChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorCopper.unbreakableCopperLeggings()) {
                context.modify(copperLeggings, components -> components.set(MAX_DAMAGE, CONFIG.ArmorCopper.durabilityForCopperLeggings()));
            }
            else {
                context.modify(copperLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorCopper.unbreakableCopperBoots()) {
                context.modify(copperBoots, components -> components.set(MAX_DAMAGE, CONFIG.ArmorCopper.durabilityForCopperBoots()));
            }
            else {
                context.modify(copperBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableChainmail() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item chainHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "chainmail_helmet"));
            Item chainChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "chainmail_chestplate"));
            Item chainLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "chainmail_leggings"));
            Item chainBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "chainmail_boots"));

            if (!CONFIG.ArmorChainmail.unbreakableChainmailHelmet()) {
                context.modify(chainHelmet, components -> components.set(MAX_DAMAGE, CONFIG.ArmorChainmail.durabilityForChainmailHelmet()));
            }
            else {
                context.modify(chainHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorChainmail.unbreakableChainmailChestplate()) {
                context.modify(chainChestplate, components -> components.set(MAX_DAMAGE, CONFIG.ArmorChainmail.durabilityForChainmailChestplate()));
            }
            else {
                context.modify(chainChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorChainmail.unbreakableChainmailLeggings()) {
                context.modify(chainLeggings, components -> components.set(MAX_DAMAGE, CONFIG.ArmorChainmail.durabilityForChainmailLeggings()));
            }
            else {
                context.modify(chainLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorChainmail.unbreakableChainmailBoots()) {
                context.modify(chainBoots, components -> components.set(MAX_DAMAGE, CONFIG.ArmorChainmail.durabilityForChainmailBoots()));
            }
            else {
                context.modify(chainBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableIron() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item ironHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_helmet"));
            Item ironChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_chestplate"));
            Item ironLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_leggings"));
            Item ironBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_boots"));

            if (!CONFIG.ArmorIron.unbreakableIronHelmet()) {
                context.modify(ironHelmet, components -> components.set(MAX_DAMAGE, CONFIG.ArmorIron.durabilityForIronHelmet()));
            }
            else {
                context.modify(ironHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorIron.unbreakableIronChestplate()) {
                context.modify(ironChestplate, components -> components.set(MAX_DAMAGE, CONFIG.ArmorIron.durabilityForIronChestplate()));
            }
            else {
                context.modify(ironChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorIron.unbreakableIronLeggings()) {
                context.modify(ironLeggings, components -> components.set(MAX_DAMAGE, CONFIG.ArmorIron.durabilityForIronLeggings()));
            }
            else {
                context.modify(ironLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorIron.unbreakableIronBoots()) {
                context.modify(ironBoots, components -> components.set(MAX_DAMAGE, CONFIG.ArmorIron.durabilityForIronBoots()));
            }
            else {
                context.modify(ironBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableGolden() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item goldenHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_helmet"));
            Item goldenChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_chestplate"));
            Item goldenLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_leggings"));
            Item goldenBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_boots"));

            if (!CONFIG.ArmorGolden.unbreakableGoldenHelmet()) {
                context.modify(goldenHelmet, components -> components.set(MAX_DAMAGE, CONFIG.ArmorGolden.durabilityForGoldenHelmet()));
            }
            else {
                context.modify(goldenHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorGolden.unbreakableGoldenChestplate()) {
                context.modify(goldenChestplate, components -> components.set(MAX_DAMAGE, CONFIG.ArmorGolden.durabilityForGoldenChestplate()));
            }
            else {
                context.modify(goldenChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorGolden.unbreakableGoldenLeggings()) {
                context.modify(goldenLeggings, components -> components.set(MAX_DAMAGE, CONFIG.ArmorGolden.durabilityForGoldenLeggings()));
            }
            else {
                context.modify(goldenLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorGolden.unbreakableGoldenBoots()) {
                context.modify(goldenBoots, components -> components.set(MAX_DAMAGE, CONFIG.ArmorGolden.durabilityForGoldenBoots()));
            }
            else {
                context.modify(goldenBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableDiamond() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item diamondHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_helmet"));
            Item diamondChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_chestplate"));
            Item diamondLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_leggings"));
            Item diamondBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_boots"));

            if (!CONFIG.ArmorDiamond.unbreakableDiamondHelmet()) {
                context.modify(diamondHelmet, components -> components.set(MAX_DAMAGE, CONFIG.ArmorDiamond.durabilityForDiamondHelmet()));
            }
            else {
                context.modify(diamondHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorDiamond.unbreakableDiamondChestplate()) {
                context.modify(diamondChestplate, components -> components.set(MAX_DAMAGE, CONFIG.ArmorDiamond.durabilityForDiamondChestplate()));
            }
            else {
                context.modify(diamondChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorDiamond.unbreakableDiamondLeggings()) {
                context.modify(diamondLeggings, components -> components.set(MAX_DAMAGE, CONFIG.ArmorDiamond.durabilityForDiamondLeggings()));
            }
            else {
                context.modify(diamondLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorDiamond.unbreakableDiamondBoots()) {
                context.modify(diamondBoots, components -> components.set(MAX_DAMAGE, CONFIG.ArmorDiamond.durabilityForDiamondBoots()));
            }
            else {
                context.modify(diamondBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetherite() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_helmet"));
            Item netheriteChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_chestplate"));
            Item netheriteLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_leggings"));
            Item netheriteBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_boots"));

            if (!CONFIG.ArmorNetherite.unbreakableNetheriteHelmet()) {
                context.modify(netheriteHelmet, components -> components.set(MAX_DAMAGE, CONFIG.ArmorNetherite.durabilityForNetheriteHelmet()));
            }
            else {
                context.modify(netheriteHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorNetherite.unbreakableNetheriteChestplate()) {
                context.modify(netheriteChestplate, components -> components.set(MAX_DAMAGE, CONFIG.ArmorNetherite.durabilityForNetheriteChestplate()));
            }
            else {
                context.modify(netheriteChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorNetherite.unbreakableNetheriteLeggings()) {
                context.modify(netheriteLeggings, components -> components.set(MAX_DAMAGE, CONFIG.ArmorNetherite.durabilityForNetheriteLeggings()));
            }
            else {
                context.modify(netheriteLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ArmorNetherite.unbreakableNetheriteBoots()) {
                context.modify(netheriteBoots, components -> components.set(MAX_DAMAGE, CONFIG.ArmorNetherite.durabilityForNetheriteBoots()));
            }
            else {
                context.modify(netheriteBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
