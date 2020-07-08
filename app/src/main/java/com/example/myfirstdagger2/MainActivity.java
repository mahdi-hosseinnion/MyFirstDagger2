package com.example.myfirstdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myfirstdagger2.car.Car;
import com.example.myfirstdagger2.dagger.ActivityComponent;
import com.example.myfirstdagger2.dagger.DieselEngineModule;


import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent component = ((ExampleApp)getApplication()).getAppComponent()
                .getActivityComponentFactory().create(140,15748);
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
