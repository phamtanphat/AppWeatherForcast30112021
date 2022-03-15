package com.example.appweatherforcast30112021.model;

import com.example.appweatherforcast30112021.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class Xemay {
    public Dongco dongco;
    public Banhxe banhxe;

    @Inject
    public Xemay(Dongco dongco, Banhxe banhxe){
        this.dongco = dongco;
        this.banhxe = banhxe;
    }
}
