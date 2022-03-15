package com.example.appweatherforcast30112021;


import android.content.Context;

import com.example.appweatherforcast30112021.model.Xehoi;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = AppModule.class )
public interface AppComponent{

    void injectApplication(MyApplication myApplication);

    ActivityComponent.Builder getActivityComponent();

    @Component.Builder
    interface AppBuilder{

        @BindsInstance
        AppBuilder context(Context context);

        AppComponent build();
    }
}
