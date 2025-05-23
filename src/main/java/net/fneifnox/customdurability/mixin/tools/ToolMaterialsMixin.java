package net.fneifnox.customdurability.mixin.tools;

import net.fneifnox.customdurability.CustomDurability;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ToolMaterials.class)
public abstract class ToolMaterialsMixin implements ToolMaterial {

    @Overwrite
    public int getDurability() {
        if ((Object) this == ToolMaterials.WOOD) {
            return CustomDurability.CONFIG.durabilityForWoodenTools();
        }
        if ((Object) this == ToolMaterials.STONE) {
            return CustomDurability.CONFIG.durabilityForStoneTools();
        }
        if ((Object) this == ToolMaterials.IRON) {
            return CustomDurability.CONFIG.durabilityForIronTools();
        }
        if ((Object) this == ToolMaterials.DIAMOND) {
            return CustomDurability.CONFIG.durabilityForDiamondTools();
        }
        if ((Object) this == ToolMaterials.GOLD) {
            return CustomDurability.CONFIG.durabilityForGoldenTools();
        }
        if ((Object) this == ToolMaterials.NETHERITE) {
            return CustomDurability.CONFIG.durabilityForNetheriteTools();
        }

        // Default-Fallback: Vanilla-Wert behalten
        return switch ((ToolMaterials)(Object)this) {
            case STONE -> 131;
            case IRON -> 250;
            case DIAMOND -> 1561;
            case GOLD -> 32;
            case NETHERITE -> 2031;
            default -> 59; // Default für WOOD, wird aber überschrieben
        };
    }
}
