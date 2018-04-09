package com.example.mobiweb.testapp;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import com.facebook.drawee.backends.pipeline.Fresco;


public class BaseApplication extends Application {
    private static BaseApplication mBaseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        Fresco.initialize(this);
        mBaseApplication = this;

    }


    public static BaseApplication getBaseApplication() {
        return mBaseApplication;
    }


    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
