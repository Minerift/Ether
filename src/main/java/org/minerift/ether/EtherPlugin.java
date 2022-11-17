package org.minerift.ether;

import org.bukkit.plugin.java.JavaPlugin;

public class EtherPlugin extends JavaPlugin {

    private static EtherPlugin INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;

    }
    @Override
    public void onDisable() {

    }

    public static EtherPlugin getInstance() {
        return INSTANCE;
    }
}
