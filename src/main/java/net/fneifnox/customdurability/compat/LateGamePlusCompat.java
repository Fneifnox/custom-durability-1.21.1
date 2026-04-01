package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class LateGamePlusCompat {

    public static void setDurabilityAndUnbreakableItems() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteBow = Registries.ITEM.get(Identifier.of("lategameplus", "netherite_bow"));
            Item netheriteCrossbow = Registries.ITEM.get(Identifier.of("lategameplus", "netherite_crossbow"));
            Item netheriteElytra = Registries.ITEM.get(Identifier.of("lategameplus", "netherite_elytra"));
            Item netheriteFishingRod = Registries.ITEM.get(Identifier.of("lategameplus", "netherite_fishing_rod"));
            Item netheriteWolfArmor = Registries.ITEM.get(Identifier.of("lategameplus", "netherite_wolf_armor"));

            if (!CONFIG.lateGamePlus.unbreakableNetheriteBow()) {
                context.modify(netheriteBow, components -> components.add(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteBow()));
            } else {
                context.modify(netheriteBow, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.lateGamePlus.unbreakableNetheriteCrossbow()) {
                context.modify(netheriteCrossbow, components -> components.add(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteCrossbow()));
            } else {
                context.modify(netheriteCrossbow, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.lateGamePlus.unbreakableNetheriteElytra()) {
                context.modify(netheriteElytra, components -> components.add(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteElytra()));
            } else {
                context.modify(netheriteElytra, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.lateGamePlus.unbreakableNetheriteFishingRod()) {
                context.modify(netheriteFishingRod, components -> components.add(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteFishingRod()));
            } else {
                context.modify(netheriteFishingRod, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.lateGamePlus.unbreakableNetheriteWolfArmor()) {
                context.modify(netheriteWolfArmor, components -> components.add(MAX_DAMAGE, CONFIG.lateGamePlus.durabilityForNetheriteWolfArmor()));
            } else {
                context.modify(netheriteWolfArmor, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }
        });
    }
}
