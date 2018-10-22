package org.autojs.plugin.sdk.demo;

import org.autojs.plugin.sdk.Plugin;
import org.autojs.plugin.sdk.PluginLoader;
import org.autojs.plugin.sdk.PluginRegistry;

public class MyPluginRegistry extends PluginRegistry {

    static {
        registerDefaultPlugin(new PluginLoader() {
            @Override
            public Plugin load(Object runtime, Object topLevelScope) {
                return new PluginHelloWorld(runtime, topLevelScope);
            }
        });
    }
}
