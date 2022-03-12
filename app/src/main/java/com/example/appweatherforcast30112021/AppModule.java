package com.example.appweatherforcast30112021;

import android.content.Context;

import com.example.appweatherforcast30112021.model.Banhxe;
import com.example.appweatherforcast30112021.model.Dongco;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public Dongco provideDongCo(Context context){
        return new Dongco(context);
    }

    @Provides
    public Banhxe provideBanhxe(){
        return new Banhxe();
    }

}
