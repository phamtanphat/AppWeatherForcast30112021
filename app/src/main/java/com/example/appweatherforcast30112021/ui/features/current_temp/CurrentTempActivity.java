package com.example.appweatherforcast30112021.ui.features.current_temp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.appweatherforcast30112021.R;
import com.example.appweatherforcast30112021.data.model.WeatherResponse;
import com.example.appweatherforcast30112021.databinding.ActivityCurrentTempBinding;
import com.example.appweatherforcast30112021.di.ViewModelFactory;
import com.example.appweatherforcast30112021.ui.MyApplication;


import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import retrofit2.Retrofit;

public class CurrentTempActivity extends DaggerAppCompatActivity {

    @Inject
    CurrentTempViewModel mViewModel;

    ActivityCurrentTempBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_current_temp);

        mViewModel.getWeatherResponse().observe(this, new Observer<WeatherResponse>() {
            @Override
            public void onChanged(WeatherResponse weatherResponse) {
                Log.d("BBB",weatherResponse.getMain().getTemp() + "");
            }
        });

        mViewModel.getTempFromCityName("Hanoi");

    }
}