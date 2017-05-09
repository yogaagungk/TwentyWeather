package com.resurrect.twentyweather.dataCuaca;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 09/05/17.
 */

public class Weather {

    @SerializedName("main")
    String main;

    @SerializedName("description")
    String desc;

    public Weather(String main, String desc) {
        this.main = main;
        this.desc = desc;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
