package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Unit;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class WaystonesCompat {

    public static void setDurabilityAndUnbreakableWarpStone() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item warpStone = Registries.ITEM.get(Identifier.of("waystones", "warp_stone"));

            if (!CONFIG.waystones.unbreakableWarpStone()) {
                context.modify(warpStone, components -> components.add(MAX_DAMAGE, CONFIG.waystones.durabilityForWarpStone()));
            }
            else {
                context.modify(warpStone, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
