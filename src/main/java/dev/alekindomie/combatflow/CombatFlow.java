package dev.alekindomie.combatflow;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CombatFlow implements ModInitializer {
    public static final String MOD_ID = "combatflow";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("CombatFlow initialized.");
    }
}
