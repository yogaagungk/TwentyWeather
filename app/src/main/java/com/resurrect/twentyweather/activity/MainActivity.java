package com.resurrect.twentyweather.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.resurrect.twentyweather.R;
import com.resurrect.twentyweather.adapter.ForecastAdapter;
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
    private final static String CNT="7";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getForecastData();
    }

    public void getForecastData(){
        final TextView cityT = (TextView) findViewById(R.id.cityName);
        final RecyclerView recyclerView =  (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface service = ApiClient.getClient().create(ApiInterface.class);

        Call<CommonInfo> call = service.getWeatherNow("Jakarta",MODE,UNITS,CNT,APPID);
        call.enqueue(new Callback<CommonInfo>() {
            @Override
            public void onResponse(Call<CommonInfo> call, Response<CommonInfo> response) {
                City city = response.body().getCity();
                String cityName =  city.getName();

                List<Forecast> forecast = response.body().getForecast();

                cityT.setText(cityName);
                recyclerView.setAdapter(new ForecastAdapter(forecast, R.layout.content_main, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<CommonInfo> call, Throwable t) {
                Log.e(MainActivity.class.getSimpleName(), t.toString());
            }
        });
    }

}
