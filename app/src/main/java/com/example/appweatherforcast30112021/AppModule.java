package com.example.appweatherforcast30112021;

import android.content.Context;

import com.example.appweatherforcast30112021.model.Banhxe;
import com.example.appweatherforcast30112021.model.Dongco;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = ActivityComponent.class)
public class AppModule {

    @Provides
    public static Dongco provideDongCo(Context context){
        return new Dongco(context);
    }

    @Provides
    public static Banhxe provideBanhxe(){
        return new Banhxe();
    }

}
