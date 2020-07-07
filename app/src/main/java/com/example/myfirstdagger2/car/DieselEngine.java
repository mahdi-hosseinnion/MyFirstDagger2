package com.example.myfirstdagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    private int mHorsePower;
    @Inject
    public DieselEngine(int horsePower) {
        this.mHorsePower=horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Diesel engine started..........................+ "+mHorsePower);
    }
}
