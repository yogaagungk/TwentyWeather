package com.resurrect.twentyweather.api;

import com.resurrect.twentyweather.dataCuaca.CommonInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by root on 30/04/17.
 */

public interface ApiInterface {

    @GET("/data/2.5/forecast/daily")
    Call<CommonInfo> getWeatherNow(@Query("q") String city, @Query("mode") String mode, @Query("units") String units,@Query("cnt") int cnt, @Query("appid") String appId);

}
