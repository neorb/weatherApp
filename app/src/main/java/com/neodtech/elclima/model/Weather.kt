package com.neodtech.elclima.model

data class Weather(
    val dt: String,
    val day: String,
    val night: Double,
    val title: String,
    val description: String,
    val icon: String,
)
