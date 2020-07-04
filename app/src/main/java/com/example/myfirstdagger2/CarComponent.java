package com.example.myfirstdagger2;

import dagger.Component;

@Component(modules = {WheelModule.class,PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
