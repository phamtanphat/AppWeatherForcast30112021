package com.example.appweatherforcast30112021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.appweatherforcast30112021.model.Xehoi;

public class MainActivity extends AppCompatActivity {

    AppComponent appComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appComponent = DaggerAppComponent.create();


        Xehoi xehoi = appComponent.getXeHoi();

        Log.d("BBB",xehoi.toString());
    }
}