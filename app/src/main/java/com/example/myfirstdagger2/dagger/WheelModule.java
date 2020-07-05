package com.example.myfirstdagger2.dagger;

import com.example.myfirstdagger2.car.Rims;
import com.example.myfirstdagger2.car.Tires;
import com.example.myfirstdagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {
    @Provides
    static Rims provideRims(){
        return new Rims();
    }
    @Provides
    static Tires provideTires(){
        Tires tires=new Tires();
        tires.inlfate();
        return tires;
    }
    @Provides
    static Wheels provideWheels(Tires tires, Rims rims){
        return new Wheels(rims,tires);
    }
}
