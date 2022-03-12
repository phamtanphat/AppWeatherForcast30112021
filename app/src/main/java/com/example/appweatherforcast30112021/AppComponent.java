package com.example.appweatherforcast30112021;


import android.content.Context;

import com.example.appweatherforcast30112021.model.Xehoi;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent{

    void injectMain(MainActivity mainActivity);
    void injectMain(MainActivity2 mainActivity);

    @Component.Builder
    interface AppBuilder{

        @BindsInstance
        AppBuilder context(Context context);

        AppComponent build();
    }
}
