package n0rzik.fire;

import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import n0rzik.fire.modules.combat.NoHitDelay;
import n0rzik.fire.modules.movement.FastWeb;
import org.slf4j.Logger;

public class Fire extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category FIRE = new Category("Fire");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Fire Addon");

        Modules.get().add(new NoHitDelay());
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
