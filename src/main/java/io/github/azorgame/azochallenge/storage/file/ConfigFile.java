package io.github.azorgame.azochallenge.storage.file;

import io.github.azorgame.azochallenge.AzoChallenge;

public class ConfigFile extends PluginFile {

    public ConfigFile(AzoChallenge instance) {
        super(instance, "config.yml");
    }
}
