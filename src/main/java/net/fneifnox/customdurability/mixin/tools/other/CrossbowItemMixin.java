package net.fneifnox.customdurability.mixin.tools.other;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public abstract class CrossbowItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof CrossbowItem) {
            if (CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableCrossbow() ||
                    CONFIG.unbreakableTools.unbreakableAllTools()) {
                cir.setReturnValue(1);
            } else {
                cir.setReturnValue(CONFIG.durabilityForCrossbow());
            }
        }
    }

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void modifyIsDamageable(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof CrossbowItem && CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableCrossbow() ||
                stack.getItem() instanceof CrossbowItem && CONFIG.unbreakableTools.unbreakableAllTools()) {
            cir.setReturnValue(false);
        }
    }
}