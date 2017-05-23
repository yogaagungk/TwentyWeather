package com.resurrect.twentyweather.dataCuaca

/**
 * Created by root on 09/05/17.
 */

import com.google.gson.annotations.SerializedName

class Forecast(@SerializedName("pressure")
               var pressure: String, @SerializedName("humidity")
               var humidity: String, var temp: Temperature, @SerializedName("weather")
               var weather: List<Weather>)
