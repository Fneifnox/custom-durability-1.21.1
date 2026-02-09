package net.fneifnox.customdurability.armor;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class OtherArmorItems {

    public static void setDurabilityAndUnbreakableTurtleHelmet() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item turtleHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "turtle_helmet"));

            if (!CONFIG.ArmorOther.unbreakableTurtleHelmet()) {
                context.modify(turtleHelmet, components -> components.set(MAX_DAMAGE, CONFIG.ArmorOther.durabilityForTurtleHelmet()));
            }
            else {
                context.modify(turtleHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableElytra() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item elytra = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "elytra"));

            if (!CONFIG.ArmorOther.unbreakableElytra()) {
                context.modify(elytra, components -> components.set(MAX_DAMAGE, CONFIG.ArmorOther.durabilityForElytra()));
            }
            else {
                context.modify(elytra, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableWolfArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item wolfArmor = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "wolf_armor"));

            if (!CONFIG.ArmorOther.unbreakableWolfArmor()) {
                context.modify(wolfArmor, components -> components.set(MAX_DAMAGE, CONFIG.ArmorOther.durabilityForWolfArmor()));
            }
            else {
                context.modify(wolfArmor, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
