package com.example.myfirstdagger2.dagger;

import com.example.myfirstdagger2.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
