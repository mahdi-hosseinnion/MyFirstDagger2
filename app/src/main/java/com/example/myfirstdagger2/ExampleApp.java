package com.example.myfirstdagger2;

import android.app.Application;

import com.example.myfirstdagger2.dagger.ActivityComponent;
import com.example.myfirstdagger2.dagger.AppComponent;
import com.example.myfirstdagger2.dagger.DaggerAppComponent;
import com.example.myfirstdagger2.dagger.DriverModule;


public class ExampleApp extends Application {
    private AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent= DaggerAppComponent.factory().create(new DriverModule("mamad"));

    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
