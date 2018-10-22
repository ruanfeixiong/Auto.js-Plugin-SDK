package org.autojs.plugin.sdk.demo;

import android.content.Context;

import org.autojs.plugin.sdk.Plugin;
import org.autojs.plugin.sdk.PluginLoader;
import org.autojs.plugin.sdk.PluginRegistry;

public class MyPluginRegistry extends PluginRegistry {

    static {
        registerDefaultPlugin(new PluginLoader() {
            @Override
            public Plugin load(Context context, Context selfContext, Object runtime, Object topLevelScope) {
                return new PluginHelloWorld(context, runtime, topLevelScope);
            }
        });
    }
}
