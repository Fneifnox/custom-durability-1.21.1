package net.fneifnox.customdurability.mixin.other;

import net.fneifnox.customdurability.CustomDurability;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class ShieldItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof ShieldItem) {
            if (CustomDurability.CONFIG.unbreakableShield()) {
                cir.setReturnValue(1);
            } else {
                cir.setReturnValue(CustomDurability.CONFIG.durabilityForShield());
            }
        }
    }

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void modifyIsDamageable(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof ShieldItem && CustomDurability.CONFIG.unbreakableShield()) {
            cir.setReturnValue(false);
        }
    }
}
