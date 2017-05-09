package com.resurrect.twentyweather.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.resurrect.twentyweather.R;
import com.resurrect.twentyweather.api.*;
import com.resurrect.twentyweather.dataCuaca.*;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private final static String APPID = "846d1dcd7d69ddc434414a0c56be7588";
    private final static String MODE = "json";
    private final static String UNITS = "metric";
    private final static int CNT= 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getForecastData();
    }

    public void getForecastData(){
        final TextView cityT = (TextView) findViewById(R.id.cityName);
        final TextView weatherT = (TextView) findViewById(R.id.weather);
        final TextView tempT = (TextView) findViewById(R.id.temperature);
        final TextView descT = (TextView) findViewById(R.id.desc);

        ApiInterface service = ApiClient.getClient().create(ApiInterface.class);

        Call<CommonInfo> call = service.getWeatherNow("Jakarta",MODE,UNITS,CNT,APPID);
        call.enqueue(new Callback<CommonInfo>() {
            @Override
            public void onResponse(Call<CommonInfo> call, Response<CommonInfo> response) {
                City city = response.body().getCity();
                String cityName =  city.getName();

                List<Forecast> forecast = response.body().getForecast();
                int temp = forecast.get(0).getTemp().getAvg();

                List<Weather> weather = forecast.get(0).getWeather();
                String main = weather.get(0).getMain();
                String desc = weather.get(0).getDesc();

                cityT.setText(cityName);
                weatherT.setText(main);
                tempT.setText(Integer.toString(temp)+" 'C");
                descT.setText(desc.toUpperCase());
            }

            @Override
            public void onFailure(Call<CommonInfo> call, Throwable t) {
                Log.e(MainActivity.class.getSimpleName(), t.toString());
            }
        });
    }

}
