package org.autojs.plugin.sdk;

import android.support.annotation.Keep;
import android.util.Log;

import java.util.HashMap;

public abstract class PluginRegistry {

    private static final String NAME_DEFAULT = "::default";
    static final int VERSION = 1;
    private static final String LOG_TAG = "Plugin";
    private static HashMap<String, PluginLoader> sPluginLoaders = new HashMap<>();

    public void onAttached() {

    }

    public void onDetached() {

    }

    @Keep
    public static Plugin load(String name, Object runtime, Object topLevelScope) {
        PluginLoader pluginLoader = sPluginLoaders.get(name);
        Log.i(LOG_TAG, "load: name = " + name + ", loader = " + pluginLoader);
        if (pluginLoader == null) {
            return null;
        }
        return pluginLoader.load(runtime, topLevelScope);
    }

    @Keep
    public static Plugin loadDefault(Object runtime, Object topLevelScope) {
        return load(NAME_DEFAULT, runtime, topLevelScope);
    }

    public static void registerPlugin(String name, PluginLoader loader) {
        Log.i(LOG_TAG, "registerPlugin: name = " + name + ", loader = " + loader);
        sPluginLoaders.put(name, loader);
    }

    public static void registerDefaultPlugin(PluginLoader loader) {
        registerPlugin(NAME_DEFAULT, loader);
    }

}
