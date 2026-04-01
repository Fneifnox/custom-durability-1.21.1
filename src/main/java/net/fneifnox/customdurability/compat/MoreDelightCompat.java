package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class MoreDelightCompat {

    public static void setDurabilityAndUnbreakableKnives() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item woodenKnife = Registries.ITEM.get(Identifier.of("moredelight", "wooden_knife"));
            Item stoneKnife = Registries.ITEM.get(Identifier.of("moredelight", "stone_knife"));

            if (!CONFIG.moreDelight.unbreakableWoodenKnife()) {
                context.modify(woodenKnife, components -> components.add(MAX_DAMAGE, CONFIG.moreDelight.durabilityForWoodenKnife()));
            } else {
                context.modify(woodenKnife, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.moreDelight.unbreakableStoneKnife()) {
                context.modify(stoneKnife, components -> components.add(MAX_DAMAGE, CONFIG.moreDelight.durabilityForStoneKnife()));
            } else {
                context.modify(stoneKnife, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }
        });
    }
}
