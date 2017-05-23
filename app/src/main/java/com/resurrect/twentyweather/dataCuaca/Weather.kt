package com.resurrect.twentyweather.dataCuaca

import com.google.gson.annotations.SerializedName

/**
 * Created by root on 09/05/17.
 */

class Weather(@SerializedName("main")
              var main: String, @SerializedName("description")
              var desc: String)
