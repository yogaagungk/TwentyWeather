package com.resurrect.twentyweather.dataCuaca;

/**
 * Created by root on 09/05/17.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Forecast {
    @SerializedName("pressure")
    String pressure;

    @SerializedName("humidity")
    String humidity;

    Temperature temp;

    @SerializedName("weather")
    List<Weather> weather;

    public Forecast(String pressure, String humidity, Temperature temp, List<Weather> weather) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp = temp;
        this.weather = weather;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
