package com.resurrect.twentyweather.api

import com.resurrect.twentyweather.dataCuaca.CommonInfo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by root on 30/04/17.
 */

interface ApiInterface {

    @GET("/data/2.5/forecast/daily")
    fun getWeatherNow(@Query("q") city: String, @Query("mode") mode: String, @Query("units") units: String, @Query("cnt") cnt: String, @Query("appid") appId: String): Call<CommonInfo>

}
