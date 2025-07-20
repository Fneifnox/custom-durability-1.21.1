package net.fneifnox.customdurability;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.fneifnox.customdurability.Config.CustomD;
import net.fneifnox.customdurability.armor.ArmorItems;
import net.fneifnox.customdurability.armor.OtherArmorItems;
import net.fneifnox.customdurability.compat.AdvancedNetheriteCompat;
import net.fneifnox.customdurability.compat.NetheriteExtrasCompat;
import net.fneifnox.customdurability.compat.WaystonesCompat;
import net.fneifnox.customdurability.tools.OtherToolItems;
import net.fneifnox.customdurability.tools.ToolItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomDurability implements ModInitializer {
	public static final String MOD_ID = "custom-durability";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		CONFIG.load();
		CONFIG.save();

		ToolItems.setDurabilityAndUnbreakableWooden();
		ToolItems.setDurabilityAndUnbreakableStone();
		ToolItems.setDurabilityAndUnbreakableIron();
		ToolItems.setDurabilityAndUnbreakableGolden();
		ToolItems.setDurabilityAndUnbreakableDiamond();
		ToolItems.setDurabilityAndUnbreakableNetherite();

		OtherToolItems.setDurabilityAndUnbreakableTrident();
		OtherToolItems.setDurabilityAndUnbreakableMace();
		OtherToolItems.setDurabilityAndUnbreakableBow();
		OtherToolItems.setDurabilityAndUnbreakableCrossbow();
		OtherToolItems.setDurabilityAndUnbreakableShield();
		OtherToolItems.setDurabilityAndUnbreakableFishingRod();
		OtherToolItems.setDurabilityAndUnbreakableFlintAndSteel();
		OtherToolItems.setDurabilityAndUnbreakableShears();
		OtherToolItems.setDurabilityAndUnbreakableBrush();

		ArmorItems.setDurabilityAndUnbreakableLeather();
		ArmorItems.setDurabilityAndUnbreakableChainmail();
		ArmorItems.setDurabilityAndUnbreakableIron();
		ArmorItems.setDurabilityAndUnbreakableGolden();
		ArmorItems.setDurabilityAndUnbreakableDiamond();
		ArmorItems.setDurabilityAndUnbreakableNetherite();

		OtherArmorItems.setDurabilityAndUnbreakableTurtleHelmet();
		OtherArmorItems.setDurabilityAndUnbreakableElytra();
		OtherArmorItems.setDurabilityAndUnbreakableWolfArmor();

		if (FabricLoader.getInstance().isModLoaded("advancednetherite") && CONFIG.advancedNetherite.enableAdvancedNetherite()) {
			AdvancedNetheriteCompat.setDurabilityAndUnbreakableNetheriteIronTools();
			AdvancedNetheriteCompat.setDurabilityAndUnbreakableNetheriteGoldTools();
			AdvancedNetheriteCompat.setDurabilityAndUnbreakableNetheriteEmeraldTools();
			AdvancedNetheriteCompat.setDurabilityAndUnbreakableNetheriteDiamondTools();

			AdvancedNetheriteCompat.setDurabilityAndUnbreakableNetheriteIronArmor();
			AdvancedNetheriteCompat.setDurabilityAndUnbreakableNetheriteGoldArmor();
			AdvancedNetheriteCompat.setDurabilityAndUnbreakableNetheriteEmeraldArmor();
			AdvancedNetheriteCompat.setDurabilityAndUnbreakableNetheriteDiamondArmor();
		}

		if (FabricLoader.getInstance().isModLoaded("netheriteextras") && CONFIG.netheriteExtras.enableNetheriteExtras()) {
			NetheriteExtrasCompat.setDurabilityAndUnbreakableNetheriteWolfArmor();
		}

		if (FabricLoader.getInstance().isModLoaded("waystones") && CONFIG.waystones.enableWaystones()) {
			WaystonesCompat.setDurabilityAndUnbreakableWarpStone();
		}
	}

	public static final CustomD CONFIG = CustomD.createAndLoad();
}