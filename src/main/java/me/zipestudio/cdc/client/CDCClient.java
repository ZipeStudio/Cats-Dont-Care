package me.zipestudio.cdc.client;

import me.zipestudio.cdc.CDCServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDCClient {

	public static Logger LOGGER = LoggerFactory.getLogger(CDCServer.MOD_NAME + "/Client");

	public static void onInitializeClient() {
		LOGGER.info("{} Client Initialized", CDCServer.MOD_NAME);
	}

}
