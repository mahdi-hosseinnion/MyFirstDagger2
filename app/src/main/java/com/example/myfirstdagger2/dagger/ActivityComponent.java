package com.example.myfirstdagger2.dagger;

import com.example.myfirstdagger2.MainActivity;
import com.example.myfirstdagger2.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PreActivity
@Component(dependencies = AppComponent.class, modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        Builder appComponent(AppComponent appComponent);
        ActivityComponent build();
    }
}