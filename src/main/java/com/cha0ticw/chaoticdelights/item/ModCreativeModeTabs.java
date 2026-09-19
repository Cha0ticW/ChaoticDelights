package com.cha0ticw.chaoticdelights.item;

import com.cha0ticw.chaoticdelights.ChaoticDelights;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChaoticDelights.MOD_ID);

    public static final Supplier<CreativeModeTab> CHAOTIC_DELIGHTS_TAB = CREATIVE_MODE_TAB.register("chaotic_delights_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CropsItems.STRAWBERRY.get()))
                    .title(Component.translatable("creativetab.chaotic_delights.chaotic_delights_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(CropsItems.STRAWBERRY);
                        output.accept(CropsItems.ZUCCHINI);
                        output.accept(CropsItems.BUCKWHEAT);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
