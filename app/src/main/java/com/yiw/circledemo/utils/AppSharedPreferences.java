package com.yiw.circledemo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * SharedPreference管理类
 *
 * @author yiw
 *         2015-12-30 上午11:05:27
 */
@SuppressWarnings("ALL")
public class AppSharedPreferences {

    private SharedPreferences sharedPreferences;
    private static AppSharedPreferences appSharedPreferences;

    private AppSharedPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences("CIRCLEDEMO", Activity.MODE_PRIVATE);
    }

    public static AppSharedPreferences getInstance(Context context) {
        if (null == appSharedPreferences) {
            appSharedPreferences = new AppSharedPreferences(context);
        }
        return appSharedPreferences;
    }

    public String get(String key) {
        if (null == sharedPreferences) {
            return "";
        }
        String result = sharedPreferences.getString(key, "");
        if (!TextUtils.isEmpty(result)) {
            return result;
        }
        return "";
    }

    public void set(String key, String value) {
        if (null != sharedPreferences) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(key, value);
            editor.apply();
        }
    }

    public void remove(String... key) {
        for (String k : key) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.remove(k);
            editor.apply();
        }
    }
}
