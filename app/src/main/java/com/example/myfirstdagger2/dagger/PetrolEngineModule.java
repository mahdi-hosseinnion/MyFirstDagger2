package com.example.myfirstdagger2.dagger;

import com.example.myfirstdagger2.car.Engine;
import com.example.myfirstdagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);




}
