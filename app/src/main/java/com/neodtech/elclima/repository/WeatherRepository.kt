package com.neodtech.elclima.repository

import com.neodtech.elclima.datasource.RestDataSource
import com.neodtech.elclima.model.Weather
import javax.inject.Inject

interface WeatherRepository {
    //here goes the mock for future testing
    suspend fun getWeatherCity() : List<Weather>
}

class WeatherRepositoryImpl @Inject constructor(
    val dataSource : RestDataSource,
) : WeatherRepository {

    override suspend fun getWeatherCity() : List<Weather> {
        val weatherCity = dataSource.getResponse().weather[0].main!!
        val city = Weather(weatherCity.description, weatherCity.main)
        return city
    }

}