package n0rzik.fire.modules.combat;

import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import n0rzik.fire.Fire;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class PistonPush extends Module {
    public PistonPush () {
        super(Fire.FIRE, "PistonPush", "does not work");
    }
    private final SettingGroup sgGenetal = settings.getDefaultGroup();

    private final Setting<Double> range = sgGenetal.add(new DoubleSetting.Builder()
            .name("Range")
            .defaultValue(1)
            .sliderRange(1,3)
            .build()
    );

    private List<BlockPos> queue = new ArrayList<>();

    public final List<BlockPos> pistonRow = List.of(new BlockPos(0, 1, 1), new BlockPos(0, 1, 1), new BlockPos(-1, 1, 0) , new BlockPos(0, 1, -1));

    public void onPushTick(TickEvent.Pre event) {
        boolean fakePlayer = false;
    }
    //piston push does not work!!!
    //piston push does not work!!!
    //piston push does not work!!!
    //piston push does not work!!!
    //piston push does not work!!!
}
