package com.resurrect.twentyweather.dataCuaca;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 09/05/17.
 */

public class Temperature {
    @SerializedName("min")
    private float min;
    @SerializedName("max")
    private float max;

    public float getAvg(){
        return (min+max)/2;
    }
}
