package com.example.appweatherforcast30112021.di.module;


import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.appweatherforcast30112021.di.ViewModelFactory;
import com.example.appweatherforcast30112021.di.key.ViewModelKey;
import com.example.appweatherforcast30112021.ui.features.current_temp.CurrentTempViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CurrentTempViewModel.class)
    abstract ViewModel bindCurrentTempViewModel(CurrentTempViewModel currentTempViewModel);

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
