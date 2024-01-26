package net.Bearlife.sprayandpray.block.custom;
import net.Bearlife.sprayandpray.SprayandPray;
import net.Bearlife.sprayandpray.block.ModBlocks;
import net.Bearlife.sprayandpray.item.ModItems;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;
import org.openjdk.nashorn.internal.ir.Statement;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

public class EnderliteBlock extends Block {


    public EnderliteBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader level, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {



        return super.getExpDrop(state, level, randomSource, pos, fortuneLevel, silkTouchLevel);
    }

    public static List<ItemStack> getDrops(BlockState blockState, ServerLevel serverlevel, BlockPos blockpos, @Nullable BlockEntity blockentity) {
        LootContext.Builder lootcontext$builder = (new LootContext.Builder(serverlevel)).withRandom(serverlevel.random).withParameter(LootContextParams.ORIGIN, Vec3.atCenterOf(blockpos)).withParameter(LootContextParams.TOOL, ItemStack.EMPTY).withOptionalParameter(LootContextParams.BLOCK_ENTITY, blockentity);
        return blockState.getDrops(lootcontext$builder);
    }
}
