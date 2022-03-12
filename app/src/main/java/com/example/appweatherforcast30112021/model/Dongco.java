package com.example.appweatherforcast30112021.model;

import android.content.Context;
import android.widget.Toast;

public class Dongco {

    private Context context;

    public Dongco(Context context){
        this.context = context;
    }

    public void showInfo(){
        Toast.makeText(context, "Động cơ", Toast.LENGTH_SHORT).show();
    }
}
