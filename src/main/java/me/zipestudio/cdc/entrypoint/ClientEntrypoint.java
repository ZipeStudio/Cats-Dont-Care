package me.zipestudio.cdc.entrypoint;

//? if fabric {

/*import net.fabricmc.api.ClientModInitializer;
import me.zipestudio.cdc.client.CDCClient;

public class ClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		CDCClient.onInitializeClient();
	}
}

*///?} elif neoforge {

/*import me.zipestudio.cdc.CDCServer;
import me.zipestudio.cdc.client.CDCClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

	@Mod(value = CDCServer.MOD_ID, dist = Dist.CLIENT)
public class ClientEntrypoint {

	public ClientEntrypoint(ModContainer container) {
		CDCClient.onInitializeClient();
	}

}

*///?} elif forge {

import me.zipestudio.cdc.client.CDCClient;

public class ClientEntrypoint {

	public static void onInitializeClient() {
		CDCClient.onInitializeClient();
	}

}

//?}
