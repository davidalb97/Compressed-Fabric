package gg.twinhead.compressed.registry;      

import gg.twinhead.compressed.Compressed;
import gg.twinhead.compressed.common.CompressedBlock;
import gg.twinhead.compressed.common.CompressedFallingBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
	public static final Block STONE_I =   registerBlock("stone_i", 			new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block STONE_II =  registerBlock("stone_ii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block STONE_III = registerBlock("stone_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block STONE_IV =  registerBlock("stone_iv", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block GRANITE_I =   registerBlock("granite_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block GRANITE_II =  registerBlock("granite_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block GRANITE_III = registerBlock("granite_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block GRANITE_IV =  registerBlock("granite_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block DIORITE_I =   registerBlock("diorite_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIORITE_II =  registerBlock("diorite_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIORITE_III = registerBlock("diorite_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIORITE_IV =  registerBlock("diorite_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
    
	public static final Block ANDESITE_I =   registerBlock("andesite_i", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block ANDESITE_II =  registerBlock("andesite_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block ANDESITE_III = registerBlock("andesite_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block ANDESITE_IV =  registerBlock("andesite_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block DEEPSLATE_I =   registerBlock("deepslate_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block DEEPSLATE_II =  registerBlock("deepslate_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block DEEPSLATE_III = registerBlock("deepslate_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block DEEPSLATE_IV =  registerBlock("deepslate_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

	public static final Block COBBLED_DEEPSLATE_I =   registerBlock("cobbled_deepslate_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block COBBLED_DEEPSLATE_II =  registerBlock("cobbled_deepslate_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block COBBLED_DEEPSLATE_III = registerBlock("cobbled_deepslate_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block COBBLED_DEEPSLATE_IV =  registerBlock("cobbled_deepslate_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

	public static final Block CALCITE_I =   registerBlock("calcite_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.CALCITE)));
	public static final Block CALCITE_II =  registerBlock("calcite_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.CALCITE)));
	public static final Block CALCITE_III = registerBlock("calcite_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.CALCITE)));
	public static final Block CALCITE_IV =  registerBlock("calcite_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.CALCITE)));

	public static final Block TUFF_I =   registerBlock("tuff_i", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.TUFF)));
	public static final Block TUFF_II =  registerBlock("tuff_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.TUFF)));
	public static final Block TUFF_III = registerBlock("tuff_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.TUFF)));
	public static final Block TUFF_IV =  registerBlock("tuff_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.TUFF)));

	public static final Block DRIPSTONE_BLOCK_I =   registerBlock("dripstone_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
	public static final Block DRIPSTONE_BLOCK_II =  registerBlock("dripstone_block_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
	public static final Block DRIPSTONE_BLOCK_III = registerBlock("dripstone_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
	public static final Block DRIPSTONE_BLOCK_IV =  registerBlock("dripstone_block_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

	public static final Block MOSS_BLOCK_I =   registerBlock("moss_block_i", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.MOSS_BLOCK)));
	public static final Block MOSS_BLOCK_II =  registerBlock("moss_block_ii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.MOSS_BLOCK)));
	public static final Block MOSS_BLOCK_III = registerBlock("moss_block_iii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.MOSS_BLOCK)));
	public static final Block MOSS_BLOCK_IV =  registerBlock("moss_block_iv", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.MOSS_BLOCK)));

	public static final Block GRASS_BLOCK_I =   registerBlock("grass_block_i", 				new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.7f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS)));
	public static final Block GRASS_BLOCK_II =  registerBlock("grass_block_ii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.9f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS)));
	public static final Block GRASS_BLOCK_III = registerBlock("grass_block_iii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.1f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS)));
	public static final Block GRASS_BLOCK_IV =  registerBlock("grass_block_iv", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.3f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS)));

	public static final Block DIRT_I =   registerBlock("dirt_i", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block DIRT_II =  registerBlock("dirt_ii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block DIRT_III = registerBlock("dirt_iii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block DIRT_IV =  registerBlock("dirt_iv", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));

	public static final Block COARSE_DIRT_I =   registerBlock("coarse_dirt_i", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block COARSE_DIRT_II =  registerBlock("coarse_dirt_ii", 		new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block COARSE_DIRT_III = registerBlock("coarse_dirt_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block COARSE_DIRT_IV =  registerBlock("coarse_dirt_iv", 		new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));

	public static final Block PODZOL_I =   registerBlock("podzol_i", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.7f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS)));
	public static final Block PODZOL_II =  registerBlock("podzol_ii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.9f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS)));
	public static final Block PODZOL_III = registerBlock("podzol_iii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.1f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS)));
	public static final Block PODZOL_IV =  registerBlock("podzol_iv", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.3f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS)));

	public static final Block ROOTED_DIRT_I =   registerBlock("rooted_dirt_i", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block ROOTED_DIRT_II =  registerBlock("rooted_dirt_ii", 		new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block ROOTED_DIRT_III = registerBlock("rooted_dirt_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block ROOTED_DIRT_IV =  registerBlock("rooted_dirt_iv", 		new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));

	public static final Block COBBLESTONE_I = 	registerBlock("cobblestone_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block COBBLESTONE_II = 	registerBlock("cobblestone_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block COBBLESTONE_III = registerBlock("cobblestone_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block COBBLESTONE_IV = 	registerBlock("cobblestone_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block SAND_I =   registerFallingBlock("sand_i", 			new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND)));
	public static final Block SAND_II =  registerFallingBlock("sand_ii", 			new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND)));
	public static final Block SAND_III = registerFallingBlock("sand_iii", 			new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND)));
	public static final Block SAND_IV =  registerFallingBlock("sand_iv", 			new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND)));

	public static final Block RED_SAND_I =   registerFallingBlock("red_sand_i", 			new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND)));
	public static final Block RED_SAND_II =  registerFallingBlock("red_sand_ii", 			new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND)));
	public static final Block RED_SAND_III = registerFallingBlock("red_sand_iii", 			new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND)));
	public static final Block RED_SAND_IV =  registerFallingBlock("red_sand_iv", 			new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND)));

	public static final Block GRAVEL_I =   registerFallingBlock("gravel_i", 		new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block GRAVEL_II =  registerFallingBlock("gravel_ii", 		new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block GRAVEL_III = registerFallingBlock("gravel_iii", 		new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block GRAVEL_IV =  registerFallingBlock("gravel_iv", 		new CompressedFallingBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));

	public static final Block COAL_BLOCK_I = 	registerBlock("coal_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block COAL_BLOCK_II = 	registerBlock("coal_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block COAL_BLOCK_III = 	registerBlock("coal_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block COAL_BLOCK_IV = 	registerBlock("coal_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block CHARCOAL_BLOCK = 		registerBlock("charcoal_block", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block CHARCOAL_BLOCK_I = 	registerBlock("charcoal_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block CHARCOAL_BLOCK_II = 	registerBlock("charcoal_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block CHARCOAL_BLOCK_III = 	registerBlock("charcoal_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block CHARCOAL_BLOCK_IV = 	registerBlock("charcoal_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block RAW_IRON_BLOCK_I = 	registerBlock("raw_iron_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_IRON_BLOCK_II = 	registerBlock("raw_iron_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_IRON_BLOCK_III = 	registerBlock("raw_iron_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_IRON_BLOCK_IV = 	registerBlock("raw_iron_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));

	public static final Block RAW_COPPER_BLOCK_I = 		registerBlock("raw_copper_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_COPPER_BLOCK_II = 	registerBlock("raw_copper_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_COPPER_BLOCK_III = 	registerBlock("raw_copper_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_COPPER_BLOCK_IV = 	registerBlock("raw_copper_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));

	public static final Block RAW_GOLD_BLOCK_I = 	registerBlock("raw_gold_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_GOLD_BLOCK_II = 	registerBlock("raw_gold_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_GOLD_BLOCK_III = 	registerBlock("raw_gold_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block RAW_GOLD_BLOCK_IV = 	registerBlock("raw_gold_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));

	public static final Block AMETHYST_BLOCK_I = 	registerBlock("amethyst_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
	public static final Block AMETHYST_BLOCK_II = 	registerBlock("amethyst_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
	public static final Block AMETHYST_BLOCK_III = 	registerBlock("amethyst_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
	public static final Block AMETHYST_BLOCK_IV = 	registerBlock("amethyst_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));


	public static final Block IRON_BLOCK_I = 	registerBlock("iron_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block IRON_BLOCK_II = 	registerBlock("iron_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block IRON_BLOCK_III = 	registerBlock("iron_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block IRON_BLOCK_IV = 	registerBlock("iron_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));

	public static final Block COPPER_BLOCK_I = 		registerBlock("copper_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block COPPER_BLOCK_II = 	registerBlock("copper_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block COPPER_BLOCK_III = 	registerBlock("copper_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block COPPER_BLOCK_IV = 	registerBlock("copper_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));

	public static final Block GOLD_BLOCK_I = 	registerBlock("gold_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block GOLD_BLOCK_II = 	registerBlock("gold_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block GOLD_BLOCK_III = 	registerBlock("gold_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block GOLD_BLOCK_IV = 	registerBlock("gold_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));

	public static final Block DIAMOND_BLOCK_I = 	registerBlock("diamond_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIAMOND_BLOCK_II = 	registerBlock("diamond_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIAMOND_BLOCK_III = 	registerBlock("diamond_block_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DIAMOND_BLOCK_IV = 	registerBlock("diamond_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block NETHERITE_BLOCK_I = 	registerBlock("netherite_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
	public static final Block NETHERITE_BLOCK_II = 	registerBlock("netherite_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
	public static final Block NETHERITE_BLOCK_III = registerBlock("netherite_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
	public static final Block NETHERITE_BLOCK_IV = 	registerBlock("netherite_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

	//todo oxidized copper

	public static final Block OAK_LOG_I = 	registerBlock("oak_log_i", 		new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block OAK_LOG_II = 	registerBlock("oak_log_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block OAK_LOG_III = registerBlock("oak_log_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block OAK_LOG_IV = 	registerBlock("oak_log_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(5.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));

	public static final Block SPRUCE_LOG_I = 	registerBlock("spruce_log_i", 		new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block SPRUCE_LOG_II = 	registerBlock("spruce_log_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block SPRUCE_LOG_III = 	registerBlock("spruce_log_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block SPRUCE_LOG_IV = 	registerBlock("spruce_log_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(5.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));

	public static final Block BIRCH_LOG_I = 	registerBlock("birch_log_i", 		new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block BIRCH_LOG_II = 	registerBlock("birch_log_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block BIRCH_LOG_III = 	registerBlock("birch_log_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block BIRCH_LOG_IV = 	registerBlock("birch_log_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(5.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));

	public static final Block JUNGLE_LOG_I = 	registerBlock("jungle_log_i", 		new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block JUNGLE_LOG_II = 	registerBlock("jungle_log_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block JUNGLE_LOG_III = 	registerBlock("jungle_log_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block JUNGLE_LOG_IV = 	registerBlock("jungle_log_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(5.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));

	public static final Block ACACIA_LOG_I = 	registerBlock("acacia_log_i", 		new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block ACACIA_LOG_II = 	registerBlock("acacia_log_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block ACACIA_LOG_III = 	registerBlock("acacia_log_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block ACACIA_LOG_IV = 	registerBlock("acacia_log_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(5.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));

	public static final Block DARK_OAK_LOG_I = 		registerBlock("dark_oak_log_i", 	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block DARK_OAK_LOG_II = 	registerBlock("dark_oak_log_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block DARK_OAK_LOG_III = 	registerBlock("dark_oak_log_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block DARK_OAK_LOG_IV = 	registerBlock("dark_oak_log_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.WOOD).strength(5.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	
	//todo crimson stem

	//todo warped stem

	public static final Block LAPIS_BLOCK_I = 	registerBlock("lapis_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block LAPIS_BLOCK_II = 	registerBlock("lapis_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block LAPIS_BLOCK_III = registerBlock("lapis_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));
	public static final Block LAPIS_BLOCK_IV = 	registerBlock("lapis_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.METAL)));

	public static final Block SANDSTONE_I =   registerBlock("sandstone_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block SANDSTONE_II =  registerBlock("sandstone_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block SANDSTONE_III = registerBlock("sandstone_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block SANDSTONE_IV =  registerBlock("sandstone_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block RED_SANDSTONE_I =   registerBlock("red_sandstone_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block RED_SANDSTONE_II =  registerBlock("red_sandstone_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block RED_SANDSTONE_III = registerBlock("red_sandstone_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block RED_SANDSTONE_IV =  registerBlock("red_sandstone_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block MOSSY_COBBLESTONE_I = 	registerBlock("mossy_cobblestone_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block MOSSY_COBBLESTONE_II = 	registerBlock("mossy_cobblestone_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block MOSSY_COBBLESTONE_III = 	registerBlock("mossy_cobblestone_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block MOSSY_COBBLESTONE_IV = 	registerBlock("mossy_cobblestone_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block OBSIDIAN_I = 		registerBlock("obsidian_i", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(50.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block OBSIDIAN_II = 	registerBlock("obsidian_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(52.5f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block OBSIDIAN_III = 	registerBlock("obsidian_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(55.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block OBSIDIAN_IV = 	registerBlock("obsidian_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(57.5f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block SNOW_BLOCK_I =   registerBlock("snow_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SNOW)));
	public static final Block SNOW_BLOCK_II =  registerBlock("snow_block_ii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SNOW)));
	public static final Block SNOW_BLOCK_III = registerBlock("snow_block_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SNOW)));
	public static final Block SNOW_BLOCK_IV =  registerBlock("snow_block_iv", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SNOW)));


	public static final Block CLAY_I =   registerBlock("clay_i", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block CLAY_II =  registerBlock("clay_ii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block CLAY_III = registerBlock("clay_iii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block CLAY_IV =  registerBlock("clay_iv", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRAVEL)));

	public static final Block PUMPKIN_I =   registerBlock("pumpkin_i", 			new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block PUMPKIN_II =  registerBlock("pumpkin_ii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block PUMPKIN_III = registerBlock("pumpkin_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block PUMPKIN_IV =  registerBlock("pumpkin_iv", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));

	public static final Block NETHERRACK_I =   registerBlock("netherrack_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(0.6f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
	public static final Block NETHERRACK_II =  registerBlock("netherrack_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(0.8f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
	public static final Block NETHERRACK_III = registerBlock("netherrack_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
	public static final Block NETHERRACK_IV =  registerBlock("netherrack_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(1.2f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

	public static final Block SOUL_SAND_I =   registerBlock("soul_sand_i", 				new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SOUL_SAND)));
	public static final Block SOUL_SAND_II =  registerBlock("soul_sand_ii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SOUL_SAND)));
	public static final Block SOUL_SAND_III = registerBlock("soul_sand_iii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SOUL_SAND)));
	public static final Block SOUL_SAND_IV =  registerBlock("soul_sand_iv", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SOUL_SAND)));

	public static final Block SOUL_SOIL_I =   registerBlock("soul_soil_i", 				new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SOUL_SOIL)));
	public static final Block SOUL_SOIL_II =  registerBlock("soul_soil_ii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SOUL_SOIL)));
	public static final Block SOUL_SOIL_III = registerBlock("soul_soil_iii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.0f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SOUL_SOIL)));
	public static final Block SOUL_SOIL_IV =  registerBlock("soul_soil_iv", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SOUL_SOIL)));

	public static final Block BASALT_I =   registerBlock("basalt_i", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.BASALT)));
	public static final Block BASALT_II =  registerBlock("basalt_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.BASALT)));
	public static final Block BASALT_III = registerBlock("basalt_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.5f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.BASALT)));
	public static final Block BASALT_IV =  registerBlock("basalt_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.BASALT)));

	public static final Block GLOWSTONE_I = 	registerBlock("glowstone_i", 		new CompressedBlock(FabricBlockSettings.of(Material.GLASS).strength(1.0f).sounds(BlockSoundGroup.GLASS).luminance(15)));
	public static final Block GLOWSTONE_II = 	registerBlock("glowstone_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.GLASS).strength(2.0f).sounds(BlockSoundGroup.GLASS).luminance(15)));
	public static final Block GLOWSTONE_III = 	registerBlock("glowstone_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.GLASS).strength(3.0f).sounds(BlockSoundGroup.GLASS).luminance(15)));
	public static final Block GLOWSTONE_IV = 	registerBlock("glowstone_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.GLASS).strength(4.0f).sounds(BlockSoundGroup.GLASS).luminance(15)));

	public static final Block SHROOMLIGHT_I = 	registerBlock("shroomlight_i", 		new CompressedBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(1.0f).sounds(BlockSoundGroup.SHROOMLIGHT).luminance(15).breakByTool(FabricToolTags.HOES)));
	public static final Block SHROOMLIGHT_II = 	registerBlock("shroomlight_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(2.0f).sounds(BlockSoundGroup.SHROOMLIGHT).luminance(15).breakByTool(FabricToolTags.HOES)));
	public static final Block SHROOMLIGHT_III = registerBlock("shroomlight_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(3.0f).sounds(BlockSoundGroup.SHROOMLIGHT).luminance(15).breakByTool(FabricToolTags.HOES)));
	public static final Block SHROOMLIGHT_IV = 	registerBlock("shroomlight_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(4.0f).sounds(BlockSoundGroup.SHROOMLIGHT).luminance(15).breakByTool(FabricToolTags.HOES)));


	public static final Block BLACKSTONE_I =   registerBlock("blackstone_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BLACKSTONE_II =  registerBlock("blackstone_ii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BLACKSTONE_III = registerBlock("blackstone_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block BLACKSTONE_IV =  registerBlock("blackstone_iv", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block NETHER_BRICKS_I = 	registerBlock("nether_bricks_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));
	public static final Block NETHER_BRICKS_II = 	registerBlock("nether_bricks_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));
	public static final Block NETHER_BRICKS_III = 	registerBlock("nether_bricks_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));
	public static final Block NETHER_BRICKS_IV = 	registerBlock("nether_bricks_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

	public static final Block MELON_I =   registerBlock("melon_i", 			new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block MELON_II =  registerBlock("melon_ii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block MELON_III = registerBlock("melon_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));
	public static final Block MELON_IV =  registerBlock("melon_iv", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.AXES).sounds(BlockSoundGroup.WOOD)));

	public static final Block END_STONE_I =   registerBlock("end_stone_i", 			new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block END_STONE_II =  registerBlock("end_stone_ii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block END_STONE_III = registerBlock("end_stone_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block END_STONE_IV =  registerBlock("end_stone_iv", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block EMERALD_BLOCK_I = 	registerBlock("emerald_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block EMERALD_BLOCK_II = 	registerBlock("emerald_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block EMERALD_BLOCK_III = 	registerBlock("emerald_block_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block EMERALD_BLOCK_IV = 	registerBlock("emerald_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block HAY_BLOCK_I =   registerBlock("hay_block_i", 			new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(0.7f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRASS)));
	public static final Block HAY_BLOCK_II =  registerBlock("hay_block_ii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(0.9f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRASS)));
	public static final Block HAY_BLOCK_III = registerBlock("hay_block_iii", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRASS)));
	public static final Block HAY_BLOCK_IV =  registerBlock("hay_block_iv", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRASS)));

	public static final Block PRISMARINE_I = 	registerBlock("prismarine_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block PRISMARINE_II = 	registerBlock("prismarine_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block PRISMARINE_III =  registerBlock("prismarine_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block PRISMARINE_IV = 	registerBlock("prismarine_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block DARK_PRISMARINE_I = 	registerBlock("dark_prismarine_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DARK_PRISMARINE_II = 	registerBlock("dark_prismarine_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DARK_PRISMARINE_III = registerBlock("dark_prismarine_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DARK_PRISMARINE_IV = 	registerBlock("dark_prismarine_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	//todo sea lantern

	//todo magma block

	//todo nether wart block

	//todo warped wart block

	public static final Block BONE_BLOCK_I = 	registerBlock("bone_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.BONE)));
	public static final Block BONE_BLOCK_II = 	registerBlock("bone_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.BONE)));
	public static final Block BONE_BLOCK_III = 	registerBlock("bone_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.BONE)));
	public static final Block BONE_BLOCK_IV = 	registerBlock("bone_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.BONE)));

	public static final Block DRIED_KELP_I =   registerBlock("dried_kelp_i", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block DRIED_KELP_II =  registerBlock("dried_kelp_ii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block DRIED_KELP_III = registerBlock("dried_kelp_iii", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(0.0f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRAVEL)));
	public static final Block DRIED_KELP_IV =  registerBlock("dried_kelp_iv", 			new CompressedBlock(FabricBlockSettings.of(Material.SOIL).strength(1.2f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRAVEL)));

	public static final Block QUARTZ_BLOCK_I = 	registerBlock("quartz_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block QUARTZ_BLOCK_II = 	registerBlock("quartz_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block QUARTZ_BLOCK_III =  registerBlock("quartz_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block QUARTZ_BLOCK_IV = 	registerBlock("quartz_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block REDSTONE_BLOCK_I = 	registerBlock("redstone_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block REDSTONE_BLOCK_II = 	registerBlock("redstone_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block REDSTONE_BLOCK_III = 	registerBlock("redstone_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block REDSTONE_BLOCK_IV = 	registerBlock("redstone_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).breakByTool(FabricToolTags.PICKAXES).requiresTool().sounds(BlockSoundGroup.STONE)));

	public static final Block SLIME_BLOCK_I = 	registerBlock("slime_block_i", 		new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).sounds(BlockSoundGroup.SLIME).breakInstantly()));
	public static final Block SLIME_BLOCK_II = 	registerBlock("slime_block_ii",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).sounds(BlockSoundGroup.SLIME).breakInstantly()));
	public static final Block SLIME_BLOCK_III = registerBlock("slime_block_iii", 	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).sounds(BlockSoundGroup.SLIME).breakInstantly()));
	public static final Block SLIME_BLOCK_IV = 	registerBlock("slime_block_iv",   	new CompressedBlock(FabricBlockSettings.of(Material.STONE).strength(6.0f).sounds(BlockSoundGroup.SLIME).breakInstantly()));




    public static void register() {}

	public static Block registerBlock(String name, CompressedBlock compressedBlock) {
		compressedBlock.setName(name);
		Registry.register(Registry.BLOCK, new Identifier(Compressed.MOD_ID, name), compressedBlock);
		Item.Settings settings = new Item.Settings().group(Compressed.COMPRESSED_GROUP);
		ItemRegistry.registerItem(name, new BlockItem(compressedBlock, settings));
		return compressedBlock;
	}

	public static Block registerFallingBlock(String name, CompressedFallingBlock compressedBlock) {
		compressedBlock.setName(name);
		Registry.register(Registry.BLOCK, new Identifier(Compressed.MOD_ID, name), compressedBlock);
		Item.Settings settings = new Item.Settings().group(Compressed.COMPRESSED_GROUP);
		ItemRegistry.registerItem(name, new BlockItem(compressedBlock, settings));
		return compressedBlock;
	}

	/*
	public static Block registerBlock(String name, CompressedBlock compressedBlock) {
		//if (Configs.BLOCKS.getBoolean("blocks", name, true)) {
			compressedBlock.setName(name);
			registerBlockDirectly(name, compressedBlock);
		//}
		BLOCKS.add(name);
		return compressedBlock;
	}

    public static Block registerBlockNI(String name, Block block) {
		if (Configs.BLOCKS.getBoolean("blocks", name, true)) {
			Registry.register(Registry.BLOCK, new Identifier(Compressed.MOD_ID, name), block);
		}
		BLOCKS.add(name);
		return block;
	}*/

	private static void registerBlockDirectly(String name, Block compressedBlock) {
		Registry.register(Registry.BLOCK, new Identifier(Compressed.MOD_ID, name), compressedBlock);
		Item.Settings settings = new Item.Settings().group(Compressed.COMPRESSED_GROUP);
		ItemRegistry.registerItem(name, new BlockItem(compressedBlock, settings));
	}
}
