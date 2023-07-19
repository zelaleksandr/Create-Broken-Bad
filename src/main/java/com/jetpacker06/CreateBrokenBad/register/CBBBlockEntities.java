package com.jetpacker06.CreateBrokenBad.register;

import com.jetpacker06.CreateBrokenBad.block.blockentity.BrassCallBellBlockEntity;
import com.jetpacker06.CreateBrokenBad.block.blockentity.TrappedBrassCallBellBlockEntity;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class CBBBlockEntities {
    public static BlockEntityEntry<BrassCallBellBlockEntity> BRASS_CALL_BELL;
    public static BlockEntityEntry<TrappedBrassCallBellBlockEntity> TRAPPED_BRASS_CALL_BELL;

    public static void register(Registrate REGISTRATE) {
        BRASS_CALL_BELL = REGISTRATE.blockEntity("brass_call_bell", BrassCallBellBlockEntity::new)
                .validBlocks(() -> CBBBlocks.BRASS_CALL_BELL.get())
                .register();

        TRAPPED_BRASS_CALL_BELL = REGISTRATE.blockEntity("trapped_brass_call_bell", TrappedBrassCallBellBlockEntity::new)
                .validBlocks(() -> CBBBlocks.BRASS_CALL_BELL.get())
                .register();
    }
}