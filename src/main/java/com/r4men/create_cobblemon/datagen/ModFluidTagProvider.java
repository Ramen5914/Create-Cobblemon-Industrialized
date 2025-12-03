package com.r4men.create_cobblemon.datagen;

import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.fluid.ModFluids;
import com.r4men.create_cobblemon.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModFluidTagProvider extends FluidTagsProvider {
    public ModFluidTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, CreateCobblemon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ModTags.Fluids.UPGRADES_TO_FULL_HEAL)
                .add(ModFluids.ANTIDOTE.get())
                .add(ModFluids.AWAKENING.get())
                .add(ModFluids.BURN_HEAL.get())
                .add(ModFluids.ICE_HEAL.get())
                .add(ModFluids.MEDICINAL_BREW.get())
                .add(ModFluids.PARALYZE_HEAL.get());
    }
}
