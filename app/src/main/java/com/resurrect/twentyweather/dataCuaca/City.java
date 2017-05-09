package com.resurrect.twentyweather.dataCuaca;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 09/05/17.
 */

public class City {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
