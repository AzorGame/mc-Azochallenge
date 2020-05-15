package io.github.azorgame.azochallenge;

import io.github.azorgame.azochallenge.storage.file.ConfigFile;
import org.bukkit.plugin.java.JavaPlugin;

public class AzoChallenge extends JavaPlugin {

    private ConfigFile configFile;

    @Override
    public void onEnable() {
        super.onEnable();
        this.configFile = new ConfigFile(this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
