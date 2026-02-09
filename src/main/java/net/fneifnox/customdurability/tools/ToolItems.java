package net.fneifnox.customdurability.tools;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class ToolItems {

    public static void setDurabilityAndUnbreakableWooden() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item woodenSword = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "wooden_sword"));
            Item woodenShovel = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "wooden_shovel"));
            Item woodenPickaxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "wooden_pickaxe"));
            Item woodenAxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "wooden_axe"));
            Item woodenHoe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "wooden_hoe"));
            Item woodenSpear = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "wooden_spear"));

            if (!CONFIG.ToolsWooden.unbreakableWoodenSword()) {
                context.modify(woodenSword, components -> components.set(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenSword()));
            }
            else {
                context.modify(woodenSword, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenShovel()) {
                context.modify(woodenShovel, components -> components.set(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenShovel()));
            }
            else {
                context.modify(woodenShovel, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenPickaxe()) {
                context.modify(woodenPickaxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenPickaxe()));
            }
            else {
                context.modify(woodenPickaxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenAxe()) {
                context.modify(woodenAxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenAxe()));
            }
            else {
                context.modify(woodenAxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenHoe()) {
                context.modify(woodenHoe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenHoe()));
            }
            else {
                context.modify(woodenHoe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenSpear()) {
                context.modify(woodenSpear, components -> components.set(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenSpear()));
            }
            else {
                context.modify(woodenSpear, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableStone() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item stoneSword = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "stone_sword"));
            Item stoneShovel = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "stone_shovel"));
            Item stonePickaxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "stone_pickaxe"));
            Item stoneAxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "stone_axe"));
            Item stoneHoe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "stone_hoe"));
            Item stoneSpear = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "stone_spear"));

            if (!CONFIG.ToolsStone.unbreakableStoneSword()) {
                context.modify(stoneSword, components -> components.set(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneSword()));
            }
            else {
                context.modify(stoneSword, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsStone.unbreakableStoneShovel()) {
                context.modify(stoneShovel, components -> components.set(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneShovel()));
            }
            else {
                context.modify(stoneShovel, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsStone.unbreakableStonePickaxe()) {
                context.modify(stonePickaxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStonePickaxe()));
            }
            else {
                context.modify(stonePickaxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsStone.unbreakableStoneAxe()) {
                context.modify(stoneAxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneAxe()));
            }
            else {
                context.modify(stoneAxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsStone.unbreakableStoneHoe()) {
                context.modify(stoneHoe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneHoe()));
            }
            else {
                context.modify(stoneHoe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsStone.unbreakableStoneSpear()) {
                context.modify(stoneSpear, components -> components.set(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneSpear()));
            }
            else {
                context.modify(stoneSpear, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableCopper() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item copperSword = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_sword"));
            Item copperShovel = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_shovel"));
            Item copperPickaxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_pickaxe"));
            Item copperAxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_axe"));
            Item copperHoe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_hoe"));
            Item copperSpear = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "copper_spear"));

            if (!CONFIG.ToolsCopper.unbreakableCopperSword()) {
                context.modify(copperSword, components -> components.set(MAX_DAMAGE, CONFIG.ToolsCopper.durabilityForCopperSword()));
            }
            else {
                context.modify(copperSword, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsCopper.unbreakableCopperShovel()) {
                context.modify(copperShovel, components -> components.set(MAX_DAMAGE, CONFIG.ToolsCopper.durabilityForCopperShovel()));
            }
            else {
                context.modify(copperShovel, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsCopper.unbreakableCopperPickaxe()) {
                context.modify(copperPickaxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsCopper.durabilityForCopperPickaxe()));
            }
            else {
                context.modify(copperPickaxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsCopper.unbreakableCopperAxe()) {
                context.modify(copperAxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsCopper.durabilityForCopperAxe()));
            }
            else {
                context.modify(copperAxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsCopper.unbreakableCopperHoe()) {
                context.modify(copperHoe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsCopper.durabilityForCopperHoe()));
            }
            else {
                context.modify(copperHoe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsCopper.unbreakableCopperSpear()) {
                context.modify(copperSpear, components -> components.set(MAX_DAMAGE, CONFIG.ToolsCopper.durabilityForCopperSpear()));
            }
            else {
                context.modify(copperSpear, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableIron() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item ironSword = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_sword"));
            Item ironShovel = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_shovel"));
            Item ironPickaxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_pickaxe"));
            Item ironAxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_axe"));
            Item ironHoe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_hoe"));
            Item ironSpear = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "iron_spear"));

            if (!CONFIG.ToolsIron.unbreakableIronSword()) {
                context.modify(ironSword, components -> components.set(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronSword()));
            }
            else {
                context.modify(ironSword, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsIron.unbreakableIronShovel()) {
                context.modify(ironShovel, components -> components.set(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronShovel()));
            }
            else {
                context.modify(ironShovel, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsIron.unbreakableIronPickaxe()) {
                context.modify(ironPickaxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronPickaxe()));
            }
            else {
                context.modify(ironPickaxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsIron.unbreakableIronAxe()) {
                context.modify(ironAxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronAxe()));
            }
            else {
                context.modify(ironAxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsIron.unbreakableIronHoe()) {
                context.modify(ironHoe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronHoe()));
            }
            else {
                context.modify(ironHoe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsIron.unbreakableIronSpear()) {
                context.modify(ironSpear, components -> components.set(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronSpear()));
            }
            else {
                context.modify(ironSpear, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableGolden() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item goldenSword = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_sword"));
            Item goldenShovel = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_shovel"));
            Item goldenPickaxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_pickaxe"));
            Item goldenAxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_axe"));
            Item goldenHoe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_hoe"));
            Item goldenSpear = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "golden_spear"));

            if (!CONFIG.ToolsGolden.unbreakableGoldenSword()) {
                context.modify(goldenSword, components -> components.set(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenSword()));
            }
            else {
                context.modify(goldenSword, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenShovel()) {
                context.modify(goldenShovel, components -> components.set(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenShovel()));
            }
            else {
                context.modify(goldenShovel, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenPickaxe()) {
                context.modify(goldenPickaxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenPickaxe()));
            }
            else {
                context.modify(goldenPickaxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenAxe()) {
                context.modify(goldenAxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenAxe()));
            }
            else {
                context.modify(goldenAxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenHoe()) {
                context.modify(goldenHoe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenHoe()));
            }
            else {
                context.modify(goldenHoe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenSpear()) {
                context.modify(goldenSpear, components -> components.set(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenSpear()));
            }
            else {
                context.modify(goldenSpear, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableDiamond() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item diamondSword = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_sword"));
            Item diamondShovel = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_shovel"));
            Item diamondPickaxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_pickaxe"));
            Item diamondAxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_axe"));
            Item diamondHoe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_hoe"));
            Item diamondSpear = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "diamond_spear"));

            if (!CONFIG.ToolsDiamond.unbreakableDiamondSword()) {
                context.modify(diamondSword, components -> components.set(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondSword()));
            }
            else {
                context.modify(diamondSword, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondShovel()) {
                context.modify(diamondShovel, components -> components.set(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondShovel()));
            }
            else {
                context.modify(diamondShovel, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondPickaxe()) {
                context.modify(diamondPickaxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondPickaxe()));
            }
            else {
                context.modify(diamondPickaxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondAxe()) {
                context.modify(diamondAxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondAxe()));
            }
            else {
                context.modify(diamondAxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondHoe()) {
                context.modify(diamondHoe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondHoe()));
            }
            else {
                context.modify(diamondHoe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondSpear()) {
                context.modify(diamondSpear, components -> components.set(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondSpear()));
            }
            else {
                context.modify(diamondSpear, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetherite() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteSword = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_sword"));
            Item netheriteShovel = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_shovel"));
            Item netheritePickaxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_pickaxe"));
            Item netheriteAxe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_axe"));
            Item netheriteHoe = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_hoe"));
            Item netheriteSpear = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("minecraft", "netherite_spear"));

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteSword()) {
                context.modify(netheriteSword, components -> components.set(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteSword()));
            }
            else {
                context.modify(netheriteSword, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteShovel()) {
                context.modify(netheriteShovel, components -> components.set(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteShovel()));
            }
            else {
                context.modify(netheriteShovel, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheritePickaxe()) {
                context.modify(netheritePickaxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheritePickaxe()));
            }
            else {
                context.modify(netheritePickaxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteAxe()) {
                context.modify(netheriteAxe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteAxe()));
            }
            else {
                context.modify(netheriteAxe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteHoe()) {
                context.modify(netheriteHoe, components -> components.set(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteHoe()));
            }
            else {
                context.modify(netheriteHoe, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteSpear()) {
                context.modify(netheriteSpear, components -> components.set(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteSpear()));
            }
            else {
                context.modify(netheriteSpear, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
