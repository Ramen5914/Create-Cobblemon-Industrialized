package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import com.simibubi.create.api.data.recipe.PolishingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public final class ModPolishingRecipeGen extends PolishingRecipeGen {
    GeneratedRecipe EXP_CANDY_M = create(
            "exp_candy_m", b -> b
                    .require(ModItems.EXP_QUARTZ)
                    .output(CobblemonItems.EXPERIENCE_CANDY_M));

    public ModPolishingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
