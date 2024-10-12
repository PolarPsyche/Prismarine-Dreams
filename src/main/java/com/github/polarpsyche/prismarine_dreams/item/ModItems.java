package com.github.polarpsyche.prismarine_dreams.item;

import com.github.polarpsyche.prismarine_dreams.PrismarineDreams;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PRISMARITE_FRAGMENT = registerItem("prismarite_fragment", new Item(new Item.Settings()));
    public static final Item PRISMARITE_BEAD = registerItem("prismarite_bead", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.of(PrismarineDreams.MODID, name), item);
        //helper method to register items easier
    }

    public static void registerModItems() {
        PrismarineDreams.LOGGER.info("Initializing items for Prismarine Dreams...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PRISMARITE_FRAGMENT);
            entries.add(PRISMARITE_BEAD);
        });
    }
}
