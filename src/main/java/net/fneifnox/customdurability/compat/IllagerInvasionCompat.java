package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Unit;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class IllagerInvasionCompat {

    public static void setDurabilityAndUnbreakablePlatinumInfusedHatchet() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item platinumInfusedHatchet = Registries.ITEM.get(Identifier.of("illagerinvasion", "platinum_infused_hatchet"));

            if (!CONFIG.illagerInvasion.unbreakablePlatinumInfusedHatchet()) {
                context.modify(platinumInfusedHatchet, components -> components.add(MAX_DAMAGE, CONFIG.illagerInvasion.durabilityForPlatinumInfusedHatchet()));
            } else {
                context.modify(platinumInfusedHatchet, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
