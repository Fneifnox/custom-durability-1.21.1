package net.fneifnox.customdurability.mixin.tools.other;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public abstract class ShearsItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof ShearsItem) {
            if (CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableShears() ||
                    CONFIG.unbreakableTools.unbreakableAllTools()) {
                cir.setReturnValue(1);
            } else {
                cir.setReturnValue(CONFIG.durabilityForShears());
            }
        }
    }

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void modifyIsDamageable(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof ShearsItem && CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableShears() ||
                stack.getItem() instanceof ShearsItem && CONFIG.unbreakableTools.unbreakableAllTools()) {
            cir.setReturnValue(false);
        }
    }
}
