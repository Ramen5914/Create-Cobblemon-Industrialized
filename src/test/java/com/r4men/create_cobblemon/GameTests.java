package com.r4men.create_cobblemon;

import com.r4men.create_cobblemon.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.gametest.GameTestHolder;
import net.neoforged.neoforge.gametest.PrefixGameTestTemplate;

@GameTestHolder(CreateCobblemon.MOD_ID)
public class GameTests {
    @PrefixGameTestTemplate(false)
    @GameTest(
            template = "gametests/master_ball_lid"
    )
    public static void test(GameTestHelper helper) {
        BlockPos chestPos = helper.absolutePos(new BlockPos(6, 1 + 1, 0));
        BlockEntity blockentity = helper.getLevel().getBlockEntity(chestPos);

        helper.succeedWhen(() -> {
            if (!(blockentity instanceof BaseContainerBlockEntity)) {
                assert blockentity != null;
                helper.fail("Expected a container at " + chestPos + ", found " + BuiltInRegistries.BLOCK_ENTITY_TYPE.getKey(blockentity.getType()));
            } else if (((BaseContainerBlockEntity) blockentity).countItem(ModItems.MASTER_BALL_LID.get()) != 1) {
                helper.fail("Container should contain: " + ModItems.MASTER_BALL_LID);
            }

            helper.succeed();
        });

    }
}
