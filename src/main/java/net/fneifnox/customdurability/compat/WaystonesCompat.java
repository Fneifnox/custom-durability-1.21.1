package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class WaystonesCompat {

    public static void setDurabilityAndUnbreakableWarpStone() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item warpStone = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("waystones", "warp_stone"));

            if (!CONFIG.waystones.unbreakableWarpStone()) {
                context.modify(warpStone, components -> components.set(MAX_DAMAGE, CONFIG.waystones.durabilityForWarpStone()));
            }
            else {
                context.modify(warpStone, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
