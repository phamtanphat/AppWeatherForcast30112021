package com.example.appweatherforcast30112021.model;

import javax.inject.Inject;

public class Xemay {
    public Dongco dongco;
    public Banhxe banhxe;

    @Inject
    public Xemay(Dongco dongco, Banhxe banhxe){
        this.dongco = dongco;
        this.banhxe = banhxe;
    }
}
