package com.r4men.create_cobblemon.test;

import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.neoforged.neoforge.gametest.GameTestHolder;
import net.neoforged.neoforge.gametest.PrefixGameTestTemplate;

@GameTestHolder(CreateCobblemon.MOD_ID)
public class SequencedAssemblyTests {
    private static final String prefix = "game_tests/sequenced_assembly/";

    @PrefixGameTestTemplate(false)
    @GameTest(
            template = prefix + "master_ball_lid"
    )
    public static void masterBallLid(GameTestHelper helper) {
        BlockPos chestPos = new BlockPos(6, 1, 0);

        helper.succeedWhen(() -> {
            try {
                helper.assertContainerContains(chestPos.above(), ModItems.MASTER_BALL_LID.get());
            } catch (Exception e) {
                helper.fail(e.getMessage());
            }
        });
    }
}
