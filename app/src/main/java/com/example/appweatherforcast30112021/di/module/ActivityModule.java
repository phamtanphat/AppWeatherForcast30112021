package com.example.appweatherforcast30112021.di.module;

import com.example.appweatherforcast30112021.ui.features.current_temp.CurrentTempActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


// subcomponent cho activity

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    public abstract CurrentTempActivity bindContributeCurrentActivity();
}
