package com.example.appweatherforcast30112021;

import com.example.appweatherforcast30112021.model.Banhxe;
import com.example.appweatherforcast30112021.model.Dongco;
import com.example.appweatherforcast30112021.model.Xemay;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    public static Xemay provideXeMay(Dongco dongco , Banhxe banhxe){
        return new Xemay(dongco,banhxe);
    }
}
