package com.example.myfirstdagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine mEngine;
    private Wheels mWheels;
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.mEngine = engine;
        this.mWheels = wheels;

    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void drive(){
        mEngine.start();
        Log.d(TAG, "drive: yea driving............................................");
    }
}
