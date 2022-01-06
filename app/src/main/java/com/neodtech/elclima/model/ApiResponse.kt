package com.neodtech.elclima.model

data class ApiResponse (
    val weather: List<Results>
)

data class Results(
    val main: Main?,
    val clouds: Clouds?,
    val weather: Weather?
)

