package com.example.appweatherforcast30112021.data.repository;

import com.example.appweatherforcast30112021.data.model.Weather;
import com.example.appweatherforcast30112021.data.model.WeatherResponse;
import com.example.appweatherforcast30112021.data.remote.ApiService;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherRepository {

    private ApiService apiService;

    @Inject
    public WeatherRepository(ApiService apiService) {
        this.apiService = apiService;
    }


    public Call<WeatherResponse> getTempCity(String appid, String units, String q) {
        return apiService.getTempCity(appid, units, q);
    }
}
