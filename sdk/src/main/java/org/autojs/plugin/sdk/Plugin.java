package org.autojs.plugin.sdk;

import android.content.Context;
import android.support.annotation.Keep;

@Keep
public abstract class Plugin {

    private final Object mRuntime;
    private final Object mTopLevelScope;
    private final Context mContext;
    private final Context mSelfContext;

    public Plugin(Context context, Context selfContext, Object runtime, Object topLevelScope) {
        mRuntime = runtime;
        mTopLevelScope = topLevelScope;
        mContext = context;
        mSelfContext = selfContext;
    }

    public Context getSelfContext() {
        return mSelfContext;
    }

    public Object getRuntime() {
        return mRuntime;
    }

    public Object getTopLevelScope() {
        return mTopLevelScope;
    }

    public Context getContext() {
        return mContext;
    }

    public abstract String getAssetsScriptDir();

    @Keep
    public static int getVersion() {
        return PluginRegistry.VERSION;
    }
}
