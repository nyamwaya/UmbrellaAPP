package com.powermovesdev.alex.umbrella.REST.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alex on 6/3/15.
 */
public class CurrentObservation {

    @SerializedName("display_location")
    public CurrentConditions.DisplayLocation displayLocation;

    @SerializedName("temp_f")
    public float tempFahrenheit;

    @SerializedName("temp_c")
    public float tempCelsius;

    public String weather;

    public String icon;

}
