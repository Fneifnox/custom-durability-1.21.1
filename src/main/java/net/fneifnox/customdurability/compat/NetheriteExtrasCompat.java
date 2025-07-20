package net.fneifnox.customdurability.compat;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customdurability.CustomDurability.CONFIG;
import static net.minecraft.component.DataComponentTypes.MAX_DAMAGE;
import static net.minecraft.component.DataComponentTypes.UNBREAKABLE;

public class NetheriteExtrasCompat {

    public static void setDurabilityAndUnbreakableNetheriteWolfArmor() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            Item netheriteAnimalArmor = Registries.ITEM.get(Identifier.of("netheriteextras", "netherite_wolf_armor"));

            if (!CONFIG.netheriteExtras.unbreakableNetheriteWolfArmor()) {
                context.modify(netheriteAnimalArmor, components -> components.add(MAX_DAMAGE, CONFIG.netheriteExtras.durabilityForNetheriteWolfArmor()));
            }
            else {
                context.modify(netheriteAnimalArmor, components -> components.add(UNBREAKABLE, new UnbreakableComponent(CONFIG.netheriteExtras.unbreakableNetheriteWolfArmor())));
            }
        });
    }
}
