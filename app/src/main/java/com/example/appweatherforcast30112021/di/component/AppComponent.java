package com.example.appweatherforcast30112021.di.component;


import android.app.Application;

import com.example.appweatherforcast30112021.di.module.ActivityModule;
import com.example.appweatherforcast30112021.di.module.NetWorkModule;
import com.example.appweatherforcast30112021.di.module.ViewModelModule;
import com.example.appweatherforcast30112021.ui.MyApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        NetWorkModule.class,
        ViewModelModule.class,
        ActivityModule.class
})
public interface AppComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
