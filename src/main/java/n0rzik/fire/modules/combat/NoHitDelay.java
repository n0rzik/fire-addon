package n0rzik.fire.modules.combat;

import meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import n0rzik.fire.Fire;
import net.minecraft.entity.player.PlayerEntity;

public class NoHitDelay extends Module {
    public NoHitDelay () {
        super(Fire.FIRE, "NoHitDelay", "Removes the delay between hits");
    }
    @EventHandler
    private void onAttack(AttackEntityEvent event) {
        if (mc.player.getAttackCooldownProgress(0.5f) < 1) {
            ((PlayerEntity)mc.player).resetLastAttackedTicks();
        }
    }
}
