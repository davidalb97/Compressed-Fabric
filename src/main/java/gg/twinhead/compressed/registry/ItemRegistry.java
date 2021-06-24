package gg.twinhead.compressed.registry;

import java.util.ArrayList;
import java.util.List;

import gg.twinhead.compressed.Compressed;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    private static final List<String> ITEMS = new ArrayList<String>();
	public static final ArrayList<Item> MOD_BLOCKS = new ArrayList<Item>();
	public static final ArrayList<Item> MOD_ITEMS = new ArrayList<Item>();

    public static void register() {}

    public static Item registerItem(String name, Item item) {
		if (item instanceof BlockItem) {
			//CompressedBlock block = (CompressedBlock) item;
			Registry.register(Registry.ITEM, new Identifier(Compressed.MOD_ID, name), item);
			if (item instanceof BlockItem)
				MOD_BLOCKS.add(item);
			else
				MOD_ITEMS.add(item);
		}
		if (!(item instanceof BlockItem))
			ITEMS.add(name);
		return item;
	}
}