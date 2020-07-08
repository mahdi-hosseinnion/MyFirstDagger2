package com.example.myfirstdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myfirstdagger2.car.Car;
import com.example.myfirstdagger2.dagger.ActivityComponent;
import com.example.myfirstdagger2.dagger.DaggerActivityComponent;


import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(154)
                .engineCapacity(15862)
                .appComponent( ((ExampleApp)getApplication()).getAppComponent())
                .build();
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
