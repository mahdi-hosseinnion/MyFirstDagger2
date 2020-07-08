package com.example.myfirstdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myfirstdagger2.car.Car;
import com.example.myfirstdagger2.dagger.CarComponent;
import com.example.myfirstdagger2.dagger.DaggerCarComponent;
import com.example.myfirstdagger2.dagger.DieselEngineModule;


import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(185)
                .engineCapacity(1400)
                .build();
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
