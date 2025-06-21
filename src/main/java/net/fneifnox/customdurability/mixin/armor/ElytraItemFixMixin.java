package net.fneifnox.customdurability.mixin.armor;

import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ElytraItem.class)
public class ElytraItemFixMixin {

    @Overwrite
    public static boolean isUsable(ItemStack stack) {
        if (CONFIG.unbreakableArmor.unbreakableArmorOther.unbreakableElytra() ||
                CONFIG.unbreakableArmor.unbreakableAllArmor()) {
            return true;
        }

        return stack.getDamage() < stack.getMaxDamage() - 1;
    }
}

