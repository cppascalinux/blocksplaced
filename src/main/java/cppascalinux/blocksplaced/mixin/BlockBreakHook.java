package cppascalinux.blocksplaced.mixin;

import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import cppascalinux.blocksplaced.BlocksPlaced;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;

@Mixin(ItemStack.class)
public class BlockBreakHook {
	@Inject(at = @At("HEAD"), method = "postMine")
	private void increase_counter(World world, BlockState state,
		BlockPos pos, PlayerEntity miner, CallbackInfo info) {
		if (!world.isClient() && miner instanceof PlayerEntity) {
			miner.incrementStat(BlocksPlaced.BLOCKS_BROKEN);
		}
	}
}