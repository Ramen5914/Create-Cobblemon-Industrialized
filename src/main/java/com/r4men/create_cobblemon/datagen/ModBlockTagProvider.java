package com.r4men.create_cobblemon.datagen;

import com.cobblemon.mod.common.CobblemonBlocks;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateCobblemon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ModTags.Blocks.BLACK_TUMBLESTONE_BUDS)
                .add(CobblemonBlocks.SMALL_BUDDING_BLACK_TUMBLESTONE)
                .add(CobblemonBlocks.MEDIUM_BUDDING_BLACK_TUMBLESTONE)
                .add(CobblemonBlocks.LARGE_BUDDING_BLACK_TUMBLESTONE);

        tag(ModTags.Blocks.SKY_TUMBLESTONE_BUDS)
                .add(CobblemonBlocks.SMALL_BUDDING_SKY_TUMBLESTONE)
                .add(CobblemonBlocks.MEDIUM_BUDDING_SKY_TUMBLESTONE)
                .add(CobblemonBlocks.LARGE_BUDDING_SKY_TUMBLESTONE);

        tag(ModTags.Blocks.TUMBLESTONE_BUDS)
                .add(CobblemonBlocks.SMALL_BUDDING_TUMBLESTONE)
                .add(CobblemonBlocks.MEDIUM_BUDDING_TUMBLESTONE)
                .add(CobblemonBlocks.LARGE_BUDDING_TUMBLESTONE);
    }
}
