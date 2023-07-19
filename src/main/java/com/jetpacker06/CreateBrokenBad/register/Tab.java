package com.jetpacker06.CreateBrokenBad.register;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Tab {
    public static final CreativeModeTab CREATEBB = new CreativeModeTab("CreateBB") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CBBItems.WHITE_METH.get());
        }
    };
}