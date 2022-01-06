package com.neodtech.elclima

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.neodtech.elclima.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val weatherRepositoryImpl : WeatherRepository
    ) : ViewModel() {

    fun getWeather(){
        viewModelScope.launch(Dispatchers.IO ) {
            val weather = weatherRepositoryImpl.getWeatherCity()
            Log.d("WeatherViewModel", weather.toString())
        }
    }
}