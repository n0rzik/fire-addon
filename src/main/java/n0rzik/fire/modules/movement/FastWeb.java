package n0rzik.fire.modules.movement;

import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import n0rzik.fire.Fire;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FastWeb extends Module {
    public FastWeb () {
        super(Fire.FIRE, "FastWeb", "Accelerates the fall through the web");
    }
    @EventHandler
    private void onTick(TickEvent.Post event) {
        if (mc.player.getBlockStateAtPos().getBlock() == Blocks.COBWEB) {
            mc.player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 0, 255, false, false, false));
        }
    }
}
