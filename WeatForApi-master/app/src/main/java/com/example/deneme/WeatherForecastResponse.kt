package com.example.deneme

import com.google.gson.annotations.SerializedName

data class WeatherForecastResponse(
    @SerializedName("list")
    val forecastList: List<WeatherForecast>,
    // Diğer veri alanlarını da ekleyebilirsiniz
)

data class WeatherForecast(
    val dt: Long,
    val main: Main,
    val weather: List<Weather>,
    // Diğer veri alanlarını da ekleyebilirsiniz
)

data class Main(
    val temp: Double,
    // Diğer veri alanlarını da ekleyebilirsiniz
)

data class Weather(
    val main: String,
    // Diğer veri alanlarını da ekleyebilirsiniz
)