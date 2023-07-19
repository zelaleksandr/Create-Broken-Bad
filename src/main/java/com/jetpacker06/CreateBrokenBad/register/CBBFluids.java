package com.jetpacker06.CreateBrokenBad.register;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class CBBFluids {
    public static ResourceLocation still = new ResourceLocation("block/water_still");
    public static ResourceLocation flow = new ResourceLocation("block/water_flow");
    private static Registrate REGISTRATE;

    public static FluidEntry<ForgeFlowingFluid.Flowing> LIQUID_BLUE_METHAMPHETAMINE;
    public static FluidEntry<ForgeFlowingFluid.Flowing> LIQUID_METHAMPHETAMINE;
    public static FluidEntry<ForgeFlowingFluid.Flowing> METHYLAMINE;
    public static FluidEntry<ForgeFlowingFluid.Flowing> METHANOL;
    public static FluidEntry<ForgeFlowingFluid.Flowing> HYDROGEN;
    public static FluidEntry<ForgeFlowingFluid.Flowing> OXYGEN;
    public static FluidEntry<ForgeFlowingFluid.Flowing> AMMONIA;
    public static FluidEntry<ForgeFlowingFluid.Flowing> PHENYLACETIC_ACID;
    public static FluidEntry<ForgeFlowingFluid.Flowing> ACETIC_ANHYDRIDE;
    public static FluidEntry<ForgeFlowingFluid.Flowing> PHENYLACETONE;

    /**
     * Creates a white fluid.
     */
    public static FluidBuilder<ForgeFlowingFluid.Flowing, Registrate> basicFluid(String name) {
        return basicFluid(name, 0xffffffff);
    }

    /**
     * Creates a fluid with a given color. Use the format 0xAA(hex)
     */
    public static FluidBuilder<ForgeFlowingFluid.Flowing, Registrate> basicFluid(String name, int color) {
        return REGISTRATE.fluid(name, still, flow, (b, f) -> new ColoredFluidAttributes(b, f, color))
                .attributes(b -> b.viscosity(500).density(500))
                .properties(p -> p.tickRate(5).slopeFindDistance(6).explosionResistance(100f))
                .source(ForgeFlowingFluid.Source::new);
    }
    public static ItemEntry<BucketItem> getBucket(FluidBuilder<ForgeFlowingFluid.Flowing, Registrate> fluid) {
        return fluid.bucket().properties(p -> p.stacksTo(1)).register();
    }
    public static void register(Registrate registrate) {
        CBBFluids.REGISTRATE = registrate;

        var f1 = basicFluid("liquid_blue_methamphetamine", 0xff42ddf5);
        CBBItems.LIQUID_BLUE_METHAMPHETAMINE_BUCKET = getBucket(f1);
        LIQUID_BLUE_METHAMPHETAMINE = f1.register();

        var f2 = basicFluid("liquid_methamphetamine");
        CBBItems.LIQUID_METHAMPHETAMINE_BUCKET = getBucket(f2);
        LIQUID_METHAMPHETAMINE = f2.register();

        var f3 = basicFluid("methylamine");
        CBBItems.METHYLAMINE_BUCKET = getBucket(f3);
        METHYLAMINE = f3.register();

        var f4 = basicFluid("methanol");
        CBBItems.METHANOL_BUCKET = getBucket(f4);
        METHANOL = f4.register();

        var f5 = basicFluid("hydrogen");
        CBBItems.HYDROGEN_BUCKET = getBucket(f5);
        HYDROGEN = f5.register();

        var f6 = basicFluid("oxygen");
        CBBItems.OXYGEN_BUCKET = getBucket(f6);
        OXYGEN = f6.register();

        var f7 = basicFluid("ammonia");
        CBBItems.AMMONIA_BUCKET = getBucket(f7);
        AMMONIA = f7.register();

        var f8 = basicFluid("phenylacetic_acid");
        CBBItems.PHENYLACETIC_ACID_BUCKET = getBucket(f8);
        PHENYLACETIC_ACID = f8.register();

        var f9 = basicFluid("acetic_anhydride");
        CBBItems.ACETIC_ANHYDRIDE_BUCKET = getBucket(f9);
        ACETIC_ANHYDRIDE = f9.register();

        var f10 = basicFluid("phenylacetone");
        CBBItems.PHENYLACETONE_BUCKET = getBucket(f10);
        PHENYLACETONE = f10.register();

    }

    private static class ColoredFluidAttributes extends FluidAttributes {
        private final int color;

        protected ColoredFluidAttributes(Builder builder, Fluid fluid, int color) {
            super(builder, fluid);
            this.color = color;
        }

        @Override
        public int getColor(BlockAndTintGetter world, BlockPos pos) {
            return color;
        }

        @Override
        public int getColor(FluidStack stack) {
            return color;
        }
    }
}
