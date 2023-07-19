package com.jetpacker06.CreateBrokenBad.block;

import com.jetpacker06.CreateBrokenBad.register.CBBItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;

public class EphedraBlock extends BeetrootBlock {
    public EphedraBlock(Properties p_49661_) {
        super(p_49661_);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return CBBItems.EPHEDRA_SEEDS.get();
    }
}
