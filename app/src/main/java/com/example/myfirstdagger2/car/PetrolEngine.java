package com.example.myfirstdagger2.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{
    private static final String TAG = "PetrolEngine";
    private int mHorsePower;
    private int mEngineCapacity;
    @Inject
    public PetrolEngine(@Named("horsePower")int horsePower,
                        @Named("engineCapacity")int engineCapacity) {
        this.mHorsePower =horsePower;
        this.mEngineCapacity =engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Petrol engine started..............\n horsePower: "+ mHorsePower
        +"\n engineCapacity: "+mEngineCapacity);
    }
}
