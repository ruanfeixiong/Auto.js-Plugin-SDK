package org.autojs.plugin.sdk;

import android.support.annotation.Keep;
import android.util.Log;

import java.util.HashMap;

@Keep
public abstract class Plugin {


    private final Object mRuntime;
    private final Object mTopLevelScope;

    public Plugin(Object runtime, Object topLevelScope) {
        mRuntime = runtime;
        mTopLevelScope = topLevelScope;
    }

    public Object getRuntime() {
        return mRuntime;
    }

    public Object getTopLevelScope() {
        return mTopLevelScope;
    }

    public abstract String getAssetsScriptDir();

    @Keep
    public static int getVersion() {
        return PluginRegistry.VERSION;
    }
}
