package com.example.appweatherforcast30112021.ui.features.current_temp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.appweatherforcast30112021.R;
import com.example.appweatherforcast30112021.ui.MyApplication;


import dagger.android.support.DaggerAppCompatActivity;
import retrofit2.Retrofit;

public class CurrentTempActivity extends DaggerAppCompatActivity {

    Retrofit retrofit;

    Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_temp);

        retrofit = ((MyApplication) getApplication()).mRetrofit;

        mBtn = findViewById(R.id.btnNavigateScreen2);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CurrentTempActivity.this,MainActivity.class));
            }
        });

        Log.d("BBB",retrofit.toString());

    }
}