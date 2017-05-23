package com.resurrect.twentyweather.dataCuaca

/**
 * Created by root on 30/04/17.
 */

import com.google.gson.annotations.SerializedName

class CommonInfo(var city: City?, @SerializedName("list")
var forecast: List<Forecast>?)