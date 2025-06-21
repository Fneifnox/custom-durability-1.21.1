package net.fneifnox.customdurability.mixin.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;

@Mixin(ToolMaterials.class)
public abstract class ToolItemDurabilityMixin implements ToolMaterial {

    @Overwrite
    public int getDurability() {
        if ((Object) this == ToolMaterials.WOOD) {
            return CONFIG.durabilityForWoodenTools();
        }
        if ((Object) this == ToolMaterials.STONE) {
            return CONFIG.durabilityForStoneTools();
        }
        if ((Object) this == ToolMaterials.IRON) {
            return CONFIG.durabilityForIronTools();
        }
        if ((Object) this == ToolMaterials.DIAMOND) {
            return CONFIG.durabilityForDiamondTools();
        }
        if ((Object) this == ToolMaterials.GOLD) {
            return CONFIG.durabilityForGoldenTools();
        }
        if ((Object) this == ToolMaterials.NETHERITE) {
            return CONFIG.durabilityForNetheriteTools();
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
