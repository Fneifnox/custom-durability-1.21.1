package net.fneifnox.customdurability.mixin.armor;

import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public abstract class ElytraItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof ElytraItem) {
            if (CONFIG.unbreakableArmor.unbreakableArmorOther.unbreakableElytra() ||
                    CONFIG.unbreakableArmor.unbreakableAllArmor()) {
                cir.setReturnValue(1);
            } else {
                cir.setReturnValue(CONFIG.durabilityForElytra());
            }
        }
    }

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void modifyIsDamageable(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof ElytraItem && CONFIG.unbreakableArmor.unbreakableArmorOther.unbreakableElytra() ||
                stack.getItem() instanceof ElytraItem && CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            cir.setReturnValue(false);
        }
    }
}
