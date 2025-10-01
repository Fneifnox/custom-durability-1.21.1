package net.fneifnox.customdurability.armor;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Unit;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class OtherArmorItems {

    public static void setDurabilityAndUnbreakableTurtleHelmet() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item turtleHelmet = Registries.ITEM.get(Identifier.of("minecraft", "turtle_helmet"));

            if (!CONFIG.ArmorOther.unbreakableTurtleHelmet()) {
                context.modify(turtleHelmet, components -> components.add(MAX_DAMAGE, CONFIG.ArmorOther.durabilityForTurtleHelmet()));
            }
            else {
                context.modify(turtleHelmet, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableElytra() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item elytra = Registries.ITEM.get(Identifier.of("minecraft", "elytra"));

            if (!CONFIG.ArmorOther.unbreakableElytra()) {
                context.modify(elytra, components -> components.add(MAX_DAMAGE, CONFIG.ArmorOther.durabilityForElytra()));
            }
            else {
                context.modify(elytra, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableWolfArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item wolfArmor = Registries.ITEM.get(Identifier.of("minecraft", "wolf_armor"));

            if (!CONFIG.ArmorOther.unbreakableWolfArmor()) {
                context.modify(wolfArmor, components -> components.add(MAX_DAMAGE, CONFIG.ArmorOther.durabilityForWolfArmor()));
            }
            else {
                context.modify(wolfArmor, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
