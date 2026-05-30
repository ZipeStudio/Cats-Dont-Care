package me.zipestudio.cdc;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDCServer {

	public static final String MOD_NAME = /*$ mod_name*/ "Cats Don't Care";
	public static final String MOD_ID = /*$ mod_id*/ "cats_dont_care";

	public static Logger LOGGER = LoggerFactory.getLogger(CDCServer.MOD_NAME);

	public static final TagKey<Block> CAT_REST_SPOTS =
			TagKey.create(Registries.BLOCK, id(MOD_ID, "cat_carpets"));

	public static ResourceLocation id(String path) {
		return id(MOD_ID, path);
	}

	public static ResourceLocation id(String namespace, String path) {
		//? if >=1.21 {
		/*return ResourceLocation.fromNamespaceAndPath(namespace, path);
		*///?} else {
		return ResourceLocation.tryBuild(namespace, path);
		 //?}
	}

	public static ResourceLocation parseId(String path) {
		return ResourceLocation.tryParse(path);
	}

	public static MutableComponent text(String path, Object... args) {
		return Component.translatable(String.format("%s.%s", MOD_ID, path), args);
	}

	public static void onInitialize() {
		LOGGER.info("{} Initialized", MOD_NAME);
	}

}