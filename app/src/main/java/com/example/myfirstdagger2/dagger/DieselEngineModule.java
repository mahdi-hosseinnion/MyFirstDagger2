package com.example.myfirstdagger2.dagger;

import com.example.myfirstdagger2.car.DieselEngine;
import com.example.myfirstdagger2.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int mHorsePower;

    public DieselEngineModule(int mHorsePower) {
        this.mHorsePower = mHorsePower;
    }
    @Provides
    int provideHorsePower(){
        return mHorsePower;
    }
    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }



}
