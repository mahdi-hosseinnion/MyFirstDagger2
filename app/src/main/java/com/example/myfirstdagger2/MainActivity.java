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
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component= DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(120))
                .build();
        component.inject(this);
        car.drive();
    }
}
