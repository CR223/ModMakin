package net.Bearlife.sprayandpray.block;

import net.Bearlife.sprayandpray.SprayandPray;
import net.Bearlife.sprayandpray.block.custom.EnderliteBlock;
import net.Bearlife.sprayandpray.item.ModCreativeModeTab;
import net.Bearlife.sprayandpray.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SprayandPray.MOD_ID);
    // added block

    /*public static final RegistryObject<Block> ENDERLITE_BLOCK = registerBlock("enderlite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(7.0f).
                    requiresCorrectToolForDrops()), ModCreativeModeTab.EXPERIMENTALTAB);*/

    public static final RegistryObject<Block> ENDERLITE_ORE = registerBlock("enderlite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).
                    requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.EXPERIMENTALTAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name , () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
}

    public static void register(IEventBus eventBus){

        BLOCKS.register(eventBus);
    }
}
