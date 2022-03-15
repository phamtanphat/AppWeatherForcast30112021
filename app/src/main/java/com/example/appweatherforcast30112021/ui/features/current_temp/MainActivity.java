package com.example.appweatherforcast30112021.ui.features.current_temp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.appweatherforcast30112021.R;
import com.example.appweatherforcast30112021.ui.MyApplication;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit = ((MyApplication) getApplication()).mRetrofit;

        Log.d("BBB",retrofit.toString());
    }
}