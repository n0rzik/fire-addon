package n0rzik.fire;

import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import n0rzik.fire.modules.combat.NoHitDelay;
import n0rzik.fire.modules.exploit.HitboxDesync;
import n0rzik.fire.modules.movement.FastWeb;
import org.slf4j.Logger;

public class Fire extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category FIRE = new Category("Fire");

    //public static String notif = "[Fire]";
    public static String install = "fire ";
    public static String version = "0.1.1";

    @Override
    public void onInitialize() {
        LOG.info("Initializing " + install + version);

        //COMBAT
        Modules.get().add(new NoHitDelay());
        //EXPLOIT
        Modules.get().add(new HitboxDesync());
        //MOVEMENT
        Modules.get().add(new FastWeb());
    }
    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(FIRE);
    }

    @Override
    public String getPackage() {
        return "n0rzik.fire";
    }
}
