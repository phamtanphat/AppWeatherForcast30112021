package com.example.appweatherforcast30112021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.appweatherforcast30112021.model.Xehoi;

import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {

    @Inject
    Xehoi xehoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DaggerAppComponent
                .builder()
                .context(getApplicationContext())
                .build()
                .injectMain(this);

        Log.d("BBB","Main2 "  + xehoi.toString());
    }
}