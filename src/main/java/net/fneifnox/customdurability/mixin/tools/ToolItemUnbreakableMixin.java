package net.fneifnox.customdurability.mixin.tools;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public abstract class ToolItemUnbreakableMixin {

    @ModifyReturnValue(method = "isDamageable", at = @At("RETURN"))
    private boolean UnbreakableTools(boolean original) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() == Items.WOODEN_SWORD && CONFIG.unbreakableTools.unbreakableToolsWooden.unbreakableWoodenSword() ||
                stack.getItem() == Items.WOODEN_SWORD && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.WOODEN_SHOVEL && CONFIG.unbreakableTools.unbreakableToolsWooden.unbreakableWoodenShovel() ||
                stack.getItem() == Items.WOODEN_SHOVEL && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.WOODEN_PICKAXE && CONFIG.unbreakableTools.unbreakableToolsWooden.unbreakableWoodenPickaxe() ||
                stack.getItem() == Items.WOODEN_PICKAXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.WOODEN_AXE && CONFIG.unbreakableTools.unbreakableToolsWooden.unbreakableWoodenAxe() ||
                stack.getItem() == Items.WOODEN_AXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.WOODEN_HOE && CONFIG.unbreakableTools.unbreakableToolsWooden.unbreakableWoodenHoe() ||
                stack.getItem() == Items.WOODEN_HOE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }

        if (stack.getItem() == Items.STONE_SWORD && CONFIG.unbreakableTools.unbreakableToolsStone.unbreakableStoneSword() ||
                stack.getItem() == Items.STONE_SWORD && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.STONE_SHOVEL && CONFIG.unbreakableTools.unbreakableToolsStone.unbreakableStoneShovel() ||
                stack.getItem() == Items.STONE_SHOVEL && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.STONE_PICKAXE && CONFIG.unbreakableTools.unbreakableToolsStone.unbreakableStonePickaxe() ||
                stack.getItem() == Items.STONE_PICKAXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.STONE_AXE && CONFIG.unbreakableTools.unbreakableToolsStone.unbreakableStoneAxe() ||
                stack.getItem() == Items.STONE_AXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.STONE_HOE && CONFIG.unbreakableTools.unbreakableToolsStone.unbreakableStoneHoe() ||
                stack.getItem() == Items.STONE_HOE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }

        if (stack.getItem() == Items.IRON_SWORD && CONFIG.unbreakableTools.unbreakableToolsIron.unbreakableIronSword() ||
                stack.getItem() == Items.IRON_SWORD && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.IRON_SHOVEL && CONFIG.unbreakableTools.unbreakableToolsIron.unbreakableIronShovel() ||
                stack.getItem() == Items.IRON_SHOVEL && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.IRON_PICKAXE && CONFIG.unbreakableTools.unbreakableToolsIron.unbreakableIronPickaxe() ||
                stack.getItem() == Items.IRON_PICKAXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.IRON_AXE && CONFIG.unbreakableTools.unbreakableToolsIron.unbreakableIronAxe() ||
                stack.getItem() == Items.IRON_AXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.IRON_HOE && CONFIG.unbreakableTools.unbreakableToolsIron.unbreakableIronHoe() ||
                stack.getItem() == Items.IRON_HOE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }

        if (stack.getItem() == Items.GOLDEN_SWORD && CONFIG.unbreakableTools.unbreakableToolsGolden.unbreakableGoldenSword() ||
                stack.getItem() == Items.GOLDEN_SWORD && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.GOLDEN_SHOVEL && CONFIG.unbreakableTools.unbreakableToolsGolden.unbreakableGoldenShovel() ||
                stack.getItem() == Items.GOLDEN_SHOVEL && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.GOLDEN_PICKAXE && CONFIG.unbreakableTools.unbreakableToolsGolden.unbreakableGoldenPickaxe() ||
                stack.getItem() == Items.GOLDEN_PICKAXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.GOLDEN_AXE && CONFIG.unbreakableTools.unbreakableToolsGolden.unbreakableGoldenAxe() ||
                stack.getItem() == Items.GOLDEN_AXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.GOLDEN_HOE && CONFIG.unbreakableTools.unbreakableToolsGolden.unbreakableGoldenHoe() ||
                stack.getItem() == Items.GOLDEN_HOE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }

        if (stack.getItem() == Items.DIAMOND_SWORD && CONFIG.unbreakableTools.unbreakableToolsDiamond.unbreakableDiamondSword() ||
                stack.getItem() == Items.DIAMOND_SWORD && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.DIAMOND_SHOVEL && CONFIG.unbreakableTools.unbreakableToolsDiamond.unbreakableDiamondShovel() ||
                stack.getItem() == Items.DIAMOND_SHOVEL && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.DIAMOND_PICKAXE && CONFIG.unbreakableTools.unbreakableToolsDiamond.unbreakableDiamondPickaxe() ||
                stack.getItem() == Items.DIAMOND_PICKAXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.DIAMOND_AXE && CONFIG.unbreakableTools.unbreakableToolsDiamond.unbreakableDiamondAxe() ||
                stack.getItem() == Items.DIAMOND_AXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.DIAMOND_HOE && CONFIG.unbreakableTools.unbreakableToolsDiamond.unbreakableDiamondHoe() ||
                stack.getItem() == Items.DIAMOND_HOE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }

        if (stack.getItem() == Items.NETHERITE_SWORD && CONFIG.unbreakableTools.unbreakableToolsNetherite.unbreakableNetheriteSword() ||
                stack.getItem() == Items.NETHERITE_SWORD && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.NETHERITE_SHOVEL && CONFIG.unbreakableTools.unbreakableToolsNetherite.unbreakableNetheriteShovel() ||
                stack.getItem() == Items.NETHERITE_SHOVEL && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.NETHERITE_PICKAXE && CONFIG.unbreakableTools.unbreakableToolsNetherite.unbreakableNetheritePickaxe() ||
                stack.getItem() == Items.NETHERITE_PICKAXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.NETHERITE_AXE && CONFIG.unbreakableTools.unbreakableToolsNetherite.unbreakableNetheriteAxe() ||
                stack.getItem() == Items.NETHERITE_AXE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        if (stack.getItem() == Items.NETHERITE_HOE && CONFIG.unbreakableTools.unbreakableToolsNetherite.unbreakableNetheriteHoe() ||
                stack.getItem() == Items.NETHERITE_HOE && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }


        return original;
    }
}



