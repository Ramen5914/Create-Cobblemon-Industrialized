package com.r4men.create_cobblemon.datagen;

import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CreateCobblemon.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        customBlockWithItem(ModBlocks.EXP_QUARTZ_BLOCK, models()
                .cubeColumn("exp_quartz_block",
                        modLoc("block/exp_quartz_block_side"),
                        modLoc("block/exp_quartz_block_top")));

        blockWithItem(ModBlocks.EXP_QUARTZ_TILES);
        blockWithItem(ModBlocks.SMALL_EXP_QUARTZ_TILES);
    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void customBlockWithItem(DeferredBlock<Block> deferredBlock, ModelFile model) {
        simpleBlockWithItem(deferredBlock.get(), model);
    }
}
