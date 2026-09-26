package dev.alekindomie.combatflow;

import net.fabricmc.api.ClientModInitializer;

public final class CombatFlowClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CombatFlow.LOGGER.info("CombatFlow client initialized.");
    }
}
