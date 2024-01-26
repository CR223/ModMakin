package net.Bearlife.sprayandpray.item;
import net.Bearlife.sprayandpray.SprayandPray;
import net.Bearlife.sprayandpray.item.custom.BLItem;
import net.Bearlife.sprayandpray.block.custom.EnderliteBlock;
import net.Bearlife.sprayandpray.item.custom.DartItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SprayandPray.MOD_ID);

    public static final RegistryObject<Item> BLOWPIPE = ITEMS.register("blowpipe",
            ()->new BLItem(new Item.Properties().tab(ModCreativeModeTab.EXPERIMENTALTAB)));

    public static final RegistryObject<Item> DART = ITEMS.register("dart",
            ()->new DartItem(new Item.Properties().tab(ModCreativeModeTab.EXPERIMENTALTAB)));

    public static final RegistryObject<Item> ENDERLITE_INGOT = ITEMS.register("enderlite_ingot",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.EXPERIMENTALTAB)));

    public static final RegistryObject<Item> ENDERLITE_NUGGET = ITEMS.register("enderlite_nugget",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.EXPERIMENTALTAB)));

    public static final RegistryObject<Item> ENDERLITE_HELMET = ITEMS.register("enderlite_helmet",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.EXPERIMENTALTAB)));

    public static final RegistryObject<Item> ENDERLITE_CHESTPLATE = ITEMS.register("enderlite_chestplate",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.EXPERIMENTALTAB)));

    public static final RegistryObject<Item> ENDERLITE_LEGGINS = ITEMS.register("enderlite_leggins",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.EXPERIMENTALTAB)));

    public static final RegistryObject<Item> ENDERLITE_BOOTS = ITEMS.register("enderlite_boots",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.EXPERIMENTALTAB)));
public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);
}
}
