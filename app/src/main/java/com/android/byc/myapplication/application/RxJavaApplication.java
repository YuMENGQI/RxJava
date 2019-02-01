package com.android.byc.myapplication.application;

import android.app.Application;
import android.content.Context;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/31 17:00
 * @description
 */
public class RxJavaApplication extends Application {

    private static RxJavaApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static RxJavaApplication getApplication() {
        return application;
    }
}
