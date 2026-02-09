package net.fneifnox.customdurability.tools;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class OtherToolItems {

    public static void setDurabilityAndUnbreakableTrident() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item trident = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "trident"));

            if (!CONFIG.ToolsOther.unbreakableTrident()) {
                context.modify(trident, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForTrident()));
            }
            else {
                context.modify(trident, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableMace() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item mace = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "mace"));

            if (!CONFIG.ToolsOther.unbreakableMace()) {
                context.modify(mace, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForMace()));
            }
            else {
                context.modify(mace, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableBow() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item bow = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "bow"));

            if (!CONFIG.ToolsOther.unbreakableBow()) {
                context.modify(bow, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForBow()));
            }
            else {
                context.modify(bow, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableCrossbow() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item crossbow = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "crossbow"));

            if (!CONFIG.ToolsOther.unbreakableCrossbow()) {
                context.modify(crossbow, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForCrossbow()));
            }
            else {
                context.modify(crossbow, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableShield() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item shield = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "shield"));

            if (!CONFIG.ToolsOther.unbreakableShield()) {
                context.modify(shield, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForShield()));
            }
            else {
                context.modify(shield, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableFishingRod() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item fishingRod = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "fishing_rod"));

            if (!CONFIG.ToolsOther.unbreakableFishingRod()) {
                context.modify(fishingRod, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForFishingRod()));
            }
            else {
                context.modify(fishingRod, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableFlintAndSteel() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item flintAndSteel = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "flint_and_steel"));

            if (!CONFIG.ToolsOther.unbreakableFlintAndSteel()) {
                context.modify(flintAndSteel, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForFlintAndSteel()));
            }
            else {
                context.modify(flintAndSteel, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableShears() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item shears = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "shears"));

            if (!CONFIG.ToolsOther.unbreakableShears()) {
                context.modify(shears, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForShears()));
            }
            else {
                context.modify(shears, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableBrush() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item brush = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "brush"));

            if (!CONFIG.ToolsOther.unbreakableShears()) {
                context.modify(brush, components -> components.set(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForBrush()));
            }
            else {
                context.modify(brush, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
