package com.example.appweatherforcast30112021.data.remote;

import com.example.appweatherforcast30112021.data.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    // Truyền theo Query : (@Query)
    // http://api.openweathermap.org/data/2.5/weather?appid=86183a23377ed034aef7aad102f43d64&units=metric&q=Hanoi

    // Truyền theo Params : (@Params)
    // http://api.openweathermap.org/data/2.5/weather/temp/{time}/data
    // @Path("time") String time

    @GET("data/2.5/weather")
    Call<WeatherResponse> getTempCity(
            @Query("appid") String appid,
            @Query("units") String units,
            @Query("q") String q
    );


}
