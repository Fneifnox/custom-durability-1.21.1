package net.fneifnox.customdurability.mixin.tools;

import net.fneifnox.customdurability.CustomDurability;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.TridentItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin {

    @Inject(method = "isDamageable", at = @At("RETURN"), cancellable = true)
    private void infiniteDurabilityOverride(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack)(Object)this;

        if (stack.getItem() instanceof ToolItem) {
            ToolItem tool = (ToolItem) stack.getItem();

            if (tool.getMaterial() == ToolMaterials.WOOD && CustomDurability.CONFIG.unbreakableWoodenTools()) {
                cir.setReturnValue(false);
            } else if (tool.getMaterial() == ToolMaterials.STONE && CustomDurability.CONFIG.unbreakableStoneTools()) {
                cir.setReturnValue(false);
            } else if (tool.getMaterial() == ToolMaterials.IRON && CustomDurability.CONFIG.unbreakableIronTools()) {
                cir.setReturnValue(false);
            } else if (tool.getMaterial() == ToolMaterials.GOLD && CustomDurability.CONFIG.unbreakableGoldenTools()) {
                cir.setReturnValue(false);
            } else if (tool.getMaterial() == ToolMaterials.DIAMOND && CustomDurability.CONFIG.unbreakableDiamondTools()) {
                cir.setReturnValue(false);
            } else if (tool.getMaterial() == ToolMaterials.NETHERITE && CustomDurability.CONFIG.unbreakableNetheriteTools()) {
                cir.setReturnValue(false);
            }
        }
    }
}



