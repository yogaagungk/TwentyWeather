package com.resurrect.twentyweather.dataCuaca;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 09/05/17.
 */

public class Temperature {
    @SerializedName("min")
    private int min;
    @SerializedName("max")
    private int max;

    public int getAvg(){
        return (min+max)/2;
    }
}
