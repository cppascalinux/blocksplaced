package cppascalinux.blockplaced;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlocksPlaced implements ModInitializer {
	public static final Identifier BLOCKS_PLACED = 
		new Identifier("blocksplaced", "blocks_placed");

	@Override
	public void onInitialize() {
		Registry.register(Registries.CUSTOM_STAT, "blocks_placed", BLOCKS_PLACED);
	}
}