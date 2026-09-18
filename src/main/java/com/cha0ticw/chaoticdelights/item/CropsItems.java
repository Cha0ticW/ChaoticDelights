package com.cha0ticw.chaoticdelights.item;

import com.cha0ticw.chaoticdelights.ChaoticDelights;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CropsItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChaoticDelights.MOD_ID);

    public static final DeferredItem<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BUCKWHEAT = ITEMS.register("buckwheat",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZUCCHINI = ITEMS.register("zucchini",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
