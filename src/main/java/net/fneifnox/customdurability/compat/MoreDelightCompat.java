package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class MoreDelightCompat {

    public static void setDurabilityAndUnbreakableKnives() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item woodenKnife = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("moredelight", "wooden_knife"));
            Item stoneKnife = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("moredelight", "stone_knife"));

            if (!CONFIG.moreDelight.unbreakableWoodenKnife()) {
                context.modify(woodenKnife, components -> components.set(MAX_DAMAGE, CONFIG.moreDelight.durabilityForWoodenKnife()));
            } else {
                context.modify(woodenKnife, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.moreDelight.unbreakableStoneKnife()) {
                context.modify(stoneKnife, components -> components.set(MAX_DAMAGE, CONFIG.moreDelight.durabilityForStoneKnife()));
            } else {
                context.modify(stoneKnife, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
