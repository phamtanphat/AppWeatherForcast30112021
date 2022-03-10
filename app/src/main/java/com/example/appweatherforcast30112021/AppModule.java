package com.example.appweatherforcast30112021;

import com.example.appweatherforcast30112021.model.Banhxe;
import com.example.appweatherforcast30112021.model.Dongco;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public Dongco provideDongCo(){
        return new Dongco();
    }

    @Provides
    public Banhxe provideBanhxe(){
        return new Banhxe();
    }
}
