package org.autojs.plugin.sdk;

public interface PluginLoader {

    Plugin load(Object runtime, Object topLevelScope);
}
