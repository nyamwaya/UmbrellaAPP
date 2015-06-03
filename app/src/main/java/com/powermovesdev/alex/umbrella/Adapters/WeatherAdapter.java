package com.powermovesdev.alex.umbrella.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.powermovesdev.alex.umbrella.MainActivity;
import com.powermovesdev.alex.umbrella.R;
import com.powermovesdev.alex.umbrella.REST.Models.ForecastCondition;

import java.util.List;

/**
 * Created by alex on 6/3/15.
 */
public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.MyViewholder> {

    List<ForecastCondition> forecastConditions;
    public final LayoutInflater mLayoutInflater;
    public final MainActivity context;


    public WeatherAdapter(MainActivity context, List<ForecastCondition> forecastConditions) {
        mLayoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.forecastConditions = forecastConditions;

    }


    @Override
    public WeatherAdapter.MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.list_weather_conditions, parent, false);

        return new MyViewholder(view);
    }


    @Override
    public void onBindViewHolder(WeatherAdapter.MyViewholder holder, int position) {


        ForecastCondition forecastCondition = forecastConditions.get(position);
        holder.weather.setText(forecastCondition.condition);

        if (forecastConditions.size() < position) {
            forecastCondition = forecastConditions.get(position);
            holder.weather.setText(forecastCondition.fcttime.getWeekdayNameNight());

        }

    }

    @Override
    public int getItemCount() {
        return forecastConditions.size();
    }

    protected class MyViewholder extends RecyclerView.ViewHolder {

        public ImageView icon;
        public TextView weather;
        public TextView temp;


        public MyViewholder(View itemView) {
            super(itemView);

            weather = (TextView) itemView.findViewById(R.id.weather);
            temp = (TextView) itemView.findViewById(R.id.temp);
        }
    }
}
