package com.powermovesdev.alex.umbrella.REST;

import android.content.Context;

import com.powermovesdev.alex.umbrella.R;
import com.powermovesdev.alex.umbrella.REST.API.WeatherAPI;
import com.powermovesdev.alex.umbrella.REST.Models.WeatherData;

import retrofit.RestAdapter;
import rx.Observable;

/**
 * Created by alex on 6/3/15.
 */
public class WeatherClient {


    private WeatherAPI wunderAPI;
    private Context context;

    public static final String WEATHER_UNDERGROUND = "http://api.wunderground.com/api";

    public WeatherClient(Context context) {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(WEATHER_UNDERGROUND)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        wunderAPI = restAdapter.create(WeatherAPI.class);
        this.context = context;


    }

    public Observable<WeatherData> getConditions(String user_zip_code) {

        String wundergroundKey = context.getResources().getString(R.string.wunderground_key);
        return wunderAPI.getCurrentWeather(wundergroundKey, user_zip_code);
    }

}
