package net.fneifnox.customdurability.mixin.armor;

import net.fneifnox.customdurability.CustomDurability;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ElytraItem.class)
public class ElytraItemFixMixin {

    @Overwrite
    public static boolean isUsable(ItemStack stack) {
        if (CustomDurability.CONFIG.unbreakableElytra()) {
            return true;
        }

        return stack.getDamage() < stack.getMaxDamage() - 1;
    }
}

