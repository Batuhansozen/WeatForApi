package com.example.deneme

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherApiClient {

    private val retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder()
            .baseUrl("https://pro.openweathermap.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getWeatherForecast(city: String, apiKey: String): Call<WeatherForecastResponse> {
        val weatherApiService = retrofit.create(WeatherApiService::class.java)
        return weatherApiService.getWeatherForecast(city, apiKey)
    }
}