package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class LateGamePlusCompat {

    public static void setDurabilityAndUnbreakableItems() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteBow = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("lategameplus", "netherite_bow"));
            Item netheriteCrossbow = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("lategameplus", "netherite_crossbow"));
            Item netheriteElytra = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("lategameplus", "netherite_elytra"));
            Item netheriteFishingRod = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("lategameplus", "netherite_fishing_rod"));
            Item netheriteWolfArmor = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("lategameplus", "netherite_wolf_armor"));

            if (!CONFIG.lateGamePlus.unbreakableNetheriteBow()) {
                context.modify(netheriteBow, components -> components.set(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteBow()));
            } else {
                context.modify(netheriteBow, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.lateGamePlus.unbreakableNetheriteCrossbow()) {
                context.modify(netheriteCrossbow, components -> components.set(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteCrossbow()));
            } else {
                context.modify(netheriteCrossbow, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.lateGamePlus.unbreakableNetheriteElytra()) {
                context.modify(netheriteElytra, components -> components.set(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteElytra()));
            } else {
                context.modify(netheriteElytra, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.lateGamePlus.unbreakableNetheriteFishingRod()) {
                context.modify(netheriteFishingRod, components -> components.set(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteFishingRod()));
            } else {
                context.modify(netheriteFishingRod, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.lateGamePlus.unbreakableNetheriteWolfArmor()) {
                context.modify(netheriteWolfArmor, components -> components.set(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteWolfArmor()));
            } else {
                context.modify(netheriteWolfArmor, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
