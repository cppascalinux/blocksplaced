package cppascalinux.blockplaced.mixin;

import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;

import cppascalinux.blockplaced.BlocksPlaced;

@Mixin(BlockItem.class)
public class BlockPlaceHook {
	@Inject(at = @At("TAIL"), method = "place")
	private void increase_counter(ItemPlacementContext context, CallbackInfoReturnable<ActionResult> info) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
		if (!world.isClient() && player instanceof PlayerEntity) {
			player.incrementStat(BlocksPlaced.BLOCKS_PLACED);
		}
	}
}