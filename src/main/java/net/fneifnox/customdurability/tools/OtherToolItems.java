package net.fneifnox.customdurability.tools;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Unit;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class OtherToolItems {

    public static void setDurabilityAndUnbreakableTrident() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item trident = Registries.ITEM.get(Identifier.of("minecraft", "trident"));

            if (!CONFIG.ToolsOther.unbreakableTrident()) {
                context.modify(trident, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForTrident()));
            }
            else {
                context.modify(trident, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableMace() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item mace = Registries.ITEM.get(Identifier.of("minecraft", "mace"));

            if (!CONFIG.ToolsOther.unbreakableMace()) {
                context.modify(mace, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForMace()));
            }
            else {
                context.modify(mace, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableBow() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item bow = Registries.ITEM.get(Identifier.of("minecraft", "bow"));

            if (!CONFIG.ToolsOther.unbreakableBow()) {
                context.modify(bow, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForBow()));
            }
            else {
                context.modify(bow, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableCrossbow() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item crossbow = Registries.ITEM.get(Identifier.of("minecraft", "crossbow"));

            if (!CONFIG.ToolsOther.unbreakableCrossbow()) {
                context.modify(crossbow, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForCrossbow()));
            }
            else {
                context.modify(crossbow, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableShield() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item shield = Registries.ITEM.get(Identifier.of("minecraft", "shield"));

            if (!CONFIG.ToolsOther.unbreakableShield()) {
                context.modify(shield, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForShield()));
            }
            else {
                context.modify(shield, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableFishingRod() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item fishingRod = Registries.ITEM.get(Identifier.of("minecraft", "fishing_rod"));

            if (!CONFIG.ToolsOther.unbreakableFishingRod()) {
                context.modify(fishingRod, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForFishingRod()));
            }
            else {
                context.modify(fishingRod, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableFlintAndSteel() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item flintAndSteel = Registries.ITEM.get(Identifier.of("minecraft", "flint_and_steel"));

            if (!CONFIG.ToolsOther.unbreakableFlintAndSteel()) {
                context.modify(flintAndSteel, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForFlintAndSteel()));
            }
            else {
                context.modify(flintAndSteel, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableShears() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item shears = Registries.ITEM.get(Identifier.of("minecraft", "shears"));

            if (!CONFIG.ToolsOther.unbreakableShears()) {
                context.modify(shears, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForShears()));
            }
            else {
                context.modify(shears, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableBrush() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item brush = Registries.ITEM.get(Identifier.of("minecraft", "brush"));

            if (!CONFIG.ToolsOther.unbreakableShears()) {
                context.modify(brush, components -> components.add(MAX_DAMAGE, CONFIG.ToolsOther.durabilityForBrush()));
            }
            else {
                context.modify(brush, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
