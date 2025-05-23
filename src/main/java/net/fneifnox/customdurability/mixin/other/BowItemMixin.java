package net.fneifnox.customdurability.mixin.other;

import net.fneifnox.customdurability.CustomDurability;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class BowItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof BowItem) {
            if (CustomDurability.CONFIG.unbreakableBow()) {
                cir.setReturnValue(1);
            } else {
                cir.setReturnValue(CustomDurability.CONFIG.durabilityForBow());
            }
        }
    }

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void modifyIsDamageable(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof BowItem && CustomDurability.CONFIG.unbreakableBow()) {
            cir.setReturnValue(false);
        }
    }
}
