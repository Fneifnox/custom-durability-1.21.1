package net.fneifnox.customdurability.mixin.armor;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public abstract class ArmorItemUnbreakableMixin {

    @ModifyReturnValue(method = "isDamageable", at = @At("RETURN"))
    private boolean UnbreakableArmor(boolean original) {
        ItemStack stack = (ItemStack)(Object) this;

        if (stack.getItem() == Items.LEATHER_BOOTS && CONFIG.unbreakableArmor.unbreakableArmorLeather.unbreakableLeatherBoots() ||
                stack.getItem() == Items.LEATHER_BOOTS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.LEATHER_LEGGINGS && CONFIG.unbreakableArmor.unbreakableArmorLeather.unbreakableLeatherLeggings() ||
                stack.getItem() == Items.LEATHER_LEGGINGS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.LEATHER_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableArmorLeather.unbreakableLeatherChestplate() ||
                stack.getItem() == Items.LEATHER_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.LEATHER_HELMET && CONFIG.unbreakableArmor.unbreakableArmorLeather.unbreakableLeatherHelmet() ||
                stack.getItem() == Items.LEATHER_HELMET && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }

        if (stack.getItem() == Items.CHAINMAIL_BOOTS && CONFIG.unbreakableArmor.unbreakableArmorChainmail.unbreakableChainmailBoots() ||
                stack.getItem() == Items.CHAINMAIL_BOOTS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.CHAINMAIL_LEGGINGS && CONFIG.unbreakableArmor.unbreakableArmorChainmail.unbreakableChainmailLeggings() ||
                stack.getItem() == Items.CHAINMAIL_LEGGINGS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.CHAINMAIL_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableArmorChainmail.unbreakableChainmailChestplate() ||
                stack.getItem() == Items.CHAINMAIL_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.CHAINMAIL_HELMET && CONFIG.unbreakableArmor.unbreakableArmorChainmail.unbreakableChainmailHelmet() ||
                stack.getItem() == Items.CHAINMAIL_HELMET && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }

        if (stack.getItem() == Items.IRON_BOOTS && CONFIG.unbreakableArmor.unbreakableArmorIron.unbreakableIronBoots() ||
                stack.getItem() == Items.IRON_BOOTS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.IRON_LEGGINGS && CONFIG.unbreakableArmor.unbreakableArmorIron.unbreakableIronLeggings() ||
                stack.getItem() == Items.IRON_LEGGINGS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.IRON_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableArmorIron.unbreakableIronChestplate() ||
                stack.getItem() == Items.IRON_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.IRON_HELMET && CONFIG.unbreakableArmor.unbreakableArmorIron.unbreakableIronHelmet() ||
                stack.getItem() == Items.IRON_HELMET && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }

        if (stack.getItem() == Items.GOLDEN_BOOTS && CONFIG.unbreakableArmor.unbreakableArmorGolden.unbreakableGoldenBoots() ||
                stack.getItem() == Items.GOLDEN_BOOTS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.GOLDEN_LEGGINGS && CONFIG.unbreakableArmor.unbreakableArmorGolden.unbreakableGoldenLeggings() ||
                stack.getItem() == Items.GOLDEN_LEGGINGS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.GOLDEN_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableArmorGolden.unbreakableGoldenChestplate() ||
                stack.getItem() == Items.GOLDEN_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.GOLDEN_HELMET && CONFIG.unbreakableArmor.unbreakableArmorGolden.unbreakableGoldenHelmet() ||
                stack.getItem() == Items.GOLDEN_HELMET && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }

        if (stack.getItem() == Items.DIAMOND_BOOTS && CONFIG.unbreakableArmor.unbreakableArmorDiamond.unbreakableDiamondBoots() ||
                stack.getItem() == Items.DIAMOND_BOOTS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.DIAMOND_LEGGINGS && CONFIG.unbreakableArmor.unbreakableArmorDiamond.unbreakableDiamondLeggings() ||
                stack.getItem() == Items.DIAMOND_LEGGINGS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.DIAMOND_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableArmorDiamond.unbreakableDiamondChestplate() ||
                stack.getItem() == Items.DIAMOND_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.DIAMOND_HELMET && CONFIG.unbreakableArmor.unbreakableArmorDiamond.unbreakableDiamondHelmet() ||
                stack.getItem() == Items.DIAMOND_HELMET && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }

        if (stack.getItem() == Items.NETHERITE_BOOTS && CONFIG.unbreakableArmor.unbreakableArmorNetherite.unbreakableNetheriteBoots() ||
                stack.getItem() == Items.NETHERITE_BOOTS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.NETHERITE_LEGGINGS && CONFIG.unbreakableArmor.unbreakableArmorNetherite.unbreakableNetheriteLeggings() ||
                stack.getItem() == Items.NETHERITE_LEGGINGS && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.NETHERITE_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableArmorNetherite.unbreakableNetheriteChestplate() ||
                stack.getItem() == Items.NETHERITE_CHESTPLATE && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }
        if (stack.getItem() == Items.NETHERITE_HELMET && CONFIG.unbreakableArmor.unbreakableArmorNetherite.unbreakableNetheriteHelmet() ||
                stack.getItem() == Items.NETHERITE_HELMET && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }

        if (stack.getItem() == Items.TURTLE_HELMET && CONFIG.unbreakableArmor.unbreakableArmorOther.unbreakableTurtleHelmet() ||
                stack.getItem() == Items.TURTLE_HELMET && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return false;
        }

        return original;
    }
}
