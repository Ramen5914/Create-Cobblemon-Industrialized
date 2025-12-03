package com.r4men.create_cobblemon.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CobblemonItems.ANCIENT_SLATE_BALL, 1)
                .requires(ModTags.Items.DYEABLE_ANCIENT_BALLS)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_black_dye", has(Items.BLACK_DYE))
                .save(recipeOutput);
    }
}
