package net.fneifnox.customdurability.mixin.armor;

import net.fneifnox.customdurability.CustomDurability;
import net.minecraft.item.AnimalArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class AnimalArmorItemMixin {

    @Inject(method = "getMaxDamage", at = @At("RETURN"), cancellable = true)
    private void modifyMaxDamage(CallbackInfoReturnable<Integer> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof AnimalArmorItem) {
            if (CustomDurability.CONFIG.unbreakableAnimalArmor()) {
                cir.setReturnValue(1);
            } else {
                cir.setReturnValue(CustomDurability.CONFIG.durabilityForAnimalArmor());
            }
        }
    }

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void modifyIsDamageable(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;

        if (stack.getItem() instanceof AnimalArmorItem && CustomDurability.CONFIG.unbreakableAnimalArmor()) {
            cir.setReturnValue(false);
        }
    }
}
