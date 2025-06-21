package net.fneifnox.customdurability.mixin.tools.other;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ItemStack.class)
public class TridentItemFixMixin {

    @ModifyReturnValue(method = "isDamageable", at = @At("RETURN"))
    private boolean UnbreakableTrident(boolean original) {
        ItemStack stack = (ItemStack) (Object) this;
        if (stack.getItem() == Items.TRIDENT && CONFIG.unbreakableTools.unbreakableToolsOther.unbreakableTrident() ||
                stack.getItem() == Items.TRIDENT && CONFIG.unbreakableTools.unbreakableAllTools()) {
            return false;
        }
        return original;
    }
}
