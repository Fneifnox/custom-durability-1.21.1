package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class FarmersDelightCompat {

    public static void setDurabilityAndUnbreakableKnives() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item flintKnife = Registries.ITEM.get(Identifier.of("farmersdelight", "flint_knife"));
            Item copperKnife = Registries.ITEM.get(Identifier.of("farmersdelight", "copper_knife"));
            Item ironKnife = Registries.ITEM.get(Identifier.of("farmersdelight", "iron_knife"));
            Item goldenKnife = Registries.ITEM.get(Identifier.of("farmersdelight", "golden_knife"));
            Item diamondKnife = Registries.ITEM.get(Identifier.of("farmersdelight", "diamond_knife"));
            Item netheriteKnife = Registries.ITEM.get(Identifier.of("farmersdelight", "netherite_knife"));

            if (!CONFIG.farmersDelight.unbreakableFlintKnife()) {
                context.modify(flintKnife, components -> components.add(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForFlintKnife()));
            } else {
                context.modify(flintKnife, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.farmersDelight.unbreakableCopperKnife()) {
                context.modify(copperKnife, components -> components.add(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForCopperKnife()));
            } else {
                context.modify(copperKnife, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.farmersDelight.unbreakableIronKnife()) {
                context.modify(ironKnife, components -> components.add(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForIronKnife()));
            } else {
                context.modify(ironKnife, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.farmersDelight.unbreakableGoldenKnife()) {
                context.modify(goldenKnife, components -> components.add(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForGoldenKnife()));
            } else {
                context.modify(goldenKnife, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.farmersDelight.unbreakableDiamondKnife()) {
                context.modify(diamondKnife, components -> components.add(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForDiamondKnife()));
            } else {
                context.modify(diamondKnife, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }

            if (!CONFIG.farmersDelight.unbreakableNetheriteKnife()) {
                context.modify(netheriteKnife, components -> components.add(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForNetheriteKnife()));
            } else {
                context.modify(netheriteKnife, components -> components.add(UNBREAKABLE, new UnbreakableComponent((true))));
            }
        });
    }
}
