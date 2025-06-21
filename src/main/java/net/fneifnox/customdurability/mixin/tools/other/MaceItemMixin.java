package net.fneifnox.customdurability.mixin.tools.other;

import net.minecraft.item.MaceItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public abstract class MaceItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof MaceItem) {
            if (CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableMace() ||
                    CONFIG.unbreakableTools.unbreakableAllTools()) {
                cir.setReturnValue(1);
            } else {
                cir.setReturnValue(CONFIG.durabilityForMace());
            }
        }
    }

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void modifyIsDamageable(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof MaceItem && CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableMace() ||
                stack.getItem() instanceof MaceItem && CONFIG.unbreakableTools.unbreakableAllTools()) {
            cir.setReturnValue(false);
        }
    }
}
