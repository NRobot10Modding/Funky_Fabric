package net.nrobot10.funkyfabric.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nrobot10.funkyfabric.FunkyFabric;

public class ModItems {


    public static final Item WATCH = registerItem("watch", new Item(new Item.Settings()));

    public static final Item BLUESTONE = registerItem("bluestone", new Item(new Item.Settings()));

    public static final Item SPRING = registerItem("spring", new Item(new Item.Settings()));

    public static final Item NO = registerItem("no", new Item(new Item.Settings()));

    public static final Item CAP = registerItem("cap", new Item(new Item.Settings()));

    public static final Item HOODIE = registerItem("hoodie", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FunkyFabric.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FunkyFabric.LOGGER.info("Registering Mod Items for " + FunkyFabric.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(WATCH);
            entries.add(CAP);
            entries.add(HOODIE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(BLUESTONE);
            entries.add(SPRING);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(NO);
        });
    }
}
