package net.fneifnox.customdurability.mixin.tools.other;

import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public abstract class FlintAndSteelItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof FlintAndSteelItem) {
            if (CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableFlintAndSteel() ||
                    CONFIG.unbreakableTools.unbreakableAllTools()) {
                cir.setReturnValue(1);
            } else {
                cir.setReturnValue(CONFIG.durabilityForFlintAndSteel());
            }
        }
    }

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void modifyIsDamageable(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof FlintAndSteelItem && CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableFlintAndSteel() ||
                stack.getItem() instanceof FlintAndSteelItem && CONFIG.unbreakableTools.unbreakableAllTools()) {
            cir.setReturnValue(false);
        }
    }
}