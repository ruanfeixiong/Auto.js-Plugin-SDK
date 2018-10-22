package org.autojs.plugin.sdk.demo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import org.autojs.plugin.sdk.Plugin;

public class PluginHelloWorld extends Plugin {

    public PluginHelloWorld(Context context, Context selfContext, Object runtime, Object topLevelScope) {
        super(context, selfContext, runtime, topLevelScope);
    }

    @Override
    public String getAssetsScriptDir() {
        return "plugin-helloworld";
    }

    public String getStringFromJava() {
        return "Hello, Auto.js!";
    }

    public void say(Context context, String message) {
        context.startActivity(new Intent(Intent.ACTION_MAIN)
                .setComponent(new ComponentName("org.autojs.plugin.sdk.demo", HelloWorldActivity.class.getName()))
                .putExtra("message", message)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }

}
