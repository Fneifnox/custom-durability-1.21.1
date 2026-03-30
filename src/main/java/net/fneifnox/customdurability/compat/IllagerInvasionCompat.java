package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class IllagerInvasionCompat {

    public static void setDurabilityAndUnbreakablePlatinumInfusedHatchet() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item hatchet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("illagerinvasion", "platinum_infused_hatchet"));

            if (!CONFIG.illagerInvasion.unbreakablePlatinumInfusedHatchet()) {
                context.modify(hatchet, components -> components.set(MAX_DAMAGE, CONFIG.illagerInvasion.durabilityForPlatinumInfusedHatchet()));
            } else {
                context.modify(hatchet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
