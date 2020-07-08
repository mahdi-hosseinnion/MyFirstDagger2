package com.example.myfirstdagger2;

import android.app.Application;

import com.example.myfirstdagger2.dagger.ActivityComponent;
import com.example.myfirstdagger2.dagger.AppComponent;
import com.example.myfirstdagger2.dagger.DaggerAppComponent;


public class ExampleApp extends Application {
    private AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent= DaggerAppComponent.create();

    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
