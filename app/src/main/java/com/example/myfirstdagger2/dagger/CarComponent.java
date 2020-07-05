package com.example.myfirstdagger2.dagger;

import com.example.myfirstdagger2.MainActivity;
import com.example.myfirstdagger2.car.Car;

import dagger.Component;

@Component(modules = {WheelModule.class,DieselEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
