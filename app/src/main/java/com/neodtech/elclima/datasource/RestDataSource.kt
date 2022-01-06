package com.neodtech.elclima.datasource

import com.neodtech.elclima.model.ApiResponse
import retrofit2.http.GET


const val API_KEY = "bb05152b0d5bc0ba818e03a32c40451f"
const val COUNTY = "London,uk"

interface RestDataSource {

    @GET("weather?q=$COUNTY&APPID=$API_KEY")
    suspend fun getResponse() : ApiResponse
}