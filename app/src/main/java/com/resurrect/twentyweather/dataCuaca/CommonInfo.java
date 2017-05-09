package com.resurrect.twentyweather.dataCuaca;

/**
 * Created by root on 30/04/17.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommonInfo {

    private City city;

    @SerializedName("list")
    private List<Forecast> forecast;

    public City getCity() {
        return city;
    }

    public void setCity(City cityName) {
        this.city = cityName;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public CommonInfo(City city, List<Forecast> forecast) {

        this.city = city;
        this.forecast = forecast;
    }
}