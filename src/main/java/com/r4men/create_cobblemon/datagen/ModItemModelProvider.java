package com.r4men.create_cobblemon.datagen;

import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateCobblemon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (var item : ModItems.ITEMS.getEntries().stream().map(Holder::value).toList()) {
            basicItem(item);
        }
    }
}
