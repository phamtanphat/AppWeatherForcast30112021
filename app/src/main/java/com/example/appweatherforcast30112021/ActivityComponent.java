package com.example.appweatherforcast30112021;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder{
        ActivityComponent build();
    }
}
