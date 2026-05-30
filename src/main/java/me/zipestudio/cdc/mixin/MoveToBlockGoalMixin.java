package me.zipestudio.cdc.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import me.zipestudio.cdc.CDCServer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

//? if >=1.21.11 {
/*import net.minecraft.world.entity.animal.feline.Cat;
*///?} else {
import net.minecraft.world.entity.animal.Cat;
//?}

@Mixin(MoveToBlockGoal.class)
public class MoveToBlockGoalMixin {

    @Final
    @Shadow
    protected PathfinderMob mob;

    @Shadow
    protected BlockPos blockPos;

    @ModifyReturnValue(method = "getMoveToTarget", at = @At("RETURN"))
    private BlockPos redirectTargetForCatsOnBelts(BlockPos original) {

        if (!(this.mob instanceof Cat)) return original;

        BlockState state = mob.level().getBlockState(this.blockPos);
        if (state.is(CDCServer.CAT_REST_SPOTS)) {
            return this.blockPos;
        }

        return original;
    }

}
