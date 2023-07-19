package com.jetpacker06.CreateBrokenBad.block.blockentity;

import com.jetpacker06.CreateBrokenBad.block.BrassCallBellBlock;
import com.jetpacker06.CreateBrokenBad.register.CBBBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BrassCallBellBlockEntity extends BlockEntity {
    private int ticksRemaining = 5;
    public BrassCallBellBlockEntity(BlockEntityType<?> pType, BlockPos pWorldPosition, BlockState pBlockState) {
        super(pType, pWorldPosition, pBlockState);
    }
    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, BrassCallBellBlockEntity pBlockEntity) {
        if (pState.getValue(BrassCallBellBlock.DOWN)) {
            if (pBlockEntity.ticksRemaining > 0) {
                pBlockEntity.ticksRemaining--;
            } else {
                pLevel.setBlock(pPos, pState.setValue(BrassCallBellBlock.DOWN, false), 3);
                pBlockEntity.ticksRemaining = 5;
            }
        }
    }
}