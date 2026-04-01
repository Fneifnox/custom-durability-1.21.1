package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Unit;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class ToughAsNailsCompat {

    public static void setDurabilityAndUnbreakableLeafArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item leafHelmet = Registries.ITEM.get(Identifier.of("toughasnails", "leaf_helmet"));
            Item leafChestplate = Registries.ITEM.get(Identifier.of("toughasnails", "leaf_chestplate"));
            Item leafLeggings = Registries.ITEM.get(Identifier.of("toughasnails", "leaf_leggings"));
            Item leafBoots = Registries.ITEM.get(Identifier.of("toughasnails", "leaf_boots"));

            if (!CONFIG.toughAsNails.unbreakableLeafHelmet()) {
                context.modify(leafHelmet, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeafHelmet()));
            } else {
                context.modify(leafHelmet, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableLeafChestplate()) {
                context.modify(leafChestplate, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeafChestplate()));
            } else {
                context.modify(leafChestplate, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableLeafLeggings()) {
                context.modify(leafLeggings, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeafLeggings()));
            } else {
                context.modify(leafLeggings, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableLeafBoots()) {
                context.modify(leafBoots, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeafBoots()));
            } else {
                context.modify(leafBoots, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableWoolArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item woolHelmet = Registries.ITEM.get(Identifier.of("toughasnails", "wool_helmet"));
            Item woolChestplate = Registries.ITEM.get(Identifier.of("toughasnails", "wool_chestplate"));
            Item woolLeggings = Registries.ITEM.get(Identifier.of("toughasnails", "wool_leggings"));
            Item woolBoots = Registries.ITEM.get(Identifier.of("toughasnails", "wool_boots"));

            if (!CONFIG.toughAsNails.unbreakableWoolHelmet()) {
                context.modify(woolHelmet, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForWoolHelmet()));
            } else {
                context.modify(woolHelmet, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableWoolChestplate()) {
                context.modify(woolChestplate, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForWoolChestplate()));
            } else {
                context.modify(woolChestplate, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableWoolLeggings()) {
                context.modify(woolLeggings, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForWoolLeggings()));
            } else {
                context.modify(woolLeggings, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.toughAsNails.unbreakableWoolBoots()) {
                context.modify(woolBoots, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForWoolBoots()));
            } else {
                context.modify(woolBoots, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableCanteens() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item leatherCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "leather_water_canteen"));
            Item leatherDirtyCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "leather_dirty_water_canteen"));
            Item leatherPureCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "leather_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableLeatherCanteen()) {
                context.modify(leatherCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeatherCanteen()));
                context.modify(leatherDirtyCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeatherCanteen()));
                context.modify(leatherPureCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForLeatherCanteen()));
            } else {
                context.modify(leatherCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(leatherDirtyCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(leatherPureCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            Item copperCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "copper_water_canteen"));
            Item copperDirtyCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "copper_dirty_water_canteen"));
            Item copperPureCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "copper_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableCopperCanteen()) {
                context.modify(copperCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForCopperCanteen()));
                context.modify(copperDirtyCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForCopperCanteen()));
                context.modify(copperPureCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForCopperCanteen()));
            } else {
                context.modify(copperCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(copperDirtyCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(copperPureCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            Item ironCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "iron_water_canteen"));
            Item ironDirtyCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "iron_dirty_water_canteen"));
            Item ironPureCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "iron_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableIronCanteen()) {
                context.modify(ironCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForIronCanteen()));
                context.modify(ironDirtyCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForIronCanteen()));
                context.modify(ironPureCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForIronCanteen()));
            } else {
                context.modify(ironCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(ironDirtyCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(ironPureCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            Item goldCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "gold_water_canteen"));
            Item goldDirtyCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "gold_dirty_water_canteen"));
            Item goldPureCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "gold_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableGoldCanteen()) {
                context.modify(goldCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForGoldCanteen()));
                context.modify(goldDirtyCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForGoldCanteen()));
                context.modify(goldPureCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForGoldCanteen()));
            } else {
                context.modify(goldCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(goldDirtyCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(goldPureCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            // diamond
            Item diamondCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "diamond_water_canteen"));
            Item diamondDirtyCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "diamond_dirty_water_canteen"));
            Item diamondPureCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "diamond_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableDiamondCanteen()) {
                context.modify(diamondCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForDiamondCanteen()));
                context.modify(diamondDirtyCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForDiamondCanteen()));
                context.modify(diamondPureCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForDiamondCanteen()));
            } else {
                context.modify(diamondCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(diamondDirtyCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(diamondPureCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }

            // netherite
            Item netheriteCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "netherite_water_canteen"));
            Item netheriteDirtyCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "netherite_dirty_water_canteen"));
            Item netheritePureCanteen = Registries.ITEM.get(Identifier.of("toughasnails", "netherite_purified_water_canteen"));

            if (!CONFIG.toughAsNails.unbreakableNetheriteCanteen()) {
                context.modify(netheriteCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForNetheriteCanteen()));
                context.modify(netheriteDirtyCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForNetheriteCanteen()));
                context.modify(netheritePureCanteen, components -> components.add(MAX_DAMAGE, CONFIG.toughAsNails.durabilityForNetheriteCanteen()));
            } else {
                context.modify(netheriteCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(netheriteDirtyCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
                context.modify(netheritePureCanteen, components -> components.add(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
