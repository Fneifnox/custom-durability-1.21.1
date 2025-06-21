package net.fneifnox.customdurability.mixin.tools.other;

import net.minecraft.item.TridentItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public abstract class TridentItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof TridentItem) {
            if (!CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableTrident() ||
                    !CONFIG.unbreakableTools.unbreakableAllTools()) {
                cir.setReturnValue(CONFIG.durabilityForTrident());
            }
        }
    }
}










