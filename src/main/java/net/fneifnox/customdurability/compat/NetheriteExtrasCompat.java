package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.core.component.DataComponents.MAX_DAMAGE;
import static net.minecraft.core.component.DataComponents.UNBREAKABLE;

public class NetheriteExtrasCompat {

    public static void setDurabilityAndUnbreakableNetheriteWolfArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteAnimalArmor = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("netheriteextras", "netherite_wolf_armor"));

            if (!CONFIG.netheriteExtras.unbreakableNetheriteWolfArmor()) {
                context.modify(netheriteAnimalArmor, components -> components.set(MAX_DAMAGE, CONFIG.netheriteExtras.durabilityForNetheriteWolfArmor()));
            }
            else {
                context.modify(netheriteAnimalArmor, components -> components.set(UNBREAKABLE, Unit.INSTANCE));
            }
        });
    }
}
