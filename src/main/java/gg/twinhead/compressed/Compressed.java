package gg.twinhead.compressed;

import gg.twinhead.compressed.registry.BlockRegistry;
import gg.twinhead.compressed.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class Compressed implements ModInitializer {
	public static final String MOD_ID = "compressed";
	//public static final Block COBBLESTONE_I = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));

	public static final ItemGroup COMPRESSED_GROUP = FabricItemGroupBuilder.build(
		new Identifier("compressed", "blocks"),
		() -> new ItemStack(Blocks.COBBLESTONE));

	@Override
	public void onInitialize() { 
		BlockRegistry.register();
		ItemRegistry.register();
	}
}
