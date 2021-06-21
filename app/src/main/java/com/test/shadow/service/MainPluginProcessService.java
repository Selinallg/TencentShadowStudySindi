package com.test.shadow.service;

import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.util.Log;
import com.tencent.shadow.dynamic.host.PluginProcessService;

/**
 * SimpleDes:
 * Creator: Sindi
 * Date: 2021-06-21
 * UseDes:
 */
public class MainPluginProcessService extends PluginProcessService {
    public MainPluginProcessService() {

        LoadPluginCallback.setCallback(new LoadPluginCallback.Callback() {
            @Override
            public void beforeLoadPlugin(String partKey) {
                Log.e("MainPPS", "beforeLoadPlugin====>" +
                        "\tpartKey = [" + partKey + "]");
            }

            @Override
            public void afterLoadPlugin(String partKey, ApplicationInfo applicationInfo, ClassLoader pluginClassLoader, Resources pluginResources) {
                Log.e("MainPPS", "afterLoadPlugin=====>" +
                        "\tpartKey = [" + partKey + "], " +
                        "applicationInfo.className = [" + applicationInfo.className + "], " +
                        "applicationInfo.metaData = [" + applicationInfo.metaData + "], " +
                        "pluginClassLoader = [" + pluginClassLoader + "]," +
                        "pluginResources = [" + pluginResources + "]");
            }
        });
    }
}