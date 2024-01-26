package net.Bearlife.sprayandpray;

import com.mojang.logging.LogUtils;
import net.Bearlife.sprayandpray.block.ModBlocks;
import net.Bearlife.sprayandpray.item.ModItems;
import net.Bearlife.sprayandpray.world.feature.ModConfiguredFeatures;
import net.Bearlife.sprayandpray.world.feature.ModPlacedFeatures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SprayandPray.MOD_ID)
public class SprayandPray {
    public static final String MOD_ID = "sprayandpray";
    private static final Logger LOGGER = LogUtils.getLogger();
    public SprayandPray()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);

        ModPlacedFeatures.register(modEventBus);
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
