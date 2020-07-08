package com.example.myfirstdagger2.car;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Driver {
    //we consider we cannot use this class
    String name;

    public Driver(String name) {
        this.name = name;
    }
}
