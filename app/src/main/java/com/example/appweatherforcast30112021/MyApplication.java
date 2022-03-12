package com.example.appweatherforcast30112021;


import android.app.Application;

import com.example.appweatherforcast30112021.model.Xehoi;

import javax.inject.Inject;

public class MyApplication extends Application {

    @Inject
    Xehoi xehoi;

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().context(getApplicationContext()).build();

        appComponent.injectApplication(this);


    }
}
