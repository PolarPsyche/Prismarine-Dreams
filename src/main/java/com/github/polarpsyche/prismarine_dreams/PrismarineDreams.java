package com.github.polarpsyche.prismarine_dreams;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrismarineDreams implements ModInitializer {
    public static final String MODID = "pdreams";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);


    @Override
    public void onInitialize() {

        LOGGER.info("Making Prismarine useful...");
    }
}
