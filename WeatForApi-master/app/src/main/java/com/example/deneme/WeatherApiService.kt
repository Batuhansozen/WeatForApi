package com.example.deneme

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("/data/2.5/forecast/hourly")
    fun getWeatherForecast(
        @Query("q") city: String,
        @Query("appid") apiKey: String
    ): Call<WeatherForecastResponse>
}