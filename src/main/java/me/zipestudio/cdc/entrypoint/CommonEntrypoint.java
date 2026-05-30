package me.zipestudio.cdc.entrypoint;

//? if fabric {

/*import me.zipestudio.cdc.CDCServer;
import net.fabricmc.api.ModInitializer;

public class CommonEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		CDCServer.onInitialize();
	}
}

*///?} elif neoforge {

/*import me.zipestudio.cdc.CDCServer;
import net.neoforged.fml.common.Mod;

@Mod(CDCServer.MOD_ID)
public class CommonEntrypoint {

	public CommonEntrypoint() {
		CDCServer.onInitialize();
	}

}

*///?} elif forge {

import me.zipestudio.cdc.CDCServer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod(CDCServer.MOD_ID)
public class CommonEntrypoint {

	public CommonEntrypoint() {
		CDCServer.onInitialize();
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> ClientEntrypoint::onInitializeClient);
	}

}

//?}