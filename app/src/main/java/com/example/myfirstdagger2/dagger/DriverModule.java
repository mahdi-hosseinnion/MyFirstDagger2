package com.example.myfirstdagger2.dagger;

import com.example.myfirstdagger2.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }





}
