package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public final class ModSequencedAssemblyRecipeGen extends SequencedAssemblyRecipeGen {
    GeneratedRecipe ANCIENT_SLATE_BALL = create(
            "ancient_slate_ball",b -> b
                    .require(ModItems.ANCIENT_SLATE_BALL_LID)
                    .transitionTo(ModItems.INCOMPLETE_ANCIENT_SLATE_BALL)
                    .addOutput(CobblemonItems.ANCIENT_SLATE_BALL, 1)
                    .loops(1)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ModItems.IRON_BALL_BASE))
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(AllItems.COPPER_NUGGET)));

    public ModSequencedAssemblyRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
