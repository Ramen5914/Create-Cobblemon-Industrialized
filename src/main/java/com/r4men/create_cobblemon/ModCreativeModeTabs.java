package com.r4men.create_cobblemon;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, CreateCobblemon.MOD_ID);

    public static final Supplier<CreativeModeTab> CREATE_COBBLEMON_TAB = CREATIVE_MODE_TABS.register(
            "create_cobblemon_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.create_cobblemon.create_cobblemon_tab"))
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
