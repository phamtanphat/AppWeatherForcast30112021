package com.example.appweatherforcast30112021;


import com.example.appweatherforcast30112021.model.Xehoi;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent{

//    void injectMain(MainActivity mainActivity);

    Xehoi getXeHoi();

}
