package net.Bearlife.sprayandpray.world.feature;

import com.google.common.base.Suppliers;
import net.Bearlife.sprayandpray.SprayandPray;
import net.Bearlife.sprayandpray.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURE =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SprayandPray.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_ENDERLITE_ORE = Suppliers.memoize( ()-> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDERLITE_ORE.get().defaultBlockState())
    ));
   /* public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_ENDERLITE_ORE = Suppliers.memoize( ()-> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.ENDERLITE_ORE.get().defaultBlockState())
     ));*/


    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDERLITE_ORE = CONFIGURED_FEATURE.register("enderlite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ENDERLITE_ORE.get(), 7)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURE.register(eventBus);
    }
}
