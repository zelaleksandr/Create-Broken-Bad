package com.jetpacker06.CreateBrokenBad.register;

import com.jetpacker06.CreateBrokenBad.block.BrassCallBellBlock;
import com.jetpacker06.CreateBrokenBad.block.EphedraBlock;
import com.jetpacker06.CreateBrokenBad.block.TrappedBrassCallBellBlock;
import com.jetpacker06.CreateBrokenBad.block.TrayBlock;
import com.simibubi.create.foundation.data.TagGen;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class CBBBlocks {
    public static BlockEntry<EphedraBlock> EPHEDRA_CROP_BLOCK;
    public static BlockEntry<BrassCallBellBlock> BRASS_CALL_BELL;
    public static BlockEntry<TrappedBrassCallBellBlock> TRAPPED_BRASS_CALL_BELL;
    public static BlockEntry<TrayBlock.Blue> BLUE_METH_TRAY;
    public static BlockEntry<TrayBlock.White> WHITE_METH_TRAY;
    public static BlockEntry<TrayBlock.Empty> TRAY;

    public static void register(Registrate REGISTRATE) {
        REGISTRATE.creativeModeTab(() -> Tab.CREATEBB);
        NonNullSupplier<? extends Block> metal = () -> Blocks.IRON_BLOCK;

        EPHEDRA_CROP_BLOCK = REGISTRATE.block("ephedra_crop_block", EphedraBlock::new)
                .initialProperties(() -> Blocks.BEETROOTS)
                .register();
        BRASS_CALL_BELL = REGISTRATE.block("brass_call_bell", BrassCallBellBlock::new)
                .initialProperties(metal)
                .transform(TagGen.pickaxeOnly())
                .simpleItem()
                .register();
        TRAPPED_BRASS_CALL_BELL = REGISTRATE.block("trapped_brass_call_bell", TrappedBrassCallBellBlock::new)
                .initialProperties(metal)
                .transform(TagGen.pickaxeOnly())
                .simpleItem()
                .register();
        BLUE_METH_TRAY = REGISTRATE.block("blue_meth_tray", TrayBlock.Blue::new)
                .initialProperties(metal)
                .transform(TagGen.pickaxeOnly())
                .simpleItem()
                .register();
        WHITE_METH_TRAY = REGISTRATE.block("white_meth_tray", TrayBlock.White::new)
                .initialProperties(metal)
                .transform(TagGen.pickaxeOnly())
                .simpleItem()
                .register();
        TRAY = REGISTRATE.block("tray", TrayBlock.Empty::new)
                .initialProperties(metal)
                .transform(TagGen.pickaxeOnly())
                .simpleItem()
                .register();
    }
}
