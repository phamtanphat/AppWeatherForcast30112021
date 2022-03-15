package com.example.appweatherforcast30112021.di.module;


import androidx.lifecycle.ViewModelProvider;

import com.example.appweatherforcast30112021.di.ViewModelFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelModule {

//    @Binds
//    @IntoMap
//    @ViewModelKey(ProfileViewModel.class)
//    abstract ViewModel bindProfileViewModel(ProfileViewModel profileViewModel);

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
