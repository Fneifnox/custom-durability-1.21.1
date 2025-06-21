package net.fneifnox.customdurability;

import net.fabricmc.api.ModInitializer;

import net.fneifnox.customdurability.Config.CustomD;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomDurability implements ModInitializer {
	public static final String MOD_ID = "custom-durability";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		CONFIG.load();
		CONFIG.save();

	}

	public static final CustomD CONFIG = CustomD.createAndLoad();
}