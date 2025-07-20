package net.fneifnox.customdurability.tools;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class ToolItems {

    public static void setDurabilityAndUnbreakableWooden() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item woodenSword = Registries.ITEM.get(Identifier.of("minecraft", "wooden_sword"));
            Item woodenShovel = Registries.ITEM.get(Identifier.of("minecraft", "wooden_shovel"));
            Item woodenPickaxe = Registries.ITEM.get(Identifier.of("minecraft", "wooden_pickaxe"));
            Item woodenAxe = Registries.ITEM.get(Identifier.of("minecraft", "wooden_axe"));
            Item woodenHoe = Registries.ITEM.get(Identifier.of("minecraft", "wooden_hoe"));

            if (!CONFIG.ToolsWooden.unbreakableWoodenSword()) {
                context.modify(woodenSword, components -> components.add(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenSword()));
            }
            else {
                context.modify(woodenSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsWooden.unbreakableWoodenSword())));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenShovel()) {
                context.modify(woodenShovel, components -> components.add(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenShovel()));
            }
            else {
                context.modify(woodenShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsWooden.unbreakableWoodenShovel())));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenPickaxe()) {
                context.modify(woodenPickaxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenPickaxe()));
            }
            else {
                context.modify(woodenPickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsWooden.unbreakableWoodenPickaxe())));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenAxe()) {
                context.modify(woodenAxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenAxe()));
            }
            else {
                context.modify(woodenAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsWooden.unbreakableWoodenAxe())));
            }

            if (!CONFIG.ToolsWooden.unbreakableWoodenHoe()) {
                context.modify(woodenHoe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsWooden.durabilityForWoodenHoe()));
            }
            else {
                context.modify(woodenHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsWooden.unbreakableWoodenHoe())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableStone() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item stoneSword = Registries.ITEM.get(Identifier.of("minecraft", "stone_sword"));
            Item stoneShovel = Registries.ITEM.get(Identifier.of("minecraft", "stone_shovel"));
            Item stonePickaxe = Registries.ITEM.get(Identifier.of("minecraft", "stone_pickaxe"));
            Item stoneAxe = Registries.ITEM.get(Identifier.of("minecraft", "stone_axe"));
            Item stoneHoe = Registries.ITEM.get(Identifier.of("minecraft", "stone_hoe"));

            if (!CONFIG.ToolsStone.unbreakableStoneSword()) {
                context.modify(stoneSword, components -> components.add(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneSword()));
            }
            else {
                context.modify(stoneSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsStone.unbreakableStoneSword())));
            }

            if (!CONFIG.ToolsStone.unbreakableStoneShovel()) {
                context.modify(stoneShovel, components -> components.add(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneShovel()));
            }
            else {
                context.modify(stoneShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsStone.unbreakableStoneShovel())));
            }

            if (!CONFIG.ToolsStone.unbreakableStonePickaxe()) {
                context.modify(stonePickaxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStonePickaxe()));
            }
            else {
                context.modify(stonePickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsStone.unbreakableStonePickaxe())));
            }

            if (!CONFIG.ToolsStone.unbreakableStoneAxe()) {
                context.modify(stoneAxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneAxe()));
            }
            else {
                context.modify(stoneAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsStone.unbreakableStoneAxe())));
            }

            if (!CONFIG.ToolsStone.unbreakableStoneHoe()) {
                context.modify(stoneHoe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsStone.durabilityForStoneHoe()));
            }
            else {
                context.modify(stoneHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsStone.unbreakableStoneHoe())));
            }

        });
    }

    public static void setDurabilityAndUnbreakableIron() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item ironSword = Registries.ITEM.get(Identifier.of("minecraft", "iron_sword"));
            Item ironShovel = Registries.ITEM.get(Identifier.of("minecraft", "iron_shovel"));
            Item ironPickaxe = Registries.ITEM.get(Identifier.of("minecraft", "iron_pickaxe"));
            Item ironAxe = Registries.ITEM.get(Identifier.of("minecraft", "iron_axe"));
            Item ironHoe = Registries.ITEM.get(Identifier.of("minecraft", "iron_hoe"));

            if (!CONFIG.ToolsIron.unbreakableIronSword()) {
                context.modify(ironSword, components -> components.add(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronSword()));
            }
            else {
                context.modify(ironSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsIron.unbreakableIronSword())));
            }

            if (!CONFIG.ToolsIron.unbreakableIronShovel()) {
                context.modify(ironShovel, components -> components.add(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronShovel()));
            }
            else {
                context.modify(ironShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsIron.unbreakableIronShovel())));
            }

            if (!CONFIG.ToolsIron.unbreakableIronPickaxe()) {
                context.modify(ironPickaxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronPickaxe()));
            }
            else {
                context.modify(ironPickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsIron.unbreakableIronPickaxe())));
            }

            if (!CONFIG.ToolsIron.unbreakableIronAxe()) {
                context.modify(ironAxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronAxe()));
            }
            else {
                context.modify(ironAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsIron.unbreakableIronAxe())));
            }

            if (!CONFIG.ToolsIron.unbreakableIronHoe()) {
                context.modify(ironHoe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsIron.durabilityForIronHoe()));
            }
            else {
                context.modify(ironHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsIron.unbreakableIronHoe())));
            }

        });
    }

    public static void setDurabilityAndUnbreakableGolden() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item goldenSword = Registries.ITEM.get(Identifier.of("minecraft", "golden_sword"));
            Item goldenShovel = Registries.ITEM.get(Identifier.of("minecraft", "golden_shovel"));
            Item goldenPickaxe = Registries.ITEM.get(Identifier.of("minecraft", "golden_pickaxe"));
            Item goldenAxe = Registries.ITEM.get(Identifier.of("minecraft", "golden_axe"));
            Item goldenHoe = Registries.ITEM.get(Identifier.of("minecraft", "golden_hoe"));

            if (!CONFIG.ToolsGolden.unbreakableGoldenSword()) {
                context.modify(goldenSword, components -> components.add(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenSword()));
            }
            else {
                context.modify(goldenSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsGolden.unbreakableGoldenSword())));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenShovel()) {
                context.modify(goldenShovel, components -> components.add(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenShovel()));
            }
            else {
                context.modify(goldenShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsGolden.unbreakableGoldenShovel())));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenPickaxe()) {
                context.modify(goldenPickaxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenPickaxe()));
            }
            else {
                context.modify(goldenPickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsGolden.unbreakableGoldenPickaxe())));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenAxe()) {
                context.modify(goldenAxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenAxe()));
            }
            else {
                context.modify(goldenAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsGolden.unbreakableGoldenAxe())));
            }

            if (!CONFIG.ToolsGolden.unbreakableGoldenHoe()) {
                context.modify(goldenHoe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsGolden.durabilityForGoldenHoe()));
            }
            else {
                context.modify(goldenHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsGolden.unbreakableGoldenHoe())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableDiamond() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item diamondSword = Registries.ITEM.get(Identifier.of("minecraft", "diamond_sword"));
            Item diamondShovel = Registries.ITEM.get(Identifier.of("minecraft", "diamond_shovel"));
            Item diamondPickaxe = Registries.ITEM.get(Identifier.of("minecraft", "diamond_pickaxe"));
            Item diamondAxe = Registries.ITEM.get(Identifier.of("minecraft", "diamond_axe"));
            Item diamondHoe = Registries.ITEM.get(Identifier.of("minecraft", "diamond_hoe"));

            if (!CONFIG.ToolsDiamond.unbreakableDiamondSword()) {
                context.modify(diamondSword, components -> components.add(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondSword()));
            }
            else {
                context.modify(diamondSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsDiamond.unbreakableDiamondSword())));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondShovel()) {
                context.modify(diamondShovel, components -> components.add(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondShovel()));
            }
            else {
                context.modify(diamondShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsDiamond.unbreakableDiamondShovel())));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondPickaxe()) {
                context.modify(diamondPickaxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondPickaxe()));
            }
            else {
                context.modify(diamondPickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsDiamond.unbreakableDiamondPickaxe())));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondAxe()) {
                context.modify(diamondAxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondAxe()));
            }
            else {
                context.modify(diamondAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsDiamond.unbreakableDiamondAxe())));
            }

            if (!CONFIG.ToolsDiamond.unbreakableDiamondHoe()) {
                context.modify(diamondHoe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsDiamond.durabilityForDiamondHoe()));
            }
            else {
                context.modify(diamondHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsDiamond.unbreakableDiamondHoe())));
            }
        });
    }

    public static void setDurabilityAndUnbreakableNetherite() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteSword = Registries.ITEM.get(Identifier.of("minecraft", "netherite_sword"));
            Item netheriteShovel = Registries.ITEM.get(Identifier.of("minecraft", "netherite_shovel"));
            Item netheritePickaxe = Registries.ITEM.get(Identifier.of("minecraft", "netherite_pickaxe"));
            Item netheriteAxe = Registries.ITEM.get(Identifier.of("minecraft", "netherite_axe"));
            Item netheriteHoe = Registries.ITEM.get(Identifier.of("minecraft", "netherite_hoe"));

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteSword()) {
                context.modify(netheriteSword, components -> components.add(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteSword()));
            }
            else {
                context.modify(netheriteSword, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsNetherite.unbreakableNetheriteSword())));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteShovel()) {
                context.modify(netheriteShovel, components -> components.add(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteShovel()));
            }
            else {
                context.modify(netheriteShovel, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsNetherite.unbreakableNetheriteShovel())));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheritePickaxe()) {
                context.modify(netheritePickaxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheritePickaxe()));
            }
            else {
                context.modify(netheritePickaxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsNetherite.unbreakableNetheritePickaxe())));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteAxe()) {
                context.modify(netheriteAxe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteAxe()));
            }
            else {
                context.modify(netheriteAxe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsNetherite.unbreakableNetheriteAxe())));
            }

            if (!CONFIG.ToolsNetherite.unbreakableNetheriteHoe()) {
                context.modify(netheriteHoe, components -> components.add(MAX_DAMAGE, CONFIG.ToolsNetherite.durabilityForNetheriteHoe()));
            }
            else {
                context.modify(netheriteHoe, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.ToolsNetherite.unbreakableNetheriteHoe())));
            }
        });
    }
}
