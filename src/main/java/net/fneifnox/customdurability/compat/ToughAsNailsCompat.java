package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class ToughAsNailsCompat {

    public static void setDurabilityAndUnbreakableLeafArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item leafHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "leaf_helmet"));
            Item leafChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "leaf_chestplate"));
            Item leafLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "leaf_leggings"));
            Item leafBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "leaf_boots"));

            if (!CONFIG.toughAsNails.unbreakableLeafHelmet()) {
                context.modify(leafHelmet, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeafHelmet()));
            } else {
                context.modify(leafHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableLeafChestplate()) {
                context.modify(leafChestplate, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeafChestplate()));
            } else {
                context.modify(leafChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableLeafLeggings()) {
                context.modify(leafLeggings, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeafLeggings()));
            } else {
                context.modify(leafLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableLeafBoots()) {
                context.modify(leafBoots, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeafBoots()));
            } else {
                context.modify(leafBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableWoolArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item woolHelmet = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "wool_helmet"));
            Item woolChestplate = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "wool_chestplate"));
            Item woolLeggings = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "wool_leggings"));
            Item woolBoots = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "wool_boots"));

            if (!CONFIG.toughAsNails.unbreakableWoolHelmet()) {
                context.modify(woolHelmet, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForWoolHelmet()));
            } else {
                context.modify(woolHelmet, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableWoolChestplate()) {
                context.modify(woolChestplate, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForWoolChestplate()));
            } else {
                context.modify(woolChestplate, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableWoolLeggings()) {
                context.modify(woolLeggings, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForWoolLeggings()));
            } else {
                context.modify(woolLeggings, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableWoolBoots()) {
                context.modify(woolBoots, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForWoolBoots()));
            } else {
                context.modify(woolBoots, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableCanteens() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item leatherCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "leather_water_canteen"));
            Item leatherDirtyCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "leather_dirty_water_canteen"));
            Item leatherPureCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "leather_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableLeatherCanteen()) {
                context.modify(leatherCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeatherCanteen()));
                context.modify(leatherDirtyCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeatherCanteen()));
                context.modify(leatherPureCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeatherCanteen()));
            } else {
                context.modify(leatherCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(leatherDirtyCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(leatherPureCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            Item copperCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "copper_water_canteen"));
            Item copperDirtyCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "copper_dirty_water_canteen"));
            Item copperPureCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "copper_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableCopperCanteen()) {
                context.modify(copperCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForCopperCanteen()));
                context.modify(copperDirtyCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForCopperCanteen()));
                context.modify(copperPureCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForCopperCanteen()));
            } else {
                context.modify(copperCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(copperDirtyCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(copperPureCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            Item ironCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "iron_water_canteen"));
            Item ironDirtyCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "iron_dirty_water_canteen"));
            Item ironPureCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "iron_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableIronCanteen()) {
                context.modify(ironCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForIronCanteen()));
                context.modify(ironDirtyCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForIronCanteen()));
                context.modify(ironPureCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForIronCanteen()));
            } else {
                context.modify(ironCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(ironDirtyCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(ironPureCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            Item goldCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "gold_water_canteen"));
            Item goldDirtyCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "gold_dirty_water_canteen"));
            Item goldPureCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "gold_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableGoldCanteen()) {
                context.modify(goldCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForGoldCanteen()));
                context.modify(goldDirtyCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForGoldCanteen()));
                context.modify(goldPureCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForGoldCanteen()));
            } else {
                context.modify(goldCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(goldDirtyCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(goldPureCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            // diamond
            Item diamondCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "diamond_water_canteen"));
            Item diamondDirtyCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "diamond_dirty_water_canteen"));
            Item diamondPureCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "diamond_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableDiamondCanteen()) {
                context.modify(diamondCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForDiamondCanteen()));
                context.modify(diamondDirtyCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForDiamondCanteen()));
                context.modify(diamondPureCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForDiamondCanteen()));
            } else {
                context.modify(diamondCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(diamondDirtyCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(diamondPureCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            // netherite
            Item netheriteCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "netherite_water_canteen"));
            Item netheriteDirtyCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "netherite_dirty_water_canteen"));
            Item netheritePureCanteen = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("toughasnails", "netherite_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableNetheriteCanteen()) {
                context.modify(netheriteCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForNetheriteCanteen()));
                context.modify(netheriteDirtyCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForNetheriteCanteen()));
                context.modify(netheritePureCanteen, components -> components.set(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForNetheriteCanteen()));
            } else {
                context.modify(netheriteCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(netheriteDirtyCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
                context.modify(netheritePureCanteen, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
