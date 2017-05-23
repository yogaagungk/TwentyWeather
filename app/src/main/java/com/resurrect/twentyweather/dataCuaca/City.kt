package com.resurrect.twentyweather.dataCuaca

import com.google.gson.annotations.SerializedName

/**
 * Created by root on 09/05/17.
 */

class City(@SerializedName("id")
           var id: Int, @SerializedName("name")
           var name: String?)
