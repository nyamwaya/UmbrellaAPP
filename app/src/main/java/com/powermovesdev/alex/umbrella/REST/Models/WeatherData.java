package com.powermovesdev.alex.umbrella.REST.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by alex on 6/3/15.
 */
public class WeatherData {

    @SerializedName("current_observation")
    public CurrentObservation currentObservation;

    @SerializedName("hourly_forecast")
    public List<ForecastCondition> forecast;
}
