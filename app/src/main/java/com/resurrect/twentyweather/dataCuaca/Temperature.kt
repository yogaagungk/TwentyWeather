package com.resurrect.twentyweather.dataCuaca

import com.google.gson.annotations.SerializedName

/**
 * Created by root on 09/05/17.
 */

class Temperature {
    @SerializedName("min")
    private val min: Float = 0.toFloat()
    @SerializedName("max")
    private val max: Float = 0.toFloat()

    val avg: Float
        get() = (min + max) / 2
}
