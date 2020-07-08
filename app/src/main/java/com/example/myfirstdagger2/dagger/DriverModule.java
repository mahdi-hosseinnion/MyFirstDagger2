package com.example.myfirstdagger2.dagger;

import com.example.myfirstdagger2.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    String name;

    public DriverModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    Driver provideDriver(){
        return new Driver(name);
    }





}
