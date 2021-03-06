package com.example.myfirstdagger2.car;

import android.util.Log;

import com.example.myfirstdagger2.dagger.PreActivity;

import javax.inject.Inject;
@PreActivity
public class Car {
    private static final String TAG = "Car";
    private Driver mDriver;
    private Engine mEngine;
    private Wheels mWheels;

    @Inject
    public Car(Engine engine, Wheels wheels,Driver driver) {
        this.mEngine = engine;
        this.mWheels = wheels;
        this.mDriver = driver;

    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void drive(){
        mEngine.start();
        Log.d(TAG, mDriver+" " +mDriver.name+" driving "+ this+"-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-");
    }
}
