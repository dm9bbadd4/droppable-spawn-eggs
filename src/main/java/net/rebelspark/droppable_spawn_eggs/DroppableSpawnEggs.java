package net.rebelspark.droppable_spawn_eggs;

import net.fabricmc.api.ModInitializer;

import net.rebelspark.droppable_spawn_eggs.util.EggDropModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DroppableSpawnEggs implements ModInitializer {
	public static final String MOD_ID = "droppable_spawn_eggs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Droppable Spawn Eggs.");
		LOGGER.info("For server owners: This mod is not required client-side.");

		EggDropModifiers.eggDrops();

	}
}