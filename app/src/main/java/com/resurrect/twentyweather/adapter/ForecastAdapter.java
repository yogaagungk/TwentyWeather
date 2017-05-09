package com.resurrect.twentyweather.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.resurrect.twentyweather.R;
import com.resurrect.twentyweather.dataCuaca.Forecast;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by root on 10/05/17.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder>{

    List<Forecast> forecast;
    int row;
    Context context;

    static class ForecastViewHolder extends RecyclerView.ViewHolder{
        TextView weather;
        TextView temperature;
        TextView desc;

        ForecastViewHolder(View v){
            super(v);
            weather = (TextView) v.findViewById(R.id.weather);
            temperature = (TextView) v.findViewById(R.id.temperature);
            desc = (TextView) v.findViewById(R.id.desc);
        }
    }

    public ForecastAdapter(List<Forecast> forecast, int row, Context context){
        this.forecast = forecast;
        this.row = row;
        this.context = context;
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(row, parent, false);
        return new ForecastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        float temp = forecast.get(position).getTemp().getAvg();
        DecimalFormat df = new DecimalFormat("0.#");
        holder.weather.setText(forecast.get(position).getWeather().get(0).getMain());
        holder.temperature.setText(""+df.format(temp)+" `C");
        holder.desc.setText(forecast.get(position).getWeather().get(0).getDesc());
    }

    @Override
    public int getItemCount() {
        return forecast.size();
    }

}
