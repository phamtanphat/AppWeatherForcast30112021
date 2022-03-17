package com.example.appweatherforcast30112021.ui.features.current_temp;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.appweatherforcast30112021.data.model.WeatherResponse;
import com.example.appweatherforcast30112021.data.repository.WeatherRepository;

import java.io.IOException;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrentTempViewModel extends ViewModel {
    private WeatherRepository repository;
    private MutableLiveData<WeatherResponse> weatherResponse = new MutableLiveData<>();
    private MutableLiveData<Throwable> error = new MutableLiveData<>();

    @Inject
    public CurrentTempViewModel(WeatherRepository repository){
        this.repository = repository;
    }

    public LiveData<WeatherResponse> getWeatherResponse(){
        return weatherResponse;
    }

    public LiveData<Throwable> getError(){
        return error;
    }

    public void getTempFromCityName(String cityName){
        repository.getTempCity("86183a23377ed034aef7aad102f43d64","metric",cityName).enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if (response.errorBody() != null){
                    try {
                        Log.d("BBB",response.errorBody().string());
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                Log.d("BBB","Code " + response.code());
                WeatherResponse data = response.body();
                weatherResponse.setValue(data);
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                error.setValue(t);
            }
        });
    }
}
