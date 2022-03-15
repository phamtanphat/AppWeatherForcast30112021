package com.example.appweatherforcast30112021.ui;

import com.example.appweatherforcast30112021.di.component.AppComponent;
import com.example.appweatherforcast30112021.di.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import retrofit2.Retrofit;

public class MyApplication extends DaggerApplication {

    @Inject
    public Retrofit mRetrofit;

    AppComponent mAppComponent;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        mAppComponent = DaggerAppComponent.builder().application(this).build();
        return mAppComponent;
    }
}
