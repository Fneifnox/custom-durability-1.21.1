package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class FarmersDelightCompat {

    public static void setDurabilityAndUnbreakableKnives() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item flintKnife = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("farmersdelight", "flint_knife"));
            Item copperKnife = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("farmersdelight", "copper_knife"));
            Item ironKnife = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("farmersdelight", "iron_knife"));
            Item goldenKnife = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("farmersdelight", "golden_knife"));
            Item diamondKnife = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("farmersdelight", "diamond_knife"));
            Item netheriteKnife = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("farmersdelight", "netherite_knife"));

            if (!CONFIG.farmersDelight.unbreakableFlintKnife()) {
                context.modify(flintKnife, components -> components.set(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForFlintKnife()));
            } else {
                context.modify(flintKnife, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.farmersDelight.unbreakableCopperKnife()) {
                context.modify(copperKnife, components -> components.set(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForCopperKnife()));
            } else {
                context.modify(copperKnife, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.farmersDelight.unbreakableIronKnife()) {
                context.modify(ironKnife, components -> components.set(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForIronKnife()));
            } else {
                context.modify(ironKnife, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.farmersDelight.unbreakableGoldenKnife()) {
                context.modify(goldenKnife, components -> components.set(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForGoldenKnife()));
            } else {
                context.modify(goldenKnife, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.farmersDelight.unbreakableDiamondKnife()) {
                context.modify(diamondKnife, components -> components.set(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForDiamondKnife()));
            } else {
                context.modify(diamondKnife, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.farmersDelight.unbreakableNetheriteKnife()) {
                context.modify(netheriteKnife, components -> components.set(MAX_DAMAGE, CONFIG.farmersDelight.durabilityForNetheriteKnife()));
            } else {
                context.modify(netheriteKnife, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
